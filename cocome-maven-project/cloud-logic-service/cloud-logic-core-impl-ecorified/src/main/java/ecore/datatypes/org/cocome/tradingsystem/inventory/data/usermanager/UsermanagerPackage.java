/**
 */
package ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager;

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
 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerFactoryOld
 * @model kind="package"
 * @generated
 */
public interface UsermanagerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "usermanager";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "cloud-logic-core-impl/ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "usermanager";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UsermanagerPackage eINSTANCE = ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl.init();

	/**
	 * The meta object id for the '<em>ICustomer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cocome.tradingsystem.inventory.data.usermanager.ICustomer
	 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl#getICustomer()
	 * @generated
	 */
	int ICUSTOMER = 0;

	/**
	 * The meta object id for the '<em>IUser</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cocome.tradingsystem.inventory.data.usermanager.IUser
	 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl#getIUser()
	 * @generated
	 */
	int IUSER = 1;


	/**
	 * Returns the meta object for data type '{@link org.cocome.tradingsystem.inventory.data.usermanager.ICustomer <em>ICustomer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ICustomer</em>'.
	 * @see org.cocome.tradingsystem.inventory.data.usermanager.ICustomer
	 * @model instanceClass="org.cocome.tradingsystem.inventory.data.usermanager.ICustomer"
	 * @generated
	 */
	EDataType getICustomer();

	/**
	 * Returns the meta object for data type '{@link org.cocome.tradingsystem.inventory.data.usermanager.IUser <em>IUser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IUser</em>'.
	 * @see org.cocome.tradingsystem.inventory.data.usermanager.IUser
	 * @model instanceClass="org.cocome.tradingsystem.inventory.data.usermanager.IUser"
	 * @generated
	 */
	EDataType getIUser();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UsermanagerFactoryOld getUsermanagerFactory();

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
		 * The meta object literal for the '<em>ICustomer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cocome.tradingsystem.inventory.data.usermanager.ICustomer
		 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl#getICustomer()
		 * @generated
		 */
		EDataType ICUSTOMER = eINSTANCE.getICustomer();

		/**
		 * The meta object literal for the '<em>IUser</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cocome.tradingsystem.inventory.data.usermanager.IUser
		 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl#getIUser()
		 * @generated
		 */
		EDataType IUSER = eINSTANCE.getIUser();

	}

} //UsermanagerPackage
