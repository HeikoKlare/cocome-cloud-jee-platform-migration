/**
 */
package ecore.org.cocome.tradingsystem.remote.access.parsing.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ecore.org.cocome.tradingsystem.remote.access.parsing.ParsingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parser Post Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.remote.access.parsing.impl.ParserPostMessageImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.remote.access.parsing.impl.ParserPostMessageImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.remote.access.parsing.impl.ParserPostMessageImpl#getTime <em>Time</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.remote.access.parsing.impl.ParserPostMessageImpl#getLebel <em>Lebel</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.remote.access.parsing.impl.ParserPostMessageImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.remote.access.parsing.impl.ParserPostMessageImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParserPostMessageImpl extends MinimalEObjectImpl.Container implements ecore.org.cocome.tradingsystem.remote.access.parsing.ParserPostMessage {
	/**
	 * The default value of the '{@link #getResponse() <em>Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected String response = RESPONSE_EDEFAULT;

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
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected String time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLebel() <em>Lebel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLebel()
	 * @generated
	 * @ordered
	 */
	protected static final String LEBEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLebel() <em>Lebel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLebel()
	 * @generated
	 * @ordered
	 */
	protected String lebel = LEBEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParserPostMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParsingPackage.Literals.PARSER_POST_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResponse() {
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponse(String newResponse) {
		String oldResponse = response;
		response = newResponse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParsingPackage.PARSER_POST_MESSAGE__RESPONSE, oldResponse, response));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ParsingPackage.PARSER_POST_MESSAGE__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(String newTime) {
		String oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParsingPackage.PARSER_POST_MESSAGE__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLebel() {
		return lebel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLebel(String newLebel) {
		String oldLebel = lebel;
		lebel = newLebel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParsingPackage.PARSER_POST_MESSAGE__LEBEL, oldLebel, lebel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParsingPackage.PARSER_POST_MESSAGE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParsingPackage.PARSER_POST_MESSAGE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ParsingPackage.PARSER_POST_MESSAGE__RESPONSE:
				return getResponse();
			case ParsingPackage.PARSER_POST_MESSAGE__MESSAGE:
				return getMessage();
			case ParsingPackage.PARSER_POST_MESSAGE__TIME:
				return getTime();
			case ParsingPackage.PARSER_POST_MESSAGE__LEBEL:
				return getLebel();
			case ParsingPackage.PARSER_POST_MESSAGE__STATUS:
				return getStatus();
			case ParsingPackage.PARSER_POST_MESSAGE__DESCRIPTION:
				return getDescription();
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
			case ParsingPackage.PARSER_POST_MESSAGE__RESPONSE:
				setResponse((String)newValue);
				return;
			case ParsingPackage.PARSER_POST_MESSAGE__MESSAGE:
				setMessage((String)newValue);
				return;
			case ParsingPackage.PARSER_POST_MESSAGE__TIME:
				setTime((String)newValue);
				return;
			case ParsingPackage.PARSER_POST_MESSAGE__LEBEL:
				setLebel((String)newValue);
				return;
			case ParsingPackage.PARSER_POST_MESSAGE__STATUS:
				setStatus((String)newValue);
				return;
			case ParsingPackage.PARSER_POST_MESSAGE__DESCRIPTION:
				setDescription((String)newValue);
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
			case ParsingPackage.PARSER_POST_MESSAGE__RESPONSE:
				setResponse(RESPONSE_EDEFAULT);
				return;
			case ParsingPackage.PARSER_POST_MESSAGE__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case ParsingPackage.PARSER_POST_MESSAGE__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case ParsingPackage.PARSER_POST_MESSAGE__LEBEL:
				setLebel(LEBEL_EDEFAULT);
				return;
			case ParsingPackage.PARSER_POST_MESSAGE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case ParsingPackage.PARSER_POST_MESSAGE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case ParsingPackage.PARSER_POST_MESSAGE__RESPONSE:
				return RESPONSE_EDEFAULT == null ? response != null : !RESPONSE_EDEFAULT.equals(response);
			case ParsingPackage.PARSER_POST_MESSAGE__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case ParsingPackage.PARSER_POST_MESSAGE__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case ParsingPackage.PARSER_POST_MESSAGE__LEBEL:
				return LEBEL_EDEFAULT == null ? lebel != null : !LEBEL_EDEFAULT.equals(lebel);
			case ParsingPackage.PARSER_POST_MESSAGE__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case ParsingPackage.PARSER_POST_MESSAGE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		}
		return super.eIsSet(featureID);
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
		result.append(" (response: ");
		result.append(response);
		result.append(", message: ");
		result.append(message);
		result.append(", time: ");
		result.append(time);
		result.append(", lebel: ");
		result.append(lebel);
		result.append(", status: ");
		result.append(status);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ParserPostMessageImpl
