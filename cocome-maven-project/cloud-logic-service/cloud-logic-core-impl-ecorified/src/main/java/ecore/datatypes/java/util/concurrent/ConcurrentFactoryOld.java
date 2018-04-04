/**
 */
package ecore.datatypes.java.util.concurrent;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ecore.datatypes.java.util.concurrent.ConcurrentPackage
 * @generated
 */
public interface ConcurrentFactoryOld extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConcurrentFactoryOld eINSTANCE = ecore.datatypes.java.util.concurrent.impl.ConcurrentFactoryImplOld.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConcurrentPackage getConcurrentPackage();

} //ConcurrentFactory
