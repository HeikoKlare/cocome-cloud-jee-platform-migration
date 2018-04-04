/**
 */
package ecore.org.cocome.tradingsystem.remote.access.parsing;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.ParsingPackage
 * @generated
 */
public interface ParsingFactoryOld extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParsingFactoryOld eINSTANCE = ecore.org.cocome.tradingsystem.remote.access.parsing.impl.ParsingFactoryImplOld.init();

	/**
	 * Returns a new object of class '<em>CSV Helper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSV Helper</em>'.
	 * @generated
	 */
	CSVHelper createCSVHelper();

	/**
	 * Returns a new object of class '<em>Message To CSV</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message To CSV</em>'.
	 * @generated
	 */
	MessageToCSV createMessageToCSV();

	/**
	 * Returns a new object of class '<em>Parser Post Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parser Post Message</em>'.
	 * @generated
	 */
	ParserPostMessage createParserPostMessage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ParsingPackage getParsingPackage();

} //ParsingFactory
