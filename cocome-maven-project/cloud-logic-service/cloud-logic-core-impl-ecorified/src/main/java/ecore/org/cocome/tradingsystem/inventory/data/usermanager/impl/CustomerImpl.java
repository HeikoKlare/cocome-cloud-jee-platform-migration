/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Set;

import org.cocome.tradingsystem.inventory.data.store.IStore;
import org.cocome.tradingsystem.inventory.data.usermanager.IUser;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.CustomerImpl#getId <em>Id</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.CustomerImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.CustomerImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.CustomerImpl#getMailAddress <em>Mail Address</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.CustomerImpl#getCreditCardInfoSet <em>Credit Card Info Set</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.CustomerImpl#getPreferredStore <em>Preferred Store</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.CustomerImpl#getUser <em>User</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerImpl extends MinimalEObjectImpl.Container implements ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMailAddress() <em>Mail Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMailAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String MAIL_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMailAddress() <em>Mail Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMailAddress()
	 * @generated
	 * @ordered
	 */
	protected String mailAddress = MAIL_ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCreditCardInfoSet() <em>Credit Card Info Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditCardInfoSet()
	 * @generated
	 * @ordered
	 */
	protected Set<String> creditCardInfoSet;

	/**
	 * The cached value of the '{@link #getPreferredStore() <em>Preferred Store</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredStore()
	 * @generated
	 * @ordered
	 */
	protected IStore preferredStore;

	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final IUser USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected IUser user = USER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsermanagerPackage.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(long newId) {
		long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsermanagerPackage.CUSTOMER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsermanagerPackage.CUSTOMER__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsermanagerPackage.CUSTOMER__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMailAddress() {
		return mailAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMailAddress(String newMailAddress) {
		String oldMailAddress = mailAddress;
		mailAddress = newMailAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsermanagerPackage.CUSTOMER__MAIL_ADDRESS, oldMailAddress, mailAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<String> getCreditCardInfoSet() {
		return creditCardInfoSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreditCardInfoSet(Set<String> newCreditCardInfoSet) {
		Set<String> oldCreditCardInfoSet = creditCardInfoSet;
		creditCardInfoSet = newCreditCardInfoSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsermanagerPackage.CUSTOMER__CREDIT_CARD_INFO_SET, oldCreditCardInfoSet, creditCardInfoSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IStore getPreferredStore() {
		if (preferredStore != null && preferredStore.eIsProxy()) {
			InternalEObject oldPreferredStore = (InternalEObject)preferredStore;
			preferredStore = (IStore)eResolveProxy(oldPreferredStore);
			if (preferredStore != oldPreferredStore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsermanagerPackage.CUSTOMER__PREFERRED_STORE, oldPreferredStore, preferredStore));
			}
		}
		return preferredStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IStore basicGetPreferredStore() {
		return preferredStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferredStore(IStore newPreferredStore) {
		IStore oldPreferredStore = preferredStore;
		preferredStore = newPreferredStore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsermanagerPackage.CUSTOMER__PREFERRED_STORE, oldPreferredStore, preferredStore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IUser getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(IUser newUser) {
		IUser oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsermanagerPackage.CUSTOMER__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<String> getCreditCardInfo() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreditCardInfo(Set<String> creditCardInfo) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addCreditCardInfo(String creditCardInfo) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeCreditCardInfo(String creditCardInfo) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UsermanagerPackage.CUSTOMER__ID:
				return getId();
			case UsermanagerPackage.CUSTOMER__FIRST_NAME:
				return getFirstName();
			case UsermanagerPackage.CUSTOMER__LAST_NAME:
				return getLastName();
			case UsermanagerPackage.CUSTOMER__MAIL_ADDRESS:
				return getMailAddress();
			case UsermanagerPackage.CUSTOMER__CREDIT_CARD_INFO_SET:
				return getCreditCardInfoSet();
			case UsermanagerPackage.CUSTOMER__PREFERRED_STORE:
				if (resolve) return getPreferredStore();
				return basicGetPreferredStore();
			case UsermanagerPackage.CUSTOMER__USER:
				return getUser();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UsermanagerPackage.CUSTOMER__ID:
				setId((Long)newValue);
				return;
			case UsermanagerPackage.CUSTOMER__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case UsermanagerPackage.CUSTOMER__LAST_NAME:
				setLastName((String)newValue);
				return;
			case UsermanagerPackage.CUSTOMER__MAIL_ADDRESS:
				setMailAddress((String)newValue);
				return;
			case UsermanagerPackage.CUSTOMER__CREDIT_CARD_INFO_SET:
				setCreditCardInfoSet((Set<String>)newValue);
				return;
			case UsermanagerPackage.CUSTOMER__PREFERRED_STORE:
				setPreferredStore((IStore)newValue);
				return;
			case UsermanagerPackage.CUSTOMER__USER:
				setUser((IUser)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UsermanagerPackage.CUSTOMER__ID:
				setId(ID_EDEFAULT);
				return;
			case UsermanagerPackage.CUSTOMER__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case UsermanagerPackage.CUSTOMER__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case UsermanagerPackage.CUSTOMER__MAIL_ADDRESS:
				setMailAddress(MAIL_ADDRESS_EDEFAULT);
				return;
			case UsermanagerPackage.CUSTOMER__CREDIT_CARD_INFO_SET:
				setCreditCardInfoSet((Set<String>)null);
				return;
			case UsermanagerPackage.CUSTOMER__PREFERRED_STORE:
				setPreferredStore((IStore)null);
				return;
			case UsermanagerPackage.CUSTOMER__USER:
				setUser(USER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UsermanagerPackage.CUSTOMER__ID:
				return id != ID_EDEFAULT;
			case UsermanagerPackage.CUSTOMER__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case UsermanagerPackage.CUSTOMER__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case UsermanagerPackage.CUSTOMER__MAIL_ADDRESS:
				return MAIL_ADDRESS_EDEFAULT == null ? mailAddress != null : !MAIL_ADDRESS_EDEFAULT.equals(mailAddress);
			case UsermanagerPackage.CUSTOMER__CREDIT_CARD_INFO_SET:
				return creditCardInfoSet != null;
			case UsermanagerPackage.CUSTOMER__PREFERRED_STORE:
				return preferredStore != null;
			case UsermanagerPackage.CUSTOMER__USER:
				return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case UsermanagerPackage.CUSTOMER___GET_CREDIT_CARD_INFO:
				return getCreditCardInfo();
			case UsermanagerPackage.CUSTOMER___SET_CREDIT_CARD_INFO__SET:
				setCreditCardInfo((Set<String>)arguments.get(0));
				return null;
			case UsermanagerPackage.CUSTOMER___ADD_CREDIT_CARD_INFO__STRING:
				addCreditCardInfo((String)arguments.get(0));
				return null;
			case UsermanagerPackage.CUSTOMER___REMOVE_CREDIT_CARD_INFO__STRING:
				removeCreditCardInfo((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", mailAddress: ");
		result.append(mailAddress);
		result.append(", creditCardInfoSet: ");
		result.append(creditCardInfoSet);
		result.append(", user: ");
		result.append(user);
		result.append(')');
		return result.toString();
	}

} //CustomerImpl
