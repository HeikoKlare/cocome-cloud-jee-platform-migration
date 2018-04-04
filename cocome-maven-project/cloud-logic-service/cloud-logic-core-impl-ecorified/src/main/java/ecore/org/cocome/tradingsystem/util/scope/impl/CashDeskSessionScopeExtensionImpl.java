/**
 */
package ecore.org.cocome.tradingsystem.util.scope.impl;

import java.lang.reflect.InvocationTargetException;

import javax.enterprise.inject.spi.AfterBeanDiscovery;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.BeforeBeanDiscovery;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ecore.org.cocome.tradingsystem.util.scope.ScopePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cash Desk Session Scope Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CashDeskSessionScopeExtensionImpl extends MinimalEObjectImpl.Container implements ecore.org.cocome.tradingsystem.util.scope.CashDeskSessionScopeExtension {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CashDeskSessionScopeExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScopePackage.Literals.CASH_DESK_SESSION_SCOPE_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addScope(BeforeBeanDiscovery event) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerContext(AfterBeanDiscovery event, BeanManager manager) {
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
			case ScopePackage.CASH_DESK_SESSION_SCOPE_EXTENSION___ADD_SCOPE__BEFOREBEANDISCOVERY:
				addScope((BeforeBeanDiscovery)arguments.get(0));
				return null;
			case ScopePackage.CASH_DESK_SESSION_SCOPE_EXTENSION___REGISTER_CONTEXT__AFTERBEANDISCOVERY_BEANMANAGER:
				registerContext((AfterBeanDiscovery)arguments.get(0), (BeanManager)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //CashDeskSessionScopeExtensionImpl
