package ecore.org.cocome.tradingsystem.util.scope;
	
import org.eclipse.emf.ecore.EFactory;
	
/**
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * @see ecore.org.cocome.tradingsystem.util.scope.ScopePackage
 * @generated
 */
public interface ScopeFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * @generated
     */
    ScopeFactory eINSTANCE = ecore.org.cocome.tradingsystem.util.scope.impl.ScopeFactoryImpl.init();
	
	/**
	 * Returns a new object of class '<em>CashDeskRegistry</em>'.
	 * @return a new object of class '<em>CashDeskRegistry</em>'.
	 * @generated
	 */
	CashDeskRegistry createCashDeskRegistry();	    		
	
	/**
	 * Returns a new object of class '<em>CashDeskRegistryFactory</em>'.
	 * @return a new object of class '<em>CashDeskRegistryFactory</em>'.
	 * @generated
	 */
	CashDeskRegistryFactory createCashDeskRegistryFactory();	    		
	
	/**
	 * Returns a new object of class '<em>CashDeskSessionScopeExtension</em>'.
	 * @return a new object of class '<em>CashDeskSessionScopeExtension</em>'.
	 * @generated
	 */
	CashDeskSessionScopeExtension createCashDeskSessionScopeExtension();	    
	
	/**
	 * Returns the package supported by this factory.
	 * @return the package supported by this factory.
	 * @generated
	 */
	ScopePackage getScopePackage();
	
} //ScopeFactory
