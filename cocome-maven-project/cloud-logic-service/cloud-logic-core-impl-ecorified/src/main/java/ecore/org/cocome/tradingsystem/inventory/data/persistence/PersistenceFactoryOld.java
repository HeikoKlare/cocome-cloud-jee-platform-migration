/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.persistence;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.PersistencePackage
 * @generated
 */
public interface PersistenceFactoryOld extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PersistenceFactoryOld eINSTANCE = ecore.org.cocome.tradingsystem.inventory.data.persistence.impl.PersistenceFactoryImplOld.init();

	/**
	 * Returns a new object of class '<em>Cloud Persistence Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Persistence Context</em>'.
	 * @generated
	 */
	CloudPersistenceContext createCloudPersistenceContext();

	/**
	 * Returns a new object of class '<em>Service Adapter Entity Converter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Adapter Entity Converter</em>'.
	 * @generated
	 */
	ServiceAdapterEntityConverter createServiceAdapterEntityConverter();

	/**
	 * Returns a new object of class '<em>Service Adapter Headers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Adapter Headers</em>'.
	 * @generated
	 */
	ServiceAdapterHeaders createServiceAdapterHeaders();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PersistencePackage getPersistencePackage();

} //PersistenceFactory
