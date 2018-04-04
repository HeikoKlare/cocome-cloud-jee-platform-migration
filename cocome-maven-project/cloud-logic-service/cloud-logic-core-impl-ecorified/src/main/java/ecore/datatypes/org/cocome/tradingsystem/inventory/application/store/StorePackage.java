/**
 */
package ecore.datatypes.org.cocome.tradingsystem.inventory.application.store;

import org.eclipse.emf.ecore.EDataType;
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
 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.StoreFactoryOld
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
	String eNS_URI = "cloud-logic-core-impl/ecore.datatypes.org.cocome.tradingsystem.inventory.application.store";

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
	StorePackage eINSTANCE = ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.impl.StorePackageImpl.init();

	/**
	 * The meta object id for the '<em>Complex Order Entry TO</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cocome.tradingsystem.inventory.application.store.ComplexOrderEntryTO
	 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.impl.StorePackageImpl#getComplexOrderEntryTO()
	 * @generated
	 */
	int COMPLEX_ORDER_ENTRY_TO = 0;

	/**
	 * The meta object id for the '<em>Complex Order TO</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cocome.tradingsystem.inventory.application.store.ComplexOrderTO
	 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.impl.StorePackageImpl#getComplexOrderTO()
	 * @generated
	 */
	int COMPLEX_ORDER_TO = 1;

	/**
	 * The meta object id for the '<em>Customer With Store TO</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cocome.tradingsystem.inventory.application.store.CustomerWithStoreTO
	 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.impl.StorePackageImpl#getCustomerWithStoreTO()
	 * @generated
	 */
	int CUSTOMER_WITH_STORE_TO = 2;

	/**
	 * The meta object id for the '<em>Enterprise TO</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cocome.tradingsystem.inventory.application.store.EnterpriseTO
	 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.impl.StorePackageImpl#getEnterpriseTO()
	 * @generated
	 */
	int ENTERPRISE_TO = 3;

	/**
	 * The meta object id for the '<em>Order Entry TO</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cocome.tradingsystem.inventory.application.store.OrderEntryTO
	 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.impl.StorePackageImpl#getOrderEntryTO()
	 * @generated
	 */
	int ORDER_ENTRY_TO = 4;

	/**
	 * The meta object id for the '<em>Order TO</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cocome.tradingsystem.inventory.application.store.OrderTO
	 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.impl.StorePackageImpl#getOrderTO()
	 * @generated
	 */
	int ORDER_TO = 5;

	/**
	 * The meta object id for the '<em>Product TO</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cocome.tradingsystem.inventory.application.store.ProductTO
	 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.impl.StorePackageImpl#getProductTO()
	 * @generated
	 */
	int PRODUCT_TO = 6;

	/**
	 * The meta object id for the '<em>Product With Stock Item TO</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cocome.tradingsystem.inventory.application.store.ProductWithStockItemTO
	 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.impl.StorePackageImpl#getProductWithStockItemTO()
	 * @generated
	 */
	int PRODUCT_WITH_STOCK_ITEM_TO = 7;

	/**
	 * The meta object id for the '<em>Product With Supplier And Stock Item TO</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cocome.tradingsystem.inventory.application.store.ProductWithSupplierAndStockItemTO
	 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.impl.StorePackageImpl#getProductWithSupplierAndStockItemTO()
	 * @generated
	 */
	int PRODUCT_WITH_SUPPLIER_AND_STOCK_ITEM_TO = 8;

	/**
	 * The meta object id for the '<em>Product With Supplier TO</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cocome.tradingsystem.inventory.application.store.ProductWithSupplierTO
	 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.impl.StorePackageImpl#getProductWithSupplierTO()
	 * @generated
	 */
	int PRODUCT_WITH_SUPPLIER_TO = 9;

	/**
	 * The meta object id for the '<em>Stock Item TO</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cocome.tradingsystem.inventory.application.store.StockItemTO
	 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.impl.StorePackageImpl#getStockItemTO()
	 * @generated
	 */
	int STOCK_ITEM_TO = 10;

	/**
	 * The meta object id for the '<em>TO</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cocome.tradingsystem.inventory.application.store.StoreTO
	 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.impl.StorePackageImpl#getStoreTO()
	 * @generated
	 */
	int STORE_TO = 11;

	/**
	 * The meta object id for the '<em>With Enterprise TO</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cocome.tradingsystem.inventory.application.store.StoreWithEnterpriseTO
	 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.impl.StorePackageImpl#getStoreWithEnterpriseTO()
	 * @generated
	 */
	int STORE_WITH_ENTERPRISE_TO = 12;

	/**
	 * The meta object id for the '<em>Supplier TO</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cocome.tradingsystem.inventory.application.store.SupplierTO
	 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.impl.StorePackageImpl#getSupplierTO()
	 * @generated
	 */
	int SUPPLIER_TO = 13;


	/**
	 * Returns the meta object for data type '{@link org.cocome.tradingsystem.inventory.application.store.ComplexOrderEntryTO <em>Complex Order Entry TO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Complex Order Entry TO</em>'.
	 * @see org.cocome.tradingsystem.inventory.application.store.ComplexOrderEntryTO
	 * @model instanceClass="org.cocome.tradingsystem.inventory.application.store.ComplexOrderEntryTO"
	 * @generated
	 */
	EDataType getComplexOrderEntryTO();

	/**
	 * Returns the meta object for data type '{@link org.cocome.tradingsystem.inventory.application.store.ComplexOrderTO <em>Complex Order TO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Complex Order TO</em>'.
	 * @see org.cocome.tradingsystem.inventory.application.store.ComplexOrderTO
	 * @model instanceClass="org.cocome.tradingsystem.inventory.application.store.ComplexOrderTO"
	 * @generated
	 */
	EDataType getComplexOrderTO();

	/**
	 * Returns the meta object for data type '{@link org.cocome.tradingsystem.inventory.application.store.CustomerWithStoreTO <em>Customer With Store TO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Customer With Store TO</em>'.
	 * @see org.cocome.tradingsystem.inventory.application.store.CustomerWithStoreTO
	 * @model instanceClass="org.cocome.tradingsystem.inventory.application.store.CustomerWithStoreTO"
	 * @generated
	 */
	EDataType getCustomerWithStoreTO();

	/**
	 * Returns the meta object for data type '{@link org.cocome.tradingsystem.inventory.application.store.EnterpriseTO <em>Enterprise TO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Enterprise TO</em>'.
	 * @see org.cocome.tradingsystem.inventory.application.store.EnterpriseTO
	 * @model instanceClass="org.cocome.tradingsystem.inventory.application.store.EnterpriseTO"
	 * @generated
	 */
	EDataType getEnterpriseTO();

	/**
	 * Returns the meta object for data type '{@link org.cocome.tradingsystem.inventory.application.store.OrderEntryTO <em>Order Entry TO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Order Entry TO</em>'.
	 * @see org.cocome.tradingsystem.inventory.application.store.OrderEntryTO
	 * @model instanceClass="org.cocome.tradingsystem.inventory.application.store.OrderEntryTO"
	 * @generated
	 */
	EDataType getOrderEntryTO();

	/**
	 * Returns the meta object for data type '{@link org.cocome.tradingsystem.inventory.application.store.OrderTO <em>Order TO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Order TO</em>'.
	 * @see org.cocome.tradingsystem.inventory.application.store.OrderTO
	 * @model instanceClass="org.cocome.tradingsystem.inventory.application.store.OrderTO"
	 * @generated
	 */
	EDataType getOrderTO();

	/**
	 * Returns the meta object for data type '{@link org.cocome.tradingsystem.inventory.application.store.ProductTO <em>Product TO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Product TO</em>'.
	 * @see org.cocome.tradingsystem.inventory.application.store.ProductTO
	 * @model instanceClass="org.cocome.tradingsystem.inventory.application.store.ProductTO"
	 * @generated
	 */
	EDataType getProductTO();

	/**
	 * Returns the meta object for data type '{@link org.cocome.tradingsystem.inventory.application.store.ProductWithStockItemTO <em>Product With Stock Item TO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Product With Stock Item TO</em>'.
	 * @see org.cocome.tradingsystem.inventory.application.store.ProductWithStockItemTO
	 * @model instanceClass="org.cocome.tradingsystem.inventory.application.store.ProductWithStockItemTO"
	 * @generated
	 */
	EDataType getProductWithStockItemTO();

	/**
	 * Returns the meta object for data type '{@link org.cocome.tradingsystem.inventory.application.store.ProductWithSupplierAndStockItemTO <em>Product With Supplier And Stock Item TO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Product With Supplier And Stock Item TO</em>'.
	 * @see org.cocome.tradingsystem.inventory.application.store.ProductWithSupplierAndStockItemTO
	 * @model instanceClass="org.cocome.tradingsystem.inventory.application.store.ProductWithSupplierAndStockItemTO"
	 * @generated
	 */
	EDataType getProductWithSupplierAndStockItemTO();

	/**
	 * Returns the meta object for data type '{@link org.cocome.tradingsystem.inventory.application.store.ProductWithSupplierTO <em>Product With Supplier TO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Product With Supplier TO</em>'.
	 * @see org.cocome.tradingsystem.inventory.application.store.ProductWithSupplierTO
	 * @model instanceClass="org.cocome.tradingsystem.inventory.application.store.ProductWithSupplierTO"
	 * @generated
	 */
	EDataType getProductWithSupplierTO();

	/**
	 * Returns the meta object for data type '{@link org.cocome.tradingsystem.inventory.application.store.StockItemTO <em>Stock Item TO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stock Item TO</em>'.
	 * @see org.cocome.tradingsystem.inventory.application.store.StockItemTO
	 * @model instanceClass="org.cocome.tradingsystem.inventory.application.store.StockItemTO"
	 * @generated
	 */
	EDataType getStockItemTO();

	/**
	 * Returns the meta object for data type '{@link org.cocome.tradingsystem.inventory.application.store.StoreTO <em>TO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TO</em>'.
	 * @see org.cocome.tradingsystem.inventory.application.store.StoreTO
	 * @model instanceClass="org.cocome.tradingsystem.inventory.application.store.StoreTO"
	 * @generated
	 */
	EDataType getStoreTO();

	/**
	 * Returns the meta object for data type '{@link org.cocome.tradingsystem.inventory.application.store.StoreWithEnterpriseTO <em>With Enterprise TO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>With Enterprise TO</em>'.
	 * @see org.cocome.tradingsystem.inventory.application.store.StoreWithEnterpriseTO
	 * @model instanceClass="org.cocome.tradingsystem.inventory.application.store.StoreWithEnterpriseTO"
	 * @generated
	 */
	EDataType getStoreWithEnterpriseTO();

	/**
	 * Returns the meta object for data type '{@link org.cocome.tradingsystem.inventory.application.store.SupplierTO <em>Supplier TO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Supplier TO</em>'.
	 * @see org.cocome.tradingsystem.inventory.application.store.SupplierTO
	 * @model instanceClass="org.cocome.tradingsystem.inventory.application.store.SupplierTO"
	 * @generated
	 */
	EDataType getSupplierTO();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StoreFactoryOld getStoreFactory();

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
		 * The meta object literal for the '<em>Complex Order Entry TO</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cocome.tradingsystem.inventory.application.store.ComplexOrderEntryTO
		 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.impl.StorePackageImpl#getComplexOrderEntryTO()
		 * @generated
		 */
		EDataType COMPLEX_ORDER_ENTRY_TO = eINSTANCE.getComplexOrderEntryTO();

		/**
		 * The meta object literal for the '<em>Complex Order TO</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cocome.tradingsystem.inventory.application.store.ComplexOrderTO
		 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.impl.StorePackageImpl#getComplexOrderTO()
		 * @generated
		 */
		EDataType COMPLEX_ORDER_TO = eINSTANCE.getComplexOrderTO();

		/**
		 * The meta object literal for the '<em>Customer With Store TO</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cocome.tradingsystem.inventory.application.store.CustomerWithStoreTO
		 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.impl.StorePackageImpl#getCustomerWithStoreTO()
		 * @generated
		 */
		EDataType CUSTOMER_WITH_STORE_TO = eINSTANCE.getCustomerWithStoreTO();

		/**
		 * The meta object literal for the '<em>Enterprise TO</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cocome.tradingsystem.inventory.application.store.EnterpriseTO
		 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.impl.StorePackageImpl#getEnterpriseTO()
		 * @generated
		 */
		EDataType ENTERPRISE_TO = eINSTANCE.getEnterpriseTO();

		/**
		 * The meta object literal for the '<em>Order Entry TO</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cocome.tradingsystem.inventory.application.store.OrderEntryTO
		 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.impl.StorePackageImpl#getOrderEntryTO()
		 * @generated
		 */
		EDataType ORDER_ENTRY_TO = eINSTANCE.getOrderEntryTO();

		/**
		 * The meta object literal for the '<em>Order TO</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cocome.tradingsystem.inventory.application.store.OrderTO
		 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.impl.StorePackageImpl#getOrderTO()
		 * @generated
		 */
		EDataType ORDER_TO = eINSTANCE.getOrderTO();

		/**
		 * The meta object literal for the '<em>Product TO</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cocome.tradingsystem.inventory.application.store.ProductTO
		 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.impl.StorePackageImpl#getProductTO()
		 * @generated
		 */
		EDataType PRODUCT_TO = eINSTANCE.getProductTO();

		/**
		 * The meta object literal for the '<em>Product With Stock Item TO</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cocome.tradingsystem.inventory.application.store.ProductWithStockItemTO
		 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.impl.StorePackageImpl#getProductWithStockItemTO()
		 * @generated
		 */
		EDataType PRODUCT_WITH_STOCK_ITEM_TO = eINSTANCE.getProductWithStockItemTO();

		/**
		 * The meta object literal for the '<em>Product With Supplier And Stock Item TO</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cocome.tradingsystem.inventory.application.store.ProductWithSupplierAndStockItemTO
		 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.impl.StorePackageImpl#getProductWithSupplierAndStockItemTO()
		 * @generated
		 */
		EDataType PRODUCT_WITH_SUPPLIER_AND_STOCK_ITEM_TO = eINSTANCE.getProductWithSupplierAndStockItemTO();

		/**
		 * The meta object literal for the '<em>Product With Supplier TO</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cocome.tradingsystem.inventory.application.store.ProductWithSupplierTO
		 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.impl.StorePackageImpl#getProductWithSupplierTO()
		 * @generated
		 */
		EDataType PRODUCT_WITH_SUPPLIER_TO = eINSTANCE.getProductWithSupplierTO();

		/**
		 * The meta object literal for the '<em>Stock Item TO</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cocome.tradingsystem.inventory.application.store.StockItemTO
		 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.impl.StorePackageImpl#getStockItemTO()
		 * @generated
		 */
		EDataType STOCK_ITEM_TO = eINSTANCE.getStockItemTO();

		/**
		 * The meta object literal for the '<em>TO</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cocome.tradingsystem.inventory.application.store.StoreTO
		 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.impl.StorePackageImpl#getStoreTO()
		 * @generated
		 */
		EDataType STORE_TO = eINSTANCE.getStoreTO();

		/**
		 * The meta object literal for the '<em>With Enterprise TO</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cocome.tradingsystem.inventory.application.store.StoreWithEnterpriseTO
		 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.impl.StorePackageImpl#getStoreWithEnterpriseTO()
		 * @generated
		 */
		EDataType STORE_WITH_ENTERPRISE_TO = eINSTANCE.getStoreWithEnterpriseTO();

		/**
		 * The meta object literal for the '<em>Supplier TO</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cocome.tradingsystem.inventory.application.store.SupplierTO
		 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.impl.StorePackageImpl#getSupplierTO()
		 * @generated
		 */
		EDataType SUPPLIER_TO = eINSTANCE.getSupplierTO();

	}

} //StorePackage
