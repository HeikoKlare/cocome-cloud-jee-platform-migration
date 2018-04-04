package ecore.org.cocome.tradingsystem.remote.access.connection;
	
import org.eclipse.emf.ecore.EFactory;
	
/**
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * @see ecore.org.cocome.tradingsystem.remote.access.connection.ConnectionPackage
 * @generated
 */
public interface ConnectionFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * @generated
     */
    ConnectionFactory eINSTANCE = ecore.org.cocome.tradingsystem.remote.access.connection.impl.ConnectionFactoryImpl.init();
	
	/**
	 * Returns a new object of class '<em>CSVBackendConnection</em>'.
	 * @return a new object of class '<em>CSVBackendConnection</em>'.
	 * @generated
	 */
	CSVBackendConnection createCSVBackendConnection();	    		
	
	/**
	 * Returns a new object of class '<em>GetXMLFromBackend</em>'.
	 * @return a new object of class '<em>GetXMLFromBackend</em>'.
	 * @generated
	 */
	GetXMLFromBackend createGetXMLFromBackend();	    		
	
	/**
	 * Returns a new object of class '<em>QueryParameterEncoder</em>'.
	 * @return a new object of class '<em>QueryParameterEncoder</em>'.
	 * @generated
	 */
	QueryParameterEncoder createQueryParameterEncoder();	    
	
	/**
	 * Returns the package supported by this factory.
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConnectionPackage getConnectionPackage();
	
} //ConnectionFactory
