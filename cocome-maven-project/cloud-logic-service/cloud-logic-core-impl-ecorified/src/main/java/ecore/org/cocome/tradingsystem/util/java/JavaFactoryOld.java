/**
 */
package ecore.org.cocome.tradingsystem.util.java;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ecore.org.cocome.tradingsystem.util.java.JavaPackage
 * @generated
 */
public interface JavaFactoryOld extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavaFactoryOld eINSTANCE = ecore.org.cocome.tradingsystem.util.java.impl.JavaFactoryImplOld.init();

	/**
	 * Returns a new object of class '<em>Assert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assert</em>'.
	 * @generated
	 */
	Assert createAssert();

	/**
	 * Returns a new object of class '<em>Dual Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dual Element</em>'.
	 * @generated
	 */
	<T, E> DualElement<T, E> createDualElement();

	/**
	 * Returns a new object of class '<em>Dual Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dual Iterator</em>'.
	 * @generated
	 */
	<T, E> DualIterator<T, E> createDualIterator();

	/**
	 * Returns a new object of class '<em>Iterables</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iterables</em>'.
	 * @generated
	 */
	Iterables createIterables();

	/**
	 * Returns a new object of class '<em>Lists</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lists</em>'.
	 * @generated
	 */
	Lists createLists();

	/**
	 * Returns a new object of class '<em>Maps</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maps</em>'.
	 * @generated
	 */
	Maps createMaps();

	/**
	 * Returns a new object of class '<em>Reflection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reflection</em>'.
	 * @generated
	 */
	Reflection createReflection();

	/**
	 * Returns a new object of class '<em>Sets</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sets</em>'.
	 * @generated
	 */
	Sets createSets();

	/**
	 * Returns a new object of class '<em>Swing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Swing</em>'.
	 * @generated
	 */
	Swing createSwing();

	/**
	 * Returns a new object of class '<em>Time Span</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Span</em>'.
	 * @generated
	 */
	TimeSpan createTimeSpan();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JavaPackage getJavaPackage();

} //JavaFactory
