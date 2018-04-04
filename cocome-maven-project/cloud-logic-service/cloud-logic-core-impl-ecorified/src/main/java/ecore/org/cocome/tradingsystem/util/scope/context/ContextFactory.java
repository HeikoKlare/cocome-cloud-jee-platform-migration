package ecore.org.cocome.tradingsystem.util.scope.context;
	
import org.eclipse.emf.ecore.EFactory;
	
/**
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * @see ecore.org.cocome.tradingsystem.util.scope.context.ContextPackage
 * @generated
 */
public interface ContextFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * @generated
     */
    ContextFactory eINSTANCE = ecore.org.cocome.tradingsystem.util.scope.context.impl.ContextFactoryImpl.init();
	
	/**
	 * Returns a new object of class '<em>NamedSessionContext</em>'.
	 * @return a new object of class '<em>NamedSessionContext</em>'.
	 * @generated
	 */
	NamedSessionContext createNamedSessionContext();	    		
	
	/**
	 * Returns a new object of class '<em>NamedSessionContextHolder</em>'.
	 * @return a new object of class '<em>NamedSessionContextHolder</em>'.
	 * @generated
	 */
	NamedSessionContextHolder createNamedSessionContextHolder();	    
	
	/**
	 * Returns the package supported by this factory.
	 * @return the package supported by this factory.
	 * @generated
	 */
	ContextPackage getContextPackage();
	
} //ContextFactory
