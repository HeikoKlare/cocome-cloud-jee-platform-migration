/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.store;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StoreFactoryOld
 * @model kind="package"
 * @generated
 */
public interface StorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "store";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "cloud-logic-core-impl/ecore.org.cocome.tradingsystem.inventory.data.store";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "store";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StorePackage eINSTANCE = ecore.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl.init();

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.EnterpriseStoreQueryProviderImpl <em>Enterprise Store Query Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.impl.EnterpriseStoreQueryProviderImpl
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl#getEnterpriseStoreQueryProvider()
	 * @generated
	 */
	int ENTERPRISE_STORE_QUERY_PROVIDER = 0;

	/**
	 * The number of structural features of the '<em>Enterprise Store Query Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_STORE_QUERY_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Query Store</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_STORE__STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Query Store By Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_STORE_BY_ID__LONG = 1;

	/**
	 * The operation id for the '<em>Query Stock Item By Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_STOCK_ITEM_BY_ID__LONG = 2;

	/**
	 * The operation id for the '<em>Query Product By Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_PRODUCT_BY_ID__LONG = 3;

	/**
	 * The operation id for the '<em>Query Product By Barcode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_PRODUCT_BY_BARCODE__LONG = 4;

	/**
	 * The operation id for the '<em>Query Order By Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_ORDER_BY_ID__LONG = 5;

	/**
	 * The operation id for the '<em>Query Products</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_PRODUCTS__LONG = 6;

	/**
	 * The operation id for the '<em>Query Outstanding Orders</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_OUTSTANDING_ORDERS__LONG = 7;

	/**
	 * The operation id for the '<em>Query All Stock Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_ALL_STOCK_ITEMS__LONG = 8;

	/**
	 * The operation id for the '<em>Query Low Stock Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_LOW_STOCK_ITEMS__LONG = 9;

	/**
	 * The operation id for the '<em>Query Stock Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_STOCK_ITEM__LONG_LONG = 10;

	/**
	 * The operation id for the '<em>Query Stock Items By Product Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_STOCK_ITEMS_BY_PRODUCT_ID__LONG_LONG = 11;

	/**
	 * The operation id for the '<em>Query Product Order</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_PRODUCT_ORDER__LONG_LONG_LONG = 12;

	/**
	 * The operation id for the '<em>Query All Orders</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_ALL_ORDERS__LONG = 13;

	/**
	 * The number of operations of the '<em>Enterprise Store Query Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_STORE_QUERY_PROVIDER_OPERATION_COUNT = 14;

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.OrderEntryImpl <em>Order Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.impl.OrderEntryImpl
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl#getOrderEntry()
	 * @generated
	 */
	int ORDER_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ENTRY__ID = 0;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ENTRY__AMOUNT = 1;

	/**
	 * The feature id for the '<em><b>Product Barcode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ENTRY__PRODUCT_BARCODE = 2;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ENTRY__PRODUCT = 3;

	/**
	 * The feature id for the '<em><b>Store Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ENTRY__STORE_QUERY = 4;

	/**
	 * The number of structural features of the '<em>Order Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ENTRY_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Init Order Entry</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ENTRY___INIT_ORDER_ENTRY = 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ENTRY___TO_STRING = 1;

	/**
	 * The number of operations of the '<em>Order Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ENTRY_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.ProductOrderImpl <em>Product Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.impl.ProductOrderImpl
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl#getProductOrder()
	 * @generated
	 */
	int PRODUCT_ORDER = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORDER__ID = 0;

	/**
	 * The feature id for the '<em><b>Delivery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORDER__DELIVERY_DATE = 1;

	/**
	 * The feature id for the '<em><b>Ordering Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORDER__ORDERING_DATE = 2;

	/**
	 * The feature id for the '<em><b>Order Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORDER__ORDER_ENTRIES = 3;

	/**
	 * The feature id for the '<em><b>Store Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORDER__STORE_NAME = 4;

	/**
	 * The feature id for the '<em><b>Store Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORDER__STORE_LOCATION = 5;

	/**
	 * The feature id for the '<em><b>Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORDER__STORE = 6;

	/**
	 * The feature id for the '<em><b>Store Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORDER__STORE_QUERY = 7;

	/**
	 * The number of structural features of the '<em>Product Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORDER_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Product Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.IStockItem <em>IStock Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.IStockItem
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl#getIStockItem()
	 * @generated
	 */
	int ISTOCK_ITEM = 6;

	/**
	 * The number of structural features of the '<em>IStock Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTOCK_ITEM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>IStock Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTOCK_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.StockItemImpl <em>Stock Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.impl.StockItemImpl
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl#getStockItem()
	 * @generated
	 */
	int STOCK_ITEM = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_ITEM__ID = ISTOCK_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sales Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_ITEM__SALES_PRICE = ISTOCK_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_ITEM__AMOUNT = ISTOCK_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Min Stock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_ITEM__MIN_STOCK = ISTOCK_ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Max Stock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_ITEM__MAX_STOCK = ISTOCK_ITEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Incoming Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_ITEM__INCOMING_AMOUNT = ISTOCK_ITEM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Store Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_ITEM__STORE_NAME = ISTOCK_ITEM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Store Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_ITEM__STORE_LOCATION = ISTOCK_ITEM_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Product Barcode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_ITEM__PRODUCT_BARCODE = ISTOCK_ITEM_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_ITEM__STORE = ISTOCK_ITEM_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_ITEM__PRODUCT = ISTOCK_ITEM_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Store Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_ITEM__STORE_QUERY = ISTOCK_ITEM_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Stock Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_ITEM_FEATURE_COUNT = ISTOCK_ITEM_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Stock Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_ITEM_OPERATION_COUNT = ISTOCK_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.IStore <em>IStore</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.IStore
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl#getIStore()
	 * @generated
	 */
	int ISTORE = 7;

	/**
	 * The number of structural features of the '<em>IStore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTORE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>IStore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.StoreImpl <em>Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.impl.StoreImpl
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl#getStore()
	 * @generated
	 */
	int STORE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__ID = ISTORE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__NAME = ISTORE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__LOCATION = ISTORE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enterprise Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__ENTERPRISE_NAME = ISTORE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Enterprise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__ENTERPRISE = ISTORE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Product Orders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__PRODUCT_ORDERS = ISTORE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Stock Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__STOCK_ITEMS = ISTORE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_FEATURE_COUNT = ISTORE_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Init Store</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE___INIT_STORE = ISTORE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE___TO_STRING = ISTORE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE___COMPARE_TO__ISTORE = ISTORE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_OPERATION_COUNT = ISTORE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.StoreDatatypesFactoryImpl <em>Datatypes Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.impl.StoreDatatypesFactoryImpl
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl#getStoreDatatypesFactory()
	 * @generated
	 */
	int STORE_DATATYPES_FACTORY = 5;

	/**
	 * The number of structural features of the '<em>Datatypes Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATATYPES_FACTORY_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get New Order Entry</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATATYPES_FACTORY___GET_NEW_ORDER_ENTRY = 0;

	/**
	 * The operation id for the '<em>Get New Product Order</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATATYPES_FACTORY___GET_NEW_PRODUCT_ORDER = 1;

	/**
	 * The operation id for the '<em>Get New Stock Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATATYPES_FACTORY___GET_NEW_STOCK_ITEM = 2;

	/**
	 * The operation id for the '<em>Get New Store</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATATYPES_FACTORY___GET_NEW_STORE = 3;

	/**
	 * The operation id for the '<em>Convert To Order Entry</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATATYPES_FACTORY___CONVERT_TO_ORDER_ENTRY__COMPLEXORDERENTRYTO = 4;

	/**
	 * The operation id for the '<em>Fill Complex Order Entry TO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATATYPES_FACTORY___FILL_COMPLEX_ORDER_ENTRY_TO__IORDERENTRY = 5;

	/**
	 * The operation id for the '<em>Convert To Product Order</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATATYPES_FACTORY___CONVERT_TO_PRODUCT_ORDER__COMPLEXORDERTO = 6;

	/**
	 * The operation id for the '<em>Fill Complex Order TO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATATYPES_FACTORY___FILL_COMPLEX_ORDER_TO__IPRODUCTORDER = 7;

	/**
	 * The operation id for the '<em>Convert To Stock Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATATYPES_FACTORY___CONVERT_TO_STOCK_ITEM__STOCKITEMTO = 8;

	/**
	 * The operation id for the '<em>Fill Stock Item TO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATATYPES_FACTORY___FILL_STOCK_ITEM_TO__ISTOCKITEM = 9;

	/**
	 * The operation id for the '<em>Convert To Store</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATATYPES_FACTORY___CONVERT_TO_STORE__STORETO = 10;

	/**
	 * The operation id for the '<em>Fill Store TO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATATYPES_FACTORY___FILL_STORE_TO__ISTORE = 11;

	/**
	 * The operation id for the '<em>Fill Order Entry TO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATATYPES_FACTORY___FILL_ORDER_ENTRY_TO__IORDERENTRY = 12;

	/**
	 * The operation id for the '<em>Fill Order TO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATATYPES_FACTORY___FILL_ORDER_TO__IPRODUCTORDER = 13;

	/**
	 * The operation id for the '<em>Fill Product With Stock Item TO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATATYPES_FACTORY___FILL_PRODUCT_WITH_STOCK_ITEM_TO__ISTOCKITEM = 14;

	/**
	 * The operation id for the '<em>Fill Product With Supplier And Stock Item TO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATATYPES_FACTORY___FILL_PRODUCT_WITH_SUPPLIER_AND_STOCK_ITEM_TO__ISTOCKITEM = 15;

	/**
	 * The operation id for the '<em>Fill Store With Enterprise TO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATATYPES_FACTORY___FILL_STORE_WITH_ENTERPRISE_TO__ISTORE = 16;

	/**
	 * The number of operations of the '<em>Datatypes Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATATYPES_FACTORY_OPERATION_COUNT = 17;


	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.inventory.data.store.EnterpriseStoreQueryProvider <em>Enterprise Store Query Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enterprise Store Query Provider</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.EnterpriseStoreQueryProvider
	 * @generated
	 */
	EClass getEnterpriseStoreQueryProvider();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.EnterpriseStoreQueryProvider#queryStore(java.lang.String, java.lang.String) <em>Query Store</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Query Store</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.EnterpriseStoreQueryProvider#queryStore(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getEnterpriseStoreQueryProvider__QueryStore__String_String();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.EnterpriseStoreQueryProvider#queryStoreById(long) <em>Query Store By Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Query Store By Id</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.EnterpriseStoreQueryProvider#queryStoreById(long)
	 * @generated
	 */
	EOperation getEnterpriseStoreQueryProvider__QueryStoreById__long();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.EnterpriseStoreQueryProvider#queryStockItemById(long) <em>Query Stock Item By Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Query Stock Item By Id</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.EnterpriseStoreQueryProvider#queryStockItemById(long)
	 * @generated
	 */
	EOperation getEnterpriseStoreQueryProvider__QueryStockItemById__long();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.EnterpriseStoreQueryProvider#queryProductById(long) <em>Query Product By Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Query Product By Id</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.EnterpriseStoreQueryProvider#queryProductById(long)
	 * @generated
	 */
	EOperation getEnterpriseStoreQueryProvider__QueryProductById__long();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.EnterpriseStoreQueryProvider#queryProductByBarcode(long) <em>Query Product By Barcode</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Query Product By Barcode</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.EnterpriseStoreQueryProvider#queryProductByBarcode(long)
	 * @generated
	 */
	EOperation getEnterpriseStoreQueryProvider__QueryProductByBarcode__long();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.EnterpriseStoreQueryProvider#queryOrderById(long) <em>Query Order By Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Query Order By Id</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.EnterpriseStoreQueryProvider#queryOrderById(long)
	 * @generated
	 */
	EOperation getEnterpriseStoreQueryProvider__QueryOrderById__long();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.EnterpriseStoreQueryProvider#queryProducts(long) <em>Query Products</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Query Products</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.EnterpriseStoreQueryProvider#queryProducts(long)
	 * @generated
	 */
	EOperation getEnterpriseStoreQueryProvider__QueryProducts__long();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.EnterpriseStoreQueryProvider#queryOutstandingOrders(long) <em>Query Outstanding Orders</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Query Outstanding Orders</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.EnterpriseStoreQueryProvider#queryOutstandingOrders(long)
	 * @generated
	 */
	EOperation getEnterpriseStoreQueryProvider__QueryOutstandingOrders__long();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.EnterpriseStoreQueryProvider#queryAllStockItems(long) <em>Query All Stock Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Query All Stock Items</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.EnterpriseStoreQueryProvider#queryAllStockItems(long)
	 * @generated
	 */
	EOperation getEnterpriseStoreQueryProvider__QueryAllStockItems__long();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.EnterpriseStoreQueryProvider#queryLowStockItems(long) <em>Query Low Stock Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Query Low Stock Items</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.EnterpriseStoreQueryProvider#queryLowStockItems(long)
	 * @generated
	 */
	EOperation getEnterpriseStoreQueryProvider__QueryLowStockItems__long();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.EnterpriseStoreQueryProvider#queryStockItem(long, long) <em>Query Stock Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Query Stock Item</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.EnterpriseStoreQueryProvider#queryStockItem(long, long)
	 * @generated
	 */
	EOperation getEnterpriseStoreQueryProvider__QueryStockItem__long_long();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.EnterpriseStoreQueryProvider#queryStockItemsByProductId(long, long[]) <em>Query Stock Items By Product Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Query Stock Items By Product Id</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.EnterpriseStoreQueryProvider#queryStockItemsByProductId(long, long[])
	 * @generated
	 */
	EOperation getEnterpriseStoreQueryProvider__QueryStockItemsByProductId__long_long();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.EnterpriseStoreQueryProvider#queryProductOrder(long, long, long) <em>Query Product Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Query Product Order</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.EnterpriseStoreQueryProvider#queryProductOrder(long, long, long)
	 * @generated
	 */
	EOperation getEnterpriseStoreQueryProvider__QueryProductOrder__long_long_long();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.EnterpriseStoreQueryProvider#queryAllOrders(long) <em>Query All Orders</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Query All Orders</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.EnterpriseStoreQueryProvider#queryAllOrders(long)
	 * @generated
	 */
	EOperation getEnterpriseStoreQueryProvider__QueryAllOrders__long();

	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.inventory.data.store.OrderEntry <em>Order Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Entry</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.OrderEntry
	 * @generated
	 */
	EClass getOrderEntry();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.store.OrderEntry#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.OrderEntry#getId()
	 * @see #getOrderEntry()
	 * @generated
	 */
	EAttribute getOrderEntry_Id();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.store.OrderEntry#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.OrderEntry#getAmount()
	 * @see #getOrderEntry()
	 * @generated
	 */
	EAttribute getOrderEntry_Amount();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.store.OrderEntry#getProductBarcode <em>Product Barcode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Barcode</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.OrderEntry#getProductBarcode()
	 * @see #getOrderEntry()
	 * @generated
	 */
	EAttribute getOrderEntry_ProductBarcode();

	/**
	 * Returns the meta object for the reference '{@link ecore.org.cocome.tradingsystem.inventory.data.store.OrderEntry#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.OrderEntry#getProduct()
	 * @see #getOrderEntry()
	 * @generated
	 */
	EReference getOrderEntry_Product();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.store.OrderEntry#getStoreQuery <em>Store Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Store Query</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.OrderEntry#getStoreQuery()
	 * @see #getOrderEntry()
	 * @generated
	 */
	EAttribute getOrderEntry_StoreQuery();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.OrderEntry#initOrderEntry() <em>Init Order Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init Order Entry</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.OrderEntry#initOrderEntry()
	 * @generated
	 */
	EOperation getOrderEntry__InitOrderEntry();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.OrderEntry#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.OrderEntry#toString()
	 * @generated
	 */
	EOperation getOrderEntry__ToString();

	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder <em>Product Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Order</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder
	 * @generated
	 */
	EClass getProductOrder();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder#getId()
	 * @see #getProductOrder()
	 * @generated
	 */
	EAttribute getProductOrder_Id();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder#getDeliveryDate <em>Delivery Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery Date</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder#getDeliveryDate()
	 * @see #getProductOrder()
	 * @generated
	 */
	EAttribute getProductOrder_DeliveryDate();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder#getOrderingDate <em>Ordering Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordering Date</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder#getOrderingDate()
	 * @see #getProductOrder()
	 * @generated
	 */
	EAttribute getProductOrder_OrderingDate();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder#getOrderEntries <em>Order Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Entries</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder#getOrderEntries()
	 * @see #getProductOrder()
	 * @generated
	 */
	EAttribute getProductOrder_OrderEntries();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder#getStoreName <em>Store Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Store Name</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder#getStoreName()
	 * @see #getProductOrder()
	 * @generated
	 */
	EAttribute getProductOrder_StoreName();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder#getStoreLocation <em>Store Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Store Location</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder#getStoreLocation()
	 * @see #getProductOrder()
	 * @generated
	 */
	EAttribute getProductOrder_StoreLocation();

	/**
	 * Returns the meta object for the reference '{@link ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder#getStore <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Store</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder#getStore()
	 * @see #getProductOrder()
	 * @generated
	 */
	EReference getProductOrder_Store();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder#getStoreQuery <em>Store Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Store Query</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder#getStoreQuery()
	 * @see #getProductOrder()
	 * @generated
	 */
	EAttribute getProductOrder_StoreQuery();

	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem <em>Stock Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stock Item</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StockItem
	 * @generated
	 */
	EClass getStockItem();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getId()
	 * @see #getStockItem()
	 * @generated
	 */
	EAttribute getStockItem_Id();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getSalesPrice <em>Sales Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sales Price</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getSalesPrice()
	 * @see #getStockItem()
	 * @generated
	 */
	EAttribute getStockItem_SalesPrice();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getAmount()
	 * @see #getStockItem()
	 * @generated
	 */
	EAttribute getStockItem_Amount();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getMinStock <em>Min Stock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Stock</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getMinStock()
	 * @see #getStockItem()
	 * @generated
	 */
	EAttribute getStockItem_MinStock();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getMaxStock <em>Max Stock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Stock</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getMaxStock()
	 * @see #getStockItem()
	 * @generated
	 */
	EAttribute getStockItem_MaxStock();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getIncomingAmount <em>Incoming Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incoming Amount</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getIncomingAmount()
	 * @see #getStockItem()
	 * @generated
	 */
	EAttribute getStockItem_IncomingAmount();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getStoreName <em>Store Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Store Name</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getStoreName()
	 * @see #getStockItem()
	 * @generated
	 */
	EAttribute getStockItem_StoreName();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getStoreLocation <em>Store Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Store Location</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getStoreLocation()
	 * @see #getStockItem()
	 * @generated
	 */
	EAttribute getStockItem_StoreLocation();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getProductBarcode <em>Product Barcode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Barcode</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getProductBarcode()
	 * @see #getStockItem()
	 * @generated
	 */
	EAttribute getStockItem_ProductBarcode();

	/**
	 * Returns the meta object for the reference '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getStore <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Store</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getStore()
	 * @see #getStockItem()
	 * @generated
	 */
	EReference getStockItem_Store();

	/**
	 * Returns the meta object for the reference '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getProduct()
	 * @see #getStockItem()
	 * @generated
	 */
	EReference getStockItem_Product();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getStoreQuery <em>Store Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Store Query</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getStoreQuery()
	 * @see #getStockItem()
	 * @generated
	 */
	EAttribute getStockItem_StoreQuery();

	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.inventory.data.store.Store <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.Store
	 * @generated
	 */
	EClass getStore();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.store.Store#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.Store#getId()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_Id();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.store.Store#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.Store#getName()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_Name();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.store.Store#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.Store#getLocation()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_Location();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.store.Store#getEnterpriseName <em>Enterprise Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enterprise Name</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.Store#getEnterpriseName()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_EnterpriseName();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.store.Store#getEnterprise <em>Enterprise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enterprise</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.Store#getEnterprise()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_Enterprise();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.store.Store#getProductOrders <em>Product Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Orders</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.Store#getProductOrders()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_ProductOrders();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.store.Store#getStockItems <em>Stock Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stock Items</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.Store#getStockItems()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_StockItems();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.Store#initStore() <em>Init Store</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init Store</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.Store#initStore()
	 * @generated
	 */
	EOperation getStore__InitStore();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.Store#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.Store#toString()
	 * @generated
	 */
	EOperation getStore__ToString();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.Store#compareTo(ecore.org.cocome.tradingsystem.inventory.data.store.IStore) <em>Compare To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compare To</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.Store#compareTo(ecore.org.cocome.tradingsystem.inventory.data.store.IStore)
	 * @generated
	 */
	EOperation getStore__CompareTo__IStore();

	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory <em>Datatypes Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatypes Factory</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory
	 * @generated
	 */
	EClass getStoreDatatypesFactory();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory#getNewOrderEntry() <em>Get New Order Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get New Order Entry</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory#getNewOrderEntry()
	 * @generated
	 */
	EOperation getStoreDatatypesFactory__GetNewOrderEntry();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory#getNewProductOrder() <em>Get New Product Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get New Product Order</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory#getNewProductOrder()
	 * @generated
	 */
	EOperation getStoreDatatypesFactory__GetNewProductOrder();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory#getNewStockItem() <em>Get New Stock Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get New Stock Item</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory#getNewStockItem()
	 * @generated
	 */
	EOperation getStoreDatatypesFactory__GetNewStockItem();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory#getNewStore() <em>Get New Store</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get New Store</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory#getNewStore()
	 * @generated
	 */
	EOperation getStoreDatatypesFactory__GetNewStore();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory#convertToOrderEntry(org.cocome.tradingsystem.inventory.application.store.ComplexOrderEntryTO) <em>Convert To Order Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Order Entry</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory#convertToOrderEntry(org.cocome.tradingsystem.inventory.application.store.ComplexOrderEntryTO)
	 * @generated
	 */
	EOperation getStoreDatatypesFactory__ConvertToOrderEntry__ComplexOrderEntryTO();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory#fillComplexOrderEntryTO(org.cocome.tradingsystem.inventory.data.store.IOrderEntry) <em>Fill Complex Order Entry TO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fill Complex Order Entry TO</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory#fillComplexOrderEntryTO(org.cocome.tradingsystem.inventory.data.store.IOrderEntry)
	 * @generated
	 */
	EOperation getStoreDatatypesFactory__FillComplexOrderEntryTO__IOrderEntry();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory#convertToProductOrder(org.cocome.tradingsystem.inventory.application.store.ComplexOrderTO) <em>Convert To Product Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Product Order</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory#convertToProductOrder(org.cocome.tradingsystem.inventory.application.store.ComplexOrderTO)
	 * @generated
	 */
	EOperation getStoreDatatypesFactory__ConvertToProductOrder__ComplexOrderTO();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory#fillComplexOrderTO(org.cocome.tradingsystem.inventory.data.store.IProductOrder) <em>Fill Complex Order TO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fill Complex Order TO</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory#fillComplexOrderTO(org.cocome.tradingsystem.inventory.data.store.IProductOrder)
	 * @generated
	 */
	EOperation getStoreDatatypesFactory__FillComplexOrderTO__IProductOrder();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory#convertToStockItem(org.cocome.tradingsystem.inventory.application.store.StockItemTO) <em>Convert To Stock Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Stock Item</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory#convertToStockItem(org.cocome.tradingsystem.inventory.application.store.StockItemTO)
	 * @generated
	 */
	EOperation getStoreDatatypesFactory__ConvertToStockItem__StockItemTO();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory#fillStockItemTO(ecore.org.cocome.tradingsystem.inventory.data.store.IStockItem) <em>Fill Stock Item TO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fill Stock Item TO</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory#fillStockItemTO(ecore.org.cocome.tradingsystem.inventory.data.store.IStockItem)
	 * @generated
	 */
	EOperation getStoreDatatypesFactory__FillStockItemTO__IStockItem();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory#convertToStore(org.cocome.tradingsystem.inventory.application.store.StoreTO) <em>Convert To Store</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Store</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory#convertToStore(org.cocome.tradingsystem.inventory.application.store.StoreTO)
	 * @generated
	 */
	EOperation getStoreDatatypesFactory__ConvertToStore__StoreTO();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory#fillStoreTO(ecore.org.cocome.tradingsystem.inventory.data.store.IStore) <em>Fill Store TO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fill Store TO</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory#fillStoreTO(ecore.org.cocome.tradingsystem.inventory.data.store.IStore)
	 * @generated
	 */
	EOperation getStoreDatatypesFactory__FillStoreTO__IStore();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory#fillOrderEntryTO(org.cocome.tradingsystem.inventory.data.store.IOrderEntry) <em>Fill Order Entry TO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fill Order Entry TO</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory#fillOrderEntryTO(org.cocome.tradingsystem.inventory.data.store.IOrderEntry)
	 * @generated
	 */
	EOperation getStoreDatatypesFactory__FillOrderEntryTO__IOrderEntry();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory#fillOrderTO(org.cocome.tradingsystem.inventory.data.store.IProductOrder) <em>Fill Order TO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fill Order TO</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory#fillOrderTO(org.cocome.tradingsystem.inventory.data.store.IProductOrder)
	 * @generated
	 */
	EOperation getStoreDatatypesFactory__FillOrderTO__IProductOrder();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory#fillProductWithStockItemTO(ecore.org.cocome.tradingsystem.inventory.data.store.IStockItem) <em>Fill Product With Stock Item TO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fill Product With Stock Item TO</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory#fillProductWithStockItemTO(ecore.org.cocome.tradingsystem.inventory.data.store.IStockItem)
	 * @generated
	 */
	EOperation getStoreDatatypesFactory__FillProductWithStockItemTO__IStockItem();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory#fillProductWithSupplierAndStockItemTO(ecore.org.cocome.tradingsystem.inventory.data.store.IStockItem) <em>Fill Product With Supplier And Stock Item TO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fill Product With Supplier And Stock Item TO</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory#fillProductWithSupplierAndStockItemTO(ecore.org.cocome.tradingsystem.inventory.data.store.IStockItem)
	 * @generated
	 */
	EOperation getStoreDatatypesFactory__FillProductWithSupplierAndStockItemTO__IStockItem();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory#fillStoreWithEnterpriseTO(ecore.org.cocome.tradingsystem.inventory.data.store.IStore) <em>Fill Store With Enterprise TO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fill Store With Enterprise TO</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory#fillStoreWithEnterpriseTO(ecore.org.cocome.tradingsystem.inventory.data.store.IStore)
	 * @generated
	 */
	EOperation getStoreDatatypesFactory__FillStoreWithEnterpriseTO__IStore();

	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.inventory.data.store.IStockItem <em>IStock Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IStock Item</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.IStockItem
	 * @generated
	 */
	EClass getIStockItem();

	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.inventory.data.store.IStore <em>IStore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IStore</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.IStore
	 * @generated
	 */
	EClass getIStore();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StoreFactory getStoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.EnterpriseStoreQueryProviderImpl <em>Enterprise Store Query Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.inventory.data.store.impl.EnterpriseStoreQueryProviderImpl
		 * @see ecore.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl#getEnterpriseStoreQueryProvider()
		 * @generated
		 */
		EClass ENTERPRISE_STORE_QUERY_PROVIDER = eINSTANCE.getEnterpriseStoreQueryProvider();

		/**
		 * The meta object literal for the '<em><b>Query Store</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_STORE__STRING_STRING = eINSTANCE.getEnterpriseStoreQueryProvider__QueryStore__String_String();

		/**
		 * The meta object literal for the '<em><b>Query Store By Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_STORE_BY_ID__LONG = eINSTANCE.getEnterpriseStoreQueryProvider__QueryStoreById__long();

		/**
		 * The meta object literal for the '<em><b>Query Stock Item By Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_STOCK_ITEM_BY_ID__LONG = eINSTANCE.getEnterpriseStoreQueryProvider__QueryStockItemById__long();

		/**
		 * The meta object literal for the '<em><b>Query Product By Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_PRODUCT_BY_ID__LONG = eINSTANCE.getEnterpriseStoreQueryProvider__QueryProductById__long();

		/**
		 * The meta object literal for the '<em><b>Query Product By Barcode</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_PRODUCT_BY_BARCODE__LONG = eINSTANCE.getEnterpriseStoreQueryProvider__QueryProductByBarcode__long();

		/**
		 * The meta object literal for the '<em><b>Query Order By Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_ORDER_BY_ID__LONG = eINSTANCE.getEnterpriseStoreQueryProvider__QueryOrderById__long();

		/**
		 * The meta object literal for the '<em><b>Query Products</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_PRODUCTS__LONG = eINSTANCE.getEnterpriseStoreQueryProvider__QueryProducts__long();

		/**
		 * The meta object literal for the '<em><b>Query Outstanding Orders</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_OUTSTANDING_ORDERS__LONG = eINSTANCE.getEnterpriseStoreQueryProvider__QueryOutstandingOrders__long();

		/**
		 * The meta object literal for the '<em><b>Query All Stock Items</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_ALL_STOCK_ITEMS__LONG = eINSTANCE.getEnterpriseStoreQueryProvider__QueryAllStockItems__long();

		/**
		 * The meta object literal for the '<em><b>Query Low Stock Items</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_LOW_STOCK_ITEMS__LONG = eINSTANCE.getEnterpriseStoreQueryProvider__QueryLowStockItems__long();

		/**
		 * The meta object literal for the '<em><b>Query Stock Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_STOCK_ITEM__LONG_LONG = eINSTANCE.getEnterpriseStoreQueryProvider__QueryStockItem__long_long();

		/**
		 * The meta object literal for the '<em><b>Query Stock Items By Product Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_STOCK_ITEMS_BY_PRODUCT_ID__LONG_LONG = eINSTANCE.getEnterpriseStoreQueryProvider__QueryStockItemsByProductId__long_long();

		/**
		 * The meta object literal for the '<em><b>Query Product Order</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_PRODUCT_ORDER__LONG_LONG_LONG = eINSTANCE.getEnterpriseStoreQueryProvider__QueryProductOrder__long_long_long();

		/**
		 * The meta object literal for the '<em><b>Query All Orders</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_ALL_ORDERS__LONG = eINSTANCE.getEnterpriseStoreQueryProvider__QueryAllOrders__long();

		/**
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.OrderEntryImpl <em>Order Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.inventory.data.store.impl.OrderEntryImpl
		 * @see ecore.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl#getOrderEntry()
		 * @generated
		 */
		EClass ORDER_ENTRY = eINSTANCE.getOrderEntry();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ENTRY__ID = eINSTANCE.getOrderEntry_Id();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ENTRY__AMOUNT = eINSTANCE.getOrderEntry_Amount();

		/**
		 * The meta object literal for the '<em><b>Product Barcode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ENTRY__PRODUCT_BARCODE = eINSTANCE.getOrderEntry_ProductBarcode();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ENTRY__PRODUCT = eINSTANCE.getOrderEntry_Product();

		/**
		 * The meta object literal for the '<em><b>Store Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ENTRY__STORE_QUERY = eINSTANCE.getOrderEntry_StoreQuery();

		/**
		 * The meta object literal for the '<em><b>Init Order Entry</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORDER_ENTRY___INIT_ORDER_ENTRY = eINSTANCE.getOrderEntry__InitOrderEntry();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORDER_ENTRY___TO_STRING = eINSTANCE.getOrderEntry__ToString();

		/**
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.ProductOrderImpl <em>Product Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.inventory.data.store.impl.ProductOrderImpl
		 * @see ecore.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl#getProductOrder()
		 * @generated
		 */
		EClass PRODUCT_ORDER = eINSTANCE.getProductOrder();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ORDER__ID = eINSTANCE.getProductOrder_Id();

		/**
		 * The meta object literal for the '<em><b>Delivery Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ORDER__DELIVERY_DATE = eINSTANCE.getProductOrder_DeliveryDate();

		/**
		 * The meta object literal for the '<em><b>Ordering Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ORDER__ORDERING_DATE = eINSTANCE.getProductOrder_OrderingDate();

		/**
		 * The meta object literal for the '<em><b>Order Entries</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ORDER__ORDER_ENTRIES = eINSTANCE.getProductOrder_OrderEntries();

		/**
		 * The meta object literal for the '<em><b>Store Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ORDER__STORE_NAME = eINSTANCE.getProductOrder_StoreName();

		/**
		 * The meta object literal for the '<em><b>Store Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ORDER__STORE_LOCATION = eINSTANCE.getProductOrder_StoreLocation();

		/**
		 * The meta object literal for the '<em><b>Store</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_ORDER__STORE = eINSTANCE.getProductOrder_Store();

		/**
		 * The meta object literal for the '<em><b>Store Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ORDER__STORE_QUERY = eINSTANCE.getProductOrder_StoreQuery();

		/**
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.StockItemImpl <em>Stock Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.inventory.data.store.impl.StockItemImpl
		 * @see ecore.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl#getStockItem()
		 * @generated
		 */
		EClass STOCK_ITEM = eINSTANCE.getStockItem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOCK_ITEM__ID = eINSTANCE.getStockItem_Id();

		/**
		 * The meta object literal for the '<em><b>Sales Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOCK_ITEM__SALES_PRICE = eINSTANCE.getStockItem_SalesPrice();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOCK_ITEM__AMOUNT = eINSTANCE.getStockItem_Amount();

		/**
		 * The meta object literal for the '<em><b>Min Stock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOCK_ITEM__MIN_STOCK = eINSTANCE.getStockItem_MinStock();

		/**
		 * The meta object literal for the '<em><b>Max Stock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOCK_ITEM__MAX_STOCK = eINSTANCE.getStockItem_MaxStock();

		/**
		 * The meta object literal for the '<em><b>Incoming Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOCK_ITEM__INCOMING_AMOUNT = eINSTANCE.getStockItem_IncomingAmount();

		/**
		 * The meta object literal for the '<em><b>Store Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOCK_ITEM__STORE_NAME = eINSTANCE.getStockItem_StoreName();

		/**
		 * The meta object literal for the '<em><b>Store Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOCK_ITEM__STORE_LOCATION = eINSTANCE.getStockItem_StoreLocation();

		/**
		 * The meta object literal for the '<em><b>Product Barcode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOCK_ITEM__PRODUCT_BARCODE = eINSTANCE.getStockItem_ProductBarcode();

		/**
		 * The meta object literal for the '<em><b>Store</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOCK_ITEM__STORE = eINSTANCE.getStockItem_Store();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOCK_ITEM__PRODUCT = eINSTANCE.getStockItem_Product();

		/**
		 * The meta object literal for the '<em><b>Store Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOCK_ITEM__STORE_QUERY = eINSTANCE.getStockItem_StoreQuery();

		/**
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.StoreImpl <em>Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.inventory.data.store.impl.StoreImpl
		 * @see ecore.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl#getStore()
		 * @generated
		 */
		EClass STORE = eINSTANCE.getStore();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__ID = eINSTANCE.getStore_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__NAME = eINSTANCE.getStore_Name();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__LOCATION = eINSTANCE.getStore_Location();

		/**
		 * The meta object literal for the '<em><b>Enterprise Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__ENTERPRISE_NAME = eINSTANCE.getStore_EnterpriseName();

		/**
		 * The meta object literal for the '<em><b>Enterprise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__ENTERPRISE = eINSTANCE.getStore_Enterprise();

		/**
		 * The meta object literal for the '<em><b>Product Orders</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__PRODUCT_ORDERS = eINSTANCE.getStore_ProductOrders();

		/**
		 * The meta object literal for the '<em><b>Stock Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__STOCK_ITEMS = eINSTANCE.getStore_StockItems();

		/**
		 * The meta object literal for the '<em><b>Init Store</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STORE___INIT_STORE = eINSTANCE.getStore__InitStore();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STORE___TO_STRING = eINSTANCE.getStore__ToString();

		/**
		 * The meta object literal for the '<em><b>Compare To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STORE___COMPARE_TO__ISTORE = eINSTANCE.getStore__CompareTo__IStore();

		/**
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.StoreDatatypesFactoryImpl <em>Datatypes Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.inventory.data.store.impl.StoreDatatypesFactoryImpl
		 * @see ecore.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl#getStoreDatatypesFactory()
		 * @generated
		 */
		EClass STORE_DATATYPES_FACTORY = eINSTANCE.getStoreDatatypesFactory();

		/**
		 * The meta object literal for the '<em><b>Get New Order Entry</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STORE_DATATYPES_FACTORY___GET_NEW_ORDER_ENTRY = eINSTANCE.getStoreDatatypesFactory__GetNewOrderEntry();

		/**
		 * The meta object literal for the '<em><b>Get New Product Order</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STORE_DATATYPES_FACTORY___GET_NEW_PRODUCT_ORDER = eINSTANCE.getStoreDatatypesFactory__GetNewProductOrder();

		/**
		 * The meta object literal for the '<em><b>Get New Stock Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STORE_DATATYPES_FACTORY___GET_NEW_STOCK_ITEM = eINSTANCE.getStoreDatatypesFactory__GetNewStockItem();

		/**
		 * The meta object literal for the '<em><b>Get New Store</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STORE_DATATYPES_FACTORY___GET_NEW_STORE = eINSTANCE.getStoreDatatypesFactory__GetNewStore();

		/**
		 * The meta object literal for the '<em><b>Convert To Order Entry</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STORE_DATATYPES_FACTORY___CONVERT_TO_ORDER_ENTRY__COMPLEXORDERENTRYTO = eINSTANCE.getStoreDatatypesFactory__ConvertToOrderEntry__ComplexOrderEntryTO();

		/**
		 * The meta object literal for the '<em><b>Fill Complex Order Entry TO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STORE_DATATYPES_FACTORY___FILL_COMPLEX_ORDER_ENTRY_TO__IORDERENTRY = eINSTANCE.getStoreDatatypesFactory__FillComplexOrderEntryTO__IOrderEntry();

		/**
		 * The meta object literal for the '<em><b>Convert To Product Order</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STORE_DATATYPES_FACTORY___CONVERT_TO_PRODUCT_ORDER__COMPLEXORDERTO = eINSTANCE.getStoreDatatypesFactory__ConvertToProductOrder__ComplexOrderTO();

		/**
		 * The meta object literal for the '<em><b>Fill Complex Order TO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STORE_DATATYPES_FACTORY___FILL_COMPLEX_ORDER_TO__IPRODUCTORDER = eINSTANCE.getStoreDatatypesFactory__FillComplexOrderTO__IProductOrder();

		/**
		 * The meta object literal for the '<em><b>Convert To Stock Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STORE_DATATYPES_FACTORY___CONVERT_TO_STOCK_ITEM__STOCKITEMTO = eINSTANCE.getStoreDatatypesFactory__ConvertToStockItem__StockItemTO();

		/**
		 * The meta object literal for the '<em><b>Fill Stock Item TO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STORE_DATATYPES_FACTORY___FILL_STOCK_ITEM_TO__ISTOCKITEM = eINSTANCE.getStoreDatatypesFactory__FillStockItemTO__IStockItem();

		/**
		 * The meta object literal for the '<em><b>Convert To Store</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STORE_DATATYPES_FACTORY___CONVERT_TO_STORE__STORETO = eINSTANCE.getStoreDatatypesFactory__ConvertToStore__StoreTO();

		/**
		 * The meta object literal for the '<em><b>Fill Store TO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STORE_DATATYPES_FACTORY___FILL_STORE_TO__ISTORE = eINSTANCE.getStoreDatatypesFactory__FillStoreTO__IStore();

		/**
		 * The meta object literal for the '<em><b>Fill Order Entry TO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STORE_DATATYPES_FACTORY___FILL_ORDER_ENTRY_TO__IORDERENTRY = eINSTANCE.getStoreDatatypesFactory__FillOrderEntryTO__IOrderEntry();

		/**
		 * The meta object literal for the '<em><b>Fill Order TO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STORE_DATATYPES_FACTORY___FILL_ORDER_TO__IPRODUCTORDER = eINSTANCE.getStoreDatatypesFactory__FillOrderTO__IProductOrder();

		/**
		 * The meta object literal for the '<em><b>Fill Product With Stock Item TO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STORE_DATATYPES_FACTORY___FILL_PRODUCT_WITH_STOCK_ITEM_TO__ISTOCKITEM = eINSTANCE.getStoreDatatypesFactory__FillProductWithStockItemTO__IStockItem();

		/**
		 * The meta object literal for the '<em><b>Fill Product With Supplier And Stock Item TO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STORE_DATATYPES_FACTORY___FILL_PRODUCT_WITH_SUPPLIER_AND_STOCK_ITEM_TO__ISTOCKITEM = eINSTANCE.getStoreDatatypesFactory__FillProductWithSupplierAndStockItemTO__IStockItem();

		/**
		 * The meta object literal for the '<em><b>Fill Store With Enterprise TO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STORE_DATATYPES_FACTORY___FILL_STORE_WITH_ENTERPRISE_TO__ISTORE = eINSTANCE.getStoreDatatypesFactory__FillStoreWithEnterpriseTO__IStore();

		/**
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.IStockItem <em>IStock Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.inventory.data.store.IStockItem
		 * @see ecore.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl#getIStockItem()
		 * @generated
		 */
		EClass ISTOCK_ITEM = eINSTANCE.getIStockItem();

		/**
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.IStore <em>IStore</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.inventory.data.store.IStore
		 * @see ecore.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl#getIStore()
		 * @generated
		 */
		EClass ISTORE = eINSTANCE.getIStore();

	}

} //StorePackage
