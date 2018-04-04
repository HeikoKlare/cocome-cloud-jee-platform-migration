package ecore.org.cocome.tradingsystem.util.java;
	
import org.eclipse.emf.ecore.EFactory;
	
/**
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * @see ecore.org.cocome.tradingsystem.util.java.JavaPackage
 * @generated
 */
public interface JavaFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * @generated
     */
    JavaFactory eINSTANCE = ecore.org.cocome.tradingsystem.util.java.impl.JavaFactoryImpl.init();
	
	/**
	 * Returns a new object of class '<em>Assert</em>'.
	 * @return a new object of class '<em>Assert</em>'.
	 * @generated
	 */
	Assert createAssert();	    		
	
	/**
	 * Returns a new object of class '<em>DualElement</em>'.
	 * @return a new object of class '<em>DualElement</em>'.
	 * @generated
	 */
	DualElement createDualElement();	    		
	
	/**
	 * Returns a new object of class '<em>DualIterator</em>'.
	 * @return a new object of class '<em>DualIterator</em>'.
	 * @generated
	 */
	DualIterator createDualIterator();	    		
	
	/**
	 * Returns a new object of class '<em>Iterables</em>'.
	 * @return a new object of class '<em>Iterables</em>'.
	 * @generated
	 */
	Iterables createIterables();	    		
	
	/**
	 * Returns a new object of class '<em>Lists</em>'.
	 * @return a new object of class '<em>Lists</em>'.
	 * @generated
	 */
	Lists createLists();	    		
	
	/**
	 * Returns a new object of class '<em>Maps</em>'.
	 * @return a new object of class '<em>Maps</em>'.
	 * @generated
	 */
	Maps createMaps();	    		
	
	/**
	 * Returns a new object of class '<em>Reflection</em>'.
	 * @return a new object of class '<em>Reflection</em>'.
	 * @generated
	 */
	Reflection createReflection();	    		
	
	/**
	 * Returns a new object of class '<em>Sets</em>'.
	 * @return a new object of class '<em>Sets</em>'.
	 * @generated
	 */
	Sets createSets();	    		
	
	/**
	 * Returns a new object of class '<em>Swing</em>'.
	 * @return a new object of class '<em>Swing</em>'.
	 * @generated
	 */
	Swing createSwing();	    		
	
	/**
	 * Returns a new object of class '<em>TimeSpan</em>'.
	 * @return a new object of class '<em>TimeSpan</em>'.
	 * @generated
	 */
	TimeSpan createTimeSpan();	    
	
	/**
	 * Returns the package supported by this factory.
	 * @return the package supported by this factory.
	 * @generated
	 */
	JavaPackage getJavaPackage();
	
} //JavaFactory
