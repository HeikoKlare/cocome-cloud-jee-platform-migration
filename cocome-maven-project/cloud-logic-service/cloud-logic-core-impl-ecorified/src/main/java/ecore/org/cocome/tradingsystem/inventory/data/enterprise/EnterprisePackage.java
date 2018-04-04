/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.enterprise;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseFactoryOld
 * @model kind="package"
 * @generated
 */
public interface EnterprisePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "enterprise";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "cloud-logic-core-impl/ecore.org.cocome.tradingsystem.inventory.data.enterprise";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "enterprise";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnterprisePackage eINSTANCE = ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterprisePackageImpl.init();

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterpriseDatatypesFactoryImpl <em>Datatypes Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterpriseDatatypesFactoryImpl
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterprisePackageImpl#getEnterpriseDatatypesFactory()
	 * @generated
	 */
	int ENTERPRISE_DATATYPES_FACTORY = 0;

	/**
	 * The number of structural features of the '<em>Datatypes Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_DATATYPES_FACTORY_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get New Product</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_DATATYPES_FACTORY___GET_NEW_PRODUCT = 0;

	/**
	 * The operation id for the '<em>Get New Product Supplier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_DATATYPES_FACTORY___GET_NEW_PRODUCT_SUPPLIER = 1;

	/**
	 * The operation id for the '<em>Get New Trading Enterprise</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_DATATYPES_FACTORY___GET_NEW_TRADING_ENTERPRISE = 2;

	/**
	 * The operation id for the '<em>Convert To Product</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_DATATYPES_FACTORY___CONVERT_TO_PRODUCT__PRODUCTTO = 3;

	/**
	 * The operation id for the '<em>Fill Product TO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_DATATYPES_FACTORY___FILL_PRODUCT_TO__IPRODUCT = 4;

	/**
	 * The operation id for the '<em>Convert To Enterprise</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_DATATYPES_FACTORY___CONVERT_TO_ENTERPRISE__ENTERPRISETO = 5;

	/**
	 * The operation id for the '<em>Fill Enterprise TO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_DATATYPES_FACTORY___FILL_ENTERPRISE_TO__ITRADINGENTERPRISE = 6;

	/**
	 * The operation id for the '<em>Convert To Supplier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_DATATYPES_FACTORY___CONVERT_TO_SUPPLIER__SUPPLIERTO = 7;

	/**
	 * The operation id for the '<em>Fill Supplier TO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_DATATYPES_FACTORY___FILL_SUPPLIER_TO__IPRODUCTSUPPLIER = 8;

	/**
	 * The operation id for the '<em>Fill Product With Supplier TO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_DATATYPES_FACTORY___FILL_PRODUCT_WITH_SUPPLIER_TO__IPRODUCT = 9;

	/**
	 * The number of operations of the '<em>Datatypes Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_DATATYPES_FACTORY_OPERATION_COUNT = 10;

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.IProduct <em>IProduct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.IProduct
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterprisePackageImpl#getIProduct()
	 * @generated
	 */
	int IPRODUCT = 4;

	/**
	 * The number of structural features of the '<em>IProduct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPRODUCT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>IProduct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPRODUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.ProductImpl
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterprisePackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ID = IPRODUCT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Barcode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__BARCODE = IPRODUCT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PURCHASE_PRICE = IPRODUCT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = IPRODUCT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__SUPPLIER = IPRODUCT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Enterprise Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ENTERPRISE_QUERY = IPRODUCT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__REGISTRY = IPRODUCT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = IPRODUCT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = IPRODUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.ProductSupplierImpl <em>Product Supplier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.ProductSupplierImpl
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterprisePackageImpl#getProductSupplier()
	 * @generated
	 */
	int PRODUCT_SUPPLIER = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUPPLIER__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUPPLIER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Products</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUPPLIER__PRODUCTS = 2;

	/**
	 * The feature id for the '<em><b>Enterprise Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUPPLIER__ENTERPRISE_QUERY = 3;

	/**
	 * The feature id for the '<em><b>Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUPPLIER__REGISTRY = 4;

	/**
	 * The number of structural features of the '<em>Product Supplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUPPLIER_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Init Product Supplier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUPPLIER___INIT_PRODUCT_SUPPLIER = 0;

	/**
	 * The number of operations of the '<em>Product Supplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUPPLIER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.TradingEnterpriseImpl <em>Trading Enterprise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.TradingEnterpriseImpl
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterprisePackageImpl#getTradingEnterprise()
	 * @generated
	 */
	int TRADING_ENTERPRISE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_ENTERPRISE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_ENTERPRISE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Suppliers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_ENTERPRISE__SUPPLIERS = 2;

	/**
	 * The feature id for the '<em><b>Stores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_ENTERPRISE__STORES = 3;

	/**
	 * The feature id for the '<em><b>Enterprise Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_ENTERPRISE__ENTERPRISE_QUERY = 4;

	/**
	 * The number of structural features of the '<em>Trading Enterprise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_ENTERPRISE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Init Trading Enterprise</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_ENTERPRISE___INIT_TRADING_ENTERPRISE = 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_ENTERPRISE___TO_STRING = 1;

	/**
	 * The number of operations of the '<em>Trading Enterprise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_ENTERPRISE_OPERATION_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseDatatypesFactory <em>Datatypes Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatypes Factory</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseDatatypesFactory
	 * @generated
	 */
	EClass getEnterpriseDatatypesFactory();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseDatatypesFactory#getNewProduct() <em>Get New Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get New Product</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseDatatypesFactory#getNewProduct()
	 * @generated
	 */
	EOperation getEnterpriseDatatypesFactory__GetNewProduct();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseDatatypesFactory#getNewProductSupplier() <em>Get New Product Supplier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get New Product Supplier</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseDatatypesFactory#getNewProductSupplier()
	 * @generated
	 */
	EOperation getEnterpriseDatatypesFactory__GetNewProductSupplier();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseDatatypesFactory#getNewTradingEnterprise() <em>Get New Trading Enterprise</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get New Trading Enterprise</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseDatatypesFactory#getNewTradingEnterprise()
	 * @generated
	 */
	EOperation getEnterpriseDatatypesFactory__GetNewTradingEnterprise();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseDatatypesFactory#convertToProduct(org.cocome.tradingsystem.inventory.application.store.ProductTO) <em>Convert To Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Product</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseDatatypesFactory#convertToProduct(org.cocome.tradingsystem.inventory.application.store.ProductTO)
	 * @generated
	 */
	EOperation getEnterpriseDatatypesFactory__ConvertToProduct__ProductTO();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseDatatypesFactory#fillProductTO(ecore.org.cocome.tradingsystem.inventory.data.enterprise.IProduct) <em>Fill Product TO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fill Product TO</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseDatatypesFactory#fillProductTO(ecore.org.cocome.tradingsystem.inventory.data.enterprise.IProduct)
	 * @generated
	 */
	EOperation getEnterpriseDatatypesFactory__FillProductTO__IProduct();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseDatatypesFactory#convertToEnterprise(org.cocome.tradingsystem.inventory.application.store.EnterpriseTO) <em>Convert To Enterprise</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Enterprise</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseDatatypesFactory#convertToEnterprise(org.cocome.tradingsystem.inventory.application.store.EnterpriseTO)
	 * @generated
	 */
	EOperation getEnterpriseDatatypesFactory__ConvertToEnterprise__EnterpriseTO();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseDatatypesFactory#fillEnterpriseTO(org.cocome.tradingsystem.inventory.data.enterprise.ITradingEnterprise) <em>Fill Enterprise TO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fill Enterprise TO</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseDatatypesFactory#fillEnterpriseTO(org.cocome.tradingsystem.inventory.data.enterprise.ITradingEnterprise)
	 * @generated
	 */
	EOperation getEnterpriseDatatypesFactory__FillEnterpriseTO__ITradingEnterprise();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseDatatypesFactory#convertToSupplier(org.cocome.tradingsystem.inventory.application.store.SupplierTO) <em>Convert To Supplier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Supplier</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseDatatypesFactory#convertToSupplier(org.cocome.tradingsystem.inventory.application.store.SupplierTO)
	 * @generated
	 */
	EOperation getEnterpriseDatatypesFactory__ConvertToSupplier__SupplierTO();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseDatatypesFactory#fillSupplierTO(org.cocome.tradingsystem.inventory.data.enterprise.IProductSupplier) <em>Fill Supplier TO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fill Supplier TO</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseDatatypesFactory#fillSupplierTO(org.cocome.tradingsystem.inventory.data.enterprise.IProductSupplier)
	 * @generated
	 */
	EOperation getEnterpriseDatatypesFactory__FillSupplierTO__IProductSupplier();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseDatatypesFactory#fillProductWithSupplierTO(ecore.org.cocome.tradingsystem.inventory.data.enterprise.IProduct) <em>Fill Product With Supplier TO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fill Product With Supplier TO</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseDatatypesFactory#fillProductWithSupplierTO(ecore.org.cocome.tradingsystem.inventory.data.enterprise.IProduct)
	 * @generated
	 */
	EOperation getEnterpriseDatatypesFactory__FillProductWithSupplierTO__IProduct();

	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product#getId()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Id();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product#getBarcode <em>Barcode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Barcode</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product#getBarcode()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Barcode();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product#getPurchasePrice <em>Purchase Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purchase Price</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product#getPurchasePrice()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_PurchasePrice();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product#getName()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Name();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product#getSupplier()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Supplier();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product#getEnterpriseQuery <em>Enterprise Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enterprise Query</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product#getEnterpriseQuery()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_EnterpriseQuery();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product#getRegistry <em>Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registry</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product#getRegistry()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Registry();

	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.ProductSupplier <em>Product Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Supplier</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.ProductSupplier
	 * @generated
	 */
	EClass getProductSupplier();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.ProductSupplier#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.ProductSupplier#getId()
	 * @see #getProductSupplier()
	 * @generated
	 */
	EAttribute getProductSupplier_Id();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.ProductSupplier#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.ProductSupplier#getName()
	 * @see #getProductSupplier()
	 * @generated
	 */
	EAttribute getProductSupplier_Name();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.ProductSupplier#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Products</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.ProductSupplier#getProducts()
	 * @see #getProductSupplier()
	 * @generated
	 */
	EAttribute getProductSupplier_Products();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.ProductSupplier#getEnterpriseQuery <em>Enterprise Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enterprise Query</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.ProductSupplier#getEnterpriseQuery()
	 * @see #getProductSupplier()
	 * @generated
	 */
	EAttribute getProductSupplier_EnterpriseQuery();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.ProductSupplier#getRegistry <em>Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registry</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.ProductSupplier#getRegistry()
	 * @see #getProductSupplier()
	 * @generated
	 */
	EAttribute getProductSupplier_Registry();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.ProductSupplier#initProductSupplier() <em>Init Product Supplier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init Product Supplier</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.ProductSupplier#initProductSupplier()
	 * @generated
	 */
	EOperation getProductSupplier__InitProductSupplier();

	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.TradingEnterprise <em>Trading Enterprise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trading Enterprise</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.TradingEnterprise
	 * @generated
	 */
	EClass getTradingEnterprise();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.TradingEnterprise#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.TradingEnterprise#getId()
	 * @see #getTradingEnterprise()
	 * @generated
	 */
	EAttribute getTradingEnterprise_Id();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.TradingEnterprise#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.TradingEnterprise#getName()
	 * @see #getTradingEnterprise()
	 * @generated
	 */
	EAttribute getTradingEnterprise_Name();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.TradingEnterprise#getSuppliers <em>Suppliers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suppliers</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.TradingEnterprise#getSuppliers()
	 * @see #getTradingEnterprise()
	 * @generated
	 */
	EAttribute getTradingEnterprise_Suppliers();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.TradingEnterprise#getStores <em>Stores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stores</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.TradingEnterprise#getStores()
	 * @see #getTradingEnterprise()
	 * @generated
	 */
	EAttribute getTradingEnterprise_Stores();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.TradingEnterprise#getEnterpriseQuery <em>Enterprise Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enterprise Query</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.TradingEnterprise#getEnterpriseQuery()
	 * @see #getTradingEnterprise()
	 * @generated
	 */
	EAttribute getTradingEnterprise_EnterpriseQuery();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.TradingEnterprise#initTradingEnterprise() <em>Init Trading Enterprise</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init Trading Enterprise</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.TradingEnterprise#initTradingEnterprise()
	 * @generated
	 */
	EOperation getTradingEnterprise__InitTradingEnterprise();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.TradingEnterprise#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.TradingEnterprise#toString()
	 * @generated
	 */
	EOperation getTradingEnterprise__ToString();

	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.IProduct <em>IProduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IProduct</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.IProduct
	 * @generated
	 */
	EClass getIProduct();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EnterpriseFactory getEnterpriseFactory();

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
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterpriseDatatypesFactoryImpl <em>Datatypes Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterpriseDatatypesFactoryImpl
		 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterprisePackageImpl#getEnterpriseDatatypesFactory()
		 * @generated
		 */
		EClass ENTERPRISE_DATATYPES_FACTORY = eINSTANCE.getEnterpriseDatatypesFactory();

		/**
		 * The meta object literal for the '<em><b>Get New Product</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTERPRISE_DATATYPES_FACTORY___GET_NEW_PRODUCT = eINSTANCE.getEnterpriseDatatypesFactory__GetNewProduct();

		/**
		 * The meta object literal for the '<em><b>Get New Product Supplier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTERPRISE_DATATYPES_FACTORY___GET_NEW_PRODUCT_SUPPLIER = eINSTANCE.getEnterpriseDatatypesFactory__GetNewProductSupplier();

		/**
		 * The meta object literal for the '<em><b>Get New Trading Enterprise</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTERPRISE_DATATYPES_FACTORY___GET_NEW_TRADING_ENTERPRISE = eINSTANCE.getEnterpriseDatatypesFactory__GetNewTradingEnterprise();

		/**
		 * The meta object literal for the '<em><b>Convert To Product</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTERPRISE_DATATYPES_FACTORY___CONVERT_TO_PRODUCT__PRODUCTTO = eINSTANCE.getEnterpriseDatatypesFactory__ConvertToProduct__ProductTO();

		/**
		 * The meta object literal for the '<em><b>Fill Product TO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTERPRISE_DATATYPES_FACTORY___FILL_PRODUCT_TO__IPRODUCT = eINSTANCE.getEnterpriseDatatypesFactory__FillProductTO__IProduct();

		/**
		 * The meta object literal for the '<em><b>Convert To Enterprise</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTERPRISE_DATATYPES_FACTORY___CONVERT_TO_ENTERPRISE__ENTERPRISETO = eINSTANCE.getEnterpriseDatatypesFactory__ConvertToEnterprise__EnterpriseTO();

		/**
		 * The meta object literal for the '<em><b>Fill Enterprise TO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTERPRISE_DATATYPES_FACTORY___FILL_ENTERPRISE_TO__ITRADINGENTERPRISE = eINSTANCE.getEnterpriseDatatypesFactory__FillEnterpriseTO__ITradingEnterprise();

		/**
		 * The meta object literal for the '<em><b>Convert To Supplier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTERPRISE_DATATYPES_FACTORY___CONVERT_TO_SUPPLIER__SUPPLIERTO = eINSTANCE.getEnterpriseDatatypesFactory__ConvertToSupplier__SupplierTO();

		/**
		 * The meta object literal for the '<em><b>Fill Supplier TO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTERPRISE_DATATYPES_FACTORY___FILL_SUPPLIER_TO__IPRODUCTSUPPLIER = eINSTANCE.getEnterpriseDatatypesFactory__FillSupplierTO__IProductSupplier();

		/**
		 * The meta object literal for the '<em><b>Fill Product With Supplier TO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTERPRISE_DATATYPES_FACTORY___FILL_PRODUCT_WITH_SUPPLIER_TO__IPRODUCT = eINSTANCE.getEnterpriseDatatypesFactory__FillProductWithSupplierTO__IProduct();

		/**
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.ProductImpl
		 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterprisePackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__ID = eINSTANCE.getProduct_Id();

		/**
		 * The meta object literal for the '<em><b>Barcode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__BARCODE = eINSTANCE.getProduct_Barcode();

		/**
		 * The meta object literal for the '<em><b>Purchase Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__PURCHASE_PRICE = eINSTANCE.getProduct_PurchasePrice();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__NAME = eINSTANCE.getProduct_Name();

		/**
		 * The meta object literal for the '<em><b>Supplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__SUPPLIER = eINSTANCE.getProduct_Supplier();

		/**
		 * The meta object literal for the '<em><b>Enterprise Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__ENTERPRISE_QUERY = eINSTANCE.getProduct_EnterpriseQuery();

		/**
		 * The meta object literal for the '<em><b>Registry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__REGISTRY = eINSTANCE.getProduct_Registry();

		/**
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.ProductSupplierImpl <em>Product Supplier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.ProductSupplierImpl
		 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterprisePackageImpl#getProductSupplier()
		 * @generated
		 */
		EClass PRODUCT_SUPPLIER = eINSTANCE.getProductSupplier();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SUPPLIER__ID = eINSTANCE.getProductSupplier_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SUPPLIER__NAME = eINSTANCE.getProductSupplier_Name();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SUPPLIER__PRODUCTS = eINSTANCE.getProductSupplier_Products();

		/**
		 * The meta object literal for the '<em><b>Enterprise Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SUPPLIER__ENTERPRISE_QUERY = eINSTANCE.getProductSupplier_EnterpriseQuery();

		/**
		 * The meta object literal for the '<em><b>Registry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SUPPLIER__REGISTRY = eINSTANCE.getProductSupplier_Registry();

		/**
		 * The meta object literal for the '<em><b>Init Product Supplier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCT_SUPPLIER___INIT_PRODUCT_SUPPLIER = eINSTANCE.getProductSupplier__InitProductSupplier();

		/**
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.TradingEnterpriseImpl <em>Trading Enterprise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.TradingEnterpriseImpl
		 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterprisePackageImpl#getTradingEnterprise()
		 * @generated
		 */
		EClass TRADING_ENTERPRISE = eINSTANCE.getTradingEnterprise();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADING_ENTERPRISE__ID = eINSTANCE.getTradingEnterprise_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADING_ENTERPRISE__NAME = eINSTANCE.getTradingEnterprise_Name();

		/**
		 * The meta object literal for the '<em><b>Suppliers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADING_ENTERPRISE__SUPPLIERS = eINSTANCE.getTradingEnterprise_Suppliers();

		/**
		 * The meta object literal for the '<em><b>Stores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADING_ENTERPRISE__STORES = eINSTANCE.getTradingEnterprise_Stores();

		/**
		 * The meta object literal for the '<em><b>Enterprise Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADING_ENTERPRISE__ENTERPRISE_QUERY = eINSTANCE.getTradingEnterprise_EnterpriseQuery();

		/**
		 * The meta object literal for the '<em><b>Init Trading Enterprise</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRADING_ENTERPRISE___INIT_TRADING_ENTERPRISE = eINSTANCE.getTradingEnterprise__InitTradingEnterprise();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRADING_ENTERPRISE___TO_STRING = eINSTANCE.getTradingEnterprise__ToString();

		/**
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.IProduct <em>IProduct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.IProduct
		 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterprisePackageImpl#getIProduct()
		 * @generated
		 */
		EClass IPRODUCT = eINSTANCE.getIProduct();

	}

} //EnterprisePackage
