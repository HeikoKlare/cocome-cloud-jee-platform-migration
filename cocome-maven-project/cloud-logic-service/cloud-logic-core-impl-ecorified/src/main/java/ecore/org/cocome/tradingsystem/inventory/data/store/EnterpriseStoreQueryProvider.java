/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.store;

import java.util.Collection;

import org.cocome.tradingsystem.inventory.data.enterprise.IProduct;
import org.cocome.tradingsystem.inventory.data.store.IProductOrder;
import org.cocome.tradingsystem.inventory.data.store.IStockItem;
import org.cocome.tradingsystem.inventory.data.store.IStore;
import org.cocome.tradingsystem.util.exception.NotInDatabaseException;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enterprise Store Query Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getEnterpriseStoreQueryProvider()
 * @model
 * @generated
 */
public interface EnterpriseStoreQueryProvider extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IStore queryStore(String name, String location);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.org.cocome.tradingsystem.util.exception.NotInDatabaseException"
	 * @generated
	 */
	IStore queryStoreById(long storeId) throws NotInDatabaseException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.org.cocome.tradingsystem.util.exception.NotInDatabaseException"
	 * @generated
	 */
	IStockItem queryStockItemById(long stockItemId) throws NotInDatabaseException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.org.cocome.tradingsystem.util.exception.NotInDatabaseException"
	 * @generated
	 */
	IProduct queryProductById(long productId) throws NotInDatabaseException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IProduct queryProductByBarcode(long barcode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.IProductOrder" exceptions="ecore.datatypes.org.cocome.tradingsystem.util.exception.NotInDatabaseException"
	 * @generated
	 */
	IProductOrder queryOrderById(long orderId) throws NotInDatabaseException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.java.util.Collection&lt;ecore.org.cocome.tradingsystem.inventory.data.enterprise.IProduct&gt;"
	 * @generated
	 */
	Collection<IProduct> queryProducts(long storeId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.java.util.Collection&lt;ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.IProductOrder&gt;"
	 * @generated
	 */
	Collection<IProductOrder> queryOutstandingOrders(long storeId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.java.util.Collection&lt;ecore.org.cocome.tradingsystem.inventory.data.store.IStockItem&gt;"
	 * @generated
	 */
	Collection<IStockItem> queryAllStockItems(long storeId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.java.util.Collection&lt;ecore.org.cocome.tradingsystem.inventory.data.store.IStockItem&gt;"
	 * @generated
	 */
	Collection<IStockItem> queryLowStockItems(long storeId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IStockItem queryStockItem(long storeId, long productBarcode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.java.util.Collection&lt;ecore.org.cocome.tradingsystem.inventory.data.store.IStockItem&gt;" productIdsDataType="ecore.datatypes.longArray"
	 * @generated
	 */
	Collection<IStockItem> queryStockItemsByProductId(long storeId, long[] productIds);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.IProductOrder" exceptions="ecore.datatypes.org.cocome.tradingsystem.util.exception.NotInDatabaseException"
	 * @generated
	 */
	IProductOrder queryProductOrder(long storeId, long productBarcode, long amount) throws NotInDatabaseException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.java.util.Collection&lt;ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.IProductOrder&gt;"
	 * @generated
	 */
	Collection<IProductOrder> queryAllOrders(long storeId);

} // EnterpriseStoreQueryProvider
