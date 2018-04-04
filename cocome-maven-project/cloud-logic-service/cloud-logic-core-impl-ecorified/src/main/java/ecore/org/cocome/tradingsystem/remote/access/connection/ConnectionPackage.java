/**
 */
package ecore.org.cocome.tradingsystem.remote.access.connection;

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
 * @see ecore.org.cocome.tradingsystem.remote.access.connection.ConnectionFactoryOld
 * @model kind="package"
 * @generated
 */
public interface ConnectionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "connection";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "cloud-logic-core-impl/ecore.org.cocome.tradingsystem.remote.access.connection";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "connection";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConnectionPackage eINSTANCE = ecore.org.cocome.tradingsystem.remote.access.connection.impl.ConnectionPackageImpl.init();

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.remote.access.connection.impl.CSVBackendConnectionImpl <em>CSV Backend Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.impl.CSVBackendConnectionImpl
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.impl.ConnectionPackageImpl#getCSVBackendConnection()
	 * @generated
	 */
	int CSV_BACKEND_CONNECTION = 0;

	/**
	 * The feature id for the '<em><b>Backend Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_BACKEND_CONNECTION__BACKEND_HOST = 0;

	/**
	 * The feature id for the '<em><b>Backend Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_BACKEND_CONNECTION__BACKEND_PORT = 1;

	/**
	 * The feature id for the '<em><b>Backend Set Data URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_BACKEND_CONNECTION__BACKEND_SET_DATA_URL = 2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_BACKEND_CONNECTION__MESSAGE = 3;

	/**
	 * The number of structural features of the '<em>CSV Backend Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_BACKEND_CONNECTION_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Send Update Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_BACKEND_CONNECTION___SEND_UPDATE_QUERY__STRING_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Send Create Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_BACKEND_CONNECTION___SEND_CREATE_QUERY__STRING_STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Get Response</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_BACKEND_CONNECTION___GET_RESPONSE = 2;

	/**
	 * The number of operations of the '<em>CSV Backend Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_BACKEND_CONNECTION_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.remote.access.connection.impl.GetXMLFromBackendImpl <em>Get XML From Backend</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.impl.GetXMLFromBackendImpl
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.impl.ConnectionPackageImpl#getGetXMLFromBackend()
	 * @generated
	 */
	int GET_XML_FROM_BACKEND = 1;

	/**
	 * The feature id for the '<em><b>Backend Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_XML_FROM_BACKEND__BACKEND_HOST = 0;

	/**
	 * The feature id for the '<em><b>Backend Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_XML_FROM_BACKEND__BACKEND_PORT = 1;

	/**
	 * The feature id for the '<em><b>Backend Get Data URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_XML_FROM_BACKEND__BACKEND_GET_DATA_URL = 2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_XML_FROM_BACKEND__MESSAGE = 3;

	/**
	 * The number of structural features of the '<em>Get XML From Backend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_XML_FROM_BACKEND_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get XML From Backend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_XML_FROM_BACKEND___GET_XML_FROM_BACKEND__STRING = 0;

	/**
	 * The operation id for the '<em>Get Products</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_XML_FROM_BACKEND___GET_PRODUCTS__STRING = 1;

	/**
	 * The operation id for the '<em>Get Enterprises</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_XML_FROM_BACKEND___GET_ENTERPRISES__STRING = 2;

	/**
	 * The operation id for the '<em>Get Stores</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_XML_FROM_BACKEND___GET_STORES__STRING = 3;

	/**
	 * The operation id for the '<em>Get Stock Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_XML_FROM_BACKEND___GET_STOCK_ITEMS__STRING = 4;

	/**
	 * The operation id for the '<em>Get Product Order</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_XML_FROM_BACKEND___GET_PRODUCT_ORDER__STRING = 5;

	/**
	 * The operation id for the '<em>Get Product Supplier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_XML_FROM_BACKEND___GET_PRODUCT_SUPPLIER__STRING = 6;

	/**
	 * The operation id for the '<em>Get Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_XML_FROM_BACKEND___GET_ENTITY__STRING_STRING = 7;

	/**
	 * The operation id for the '<em>Get User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_XML_FROM_BACKEND___GET_USER__STRING = 8;

	/**
	 * The operation id for the '<em>Get Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_XML_FROM_BACKEND___GET_CUSTOMER__STRING = 9;

	/**
	 * The number of operations of the '<em>Get XML From Backend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_XML_FROM_BACKEND_OPERATION_COUNT = 10;

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.remote.access.connection.impl.QueryParameterEncoderImpl <em>Query Parameter Encoder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.impl.QueryParameterEncoderImpl
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.impl.ConnectionPackageImpl#getQueryParameterEncoder()
	 * @generated
	 */
	int QUERY_PARAMETER_ENCODER = 2;

	/**
	 * The number of structural features of the '<em>Query Parameter Encoder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER_ENCODER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Query Parameter Encoder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER_ENCODER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.remote.access.connection.CSVBackendConnection <em>CSV Backend Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSV Backend Connection</em>'.
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.CSVBackendConnection
	 * @generated
	 */
	EClass getCSVBackendConnection();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.remote.access.connection.CSVBackendConnection#getBackendHost <em>Backend Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Backend Host</em>'.
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.CSVBackendConnection#getBackendHost()
	 * @see #getCSVBackendConnection()
	 * @generated
	 */
	EAttribute getCSVBackendConnection_BackendHost();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.remote.access.connection.CSVBackendConnection#getBackendPort <em>Backend Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Backend Port</em>'.
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.CSVBackendConnection#getBackendPort()
	 * @see #getCSVBackendConnection()
	 * @generated
	 */
	EAttribute getCSVBackendConnection_BackendPort();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.remote.access.connection.CSVBackendConnection#getBackendSetDataURL <em>Backend Set Data URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Backend Set Data URL</em>'.
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.CSVBackendConnection#getBackendSetDataURL()
	 * @see #getCSVBackendConnection()
	 * @generated
	 */
	EAttribute getCSVBackendConnection_BackendSetDataURL();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.remote.access.connection.CSVBackendConnection#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.CSVBackendConnection#getMessage()
	 * @see #getCSVBackendConnection()
	 * @generated
	 */
	EAttribute getCSVBackendConnection_Message();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.remote.access.connection.CSVBackendConnection#sendUpdateQuery(java.lang.String, java.lang.String, java.lang.String) <em>Send Update Query</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Update Query</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.CSVBackendConnection#sendUpdateQuery(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCSVBackendConnection__SendUpdateQuery__String_String_String();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.remote.access.connection.CSVBackendConnection#sendCreateQuery(java.lang.String, java.lang.String, java.lang.String) <em>Send Create Query</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Create Query</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.CSVBackendConnection#sendCreateQuery(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCSVBackendConnection__SendCreateQuery__String_String_String();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.remote.access.connection.CSVBackendConnection#getResponse() <em>Get Response</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Response</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.CSVBackendConnection#getResponse()
	 * @generated
	 */
	EOperation getCSVBackendConnection__GetResponse();

	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend <em>Get XML From Backend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get XML From Backend</em>'.
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend
	 * @generated
	 */
	EClass getGetXMLFromBackend();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getBackendHost <em>Backend Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Backend Host</em>'.
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getBackendHost()
	 * @see #getGetXMLFromBackend()
	 * @generated
	 */
	EAttribute getGetXMLFromBackend_BackendHost();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getBackendPort <em>Backend Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Backend Port</em>'.
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getBackendPort()
	 * @see #getGetXMLFromBackend()
	 * @generated
	 */
	EAttribute getGetXMLFromBackend_BackendPort();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getBackendGetDataURL <em>Backend Get Data URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Backend Get Data URL</em>'.
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getBackendGetDataURL()
	 * @see #getGetXMLFromBackend()
	 * @generated
	 */
	EAttribute getGetXMLFromBackend_BackendGetDataURL();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getMessage()
	 * @see #getGetXMLFromBackend()
	 * @generated
	 */
	EAttribute getGetXMLFromBackend_Message();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getXMLFromBackend(java.lang.String) <em>Get XML From Backend</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get XML From Backend</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getXMLFromBackend(java.lang.String)
	 * @generated
	 */
	EOperation getGetXMLFromBackend__GetXMLFromBackend__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getProducts(java.lang.String) <em>Get Products</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Products</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getProducts(java.lang.String)
	 * @generated
	 */
	EOperation getGetXMLFromBackend__GetProducts__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getEnterprises(java.lang.String) <em>Get Enterprises</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Enterprises</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getEnterprises(java.lang.String)
	 * @generated
	 */
	EOperation getGetXMLFromBackend__GetEnterprises__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getStores(java.lang.String) <em>Get Stores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Stores</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getStores(java.lang.String)
	 * @generated
	 */
	EOperation getGetXMLFromBackend__GetStores__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getStockItems(java.lang.String) <em>Get Stock Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Stock Items</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getStockItems(java.lang.String)
	 * @generated
	 */
	EOperation getGetXMLFromBackend__GetStockItems__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getProductOrder(java.lang.String) <em>Get Product Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Product Order</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getProductOrder(java.lang.String)
	 * @generated
	 */
	EOperation getGetXMLFromBackend__GetProductOrder__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getProductSupplier(java.lang.String) <em>Get Product Supplier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Product Supplier</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getProductSupplier(java.lang.String)
	 * @generated
	 */
	EOperation getGetXMLFromBackend__GetProductSupplier__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getEntity(java.lang.String, java.lang.String) <em>Get Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Entity</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getEntity(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getGetXMLFromBackend__GetEntity__String_String();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getUser(java.lang.String) <em>Get User</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get User</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getUser(java.lang.String)
	 * @generated
	 */
	EOperation getGetXMLFromBackend__GetUser__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getCustomer(java.lang.String) <em>Get Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Customer</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getCustomer(java.lang.String)
	 * @generated
	 */
	EOperation getGetXMLFromBackend__GetCustomer__String();

	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.remote.access.connection.QueryParameterEncoder <em>Query Parameter Encoder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Parameter Encoder</em>'.
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.QueryParameterEncoder
	 * @generated
	 */
	EClass getQueryParameterEncoder();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConnectionFactory getConnectionFactory();

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
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.remote.access.connection.impl.CSVBackendConnectionImpl <em>CSV Backend Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.remote.access.connection.impl.CSVBackendConnectionImpl
		 * @see ecore.org.cocome.tradingsystem.remote.access.connection.impl.ConnectionPackageImpl#getCSVBackendConnection()
		 * @generated
		 */
		EClass CSV_BACKEND_CONNECTION = eINSTANCE.getCSVBackendConnection();

		/**
		 * The meta object literal for the '<em><b>Backend Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSV_BACKEND_CONNECTION__BACKEND_HOST = eINSTANCE.getCSVBackendConnection_BackendHost();

		/**
		 * The meta object literal for the '<em><b>Backend Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSV_BACKEND_CONNECTION__BACKEND_PORT = eINSTANCE.getCSVBackendConnection_BackendPort();

		/**
		 * The meta object literal for the '<em><b>Backend Set Data URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSV_BACKEND_CONNECTION__BACKEND_SET_DATA_URL = eINSTANCE.getCSVBackendConnection_BackendSetDataURL();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSV_BACKEND_CONNECTION__MESSAGE = eINSTANCE.getCSVBackendConnection_Message();

		/**
		 * The meta object literal for the '<em><b>Send Update Query</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CSV_BACKEND_CONNECTION___SEND_UPDATE_QUERY__STRING_STRING_STRING = eINSTANCE.getCSVBackendConnection__SendUpdateQuery__String_String_String();

		/**
		 * The meta object literal for the '<em><b>Send Create Query</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CSV_BACKEND_CONNECTION___SEND_CREATE_QUERY__STRING_STRING_STRING = eINSTANCE.getCSVBackendConnection__SendCreateQuery__String_String_String();

		/**
		 * The meta object literal for the '<em><b>Get Response</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CSV_BACKEND_CONNECTION___GET_RESPONSE = eINSTANCE.getCSVBackendConnection__GetResponse();

		/**
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.remote.access.connection.impl.GetXMLFromBackendImpl <em>Get XML From Backend</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.remote.access.connection.impl.GetXMLFromBackendImpl
		 * @see ecore.org.cocome.tradingsystem.remote.access.connection.impl.ConnectionPackageImpl#getGetXMLFromBackend()
		 * @generated
		 */
		EClass GET_XML_FROM_BACKEND = eINSTANCE.getGetXMLFromBackend();

		/**
		 * The meta object literal for the '<em><b>Backend Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_XML_FROM_BACKEND__BACKEND_HOST = eINSTANCE.getGetXMLFromBackend_BackendHost();

		/**
		 * The meta object literal for the '<em><b>Backend Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_XML_FROM_BACKEND__BACKEND_PORT = eINSTANCE.getGetXMLFromBackend_BackendPort();

		/**
		 * The meta object literal for the '<em><b>Backend Get Data URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_XML_FROM_BACKEND__BACKEND_GET_DATA_URL = eINSTANCE.getGetXMLFromBackend_BackendGetDataURL();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_XML_FROM_BACKEND__MESSAGE = eINSTANCE.getGetXMLFromBackend_Message();

		/**
		 * The meta object literal for the '<em><b>Get XML From Backend</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GET_XML_FROM_BACKEND___GET_XML_FROM_BACKEND__STRING = eINSTANCE.getGetXMLFromBackend__GetXMLFromBackend__String();

		/**
		 * The meta object literal for the '<em><b>Get Products</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GET_XML_FROM_BACKEND___GET_PRODUCTS__STRING = eINSTANCE.getGetXMLFromBackend__GetProducts__String();

		/**
		 * The meta object literal for the '<em><b>Get Enterprises</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GET_XML_FROM_BACKEND___GET_ENTERPRISES__STRING = eINSTANCE.getGetXMLFromBackend__GetEnterprises__String();

		/**
		 * The meta object literal for the '<em><b>Get Stores</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GET_XML_FROM_BACKEND___GET_STORES__STRING = eINSTANCE.getGetXMLFromBackend__GetStores__String();

		/**
		 * The meta object literal for the '<em><b>Get Stock Items</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GET_XML_FROM_BACKEND___GET_STOCK_ITEMS__STRING = eINSTANCE.getGetXMLFromBackend__GetStockItems__String();

		/**
		 * The meta object literal for the '<em><b>Get Product Order</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GET_XML_FROM_BACKEND___GET_PRODUCT_ORDER__STRING = eINSTANCE.getGetXMLFromBackend__GetProductOrder__String();

		/**
		 * The meta object literal for the '<em><b>Get Product Supplier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GET_XML_FROM_BACKEND___GET_PRODUCT_SUPPLIER__STRING = eINSTANCE.getGetXMLFromBackend__GetProductSupplier__String();

		/**
		 * The meta object literal for the '<em><b>Get Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GET_XML_FROM_BACKEND___GET_ENTITY__STRING_STRING = eINSTANCE.getGetXMLFromBackend__GetEntity__String_String();

		/**
		 * The meta object literal for the '<em><b>Get User</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GET_XML_FROM_BACKEND___GET_USER__STRING = eINSTANCE.getGetXMLFromBackend__GetUser__String();

		/**
		 * The meta object literal for the '<em><b>Get Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GET_XML_FROM_BACKEND___GET_CUSTOMER__STRING = eINSTANCE.getGetXMLFromBackend__GetCustomer__String();

		/**
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.remote.access.connection.impl.QueryParameterEncoderImpl <em>Query Parameter Encoder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.remote.access.connection.impl.QueryParameterEncoderImpl
		 * @see ecore.org.cocome.tradingsystem.remote.access.connection.impl.ConnectionPackageImpl#getQueryParameterEncoder()
		 * @generated
		 */
		EClass QUERY_PARAMETER_ENCODER = eINSTANCE.getQueryParameterEncoder();

	}

} //ConnectionPackage
