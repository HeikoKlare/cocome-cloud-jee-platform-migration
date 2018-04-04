/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.usermanager;

import org.cocome.tradingsystem.inventory.application.store.CustomerWithStoreTO;
import org.cocome.tradingsystem.inventory.application.usermanager.CredentialTO;
import org.cocome.tradingsystem.inventory.application.usermanager.UserTO;
import org.cocome.tradingsystem.inventory.application.usermanager.credentials.ICredential;
import org.cocome.tradingsystem.inventory.data.usermanager.ICustomer;
import org.cocome.tradingsystem.inventory.data.usermanager.IUser;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datatypes Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage#getUsermanagerDatatypesFactory()
 * @model
 * @generated
 */
public interface UsermanagerDatatypesFactory extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.IUser"
	 * @generated
	 */
	IUser getNewUser();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.CustomerWithStoreTO" customerDataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.ICustomer"
	 * @generated
	 */
	CustomerWithStoreTO fillCustomerWithStoreTO(ICustomer customer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.CredentialTO" credentialDataType="ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.credentials.ICredential"
	 * @generated
	 */
	CredentialTO fillCredentialTO(ICredential credential);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.UserTO" userDataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.IUser"
	 * @generated
	 */
	UserTO fillUserTO(IUser user);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.IUser" userTODataType="ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.UserTO"
	 * @generated
	 */
	IUser convertToUser(UserTO userTO);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.ICustomer"
	 * @generated
	 */
	ICustomer getNewCustomer();

} // UsermanagerDatatypesFactory
