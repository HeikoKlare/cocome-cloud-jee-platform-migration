/**
 */
package ecore.org.cocome.tradingsystem.util.java;

import java.util.concurrent.TimeUnit;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Span</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.java.TimeSpan#get__value <em>value</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.java.TimeSpan#get__unit <em>unit</em>}</li>
 * </ul>
 *
 * @see ecore.org.cocome.tradingsystem.util.java.JavaPackage#getTimeSpan()
 * @model
 * @generated
 */
public interface TimeSpan extends EObject {
	/**
	 * Returns the value of the '<em><b>value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>value</em>' attribute.
	 * @see #set__value(long)
	 * @see ecore.org.cocome.tradingsystem.util.java.JavaPackage#getTimeSpan___value()
	 * @model
	 * @generated
	 */
	long get__value();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.util.java.TimeSpan#get__value <em>value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>value</em>' attribute.
	 * @see #get__value()
	 * @generated
	 */
	void set__value(long value);

	/**
	 * Returns the value of the '<em><b>unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>unit</em>' attribute.
	 * @see #set__unit(TimeUnit)
	 * @see ecore.org.cocome.tradingsystem.util.java.JavaPackage#getTimeSpan___unit()
	 * @model dataType="ecore.datatypes.java.util.concurrent.TimeUnit"
	 * @generated
	 */
	TimeUnit get__unit();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.util.java.TimeSpan#get__unit <em>unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>unit</em>' attribute.
	 * @see #get__unit()
	 * @generated
	 */
	void set__unit(TimeUnit value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unitDataType="ecore.datatypes.java.util.concurrent.TimeUnit"
	 * @generated
	 */
	long getDuration(TimeUnit unit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean equals(Object object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int hashCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int compareTo(org.cocome.tradingsystem.util.java.TimeSpan that);

} // TimeSpan
