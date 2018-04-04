/**
 */
package ecore.org.cocome.tradingsystem.util.scope.context.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder.NamedSessionInstance;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ecore.org.cocome.tradingsystem.util.scope.context.ContextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Session Context Holder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.scope.context.impl.NamedSessionContextHolderImpl#getBeans <em>Beans</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.scope.context.impl.NamedSessionContextHolderImpl#getContextName <em>Context Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamedSessionContextHolderImpl extends MinimalEObjectImpl.Container implements ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder {
	/**
	 * The cached value of the '{@link #getBeans() <em>Beans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeans()
	 * @generated
	 * @ordered
	 */
	protected Map<Class<?>, NamedSessionInstance<?>> beans;

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
	protected NamedSessionContextHolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.NAMED_SESSION_CONTEXT_HOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<Class<?>, NamedSessionInstance<?>> getBeans() {
		return beans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeans(Map<Class<?>, NamedSessionInstance<?>> newBeans) {
		Map<Class<?>, NamedSessionInstance<?>> oldBeans = beans;
		beans = newBeans;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.NAMED_SESSION_CONTEXT_HOLDER__BEANS, oldBeans, beans));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.NAMED_SESSION_CONTEXT_HOLDER__CONTEXT_NAME, oldContextName, contextName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T> NamedSessionInstance<T> getBean(Class<T> type) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T> void putBean(NamedSessionInstance<T> cashDeskInstance) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T> void destroyBean(NamedSessionInstance<T> cashDeskInstance) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void destroyAllBeans() {
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
			case ContextPackage.NAMED_SESSION_CONTEXT_HOLDER__BEANS:
				return getBeans();
			case ContextPackage.NAMED_SESSION_CONTEXT_HOLDER__CONTEXT_NAME:
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
			case ContextPackage.NAMED_SESSION_CONTEXT_HOLDER__BEANS:
				setBeans((Map<Class<?>, NamedSessionInstance<?>>)newValue);
				return;
			case ContextPackage.NAMED_SESSION_CONTEXT_HOLDER__CONTEXT_NAME:
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
			case ContextPackage.NAMED_SESSION_CONTEXT_HOLDER__BEANS:
				setBeans((Map<Class<?>, NamedSessionInstance<?>>)null);
				return;
			case ContextPackage.NAMED_SESSION_CONTEXT_HOLDER__CONTEXT_NAME:
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
			case ContextPackage.NAMED_SESSION_CONTEXT_HOLDER__BEANS:
				return beans != null;
			case ContextPackage.NAMED_SESSION_CONTEXT_HOLDER__CONTEXT_NAME:
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
	@SuppressWarnings({"rawtypes", "unchecked" })
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ContextPackage.NAMED_SESSION_CONTEXT_HOLDER___GET_BEAN__CLASS:
				return getBean((Class)arguments.get(0));
			case ContextPackage.NAMED_SESSION_CONTEXT_HOLDER___PUT_BEAN__NAMEDSESSIONINSTANCE:
				putBean((NamedSessionInstance)arguments.get(0));
				return null;
			case ContextPackage.NAMED_SESSION_CONTEXT_HOLDER___DESTROY_BEAN__NAMEDSESSIONINSTANCE:
				destroyBean((NamedSessionInstance)arguments.get(0));
				return null;
			case ContextPackage.NAMED_SESSION_CONTEXT_HOLDER___DESTROY_ALL_BEANS:
				destroyAllBeans();
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
		result.append(" (beans: ");
		result.append(beans);
		result.append(", contextName: ");
		result.append(contextName);
		result.append(')');
		return result.toString();
	}

} //NamedSessionContextHolderImpl
