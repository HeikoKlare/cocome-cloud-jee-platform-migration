/**
 */
package ecore.org.cocome.tradingsystem.util.scope.context;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ecore.org.cocome.tradingsystem.util.scope.context.ContextPackage
 * @generated
 */
public interface ContextFactoryOld extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContextFactoryOld eINSTANCE = ecore.org.cocome.tradingsystem.util.scope.context.impl.ContextFactoryImplOld.init();

	/**
	 * Returns a new object of class '<em>Named Session Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Session Context</em>'.
	 * @generated
	 */
	NamedSessionContext createNamedSessionContext();

	/**
	 * Returns a new object of class '<em>Named Session Context Holder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Session Context Holder</em>'.
	 * @generated
	 */
	NamedSessionContextHolder createNamedSessionContextHolder();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ContextPackage getContextPackage();

} //ContextFactory
