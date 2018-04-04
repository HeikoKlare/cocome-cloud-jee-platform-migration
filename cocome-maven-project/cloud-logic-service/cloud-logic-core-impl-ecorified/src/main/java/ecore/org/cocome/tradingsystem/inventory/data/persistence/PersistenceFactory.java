package ecore.org.cocome.tradingsystem.inventory.data.persistence;
	
import org.eclipse.emf.ecore.EFactory;
	
/**
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.PersistencePackage
 * @generated
 */
public interface PersistenceFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * @generated
     */
    PersistenceFactory eINSTANCE = ecore.org.cocome.tradingsystem.inventory.data.persistence.impl.PersistenceFactoryImpl.init();
	
	/**
	 * Returns a new object of class '<em>CloudPersistenceContext</em>'.
	 * @return a new object of class '<em>CloudPersistenceContext</em>'.
	 * @generated
	 */
	CloudPersistenceContext createCloudPersistenceContext();	    		
	
	/**
	 * Returns a new object of class '<em>ServiceAdapterEntityConverter</em>'.
	 * @return a new object of class '<em>ServiceAdapterEntityConverter</em>'.
	 * @generated
	 */
	ServiceAdapterEntityConverter createServiceAdapterEntityConverter();	    		
	
	/**
	 * Returns a new object of class '<em>ServiceAdapterHeaders</em>'.
	 * @return a new object of class '<em>ServiceAdapterHeaders</em>'.
	 * @generated
	 */
	ServiceAdapterHeaders createServiceAdapterHeaders();	    
	
	/**
	 * Returns the package supported by this factory.
	 * @return the package supported by this factory.
	 * @generated
	 */
	PersistencePackage getPersistencePackage();
	
} //PersistenceFactory
