/**
 */
package ecore.org.cocome.tradingsystem.remote.access.connection.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

import ecore.org.cocome.tradingsystem.remote.access.connection.CSVBackendConnection;
import ecore.org.cocome.tradingsystem.remote.access.connection.ConnectionFactoryOld;
import ecore.org.cocome.tradingsystem.remote.access.connection.ConnectionPackage;
import ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend;
import ecore.org.cocome.tradingsystem.remote.access.connection.QueryParameterEncoder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectionFactoryImplOld extends EFactoryImpl implements ConnectionFactoryOld {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConnectionFactoryOld init() {
		return new ConnectionFactoryImplOld();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionFactoryImplOld() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConnectionPackage.CSV_BACKEND_CONNECTION: return createCSVBackendConnection();
			case ConnectionPackage.GET_XML_FROM_BACKEND: return createGetXMLFromBackend();
			case ConnectionPackage.QUERY_PARAMETER_ENCODER: return createQueryParameterEncoder();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSVBackendConnection createCSVBackendConnection() {
		CSVBackendConnectionImpl csvBackendConnection = new CSVBackendConnectionImpl();
		return csvBackendConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetXMLFromBackend createGetXMLFromBackend() {
		GetXMLFromBackendImpl getXMLFromBackend = new GetXMLFromBackendImpl();
		return getXMLFromBackend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryParameterEncoder createQueryParameterEncoder() {
		QueryParameterEncoderImpl queryParameterEncoder = new QueryParameterEncoderImpl();
		return queryParameterEncoder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPackage getConnectionPackage() {
		return (ConnectionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConnectionPackage getPackage() {
		return ConnectionPackage.eINSTANCE;
	}

} //ConnectionFactoryImpl
