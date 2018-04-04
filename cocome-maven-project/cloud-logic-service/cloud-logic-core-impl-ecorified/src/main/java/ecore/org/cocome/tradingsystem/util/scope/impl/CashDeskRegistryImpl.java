/**
 */
package ecore.org.cocome.tradingsystem.util.scope.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

import org.cocome.tradingsystem.util.scope.RegistryKeys;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ecore.org.cocome.tradingsystem.util.scope.ScopePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cash Desk Registry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.scope.impl.CashDeskRegistryImpl#getAttributeMap <em>Attribute Map</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.scope.impl.CashDeskRegistryImpl#getContextName <em>Context Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CashDeskRegistryImpl extends MinimalEObjectImpl.Container implements ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistry {
	/**
	 * The cached value of the '{@link #getAttributeMap() <em>Attribute Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeMap()
	 * @generated
	 * @ordered
	 */
	protected HashMap<RegistryKeys, Object> attributeMap;

	/**
	 * The default value of the '{@link #getContextName() <em>Context Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContextName() <em>Context Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextName()
	 * @generated
	 * @ordered
	 */
	protected String contextName = CONTEXT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CashDeskRegistryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScopePackage.Literals.CASH_DESK_REGISTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashMap<RegistryKeys, Object> getAttributeMap() {
		return attributeMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeMap(HashMap<RegistryKeys, Object> newAttributeMap) {
		HashMap<RegistryKeys, Object> oldAttributeMap = attributeMap;
		attributeMap = newAttributeMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScopePackage.CASH_DESK_REGISTRY__ATTRIBUTE_MAP, oldAttributeMap, attributeMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContextName() {
		return contextName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextName(String newContextName) {
		String oldContextName = contextName;
		contextName = newContextName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScopePackage.CASH_DESK_REGISTRY__CONTEXT_NAME, oldContextName, contextName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLong(RegistryKeys name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void putLong(RegistryKeys name, long value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getString(RegistryKeys name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void putString(RegistryKeys name, String value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getObject(RegistryKeys name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void putObject(RegistryKeys name, Object value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasObject(RegistryKeys name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasLong(RegistryKeys name) {
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
			case ScopePackage.CASH_DESK_REGISTRY__ATTRIBUTE_MAP:
				return getAttributeMap();
			case ScopePackage.CASH_DESK_REGISTRY__CONTEXT_NAME:
				return getContextName();
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
			case ScopePackage.CASH_DESK_REGISTRY__ATTRIBUTE_MAP:
				setAttributeMap((HashMap<RegistryKeys, Object>)newValue);
				return;
			case ScopePackage.CASH_DESK_REGISTRY__CONTEXT_NAME:
				setContextName((String)newValue);
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
			case ScopePackage.CASH_DESK_REGISTRY__ATTRIBUTE_MAP:
				setAttributeMap((HashMap<RegistryKeys, Object>)null);
				return;
			case ScopePackage.CASH_DESK_REGISTRY__CONTEXT_NAME:
				setContextName(CONTEXT_NAME_EDEFAULT);
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
			case ScopePackage.CASH_DESK_REGISTRY__ATTRIBUTE_MAP:
				return attributeMap != null;
			case ScopePackage.CASH_DESK_REGISTRY__CONTEXT_NAME:
				return CONTEXT_NAME_EDEFAULT == null ? contextName != null : !CONTEXT_NAME_EDEFAULT.equals(contextName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ScopePackage.CASH_DESK_REGISTRY___GET_LONG__REGISTRYKEYS:
				return getLong((RegistryKeys)arguments.get(0));
			case ScopePackage.CASH_DESK_REGISTRY___PUT_LONG__REGISTRYKEYS_LONG:
				putLong((RegistryKeys)arguments.get(0), (Long)arguments.get(1));
				return null;
			case ScopePackage.CASH_DESK_REGISTRY___GET_STRING__REGISTRYKEYS:
				return getString((RegistryKeys)arguments.get(0));
			case ScopePackage.CASH_DESK_REGISTRY___PUT_STRING__REGISTRYKEYS_STRING:
				putString((RegistryKeys)arguments.get(0), (String)arguments.get(1));
				return null;
			case ScopePackage.CASH_DESK_REGISTRY___GET_OBJECT__REGISTRYKEYS:
				return getObject((RegistryKeys)arguments.get(0));
			case ScopePackage.CASH_DESK_REGISTRY___PUT_OBJECT__REGISTRYKEYS_OBJECT:
				putObject((RegistryKeys)arguments.get(0), arguments.get(1));
				return null;
			case ScopePackage.CASH_DESK_REGISTRY___HAS_OBJECT__REGISTRYKEYS:
				return hasObject((RegistryKeys)arguments.get(0));
			case ScopePackage.CASH_DESK_REGISTRY___HAS_LONG__REGISTRYKEYS:
				return hasLong((RegistryKeys)arguments.get(0));
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
		result.append(" (attributeMap: ");
		result.append(attributeMap);
		result.append(", contextName: ");
		result.append(contextName);
		result.append(')');
		return result.toString();
	}

} //CashDeskRegistryImpl
