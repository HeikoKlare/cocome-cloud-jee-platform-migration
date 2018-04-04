/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl;

import java.lang.reflect.InvocationTargetException;

import org.cocome.tradingsystem.inventory.application.store.CustomerWithStoreTO;
import org.cocome.tradingsystem.inventory.application.usermanager.CredentialTO;
import org.cocome.tradingsystem.inventory.application.usermanager.UserTO;
import org.cocome.tradingsystem.inventory.application.usermanager.credentials.ICredential;
import org.cocome.tradingsystem.inventory.data.usermanager.ICustomer;
import org.cocome.tradingsystem.inventory.data.usermanager.IUser;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datatypes Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class UsermanagerDatatypesFactoryImpl extends MinimalEObjectImpl.Container implements ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerDatatypesFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsermanagerDatatypesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsermanagerPackage.Literals.USERMANAGER_DATATYPES_FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IUser getNewUser() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerWithStoreTO fillCustomerWithStoreTO(ICustomer customer) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CredentialTO fillCredentialTO(ICredential credential) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserTO fillUserTO(IUser user) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IUser convertToUser(UserTO userTO) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICustomer getNewCustomer() {
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
			case UsermanagerPackage.USERMANAGER_DATATYPES_FACTORY___GET_NEW_USER:
				return getNewUser();
			case UsermanagerPackage.USERMANAGER_DATATYPES_FACTORY___FILL_CUSTOMER_WITH_STORE_TO__ICUSTOMER:
				return fillCustomerWithStoreTO((ICustomer)arguments.get(0));
			case UsermanagerPackage.USERMANAGER_DATATYPES_FACTORY___FILL_CREDENTIAL_TO__ICREDENTIAL:
				return fillCredentialTO((ICredential)arguments.get(0));
			case UsermanagerPackage.USERMANAGER_DATATYPES_FACTORY___FILL_USER_TO__IUSER:
				return fillUserTO((IUser)arguments.get(0));
			case UsermanagerPackage.USERMANAGER_DATATYPES_FACTORY___CONVERT_TO_USER__USERTO:
				return convertToUser((UserTO)arguments.get(0));
			case UsermanagerPackage.USERMANAGER_DATATYPES_FACTORY___GET_NEW_CUSTOMER:
				return getNewCustomer();
		}
		return super.eInvoke(operationID, arguments);
	}

} //UsermanagerDatatypesFactoryImpl
