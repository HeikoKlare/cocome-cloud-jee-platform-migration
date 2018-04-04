/**
 */
package ecore.datatypes.javax.enterprise.inject.spi;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ecore.datatypes.javax.enterprise.inject.spi.SpiPackage
 * @generated
 */
public interface SpiFactoryOld extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpiFactoryOld eINSTANCE = ecore.datatypes.javax.enterprise.inject.spi.impl.SpiFactoryImplOld.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SpiPackage getSpiPackage();

} //SpiFactory
