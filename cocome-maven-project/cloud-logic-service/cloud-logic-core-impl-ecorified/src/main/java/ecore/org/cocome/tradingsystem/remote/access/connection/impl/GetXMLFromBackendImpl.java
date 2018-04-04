/**
 */
package ecore.org.cocome.tradingsystem.remote.access.connection.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ecore.org.cocome.tradingsystem.remote.access.connection.ConnectionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get XML From Backend</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.remote.access.connection.impl.GetXMLFromBackendImpl#getBackendHost <em>Backend Host</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.remote.access.connection.impl.GetXMLFromBackendImpl#getBackendPort <em>Backend Port</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.remote.access.connection.impl.GetXMLFromBackendImpl#getBackendGetDataURL <em>Backend Get Data URL</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.remote.access.connection.impl.GetXMLFromBackendImpl#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetXMLFromBackendImpl extends MinimalEObjectImpl.Container implements ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend {
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
	 * The default value of the '{@link #getBackendGetDataURL() <em>Backend Get Data URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackendGetDataURL()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKEND_GET_DATA_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackendGetDataURL() <em>Backend Get Data URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackendGetDataURL()
	 * @generated
	 * @ordered
	 */
	protected String backendGetDataURL = BACKEND_GET_DATA_URL_EDEFAULT;

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
	protected GetXMLFromBackendImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConnectionPackage.Literals.GET_XML_FROM_BACKEND;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.GET_XML_FROM_BACKEND__BACKEND_HOST, oldBackendHost, backendHost));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.GET_XML_FROM_BACKEND__BACKEND_PORT, oldBackendPort, backendPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackendGetDataURL() {
		return backendGetDataURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackendGetDataURL(String newBackendGetDataURL) {
		String oldBackendGetDataURL = backendGetDataURL;
		backendGetDataURL = newBackendGetDataURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.GET_XML_FROM_BACKEND__BACKEND_GET_DATA_URL, oldBackendGetDataURL, backendGetDataURL));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.GET_XML_FROM_BACKEND__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXMLFromBackend(String urlString) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProducts(String cond) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnterprises(String cond) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStores(String cond) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStockItems(String cond) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductOrder(String cond) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductSupplier(String cond) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntity(String entity, String cond) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUser(String cond) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomer(String cond) {
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
			case ConnectionPackage.GET_XML_FROM_BACKEND__BACKEND_HOST:
				return getBackendHost();
			case ConnectionPackage.GET_XML_FROM_BACKEND__BACKEND_PORT:
				return getBackendPort();
			case ConnectionPackage.GET_XML_FROM_BACKEND__BACKEND_GET_DATA_URL:
				return getBackendGetDataURL();
			case ConnectionPackage.GET_XML_FROM_BACKEND__MESSAGE:
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
			case ConnectionPackage.GET_XML_FROM_BACKEND__BACKEND_HOST:
				setBackendHost((String)newValue);
				return;
			case ConnectionPackage.GET_XML_FROM_BACKEND__BACKEND_PORT:
				setBackendPort((String)newValue);
				return;
			case ConnectionPackage.GET_XML_FROM_BACKEND__BACKEND_GET_DATA_URL:
				setBackendGetDataURL((String)newValue);
				return;
			case ConnectionPackage.GET_XML_FROM_BACKEND__MESSAGE:
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
			case ConnectionPackage.GET_XML_FROM_BACKEND__BACKEND_HOST:
				setBackendHost(BACKEND_HOST_EDEFAULT);
				return;
			case ConnectionPackage.GET_XML_FROM_BACKEND__BACKEND_PORT:
				setBackendPort(BACKEND_PORT_EDEFAULT);
				return;
			case ConnectionPackage.GET_XML_FROM_BACKEND__BACKEND_GET_DATA_URL:
				setBackendGetDataURL(BACKEND_GET_DATA_URL_EDEFAULT);
				return;
			case ConnectionPackage.GET_XML_FROM_BACKEND__MESSAGE:
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
			case ConnectionPackage.GET_XML_FROM_BACKEND__BACKEND_HOST:
				return BACKEND_HOST_EDEFAULT == null ? backendHost != null : !BACKEND_HOST_EDEFAULT.equals(backendHost);
			case ConnectionPackage.GET_XML_FROM_BACKEND__BACKEND_PORT:
				return BACKEND_PORT_EDEFAULT == null ? backendPort != null : !BACKEND_PORT_EDEFAULT.equals(backendPort);
			case ConnectionPackage.GET_XML_FROM_BACKEND__BACKEND_GET_DATA_URL:
				return BACKEND_GET_DATA_URL_EDEFAULT == null ? backendGetDataURL != null : !BACKEND_GET_DATA_URL_EDEFAULT.equals(backendGetDataURL);
			case ConnectionPackage.GET_XML_FROM_BACKEND__MESSAGE:
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
			case ConnectionPackage.GET_XML_FROM_BACKEND___GET_XML_FROM_BACKEND__STRING:
				return getXMLFromBackend((String)arguments.get(0));
			case ConnectionPackage.GET_XML_FROM_BACKEND___GET_PRODUCTS__STRING:
				return getProducts((String)arguments.get(0));
			case ConnectionPackage.GET_XML_FROM_BACKEND___GET_ENTERPRISES__STRING:
				return getEnterprises((String)arguments.get(0));
			case ConnectionPackage.GET_XML_FROM_BACKEND___GET_STORES__STRING:
				return getStores((String)arguments.get(0));
			case ConnectionPackage.GET_XML_FROM_BACKEND___GET_STOCK_ITEMS__STRING:
				return getStockItems((String)arguments.get(0));
			case ConnectionPackage.GET_XML_FROM_BACKEND___GET_PRODUCT_ORDER__STRING:
				return getProductOrder((String)arguments.get(0));
			case ConnectionPackage.GET_XML_FROM_BACKEND___GET_PRODUCT_SUPPLIER__STRING:
				return getProductSupplier((String)arguments.get(0));
			case ConnectionPackage.GET_XML_FROM_BACKEND___GET_ENTITY__STRING_STRING:
				return getEntity((String)arguments.get(0), (String)arguments.get(1));
			case ConnectionPackage.GET_XML_FROM_BACKEND___GET_USER__STRING:
				return getUser((String)arguments.get(0));
			case ConnectionPackage.GET_XML_FROM_BACKEND___GET_CUSTOMER__STRING:
				return getCustomer((String)arguments.get(0));
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
		result.append(", backendGetDataURL: ");
		result.append(backendGetDataURL);
		result.append(", message: ");
		result.append(message);
		result.append(')');
		return result.toString();
	}

} //GetXMLFromBackendImpl
