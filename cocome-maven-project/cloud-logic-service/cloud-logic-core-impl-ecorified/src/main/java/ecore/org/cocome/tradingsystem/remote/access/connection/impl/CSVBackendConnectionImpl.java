/**
 */
package ecore.org.cocome.tradingsystem.remote.access.connection.impl;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ecore.org.cocome.tradingsystem.remote.access.connection.ConnectionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSV Backend Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.remote.access.connection.impl.CSVBackendConnectionImpl#getBackendHost <em>Backend Host</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.remote.access.connection.impl.CSVBackendConnectionImpl#getBackendPort <em>Backend Port</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.remote.access.connection.impl.CSVBackendConnectionImpl#getBackendSetDataURL <em>Backend Set Data URL</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.remote.access.connection.impl.CSVBackendConnectionImpl#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CSVBackendConnectionImpl extends MinimalEObjectImpl.Container implements ecore.org.cocome.tradingsystem.remote.access.connection.CSVBackendConnection {
	/**
	 * The default value of the '{@link #getBackendHost() <em>Backend Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackendHost()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKEND_HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackendHost() <em>Backend Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackendHost()
	 * @generated
	 * @ordered
	 */
	protected String backendHost = BACKEND_HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackendPort() <em>Backend Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackendPort()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKEND_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackendPort() <em>Backend Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackendPort()
	 * @generated
	 * @ordered
	 */
	protected String backendPort = BACKEND_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackendSetDataURL() <em>Backend Set Data URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackendSetDataURL()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKEND_SET_DATA_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackendSetDataURL() <em>Backend Set Data URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackendSetDataURL()
	 * @generated
	 * @ordered
	 */
	protected String backendSetDataURL = BACKEND_SET_DATA_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSVBackendConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConnectionPackage.Literals.CSV_BACKEND_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackendHost() {
		return backendHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackendHost(String newBackendHost) {
		String oldBackendHost = backendHost;
		backendHost = newBackendHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.CSV_BACKEND_CONNECTION__BACKEND_HOST, oldBackendHost, backendHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackendPort() {
		return backendPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackendPort(String newBackendPort) {
		String oldBackendPort = backendPort;
		backendPort = newBackendPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.CSV_BACKEND_CONNECTION__BACKEND_PORT, oldBackendPort, backendPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackendSetDataURL() {
		return backendSetDataURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackendSetDataURL(String newBackendSetDataURL) {
		String oldBackendSetDataURL = backendSetDataURL;
		backendSetDataURL = newBackendSetDataURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.CSV_BACKEND_CONNECTION__BACKEND_SET_DATA_URL, oldBackendSetDataURL, backendSetDataURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.CSV_BACKEND_CONNECTION__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sendUpdateQuery(String entity, String header, String content) throws IOException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sendCreateQuery(String entity, String header, String content) throws IOException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResponse() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConnectionPackage.CSV_BACKEND_CONNECTION__BACKEND_HOST:
				return getBackendHost();
			case ConnectionPackage.CSV_BACKEND_CONNECTION__BACKEND_PORT:
				return getBackendPort();
			case ConnectionPackage.CSV_BACKEND_CONNECTION__BACKEND_SET_DATA_URL:
				return getBackendSetDataURL();
			case ConnectionPackage.CSV_BACKEND_CONNECTION__MESSAGE:
				return getMessage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConnectionPackage.CSV_BACKEND_CONNECTION__BACKEND_HOST:
				setBackendHost((String)newValue);
				return;
			case ConnectionPackage.CSV_BACKEND_CONNECTION__BACKEND_PORT:
				setBackendPort((String)newValue);
				return;
			case ConnectionPackage.CSV_BACKEND_CONNECTION__BACKEND_SET_DATA_URL:
				setBackendSetDataURL((String)newValue);
				return;
			case ConnectionPackage.CSV_BACKEND_CONNECTION__MESSAGE:
				setMessage((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConnectionPackage.CSV_BACKEND_CONNECTION__BACKEND_HOST:
				setBackendHost(BACKEND_HOST_EDEFAULT);
				return;
			case ConnectionPackage.CSV_BACKEND_CONNECTION__BACKEND_PORT:
				setBackendPort(BACKEND_PORT_EDEFAULT);
				return;
			case ConnectionPackage.CSV_BACKEND_CONNECTION__BACKEND_SET_DATA_URL:
				setBackendSetDataURL(BACKEND_SET_DATA_URL_EDEFAULT);
				return;
			case ConnectionPackage.CSV_BACKEND_CONNECTION__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConnectionPackage.CSV_BACKEND_CONNECTION__BACKEND_HOST:
				return BACKEND_HOST_EDEFAULT == null ? backendHost != null : !BACKEND_HOST_EDEFAULT.equals(backendHost);
			case ConnectionPackage.CSV_BACKEND_CONNECTION__BACKEND_PORT:
				return BACKEND_PORT_EDEFAULT == null ? backendPort != null : !BACKEND_PORT_EDEFAULT.equals(backendPort);
			case ConnectionPackage.CSV_BACKEND_CONNECTION__BACKEND_SET_DATA_URL:
				return BACKEND_SET_DATA_URL_EDEFAULT == null ? backendSetDataURL != null : !BACKEND_SET_DATA_URL_EDEFAULT.equals(backendSetDataURL);
			case ConnectionPackage.CSV_BACKEND_CONNECTION__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ConnectionPackage.CSV_BACKEND_CONNECTION___SEND_UPDATE_QUERY__STRING_STRING_STRING:
				try {
					sendUpdateQuery((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ConnectionPackage.CSV_BACKEND_CONNECTION___SEND_CREATE_QUERY__STRING_STRING_STRING:
				try {
					sendCreateQuery((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ConnectionPackage.CSV_BACKEND_CONNECTION___GET_RESPONSE:
				return getResponse();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (backendHost: ");
		result.append(backendHost);
		result.append(", backendPort: ");
		result.append(backendPort);
		result.append(", backendSetDataURL: ");
		result.append(backendSetDataURL);
		result.append(", message: ");
		result.append(message);
		result.append(')');
		return result.toString();
	}

} //CSVBackendConnectionImpl
