/**
 */
package ecore.org.cocome.tradingsystem.remote.access.parsing;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message To CSV</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.remote.access.parsing.MessageToCSV#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.ParsingPackage#getMessageToCSV()
 * @model
 * @generated
 */
public interface MessageToCSV extends EObject {
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
	 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.ParsingPackage#getMessageToCSV_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.remote.access.parsing.MessageToCSV#getMessage <em>Message</em>}' attribute.
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
	 * @model kind="operation"
	 * @generated
	 */
	String getCSV();

} // MessageToCSV
