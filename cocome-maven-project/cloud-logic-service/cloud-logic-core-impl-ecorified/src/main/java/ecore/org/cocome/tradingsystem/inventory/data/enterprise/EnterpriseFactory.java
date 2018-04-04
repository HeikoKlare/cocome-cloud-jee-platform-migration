package ecore.org.cocome.tradingsystem.inventory.data.enterprise;
	
import org.eclipse.emf.ecore.EFactory;
	
/**
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage
 * @generated
 */
public interface EnterpriseFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * @generated
     */
    EnterpriseFactory eINSTANCE = ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterpriseFactoryImpl.init();
	
	/**
	 * Returns a new object of class '<em>EnterpriseDatatypesFactory</em>'.
	 * @return a new object of class '<em>EnterpriseDatatypesFactory</em>'.
	 * @generated
	 */
	EnterpriseDatatypesFactory createEnterpriseDatatypesFactory();	    		
	
	/**
	 * Returns a new object of class '<em>Product</em>'.
	 * @return a new object of class '<em>Product</em>'.
	 * @generated
	 */
	Product createProduct();	    		
	
	/**
	 * Returns a new object of class '<em>ProductSupplier</em>'.
	 * @return a new object of class '<em>ProductSupplier</em>'.
	 * @generated
	 */
	ProductSupplier createProductSupplier();	    		
	
	/**
	 * Returns a new object of class '<em>TradingEnterprise</em>'.
	 * @return a new object of class '<em>TradingEnterprise</em>'.
	 * @generated
	 */
	TradingEnterprise createTradingEnterprise();	    
	
	/**
	 * Returns the package supported by this factory.
	 * @return the package supported by this factory.
	 * @generated
	 */
	EnterprisePackage getEnterprisePackage();
	
} //EnterpriseFactory
