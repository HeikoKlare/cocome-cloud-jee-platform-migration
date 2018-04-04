/**
 */
package ecore.org.cocome.tradingsystem.util.scope;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ecore.org.cocome.tradingsystem.util.scope.ScopePackage
 * @generated
 */
public interface ScopeFactoryOld extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScopeFactoryOld eINSTANCE = ecore.org.cocome.tradingsystem.util.scope.impl.ScopeFactoryImplOld.init();

	/**
	 * Returns a new object of class '<em>Cash Desk Registry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cash Desk Registry</em>'.
	 * @generated
	 */
	CashDeskRegistry createCashDeskRegistry();

	/**
	 * Returns a new object of class '<em>Cash Desk Registry Factory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cash Desk Registry Factory</em>'.
	 * @generated
	 */
	CashDeskRegistryFactory createCashDeskRegistryFactory();

	/**
	 * Returns a new object of class '<em>Cash Desk Session Scope Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cash Desk Session Scope Extension</em>'.
	 * @generated
	 */
	CashDeskSessionScopeExtension createCashDeskSessionScopeExtension();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ScopePackage getScopePackage();

} //ScopeFactory
