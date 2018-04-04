/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.store;

import org.cocome.tradingsystem.inventory.application.store.ComplexOrderEntryTO;
import org.cocome.tradingsystem.inventory.application.store.ComplexOrderTO;
import org.cocome.tradingsystem.inventory.application.store.OrderEntryTO;
import org.cocome.tradingsystem.inventory.application.store.OrderTO;
import org.cocome.tradingsystem.inventory.application.store.ProductWithStockItemTO;
import org.cocome.tradingsystem.inventory.application.store.ProductWithSupplierAndStockItemTO;
import org.cocome.tradingsystem.inventory.application.store.StockItemTO;
import org.cocome.tradingsystem.inventory.application.store.StoreTO;
import org.cocome.tradingsystem.inventory.application.store.StoreWithEnterpriseTO;
import org.cocome.tradingsystem.inventory.data.store.IOrderEntry;
import org.cocome.tradingsystem.inventory.data.store.IProductOrder;
import org.cocome.tradingsystem.inventory.data.store.IStockItem;
import org.cocome.tradingsystem.inventory.data.store.IStore;
import org.cocome.tradingsystem.util.exception.NotInDatabaseException;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datatypes Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getStoreDatatypesFactory()
 * @model
 * @generated
 */
public interface StoreDatatypesFactory extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.IOrderEntry"
	 * @generated
	 */
	IOrderEntry getNewOrderEntry();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.IProductOrder"
	 * @generated
	 */
	IProductOrder getNewProductOrder();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	IStockItem getNewStockItem();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	IStore getNewStore();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.IOrderEntry" entryTODataType="ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.ComplexOrderEntryTO"
	 * @generated
	 */
	IOrderEntry convertToOrderEntry(ComplexOrderEntryTO entryTO);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.ComplexOrderEntryTO" exceptions="ecore.datatypes.org.cocome.tradingsystem.util.exception.NotInDatabaseException" entryDataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.IOrderEntry"
	 * @generated
	 */
	ComplexOrderEntryTO fillComplexOrderEntryTO(IOrderEntry entry) throws NotInDatabaseException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.IProductOrder" orderTODataType="ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.ComplexOrderTO"
	 * @generated
	 */
	IProductOrder convertToProductOrder(ComplexOrderTO orderTO);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.ComplexOrderTO" exceptions="ecore.datatypes.org.cocome.tradingsystem.util.exception.NotInDatabaseException" orderDataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.IProductOrder"
	 * @generated
	 */
	ComplexOrderTO fillComplexOrderTO(IProductOrder order) throws NotInDatabaseException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model stockItemTODataType="ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.StockItemTO"
	 * @generated
	 */
	IStockItem convertToStockItem(StockItemTO stockItemTO);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.StockItemTO"
	 * @generated
	 */
	StockItemTO fillStockItemTO(IStockItem stockItem);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model storeTODataType="ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.StoreTO"
	 * @generated
	 */
	IStore convertToStore(StoreTO storeTO);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.StoreTO"
	 * @generated
	 */
	StoreTO fillStoreTO(IStore store);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.OrderEntryTO" entryDataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.IOrderEntry"
	 * @generated
	 */
	OrderEntryTO fillOrderEntryTO(IOrderEntry entry);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.OrderTO" orderDataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.IProductOrder"
	 * @generated
	 */
	OrderTO fillOrderTO(IProductOrder order);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.ProductWithStockItemTO"
	 * @generated
	 */
	ProductWithStockItemTO fillProductWithStockItemTO(IStockItem stockItem);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.ProductWithSupplierAndStockItemTO" exceptions="ecore.datatypes.org.cocome.tradingsystem.util.exception.NotInDatabaseException"
	 * @generated
	 */
	ProductWithSupplierAndStockItemTO fillProductWithSupplierAndStockItemTO(IStockItem stockItem) throws NotInDatabaseException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.StoreWithEnterpriseTO" exceptions="ecore.datatypes.org.cocome.tradingsystem.util.exception.NotInDatabaseException"
	 * @generated
	 */
	StoreWithEnterpriseTO fillStoreWithEnterpriseTO(IStore store) throws NotInDatabaseException;

} // StoreDatatypesFactory
