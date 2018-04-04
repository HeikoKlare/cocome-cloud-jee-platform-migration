package ecore.org.cocome.tradingsystem.remote.access.connection.impl;

import org.cocome.tradingsystem.remote.access.connection.CSVBackendConnection;
import org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend;
import org.cocome.tradingsystem.remote.access.connection.QueryParameterEncoder;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ecore.org.cocome.tradingsystem.remote.access.connection.ConnectionFactory;
import ecore.org.cocome.tradingsystem.remote.access.connection.ConnectionPackage;

/**
 * An implementation of the model <b>Factory</b>.
 * @generated
 */
public class ConnectionFactoryImpl extends EFactoryImpl implements ConnectionFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ConnectionFactory init() {
        try {
            ConnectionFactory theConnectionFactory = (ConnectionFactory)EPackage.Registry.INSTANCE.getEFactory(ConnectionPackage.eNS_URI);
            if (theConnectionFactory != null) {
                return theConnectionFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ConnectionFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * @generated
     */
    public ConnectionFactoryImpl() {
        super();
    }

    /**
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
	 * @generated
	 */
	public CSVBackendConnection createCSVBackendConnection() {
		return new CSVBackendConnection(); // origin code instance
	}			
	
	/**
	 * @generated
	 */
	public GetXMLFromBackend createGetXMLFromBackend() {
		return new GetXMLFromBackend(); // origin code instance
	}			
	
	/**
	 * @generated
	 */
	public QueryParameterEncoder createQueryParameterEncoder() {
		return new QueryParameterEncoder(); // origin code instance
	}	
	
	/**
	 * @generated
	 */
	public ConnectionPackage getConnectionPackage() {
	return (ConnectionPackage)getEPackage();
	}

    /**
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ConnectionPackage getPackage() {
        return ConnectionPackage.eINSTANCE;
    }
    
} //ConnectionFactoryImpl
