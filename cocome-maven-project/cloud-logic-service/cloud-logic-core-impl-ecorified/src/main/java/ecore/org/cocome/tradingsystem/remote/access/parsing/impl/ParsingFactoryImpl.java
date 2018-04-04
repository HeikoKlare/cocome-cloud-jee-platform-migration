package ecore.org.cocome.tradingsystem.remote.access.parsing.impl;

import org.cocome.tradingsystem.remote.access.parsing.CSVHelper;
import org.cocome.tradingsystem.remote.access.parsing.MessageToCSV;
import org.cocome.tradingsystem.remote.access.parsing.ParserPostMessage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ecore.org.cocome.tradingsystem.remote.access.parsing.ParsingFactory;
import ecore.org.cocome.tradingsystem.remote.access.parsing.ParsingPackage;

/**
 * An implementation of the model <b>Factory</b>.
 * @generated
 */
public class ParsingFactoryImpl extends EFactoryImpl implements ParsingFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ParsingFactory init() {
        try {
            ParsingFactory theParsingFactory = (ParsingFactory)EPackage.Registry.INSTANCE.getEFactory(ParsingPackage.eNS_URI);
            if (theParsingFactory != null) {
                return theParsingFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ParsingFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * @generated
     */
    public ParsingFactoryImpl() {
        super();
    }

    /**
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
	 * @generated
	 */
	public CSVHelper createCSVHelper() {
		return new CSVHelper(); // origin code instance
	}			
	
	/**
	 * @generated
	 */
	public MessageToCSV createMessageToCSV() {
		return new MessageToCSV(); // origin code instance
	}			
	
	/**
	 * @generated
	 */
	public ParserPostMessage createParserPostMessage() {
		return new ParserPostMessage(); // origin code instance
	}	
	
	/**
	 * @generated
	 */
	public ParsingPackage getParsingPackage() {
	return (ParsingPackage)getEPackage();
	}

    /**
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ParsingPackage getPackage() {
        return ParsingPackage.eINSTANCE;
    }
    
} //ParsingFactoryImpl
