/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.usermanager;

import java.util.Set;

import org.cocome.tradingsystem.inventory.data.store.IStore;
import org.cocome.tradingsystem.inventory.data.usermanager.IUser;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#getId <em>Id</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#getFirstName <em>First Name</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#getLastName <em>Last Name</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#getMailAddress <em>Mail Address</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#getCreditCardInfoSet <em>Credit Card Info Set</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#getPreferredStore <em>Preferred Store</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#getUser <em>User</em>}</li>
 * </ul>
 *
 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage#getCustomer_Id()
	 * @model
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage#getCustomer_FirstName()
	 * @model
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage#getCustomer_LastName()
	 * @model
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Mail Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mail Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mail Address</em>' attribute.
	 * @see #setMailAddress(String)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage#getCustomer_MailAddress()
	 * @model
	 * @generated
	 */
	String getMailAddress();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#getMailAddress <em>Mail Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mail Address</em>' attribute.
	 * @see #getMailAddress()
	 * @generated
	 */
	void setMailAddress(String value);

	/**
	 * Returns the value of the '<em><b>Credit Card Info Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credit Card Info Set</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit Card Info Set</em>' attribute.
	 * @see #setCreditCardInfoSet(Set)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage#getCustomer_CreditCardInfoSet()
	 * @model dataType="ecore.datatypes.java.util.Set&lt;org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	Set<String> getCreditCardInfoSet();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#getCreditCardInfoSet <em>Credit Card Info Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Card Info Set</em>' attribute.
	 * @see #getCreditCardInfoSet()
	 * @generated
	 */
	void setCreditCardInfoSet(Set<String> value);

	/**
	 * Returns the value of the '<em><b>Preferred Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferred Store</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred Store</em>' reference.
	 * @see #setPreferredStore(IStore)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage#getCustomer_PreferredStore()
	 * @model
	 * @generated
	 */
	IStore getPreferredStore();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#getPreferredStore <em>Preferred Store</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred Store</em>' reference.
	 * @see #getPreferredStore()
	 * @generated
	 */
	void setPreferredStore(IStore value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(IUser)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage#getCustomer_User()
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.IUser"
	 * @generated
	 */
	IUser getUser();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(IUser value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.datatypes.java.util.Set&lt;org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	Set<String> getCreditCardInfo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model creditCardInfoDataType="ecore.datatypes.java.util.Set&lt;org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	void setCreditCardInfo(Set<String> creditCardInfo);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addCreditCardInfo(String creditCardInfo);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeCreditCardInfo(String creditCardInfo);

} // Customer
