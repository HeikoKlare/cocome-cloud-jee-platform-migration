package ecore.org.cocome.tradingsystem.inventory.data.usermanager;
	
import org.eclipse.emf.ecore.EFactory;
	
/**
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage
 * @generated
 */
public interface UsermanagerFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * @generated
     */
    UsermanagerFactory eINSTANCE = ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerFactoryImpl.init();
	
	/**
	 * Returns a new object of class '<em>Customer</em>'.
	 * @return a new object of class '<em>Customer</em>'.
	 * @generated
	 */
	Customer createCustomer();	    		
	
	/**
	 * Returns a new object of class '<em>User</em>'.
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();	    		
	
	/**
	 * Returns a new object of class '<em>UsermanagerDatatypesFactory</em>'.
	 * @return a new object of class '<em>UsermanagerDatatypesFactory</em>'.
	 * @generated
	 */
	UsermanagerDatatypesFactory createUsermanagerDatatypesFactory();	    
	
	/**
	 * Returns the package supported by this factory.
	 * @return the package supported by this factory.
	 * @generated
	 */
	UsermanagerPackage getUsermanagerPackage();
	
} //UsermanagerFactory
