/**
 */
package ecore.datatypes.org.cocome.tradingsystem.inventory.data.store;

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
 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.StoreFactoryOld
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
	String eNS_URI = "cloud-logic-core-impl/ecore.datatypes.org.cocome.tradingsystem.inventory.data.store";

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
	StorePackage eINSTANCE = ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl.init();

	/**
	 * The meta object id for the '<em>IOrder Entry</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cocome.tradingsystem.inventory.data.store.IOrderEntry
	 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl#getIOrderEntry()
	 * @generated
	 */
	int IORDER_ENTRY = 0;

	/**
	 * The meta object id for the '<em>IProduct Order</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cocome.tradingsystem.inventory.data.store.IProductOrder
	 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl#getIProductOrder()
	 * @generated
	 */
	int IPRODUCT_ORDER = 1;

	/**
	 * The meta object id for the '<em>IStore Query</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cocome.tradingsystem.inventory.data.store.IStoreQuery
	 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl#getIStoreQuery()
	 * @generated
	 */
	int ISTORE_QUERY = 2;


	/**
	 * Returns the meta object for data type '{@link org.cocome.tradingsystem.inventory.data.store.IOrderEntry <em>IOrder Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IOrder Entry</em>'.
	 * @see org.cocome.tradingsystem.inventory.data.store.IOrderEntry
	 * @model instanceClass="org.cocome.tradingsystem.inventory.data.store.IOrderEntry"
	 * @generated
	 */
	EDataType getIOrderEntry();

	/**
	 * Returns the meta object for data type '{@link org.cocome.tradingsystem.inventory.data.store.IProductOrder <em>IProduct Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IProduct Order</em>'.
	 * @see org.cocome.tradingsystem.inventory.data.store.IProductOrder
	 * @model instanceClass="org.cocome.tradingsystem.inventory.data.store.IProductOrder"
	 * @generated
	 */
	EDataType getIProductOrder();

	/**
	 * Returns the meta object for data type '{@link org.cocome.tradingsystem.inventory.data.store.IStoreQuery <em>IStore Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IStore Query</em>'.
	 * @see org.cocome.tradingsystem.inventory.data.store.IStoreQuery
	 * @model instanceClass="org.cocome.tradingsystem.inventory.data.store.IStoreQuery"
	 * @generated
	 */
	EDataType getIStoreQuery();

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
		 * The meta object literal for the '<em>IOrder Entry</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cocome.tradingsystem.inventory.data.store.IOrderEntry
		 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl#getIOrderEntry()
		 * @generated
		 */
		EDataType IORDER_ENTRY = eINSTANCE.getIOrderEntry();

		/**
		 * The meta object literal for the '<em>IProduct Order</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cocome.tradingsystem.inventory.data.store.IProductOrder
		 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl#getIProductOrder()
		 * @generated
		 */
		EDataType IPRODUCT_ORDER = eINSTANCE.getIProductOrder();

		/**
		 * The meta object literal for the '<em>IStore Query</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cocome.tradingsystem.inventory.data.store.IStoreQuery
		 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl#getIStoreQuery()
		 * @generated
		 */
		EDataType ISTORE_QUERY = eINSTANCE.getIStoreQuery();

	}

} //StorePackage
