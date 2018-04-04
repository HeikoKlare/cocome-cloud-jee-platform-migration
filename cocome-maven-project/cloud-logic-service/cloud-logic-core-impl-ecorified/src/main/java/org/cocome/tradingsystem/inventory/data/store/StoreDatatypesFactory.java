package org.cocome.tradingsystem.inventory.data.store;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Provider;

import org.apache.log4j.Logger;
import org.cocome.tradingsystem.inventory.application.store.ComplexOrderEntryTO;
import org.cocome.tradingsystem.inventory.application.store.ComplexOrderTO;
import org.cocome.tradingsystem.inventory.application.store.OrderEntryTO;
import org.cocome.tradingsystem.inventory.application.store.OrderTO;
import org.cocome.tradingsystem.inventory.application.store.ProductWithStockItemTO;
import org.cocome.tradingsystem.inventory.application.store.ProductWithSupplierAndStockItemTO;
import org.cocome.tradingsystem.inventory.application.store.StockItemTO;
import org.cocome.tradingsystem.inventory.application.store.StoreTO;
import org.cocome.tradingsystem.inventory.application.store.StoreWithEnterpriseTO;
import org.cocome.tradingsystem.inventory.data.enterprise.IEnterpriseDataFactory;
import org.cocome.tradingsystem.inventory.data.enterprise.IProduct;
import org.cocome.tradingsystem.util.exception.NotInDatabaseException;
import org.cocome.tradingsystem.util.java.Lists;

@Dependent
public
class StoreDatatypesFactory extends unification.org.cocome.tradingsystem.inventory.data.store.UnifiedStoreDatatypesFactory implements IStoreDataFactory {
	private static Logger LOG = Logger.getLogger(StoreDatatypesFactory.class);

	@Inject
	private
	Provider<OrderEntry> orderEntryProvider;
	
	@Inject
	private
	Provider<ProductOrder> productOrderProvider;
	
	@Inject
	private
	Provider<StockItem> stockItemProvider;
	
	@Inject
	private
	Provider<Store> storeProvider;
	
	@Inject
	private
	IEnterpriseDataFactory enterpriseDatatypes;
	
	@Override
	public IOrderEntry getNewOrderEntry() {
		return getOrderEntryProvider().get();
	}

	IEnterpriseDataFactory getEnterpriseDatatypes() {
		return enterpriseDatatypes;
	}

	void setEnterpriseDatatypes(IEnterpriseDataFactory enterpriseDatatypes) {
		this.enterpriseDatatypes = enterpriseDatatypes;
	}

	Provider<Store> getStoreProvider() {
		return storeProvider;
	}

	void setStoreProvider(Provider<Store> storeProvider) {
		this.storeProvider = storeProvider;
	}

	Provider<StockItem> getStockItemProvider() {
		return stockItemProvider;
	}

	void setStockItemProvider(Provider<StockItem> stockItemProvider) {
		this.stockItemProvider = stockItemProvider;
	}

	Provider<ProductOrder> getProductOrderProvider() {
		return productOrderProvider;
	}

	void setProductOrderProvider(Provider<ProductOrder> productOrderProvider) {
		this.productOrderProvider = productOrderProvider;
	}

	Provider<OrderEntry> getOrderEntryProvider() {
		return orderEntryProvider;
	}

	void setOrderEntryProvider(Provider<OrderEntry> orderEntryProvider) {
		this.orderEntryProvider = orderEntryProvider;
	}

	private static Logger getLOG() {
		return LOG;
	}

	private static void setLOG(Logger lOG) {
		LOG = lOG;
	}

	@Override
	public IProductOrder getNewProductOrder() {
		return getProductOrderProvider().get();
	}

	@Override
	public IStockItem getNewStockItem() {
		return getStockItemProvider().get();
	}

	@Override
	public IStore getNewStore() {
		return getStoreProvider().get();
	}

	@Override
	public IOrderEntry convertToOrderEntry(ComplexOrderEntryTO entryTO) {
		IOrderEntry entry = getNewOrderEntry();
		entry.setAmount(entryTO.getAmount());
		entry.setProduct(getEnterpriseDatatypes().convertToProduct(entryTO.getProductTO()));
		entry.setProductBarcode(entryTO.getProductTO().getBarcode());
		
		return entry;
	}

	@Override
	public ComplexOrderEntryTO fillComplexOrderEntryTO(IOrderEntry entry) throws NotInDatabaseException {
		final ComplexOrderEntryTO result = new ComplexOrderEntryTO();
		result.setAmount(entry.getAmount());
		result.setProductTO(getEnterpriseDatatypes().fillProductWithSupplierTO(entry.getProduct()));

		return result;
	}

