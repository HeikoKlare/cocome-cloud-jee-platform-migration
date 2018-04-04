/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.store.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.cocome.tradingsystem.inventory.data.enterprise.IProduct;
import org.cocome.tradingsystem.inventory.data.store.IProductOrder;
import org.cocome.tradingsystem.inventory.data.store.IStockItem;
import org.cocome.tradingsystem.inventory.data.store.IStore;
import org.cocome.tradingsystem.util.exception.NotInDatabaseException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enterprise Store Query Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EnterpriseStoreQueryProviderImpl extends MinimalEObjectImpl.Container implements ecore.org.cocome.tradingsystem.inventory.data.store.EnterpriseStoreQueryProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnterpriseStoreQueryProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.ENTERPRISE_STORE_QUERY_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IStore queryStore(String name, String location) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IStore queryStoreById(long storeId) throws NotInDatabaseException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IStockItem queryStockItemById(long stockItemId) throws NotInDatabaseException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProduct queryProductById(long productId) throws NotInDatabaseException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProduct queryProductByBarcode(long barcode) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProductOrder queryOrderById(long orderId) throws NotInDatabaseException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<IProduct> queryProducts(long storeId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<IProductOrder> queryOutstandingOrders(long storeId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<IStockItem> queryAllStockItems(long storeId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<IStockItem> queryLowStockItems(long storeId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IStockItem queryStockItem(long storeId, long productBarcode) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<IStockItem> queryStockItemsByProductId(long storeId, long[] productIds) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProductOrder queryProductOrder(long storeId, long productBarcode, long amount) throws NotInDatabaseException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<IProductOrder> queryAllOrders(long storeId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case StorePackage.ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_STORE__STRING_STRING:
				return queryStore((String)arguments.get(0), (String)arguments.get(1));
			case StorePackage.ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_STORE_BY_ID__LONG:
				try {
					return queryStoreById((Long)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case StorePackage.ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_STOCK_ITEM_BY_ID__LONG:
				try {
					return queryStockItemById((Long)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case StorePackage.ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_PRODUCT_BY_ID__LONG:
				try {
					return queryProductById((Long)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case StorePackage.ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_PRODUCT_BY_BARCODE__LONG:
				return queryProductByBarcode((Long)arguments.get(0));
			case StorePackage.ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_ORDER_BY_ID__LONG:
				try {
					return queryOrderById((Long)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case StorePackage.ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_PRODUCTS__LONG:
				return queryProducts((Long)arguments.get(0));
			case StorePackage.ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_OUTSTANDING_ORDERS__LONG:
				return queryOutstandingOrders((Long)arguments.get(0));
			case StorePackage.ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_ALL_STOCK_ITEMS__LONG:
				return queryAllStockItems((Long)arguments.get(0));
			case StorePackage.ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_LOW_STOCK_ITEMS__LONG:
				return queryLowStockItems((Long)arguments.get(0));
			case StorePackage.ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_STOCK_ITEM__LONG_LONG:
				return queryStockItem((Long)arguments.get(0), (Long)arguments.get(1));
			case StorePackage.ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_STOCK_ITEMS_BY_PRODUCT_ID__LONG_LONG:
				return queryStockItemsByProductId((Long)arguments.get(0), (long[])arguments.get(1));
			case StorePackage.ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_PRODUCT_ORDER__LONG_LONG_LONG:
				try {
					return queryProductOrder((Long)arguments.get(0), (Long)arguments.get(1), (Long)arguments.get(2));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case StorePackage.ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_ALL_ORDERS__LONG:
				return queryAllOrders((Long)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //EnterpriseStoreQueryProviderImpl
