/**
 */
package ecore.org.cocome.tradingsystem.remote.access.connection;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get XML From Backend</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getBackendHost <em>Backend Host</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getBackendPort <em>Backend Port</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getBackendGetDataURL <em>Backend Get Data URL</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see ecore.org.cocome.tradingsystem.remote.access.connection.ConnectionPackage#getGetXMLFromBackend()
 * @model
 * @generated
 */
public interface GetXMLFromBackend extends EObject {
	/**
	 * Returns the value of the '<em><b>Backend Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Backend Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backend Host</em>' attribute.
	 * @see #setBackendHost(String)
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.ConnectionPackage#getGetXMLFromBackend_BackendHost()
	 * @model
	 * @generated
	 */
	String getBackendHost();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getBackendHost <em>Backend Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backend Host</em>' attribute.
	 * @see #getBackendHost()
	 * @generated
	 */
	void setBackendHost(String value);

	/**
	 * Returns the value of the '<em><b>Backend Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Backend Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backend Port</em>' attribute.
	 * @see #setBackendPort(String)
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.ConnectionPackage#getGetXMLFromBackend_BackendPort()
	 * @model
	 * @generated
	 */
	String getBackendPort();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getBackendPort <em>Backend Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backend Port</em>' attribute.
	 * @see #getBackendPort()
	 * @generated
	 */
	void setBackendPort(String value);

	/**
	 * Returns the value of the '<em><b>Backend Get Data URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Backend Get Data URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backend Get Data URL</em>' attribute.
	 * @see #setBackendGetDataURL(String)
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.ConnectionPackage#getGetXMLFromBackend_BackendGetDataURL()
	 * @model
	 * @generated
	 */
	String getBackendGetDataURL();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getBackendGetDataURL <em>Backend Get Data URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backend Get Data URL</em>' attribute.
	 * @see #getBackendGetDataURL()
	 * @generated
	 */
	void setBackendGetDataURL(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.ConnectionPackage#getGetXMLFromBackend_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getXMLFromBackend(String urlString);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getProducts(String cond);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getEnterprises(String cond);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getStores(String cond);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getStockItems(String cond);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getProductOrder(String cond);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getProductSupplier(String cond);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getEntity(String entity, String cond);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getUser(String cond);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getCustomer(String cond);

} // GetXMLFromBackend
