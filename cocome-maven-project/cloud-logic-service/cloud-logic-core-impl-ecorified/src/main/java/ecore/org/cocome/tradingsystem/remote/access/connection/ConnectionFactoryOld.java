/**
 */
package ecore.org.cocome.tradingsystem.remote.access.connection;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ecore.org.cocome.tradingsystem.remote.access.connection.ConnectionPackage
 * @generated
 */
public interface ConnectionFactoryOld extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConnectionFactoryOld eINSTANCE = ecore.org.cocome.tradingsystem.remote.access.connection.impl.ConnectionFactoryImplOld.init();

	/**
	 * Returns a new object of class '<em>CSV Backend Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSV Backend Connection</em>'.
	 * @generated
	 */
	CSVBackendConnection createCSVBackendConnection();

	/**
	 * Returns a new object of class '<em>Get XML From Backend</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get XML From Backend</em>'.
	 * @generated
	 */
	GetXMLFromBackend createGetXMLFromBackend();

	/**
	 * Returns a new object of class '<em>Query Parameter Encoder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Parameter Encoder</em>'.
	 * @generated
	 */
	QueryParameterEncoder createQueryParameterEncoder();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConnectionPackage getConnectionPackage();

} //ConnectionFactory
