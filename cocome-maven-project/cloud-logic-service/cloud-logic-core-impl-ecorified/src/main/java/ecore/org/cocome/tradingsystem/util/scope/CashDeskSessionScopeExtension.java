/**
 */
package ecore.org.cocome.tradingsystem.util.scope;

import javax.enterprise.inject.spi.AfterBeanDiscovery;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.BeforeBeanDiscovery;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cash Desk Session Scope Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ecore.org.cocome.tradingsystem.util.scope.ScopePackage#getCashDeskSessionScopeExtension()
 * @model
 * @generated
 */
public interface CashDeskSessionScopeExtension extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model eventDataType="ecore.datatypes.javax.enterprise.inject.spi.BeforeBeanDiscovery"
	 * @generated
	 */
	void addScope(BeforeBeanDiscovery event);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model eventDataType="ecore.datatypes.javax.enterprise.inject.spi.AfterBeanDiscovery" managerDataType="ecore.datatypes.javax.enterprise.inject.spi.BeanManager"
	 * @generated
	 */
	void registerContext(AfterBeanDiscovery event, BeanManager manager);

} // CashDeskSessionScopeExtension
