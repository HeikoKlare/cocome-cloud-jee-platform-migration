/**
 */
package ecore.org.cocome.tradingsystem.remote.access.connection;

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSV Backend Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.remote.access.connection.CSVBackendConnection#getBackendHost <em>Backend Host</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.remote.access.connection.CSVBackendConnection#getBackendPort <em>Backend Port</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.remote.access.connection.CSVBackendConnection#getBackendSetDataURL <em>Backend Set Data URL</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.remote.access.connection.CSVBackendConnection#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see ecore.org.cocome.tradingsystem.remote.access.connection.ConnectionPackage#getCSVBackendConnection()
 * @model
 * @generated
 */
public interface CSVBackendConnection extends EObject {
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
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.ConnectionPackage#getCSVBackendConnection_BackendHost()
	 * @model
	 * @generated
	 */
	String getBackendHost();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.remote.access.connection.CSVBackendConnection#getBackendHost <em>Backend Host</em>}' attribute.
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
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.ConnectionPackage#getCSVBackendConnection_BackendPort()
	 * @model
	 * @generated
	 */
	String getBackendPort();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.remote.access.connection.CSVBackendConnection#getBackendPort <em>Backend Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backend Port</em>' attribute.
	 * @see #getBackendPort()
	 * @generated
	 */
	void setBackendPort(String value);

	/**
	 * Returns the value of the '<em><b>Backend Set Data URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Backend Set Data URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backend Set Data URL</em>' attribute.
	 * @see #setBackendSetDataURL(String)
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.ConnectionPackage#getCSVBackendConnection_BackendSetDataURL()
	 * @model
	 * @generated
	 */
	String getBackendSetDataURL();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.remote.access.connection.CSVBackendConnection#getBackendSetDataURL <em>Backend Set Data URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backend Set Data URL</em>' attribute.
	 * @see #getBackendSetDataURL()
	 * @generated
	 */
	void setBackendSetDataURL(String value);

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
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.ConnectionPackage#getCSVBackendConnection_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.remote.access.connection.CSVBackendConnection#getMessage <em>Message</em>}' attribute.
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
	 * @model exceptions="ecore.datatypes.java.io.IOException"
	 * @generated
	 */
	void sendUpdateQuery(String entity, String header, String content) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.java.io.IOException"
	 * @generated
	 */
	void sendCreateQuery(String entity, String header, String content) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getResponse();

} // CSVBackendConnection
