package ecore.org.cocome.tradingsystem.remote.access.parsing;
	
import org.eclipse.emf.ecore.EFactory;
	
/**
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.ParsingPackage
 * @generated
 */
public interface ParsingFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * @generated
     */
    ParsingFactory eINSTANCE = ecore.org.cocome.tradingsystem.remote.access.parsing.impl.ParsingFactoryImpl.init();
	
	/**
	 * Returns a new object of class '<em>CSVHelper</em>'.
	 * @return a new object of class '<em>CSVHelper</em>'.
	 * @generated
	 */
	CSVHelper createCSVHelper();	    		
	
	/**
	 * Returns a new object of class '<em>MessageToCSV</em>'.
	 * @return a new object of class '<em>MessageToCSV</em>'.
	 * @generated
	 */
	MessageToCSV createMessageToCSV();	    		
	
	/**
	 * Returns a new object of class '<em>ParserPostMessage</em>'.
	 * @return a new object of class '<em>ParserPostMessage</em>'.
	 * @generated
	 */
	ParserPostMessage createParserPostMessage();	    
	
	/**
	 * Returns the package supported by this factory.
	 * @return the package supported by this factory.
	 * @generated
	 */
	ParsingPackage getParsingPackage();
	
} //ParsingFactory
