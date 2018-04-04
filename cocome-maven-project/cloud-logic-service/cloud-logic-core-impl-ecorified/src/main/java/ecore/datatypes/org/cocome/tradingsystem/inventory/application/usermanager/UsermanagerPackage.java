/**
 */
package ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager;

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
 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.UsermanagerFactoryOld
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
	String eNS_URI = "cloud-logic-core-impl/ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager";

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
	UsermanagerPackage eINSTANCE = ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.impl.UsermanagerPackageImpl.init();

	/**
	 * The meta object id for the '<em>Credential TO</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cocome.tradingsystem.inventory.application.usermanager.CredentialTO
	 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.impl.UsermanagerPackageImpl#getCredentialTO()
	 * @generated
	 */
	int CREDENTIAL_TO = 0;

	/**
	 * The meta object id for the '<em>Credential Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cocome.tradingsystem.inventory.application.usermanager.CredentialType
	 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.impl.UsermanagerPackageImpl#getCredentialType()
	 * @generated
	 */
	int CREDENTIAL_TYPE = 1;

	/**
	 * The meta object id for the '<em>Credential Type Not Found Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cocome.tradingsystem.inventory.application.usermanager.CredentialTypeNotFoundException
	 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.impl.UsermanagerPackageImpl#getCredentialTypeNotFoundException()
	 * @generated
	 */
	int CREDENTIAL_TYPE_NOT_FOUND_EXCEPTION = 2;

	/**
	 * The meta object id for the '<em>Role</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cocome.tradingsystem.inventory.application.usermanager.Role
	 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.impl.UsermanagerPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 3;

	/**
	 * The meta object id for the '<em>User TO</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cocome.tradingsystem.inventory.application.usermanager.UserTO
	 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.impl.UsermanagerPackageImpl#getUserTO()
	 * @generated
	 */
	int USER_TO = 4;


	/**
	 * Returns the meta object for data type '{@link org.cocome.tradingsystem.inventory.application.usermanager.CredentialTO <em>Credential TO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Credential TO</em>'.
	 * @see org.cocome.tradingsystem.inventory.application.usermanager.CredentialTO
	 * @model instanceClass="org.cocome.tradingsystem.inventory.application.usermanager.CredentialTO"
	 * @generated
	 */
	EDataType getCredentialTO();

	/**
	 * Returns the meta object for data type '{@link org.cocome.tradingsystem.inventory.application.usermanager.CredentialType <em>Credential Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Credential Type</em>'.
	 * @see org.cocome.tradingsystem.inventory.application.usermanager.CredentialType
	 * @model instanceClass="org.cocome.tradingsystem.inventory.application.usermanager.CredentialType"
	 * @generated
	 */
	EDataType getCredentialType();

	/**
	 * Returns the meta object for data type '{@link org.cocome.tradingsystem.inventory.application.usermanager.CredentialTypeNotFoundException <em>Credential Type Not Found Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Credential Type Not Found Exception</em>'.
	 * @see org.cocome.tradingsystem.inventory.application.usermanager.CredentialTypeNotFoundException
	 * @model instanceClass="org.cocome.tradingsystem.inventory.application.usermanager.CredentialTypeNotFoundException"
	 * @generated
	 */
	EDataType getCredentialTypeNotFoundException();

	/**
	 * Returns the meta object for data type '{@link org.cocome.tradingsystem.inventory.application.usermanager.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Role</em>'.
	 * @see org.cocome.tradingsystem.inventory.application.usermanager.Role
	 * @model instanceClass="org.cocome.tradingsystem.inventory.application.usermanager.Role"
	 * @generated
	 */
	EDataType getRole();

	/**
	 * Returns the meta object for data type '{@link org.cocome.tradingsystem.inventory.application.usermanager.UserTO <em>User TO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>User TO</em>'.
	 * @see org.cocome.tradingsystem.inventory.application.usermanager.UserTO
	 * @model instanceClass="org.cocome.tradingsystem.inventory.application.usermanager.UserTO"
	 * @generated
	 */
	EDataType getUserTO();

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
		 * The meta object literal for the '<em>Credential TO</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cocome.tradingsystem.inventory.application.usermanager.CredentialTO
		 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.impl.UsermanagerPackageImpl#getCredentialTO()
		 * @generated
		 */
		EDataType CREDENTIAL_TO = eINSTANCE.getCredentialTO();

		/**
		 * The meta object literal for the '<em>Credential Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cocome.tradingsystem.inventory.application.usermanager.CredentialType
		 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.impl.UsermanagerPackageImpl#getCredentialType()
		 * @generated
		 */
		EDataType CREDENTIAL_TYPE = eINSTANCE.getCredentialType();

		/**
		 * The meta object literal for the '<em>Credential Type Not Found Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cocome.tradingsystem.inventory.application.usermanager.CredentialTypeNotFoundException
		 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.impl.UsermanagerPackageImpl#getCredentialTypeNotFoundException()
		 * @generated
		 */
		EDataType CREDENTIAL_TYPE_NOT_FOUND_EXCEPTION = eINSTANCE.getCredentialTypeNotFoundException();

		/**
		 * The meta object literal for the '<em>Role</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cocome.tradingsystem.inventory.application.usermanager.Role
		 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.impl.UsermanagerPackageImpl#getRole()
		 * @generated
		 */
		EDataType ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em>User TO</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cocome.tradingsystem.inventory.application.usermanager.UserTO
		 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.impl.UsermanagerPackageImpl#getUserTO()
		 * @generated
		 */
		EDataType USER_TO = eINSTANCE.getUserTO();

	}

} //UsermanagerPackage
