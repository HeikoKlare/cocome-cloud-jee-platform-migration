/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.usermanager;

import java.util.Map;
import java.util.Set;

import org.cocome.tradingsystem.inventory.application.usermanager.CredentialType;
import org.cocome.tradingsystem.inventory.application.usermanager.CredentialTypeNotFoundException;
import org.cocome.tradingsystem.inventory.application.usermanager.Role;
import org.cocome.tradingsystem.inventory.application.usermanager.UserTO;
import org.cocome.tradingsystem.inventory.application.usermanager.credentials.ICredential;
import org.cocome.tradingsystem.inventory.data.usermanager.IUser;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.User#getUsername <em>Username</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.User#getCredentials <em>Credentials</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.User#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage#getUser_Username()
	 * @model
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.User#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Credentials</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credentials</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credentials</em>' attribute.
	 * @see #setCredentials(Map)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage#getUser_Credentials()
	 * @model dataType="ecore.datatypes.java.util.Map&lt;ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.CredentialType, ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.credentials.ICredential&gt;"
	 * @generated
	 */
	Map<CredentialType, ICredential> getCredentials();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.User#getCredentials <em>Credentials</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credentials</em>' attribute.
	 * @see #getCredentials()
	 * @generated
	 */
	void setCredentials(Map<CredentialType, ICredential> value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' attribute.
	 * @see #setRoles(Set)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage#getUser_Roles()
	 * @model dataType="ecore.datatypes.java.util.Set&lt;ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.Role&gt;"
	 * @generated
	 */
	Set<Role> getRoles();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.User#getRoles <em>Roles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roles</em>' attribute.
	 * @see #getRoles()
	 * @generated
	 */
	void setRoles(Set<Role> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initUser();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model userTODataType="ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.UserTO"
	 * @generated
	 */
	void initUser(UserTO userTO);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model credentialDataType="ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.credentials.ICredential"
	 * @generated
	 */
	void addCredential(ICredential credential);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model credentialTypeDataType="ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.CredentialType"
	 * @generated
	 */
	void removeCredential(CredentialType credentialType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model credentialDataType="ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.credentials.ICredential"
	 * @generated
	 */
	boolean checkCredential(ICredential credential);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model userToCheckDataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.IUser"
	 * @generated
	 */
	boolean checkUserCredentials(IUser userToCheck);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roleDataType="ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.Role"
	 * @generated
	 */
	boolean hasRole(Role role);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roleDataType="ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.Role"
	 * @generated
	 */
	void addRole(Role role);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roleDataType="ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.Role"
	 * @generated
	 */
	void withdrawRole(Role role);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.CredentialTypeNotFoundException" credentialTypeDataType="ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.CredentialType"
	 * @generated
	 */
	String resetCredential(CredentialType credentialType) throws CredentialTypeNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.credentials.ICredential" credentialTypeDataType="ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.CredentialType"
	 * @generated
	 */
	ICredential getCredential(CredentialType credentialType);

} // User