	@Override
	public IProductOrder convertToProductOrder(ComplexOrderTO orderTO) {
		IProductOrder order = getNewProductOrder();
		order.setDeliveryDate(orderTO.getDeliveryDate());
		order.setId(orderTO.getId());
		
		Collection<IOrderEntry> entries = new LinkedList<>();
		for (ComplexOrderEntryTO entry : orderTO.getOrderEntryTOs()) {
			entries.add(convertToOrderEntry(entry));
		}
		order.setOrderEntries(entries);
		
		order.setOrderingDate(orderTO.getOrderingDate());
		return order;
	}

	@Override
	public ComplexOrderTO fillComplexOrderTO(IProductOrder order) throws NotInDatabaseException {
		final ComplexOrderTO result = new ComplexOrderTO();
		result.setId(order.getId());
		result.setDeliveryDate(order.getDeliveryDate());
		result.setOrderingDate(order.getOrderingDate());

		final List<ComplexOrderEntryTO> oeto = Lists.newArrayList();
		for (final IOrderEntry orderentry : order.getOrderEntries()) {
			oeto.add(fillComplexOrderEntryTO(orderentry));
		}
		result.setOrderEntryTOs(oeto);

		return result;
	}

	@Override
	public IStockItem convertToStockItem(StockItemTO stockItemTO) {
		IStockItem result = getNewStockItem();
		result.setAmount(stockItemTO.getAmount());
		result.setId(stockItemTO.getId());
		result.setIncomingAmount(stockItemTO.getIncomingAmount());
		result.setMaxStock(stockItemTO.getMaxStock());
		result.setMinStock(stockItemTO.getMinStock());
		result.setSalesPrice(stockItemTO.getSalesPrice());
		return result;
	}

	@Override
	public StockItemTO fillStockItemTO(IStockItem stockItem) {
		final StockItemTO result = new StockItemTO();
		result.setId(stockItem.getId());
		result.setAmount(stockItem.getAmount());
		result.setMinStock(stockItem.getMinStock());
		result.setMaxStock(stockItem.getMaxStock());
		result.setSalesPrice(stockItem.getSalesPrice());
		result.setIncomingAmount(stockItem.getIncomingAmount());

		return result;
	}

	@Override
	public IStore convertToStore(StoreTO storeTO) {
		IStore store = getNewStore();
		store.setName(storeTO.getName());
		store.setLocation(storeTO.getLocation());
		store.setId(storeTO.getId());
		return store;
	}

	@Override
	public StoreTO fillStoreTO(IStore store) {
		final StoreTO result = new StoreTO();
		result.setId(store.getId());
		result.setName(store.getName());
		result.setLocation(store.getLocation());

		return result;
	}

	@Override
	public OrderEntryTO fillOrderEntryTO(IOrderEntry entry) {
		final OrderEntryTO result = new OrderEntryTO();
		result.setAmount(entry.getAmount());

		return result;
	}

	@Override
	public OrderTO fillOrderTO(IProductOrder order) {
		final OrderTO result = new OrderTO();
		result.setId(order.getId());
		result.setDeliveryDate(order.getDeliveryDate());
		result.setOrderingDate(order.getOrderingDate());

		return result;
	}

	@Override
	public ProductWithStockItemTO fillProductWithStockItemTO(IStockItem stockItem) {
		final ProductWithStockItemTO result = new ProductWithStockItemTO();
		final IProduct product = stockItem.getProduct();

		result.setId(product.getId());
		result.setName(product.getName());
		result.setBarcode(product.getBarcode());
		result.setPurchasePrice(product.getPurchasePrice());
		result.setStockItemTO(fillStockItemTO(stockItem));

		return result;
	}

	@Override
	public ProductWithSupplierAndStockItemTO fillProductWithSupplierAndStockItemTO(
			IStockItem stockItem) throws NotInDatabaseException {
		final ProductWithSupplierAndStockItemTO result = new ProductWithSupplierAndStockItemTO();
		final IProduct product = stockItem.getProduct();

		result.setId(product.getId());
		result.setName(product.getName());
		result.setBarcode(product.getBarcode());
		result.setPurchasePrice(product.getPurchasePrice());
		result.setSupplierTO(getEnterpriseDatatypes().fillSupplierTO(product.getSupplier()));
		result.setStockItemTO(fillStockItemTO(stockItem));

		return result;
	}

	@Override
	public StoreWithEnterpriseTO fillStoreWithEnterpriseTO(IStore store) throws NotInDatabaseException {
		final StoreWithEnterpriseTO result = new StoreWithEnterpriseTO();
		result.setId(store.getId());
		result.setName(store.getName());
		result.setLocation(store.getLocation());
		result.setEnterpriseTO(getEnterpriseDatatypes().fillEnterpriseTO(store.getEnterprise()));
		
		getLOG().debug(String.format("Got store with id %d, name %s and enterprise %s.", result.getId(), result.getName(), result.getEnterpriseTO().getName()));

		return result;
	}

}
