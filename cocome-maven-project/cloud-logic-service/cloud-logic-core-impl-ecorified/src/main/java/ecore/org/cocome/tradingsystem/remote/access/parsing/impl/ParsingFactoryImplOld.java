/**
 */
package ecore.org.cocome.tradingsystem.remote.access.parsing.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

import ecore.org.cocome.tradingsystem.remote.access.parsing.CSVHelper;
import ecore.org.cocome.tradingsystem.remote.access.parsing.MessageToCSV;
import ecore.org.cocome.tradingsystem.remote.access.parsing.ParserPostMessage;
import ecore.org.cocome.tradingsystem.remote.access.parsing.ParsingFactoryOld;
import ecore.org.cocome.tradingsystem.remote.access.parsing.ParsingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParsingFactoryImplOld extends EFactoryImpl implements ParsingFactoryOld {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParsingFactoryOld init() {
		return new ParsingFactoryImplOld();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParsingFactoryImplOld() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ParsingPackage.CSV_HELPER: return createCSVHelper();
			case ParsingPackage.MESSAGE_TO_CSV: return createMessageToCSV();
			case ParsingPackage.PARSER_POST_MESSAGE: return createParserPostMessage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSVHelper createCSVHelper() {
		CSVHelperImpl csvHelper = new CSVHelperImpl();
		return csvHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageToCSV createMessageToCSV() {
		MessageToCSVImpl messageToCSV = new MessageToCSVImpl();
		return messageToCSV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParserPostMessage createParserPostMessage() {
		ParserPostMessageImpl parserPostMessage = new ParserPostMessageImpl();
		return parserPostMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParsingPackage getParsingPackage() {
		return (ParsingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ParsingPackage getPackage() {
		return ParsingPackage.eINSTANCE;
	}

} //ParsingFactoryImpl
