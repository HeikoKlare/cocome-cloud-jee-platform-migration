/**
 */
package ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.impl;

import org.cocome.tradingsystem.inventory.application.usermanager.CredentialTO;
import org.cocome.tradingsystem.inventory.application.usermanager.CredentialType;
import org.cocome.tradingsystem.inventory.application.usermanager.CredentialTypeNotFoundException;
import org.cocome.tradingsystem.inventory.application.usermanager.Role;
import org.cocome.tradingsystem.inventory.application.usermanager.UserTO;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

import ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.UsermanagerFactoryOld;
import ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.UsermanagerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsermanagerFactoryImplOld extends EFactoryImpl implements UsermanagerFactoryOld {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UsermanagerFactoryOld init() {
		return new UsermanagerFactoryImplOld();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsermanagerFactoryImplOld() {
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
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case UsermanagerPackage.CREDENTIAL_TO:
				return createCredentialTOFromString(eDataType, initialValue);
			case UsermanagerPackage.CREDENTIAL_TYPE:
				return createCredentialTypeFromString(eDataType, initialValue);
			case UsermanagerPackage.CREDENTIAL_TYPE_NOT_FOUND_EXCEPTION:
				return createCredentialTypeNotFoundExceptionFromString(eDataType, initialValue);
			case UsermanagerPackage.ROLE:
				return createRoleFromString(eDataType, initialValue);
			case UsermanagerPackage.USER_TO:
				return createUserTOFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case UsermanagerPackage.CREDENTIAL_TO:
				return convertCredentialTOToString(eDataType, instanceValue);
			case UsermanagerPackage.CREDENTIAL_TYPE:
				return convertCredentialTypeToString(eDataType, instanceValue);
			case UsermanagerPackage.CREDENTIAL_TYPE_NOT_FOUND_EXCEPTION:
				return convertCredentialTypeNotFoundExceptionToString(eDataType, instanceValue);
			case UsermanagerPackage.ROLE:
				return convertRoleToString(eDataType, instanceValue);
			case UsermanagerPackage.USER_TO:
				return convertUserTOToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CredentialTO createCredentialTOFromString(EDataType eDataType, String initialValue) {
		return (CredentialTO)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCredentialTOToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CredentialType createCredentialTypeFromString(EDataType eDataType, String initialValue) {
		return (CredentialType)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCredentialTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CredentialTypeNotFoundException createCredentialTypeNotFoundExceptionFromString(EDataType eDataType, String initialValue) {
		return (CredentialTypeNotFoundException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCredentialTypeNotFoundExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRoleFromString(EDataType eDataType, String initialValue) {
		return (Role)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoleToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserTO createUserTOFromString(EDataType eDataType, String initialValue) {
		return (UserTO)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUserTOToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsermanagerPackage getUsermanagerPackage() {
		return (UsermanagerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UsermanagerPackage getPackage() {
		return UsermanagerPackage.eINSTANCE;
	}

} //UsermanagerFactoryImpl
