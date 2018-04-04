/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.store.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

import ecore.org.cocome.tradingsystem.inventory.data.store.EnterpriseStoreQueryProvider;
import ecore.org.cocome.tradingsystem.inventory.data.store.OrderEntry;
import ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder;
import ecore.org.cocome.tradingsystem.inventory.data.store.StockItem;
import ecore.org.cocome.tradingsystem.inventory.data.store.Store;
import ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory;
import ecore.org.cocome.tradingsystem.inventory.data.store.StoreFactoryOld;
import ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StoreFactoryImplOld extends EFactoryImpl implements StoreFactoryOld {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StoreFactoryOld init() {
		return new StoreFactoryImplOld();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreFactoryImplOld() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StorePackage.ENTERPRISE_STORE_QUERY_PROVIDER: return createEnterpriseStoreQueryProvider();
			case StorePackage.ORDER_ENTRY: return createOrderEntry();
			case StorePackage.PRODUCT_ORDER: return createProductOrder();
			case StorePackage.STOCK_ITEM: return createStockItem();
			case StorePackage.STORE: return createStore();
			case StorePackage.STORE_DATATYPES_FACTORY: return createStoreDatatypesFactory();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnterpriseStoreQueryProvider createEnterpriseStoreQueryProvider() {
		EnterpriseStoreQueryProviderImpl enterpriseStoreQueryProvider = new EnterpriseStoreQueryProviderImpl();
		return enterpriseStoreQueryProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderEntry createOrderEntry() {
		OrderEntryImpl orderEntry = new OrderEntryImpl();
		return orderEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductOrder createProductOrder() {
		ProductOrderImpl productOrder = new ProductOrderImpl();
		return productOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StockItem createStockItem() {
		StockItemImpl stockItem = new StockItemImpl();
		return stockItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Store createStore() {
		StoreImpl store = new StoreImpl();
		return store;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreDatatypesFactory createStoreDatatypesFactory() {
		StoreDatatypesFactoryImpl storeDatatypesFactory = new StoreDatatypesFactoryImpl();
		return storeDatatypesFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorePackage getStorePackage() {
		return (StorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StorePackage getPackage() {
		return StorePackage.eINSTANCE;
	}

} //StoreFactoryImpl
