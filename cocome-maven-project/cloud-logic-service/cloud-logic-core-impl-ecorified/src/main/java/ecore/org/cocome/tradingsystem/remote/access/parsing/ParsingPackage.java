/**
 */
package ecore.org.cocome.tradingsystem.remote.access.parsing;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.ParsingFactoryOld
 * @model kind="package"
 * @generated
 */
public interface ParsingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "parsing";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "cloud-logic-core-impl/ecore.org.cocome.tradingsystem.remote.access.parsing";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "parsing";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParsingPackage eINSTANCE = ecore.org.cocome.tradingsystem.remote.access.parsing.impl.ParsingPackageImpl.init();

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.remote.access.parsing.impl.CSVHelperImpl <em>CSV Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.impl.CSVHelperImpl
	 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.impl.ParsingPackageImpl#getCSVHelper()
	 * @generated
	 */
	int CSV_HELPER = 0;

	/**
	 * The number of structural features of the '<em>CSV Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_HELPER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Stores</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_HELPER___GET_STORES__STRING = 0;

	/**
	 * The operation id for the '<em>Get Customers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_HELPER___GET_CUSTOMERS__STRING = 1;

	/**
	 * The operation id for the '<em>Get Users</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_HELPER___GET_USERS__STRING = 2;

	/**
	 * The operation id for the '<em>Get Enterprises</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_HELPER___GET_ENTERPRISES__STRING = 3;

	/**
	 * The operation id for the '<em>Get Stock Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_HELPER___GET_STOCK_ITEMS__STRING = 4;

	/**
	 * The operation id for the '<em>Get Products</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_HELPER___GET_PRODUCTS__STRING = 5;

	/**
	 * The operation id for the '<em>Get Product Suppliers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_HELPER___GET_PRODUCT_SUPPLIERS__STRING = 6;

	/**
	 * The operation id for the '<em>Get Product Orders</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_HELPER___GET_PRODUCT_ORDERS__STRING = 7;

	/**
	 * The number of operations of the '<em>CSV Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_HELPER_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.remote.access.parsing.impl.MessageToCSVImpl <em>Message To CSV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.impl.MessageToCSVImpl
	 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.impl.ParsingPackageImpl#getMessageToCSV()
	 * @generated
	 */
	int MESSAGE_TO_CSV = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TO_CSV__MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Message To CSV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TO_CSV_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get CSV</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TO_CSV___GET_CSV = 0;

	/**
	 * The number of operations of the '<em>Message To CSV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TO_CSV_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.remote.access.parsing.impl.ParserPostMessageImpl <em>Parser Post Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.impl.ParserPostMessageImpl
	 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.impl.ParsingPackageImpl#getParserPostMessage()
	 * @generated
	 */
	int PARSER_POST_MESSAGE = 2;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_POST_MESSAGE__RESPONSE = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_POST_MESSAGE__MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_POST_MESSAGE__TIME = 2;

	/**
	 * The feature id for the '<em><b>Lebel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_POST_MESSAGE__LEBEL = 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_POST_MESSAGE__STATUS = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_POST_MESSAGE__DESCRIPTION = 5;

	/**
	 * The number of structural features of the '<em>Parser Post Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_POST_MESSAGE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Parser Post Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_POST_MESSAGE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.remote.access.parsing.CSVHelper <em>CSV Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSV Helper</em>'.
	 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.CSVHelper
	 * @generated
	 */
	EClass getCSVHelper();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.remote.access.parsing.CSVHelper#getStores(java.lang.String) <em>Get Stores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Stores</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.CSVHelper#getStores(java.lang.String)
	 * @generated
	 */
	EOperation getCSVHelper__GetStores__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.remote.access.parsing.CSVHelper#getCustomers(java.lang.String) <em>Get Customers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Customers</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.CSVHelper#getCustomers(java.lang.String)
	 * @generated
	 */
	EOperation getCSVHelper__GetCustomers__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.remote.access.parsing.CSVHelper#getUsers(java.lang.String) <em>Get Users</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Users</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.CSVHelper#getUsers(java.lang.String)
	 * @generated
	 */
	EOperation getCSVHelper__GetUsers__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.remote.access.parsing.CSVHelper#getEnterprises(java.lang.String) <em>Get Enterprises</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Enterprises</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.CSVHelper#getEnterprises(java.lang.String)
	 * @generated
	 */
	EOperation getCSVHelper__GetEnterprises__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.remote.access.parsing.CSVHelper#getStockItems(java.lang.String) <em>Get Stock Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Stock Items</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.CSVHelper#getStockItems(java.lang.String)
	 * @generated
	 */
	EOperation getCSVHelper__GetStockItems__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.remote.access.parsing.CSVHelper#getProducts(java.lang.String) <em>Get Products</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Products</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.CSVHelper#getProducts(java.lang.String)
	 * @generated
	 */
	EOperation getCSVHelper__GetProducts__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.remote.access.parsing.CSVHelper#getProductSuppliers(java.lang.String) <em>Get Product Suppliers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Product Suppliers</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.CSVHelper#getProductSuppliers(java.lang.String)
	 * @generated
	 */
	EOperation getCSVHelper__GetProductSuppliers__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.remote.access.parsing.CSVHelper#getProductOrders(java.lang.String) <em>Get Product Orders</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Product Orders</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.CSVHelper#getProductOrders(java.lang.String)
	 * @generated
	 */
	EOperation getCSVHelper__GetProductOrders__String();

	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.remote.access.parsing.MessageToCSV <em>Message To CSV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message To CSV</em>'.
	 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.MessageToCSV
	 * @generated
	 */
	EClass getMessageToCSV();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.remote.access.parsing.MessageToCSV#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.MessageToCSV#getMessage()
	 * @see #getMessageToCSV()
	 * @generated
	 */
	EAttribute getMessageToCSV_Message();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.remote.access.parsing.MessageToCSV#getCSV() <em>Get CSV</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get CSV</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.MessageToCSV#getCSV()
	 * @generated
	 */
	EOperation getMessageToCSV__GetCSV();

	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.remote.access.parsing.ParserPostMessage <em>Parser Post Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parser Post Message</em>'.
	 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.ParserPostMessage
	 * @generated
	 */
	EClass getParserPostMessage();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.remote.access.parsing.ParserPostMessage#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response</em>'.
	 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.ParserPostMessage#getResponse()
	 * @see #getParserPostMessage()
	 * @generated
	 */
	EAttribute getParserPostMessage_Response();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.remote.access.parsing.ParserPostMessage#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.ParserPostMessage#getMessage()
	 * @see #getParserPostMessage()
	 * @generated
	 */
	EAttribute getParserPostMessage_Message();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.remote.access.parsing.ParserPostMessage#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.ParserPostMessage#getTime()
	 * @see #getParserPostMessage()
	 * @generated
	 */
	EAttribute getParserPostMessage_Time();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.remote.access.parsing.ParserPostMessage#getLebel <em>Lebel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lebel</em>'.
	 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.ParserPostMessage#getLebel()
	 * @see #getParserPostMessage()
	 * @generated
	 */
	EAttribute getParserPostMessage_Lebel();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.remote.access.parsing.ParserPostMessage#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.ParserPostMessage#getStatus()
	 * @see #getParserPostMessage()
	 * @generated
	 */
	EAttribute getParserPostMessage_Status();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.remote.access.parsing.ParserPostMessage#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.ParserPostMessage#getDescription()
	 * @see #getParserPostMessage()
	 * @generated
	 */
	EAttribute getParserPostMessage_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ParsingFactory getParsingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.remote.access.parsing.impl.CSVHelperImpl <em>CSV Helper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.impl.CSVHelperImpl
		 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.impl.ParsingPackageImpl#getCSVHelper()
		 * @generated
		 */
		EClass CSV_HELPER = eINSTANCE.getCSVHelper();

		/**
		 * The meta object literal for the '<em><b>Get Stores</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CSV_HELPER___GET_STORES__STRING = eINSTANCE.getCSVHelper__GetStores__String();

		/**
		 * The meta object literal for the '<em><b>Get Customers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CSV_HELPER___GET_CUSTOMERS__STRING = eINSTANCE.getCSVHelper__GetCustomers__String();

		/**
		 * The meta object literal for the '<em><b>Get Users</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CSV_HELPER___GET_USERS__STRING = eINSTANCE.getCSVHelper__GetUsers__String();

		/**
		 * The meta object literal for the '<em><b>Get Enterprises</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CSV_HELPER___GET_ENTERPRISES__STRING = eINSTANCE.getCSVHelper__GetEnterprises__String();

		/**
		 * The meta object literal for the '<em><b>Get Stock Items</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CSV_HELPER___GET_STOCK_ITEMS__STRING = eINSTANCE.getCSVHelper__GetStockItems__String();

		/**
		 * The meta object literal for the '<em><b>Get Products</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CSV_HELPER___GET_PRODUCTS__STRING = eINSTANCE.getCSVHelper__GetProducts__String();

		/**
		 * The meta object literal for the '<em><b>Get Product Suppliers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CSV_HELPER___GET_PRODUCT_SUPPLIERS__STRING = eINSTANCE.getCSVHelper__GetProductSuppliers__String();

		/**
		 * The meta object literal for the '<em><b>Get Product Orders</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CSV_HELPER___GET_PRODUCT_ORDERS__STRING = eINSTANCE.getCSVHelper__GetProductOrders__String();

		/**
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.remote.access.parsing.impl.MessageToCSVImpl <em>Message To CSV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.impl.MessageToCSVImpl
		 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.impl.ParsingPackageImpl#getMessageToCSV()
		 * @generated
		 */
		EClass MESSAGE_TO_CSV = eINSTANCE.getMessageToCSV();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_TO_CSV__MESSAGE = eINSTANCE.getMessageToCSV_Message();

		/**
		 * The meta object literal for the '<em><b>Get CSV</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MESSAGE_TO_CSV___GET_CSV = eINSTANCE.getMessageToCSV__GetCSV();

		/**
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.remote.access.parsing.impl.ParserPostMessageImpl <em>Parser Post Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.impl.ParserPostMessageImpl
		 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.impl.ParsingPackageImpl#getParserPostMessage()
		 * @generated
		 */
		EClass PARSER_POST_MESSAGE = eINSTANCE.getParserPostMessage();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARSER_POST_MESSAGE__RESPONSE = eINSTANCE.getParserPostMessage_Response();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARSER_POST_MESSAGE__MESSAGE = eINSTANCE.getParserPostMessage_Message();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARSER_POST_MESSAGE__TIME = eINSTANCE.getParserPostMessage_Time();

		/**
		 * The meta object literal for the '<em><b>Lebel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARSER_POST_MESSAGE__LEBEL = eINSTANCE.getParserPostMessage_Lebel();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARSER_POST_MESSAGE__STATUS = eINSTANCE.getParserPostMessage_Status();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARSER_POST_MESSAGE__DESCRIPTION = eINSTANCE.getParserPostMessage_Description();

	}

} //ParsingPackage
