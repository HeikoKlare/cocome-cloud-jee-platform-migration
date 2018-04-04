/**
 */
package ecore.datatypes.javax.ejb;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ecore.datatypes.javax.ejb.EjbPackage
 * @generated
 */
public interface EjbFactoryOld extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EjbFactoryOld eINSTANCE = ecore.datatypes.javax.ejb.impl.EjbFactoryImplOld.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EjbPackage getEjbPackage();

} //EjbFactory
