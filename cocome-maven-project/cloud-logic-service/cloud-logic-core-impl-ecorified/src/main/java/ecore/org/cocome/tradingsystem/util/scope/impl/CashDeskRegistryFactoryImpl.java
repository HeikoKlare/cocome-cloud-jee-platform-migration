/**
 */
package ecore.org.cocome.tradingsystem.util.scope.impl;

import java.lang.reflect.InvocationTargetException;

import javax.enterprise.context.ContextNotActiveException;
import javax.enterprise.inject.spi.BeanManager;

import org.cocome.tradingsystem.util.scope.IContextRegistry;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ecore.org.cocome.tradingsystem.util.scope.ScopePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cash Desk Registry Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.scope.impl.CashDeskRegistryFactoryImpl#getManager <em>Manager</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.scope.impl.CashDeskRegistryFactoryImpl#getStoreContext <em>Store Context</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.scope.impl.CashDeskRegistryFactoryImpl#getEnterpriseContext <em>Enterprise Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CashDeskRegistryFactoryImpl extends MinimalEObjectImpl.Container implements ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistryFactory {
	/**
	 * The default value of the '{@link #getManager() <em>Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManager()
	 * @generated
	 * @ordered
	 */
	protected static final BeanManager MANAGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManager() <em>Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManager()
	 * @generated
	 * @ordered
	 */
	protected BeanManager manager = MANAGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getStoreContext() <em>Store Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreContext()
	 * @generated
	 * @ordered
	 */
	protected static final IContextRegistry STORE_CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStoreContext() <em>Store Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreContext()
	 * @generated
	 * @ordered
	 */
	protected IContextRegistry storeContext = STORE_CONTEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnterpriseContext() <em>Enterprise Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterpriseContext()
	 * @generated
	 * @ordered
	 */
	protected static final IContextRegistry ENTERPRISE_CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnterpriseContext() <em>Enterprise Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterpriseContext()
	 * @generated
	 * @ordered
	 */
	protected IContextRegistry enterpriseContext = ENTERPRISE_CONTEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CashDeskRegistryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScopePackage.Literals.CASH_DESK_REGISTRY_FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeanManager getManager() {
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManager(BeanManager newManager) {
		BeanManager oldManager = manager;
		manager = newManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScopePackage.CASH_DESK_REGISTRY_FACTORY__MANAGER, oldManager, manager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IContextRegistry getStoreContext() {
		return storeContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoreContext(IContextRegistry newStoreContext) {
		IContextRegistry oldStoreContext = storeContext;
		storeContext = newStoreContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScopePackage.CASH_DESK_REGISTRY_FACTORY__STORE_CONTEXT, oldStoreContext, storeContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IContextRegistry getEnterpriseContext() {
		return enterpriseContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnterpriseContext(IContextRegistry newEnterpriseContext) {
		IContextRegistry oldEnterpriseContext = enterpriseContext;
		enterpriseContext = newEnterpriseContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScopePackage.CASH_DESK_REGISTRY_FACTORY__ENTERPRISE_CONTEXT, oldEnterpriseContext, enterpriseContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IContextRegistry getCashDeskContextRegistry() throws ContextNotActiveException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IContextRegistry getStoreContextRegistry() throws ContextNotActiveException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IContextRegistry getEnterpriseContextRegistry() throws ContextNotActiveException {
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
			case ScopePackage.CASH_DESK_REGISTRY_FACTORY__MANAGER:
				return getManager();
			case ScopePackage.CASH_DESK_REGISTRY_FACTORY__STORE_CONTEXT:
				return getStoreContext();
			case ScopePackage.CASH_DESK_REGISTRY_FACTORY__ENTERPRISE_CONTEXT:
				return getEnterpriseContext();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScopePackage.CASH_DESK_REGISTRY_FACTORY__MANAGER:
				setManager((BeanManager)newValue);
				return;
			case ScopePackage.CASH_DESK_REGISTRY_FACTORY__STORE_CONTEXT:
				setStoreContext((IContextRegistry)newValue);
				return;
			case ScopePackage.CASH_DESK_REGISTRY_FACTORY__ENTERPRISE_CONTEXT:
				setEnterpriseContext((IContextRegistry)newValue);
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
			case ScopePackage.CASH_DESK_REGISTRY_FACTORY__MANAGER:
				setManager(MANAGER_EDEFAULT);
				return;
			case ScopePackage.CASH_DESK_REGISTRY_FACTORY__STORE_CONTEXT:
				setStoreContext(STORE_CONTEXT_EDEFAULT);
				return;
			case ScopePackage.CASH_DESK_REGISTRY_FACTORY__ENTERPRISE_CONTEXT:
				setEnterpriseContext(ENTERPRISE_CONTEXT_EDEFAULT);
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
			case ScopePackage.CASH_DESK_REGISTRY_FACTORY__MANAGER:
				return MANAGER_EDEFAULT == null ? manager != null : !MANAGER_EDEFAULT.equals(manager);
			case ScopePackage.CASH_DESK_REGISTRY_FACTORY__STORE_CONTEXT:
				return STORE_CONTEXT_EDEFAULT == null ? storeContext != null : !STORE_CONTEXT_EDEFAULT.equals(storeContext);
			case ScopePackage.CASH_DESK_REGISTRY_FACTORY__ENTERPRISE_CONTEXT:
				return ENTERPRISE_CONTEXT_EDEFAULT == null ? enterpriseContext != null : !ENTERPRISE_CONTEXT_EDEFAULT.equals(enterpriseContext);
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
			case ScopePackage.CASH_DESK_REGISTRY_FACTORY___GET_CASH_DESK_CONTEXT_REGISTRY:
				return getCashDeskContextRegistry();
			case ScopePackage.CASH_DESK_REGISTRY_FACTORY___GET_STORE_CONTEXT_REGISTRY:
				return getStoreContextRegistry();
			case ScopePackage.CASH_DESK_REGISTRY_FACTORY___GET_ENTERPRISE_CONTEXT_REGISTRY:
				return getEnterpriseContextRegistry();
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
		result.append(" (manager: ");
		result.append(manager);
		result.append(", storeContext: ");
		result.append(storeContext);
		result.append(", enterpriseContext: ");
		result.append(enterpriseContext);
		result.append(')');
		return result.toString();
	}

} //CashDeskRegistryFactoryImpl
