/**
 */
package ecore.org.cocome.tradingsystem.util.scope.context.impl;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;

import javax.enterprise.context.spi.Contextual;
import javax.enterprise.context.spi.CreationalContext;

import org.cocome.tradingsystem.util.scope.IContextRegistry;
import org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ecore.org.cocome.tradingsystem.util.scope.context.ContextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Session Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.scope.context.impl.NamedSessionContextImpl#getIsActive <em>Is Active</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.scope.context.impl.NamedSessionContextImpl#getProvidedScope <em>Provided Scope</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.scope.context.impl.NamedSessionContextImpl#getContext <em>Context</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.scope.context.impl.NamedSessionContextImpl#getContextHolder <em>Context Holder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamedSessionContextImpl extends MinimalEObjectImpl.Container implements ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext {
	/**
	 * The cached value of the '{@link #getIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsActive()
	 * @generated
	 * @ordered
	 */
	protected ThreadLocal<Boolean> isActive;

	/**
	 * The cached value of the '{@link #getProvidedScope() <em>Provided Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedScope()
	 * @generated
	 * @ordered
	 */
	protected ThreadLocal<Class<? extends Annotation>> providedScope;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected ThreadLocal<IContextRegistry> context;

	/**
	 * The cached value of the '{@link #getContextHolder() <em>Context Holder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextHolder()
	 * @generated
	 * @ordered
	 */
	protected ThreadLocal<NamedSessionContextHolder> contextHolder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedSessionContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.NAMED_SESSION_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadLocal<Boolean> getIsActive() {
		return isActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsActive(ThreadLocal<Boolean> newIsActive) {
		ThreadLocal<Boolean> oldIsActive = isActive;
		isActive = newIsActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.NAMED_SESSION_CONTEXT__IS_ACTIVE, oldIsActive, isActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadLocal<Class<? extends Annotation>> getProvidedScope() {
		return providedScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedScope(ThreadLocal<Class<? extends Annotation>> newProvidedScope) {
		ThreadLocal<Class<? extends Annotation>> oldProvidedScope = providedScope;
		providedScope = newProvidedScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.NAMED_SESSION_CONTEXT__PROVIDED_SCOPE, oldProvidedScope, providedScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadLocal<IContextRegistry> getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(ThreadLocal<IContextRegistry> newContext) {
		ThreadLocal<IContextRegistry> oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.NAMED_SESSION_CONTEXT__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadLocal<NamedSessionContextHolder> getContextHolder() {
		return contextHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextHolder(ThreadLocal<NamedSessionContextHolder> newContextHolder) {
		ThreadLocal<NamedSessionContextHolder> oldContextHolder = contextHolder;
		contextHolder = newContextHolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.NAMED_SESSION_CONTEXT__CONTEXT_HOLDER, oldContextHolder, contextHolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class<? extends Annotation> getScope() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T> T get(Contextual<T> contextual, CreationalContext<T> creationalContext) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T> T get(Contextual<T> contextual) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActive() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean activate(IContextRegistry context) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deactivateCurrentContext() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteCurrentContext() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IContextRegistry getActiveContext() {
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
			case ContextPackage.NAMED_SESSION_CONTEXT__IS_ACTIVE:
				return getIsActive();
			case ContextPackage.NAMED_SESSION_CONTEXT__PROVIDED_SCOPE:
				return getProvidedScope();
			case ContextPackage.NAMED_SESSION_CONTEXT__CONTEXT:
				return getContext();
			case ContextPackage.NAMED_SESSION_CONTEXT__CONTEXT_HOLDER:
				return getContextHolder();
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
			case ContextPackage.NAMED_SESSION_CONTEXT__IS_ACTIVE:
				setIsActive((ThreadLocal<Boolean>)newValue);
				return;
			case ContextPackage.NAMED_SESSION_CONTEXT__PROVIDED_SCOPE:
				setProvidedScope((ThreadLocal<Class<? extends Annotation>>)newValue);
				return;
			case ContextPackage.NAMED_SESSION_CONTEXT__CONTEXT:
				setContext((ThreadLocal<IContextRegistry>)newValue);
				return;
			case ContextPackage.NAMED_SESSION_CONTEXT__CONTEXT_HOLDER:
				setContextHolder((ThreadLocal<NamedSessionContextHolder>)newValue);
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
			case ContextPackage.NAMED_SESSION_CONTEXT__IS_ACTIVE:
				setIsActive((ThreadLocal<Boolean>)null);
				return;
			case ContextPackage.NAMED_SESSION_CONTEXT__PROVIDED_SCOPE:
				setProvidedScope((ThreadLocal<Class<? extends Annotation>>)null);
				return;
			case ContextPackage.NAMED_SESSION_CONTEXT__CONTEXT:
				setContext((ThreadLocal<IContextRegistry>)null);
				return;
			case ContextPackage.NAMED_SESSION_CONTEXT__CONTEXT_HOLDER:
				setContextHolder((ThreadLocal<NamedSessionContextHolder>)null);
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
			case ContextPackage.NAMED_SESSION_CONTEXT__IS_ACTIVE:
				return isActive != null;
			case ContextPackage.NAMED_SESSION_CONTEXT__PROVIDED_SCOPE:
				return providedScope != null;
			case ContextPackage.NAMED_SESSION_CONTEXT__CONTEXT:
				return context != null;
			case ContextPackage.NAMED_SESSION_CONTEXT__CONTEXT_HOLDER:
				return contextHolder != null;
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
			case ContextPackage.NAMED_SESSION_CONTEXT___GET_SCOPE:
				return getScope();
			case ContextPackage.NAMED_SESSION_CONTEXT___GET__CONTEXTUAL_CREATIONALCONTEXT:
				return get((Contextual)arguments.get(0), (CreationalContext)arguments.get(1));
			case ContextPackage.NAMED_SESSION_CONTEXT___GET__CONTEXTUAL:
				return get((Contextual)arguments.get(0));
			case ContextPackage.NAMED_SESSION_CONTEXT___IS_ACTIVE:
				return isActive();
			case ContextPackage.NAMED_SESSION_CONTEXT___ACTIVATE__ICONTEXTREGISTRY:
				return activate((IContextRegistry)arguments.get(0));
			case ContextPackage.NAMED_SESSION_CONTEXT___DEACTIVATE_CURRENT_CONTEXT:
				deactivateCurrentContext();
				return null;
			case ContextPackage.NAMED_SESSION_CONTEXT___GET_NAME:
				return getName();
			case ContextPackage.NAMED_SESSION_CONTEXT___DELETE_CURRENT_CONTEXT:
				deleteCurrentContext();
				return null;
			case ContextPackage.NAMED_SESSION_CONTEXT___GET_ACTIVE_CONTEXT:
				return getActiveContext();
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
		result.append(" (isActive: ");
		result.append(isActive);
		result.append(", providedScope: ");
		result.append(providedScope);
		result.append(", context: ");
		result.append(context);
		result.append(", contextHolder: ");
		result.append(contextHolder);
		result.append(')');
		return result.toString();
	}

} //NamedSessionContextImpl
