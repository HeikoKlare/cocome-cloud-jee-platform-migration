/**
 */
package ecore.org.cocome.tradingsystem.util.java;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dual Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.java.DualElement#getElem1 <em>Elem1</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.java.DualElement#getElem2 <em>Elem2</em>}</li>
 * </ul>
 *
 * @see ecore.org.cocome.tradingsystem.util.java.JavaPackage#getDualElement()
 * @model
 * @generated
 */
public interface DualElement<T, E> extends EObject {
	/**
	 * Returns the value of the '<em><b>Elem1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elem1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elem1</em>' attribute.
	 * @see #setElem1(Object)
	 * @see ecore.org.cocome.tradingsystem.util.java.JavaPackage#getDualElement_Elem1()
	 * @model
	 * @generated
	 */
	T getElem1();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.util.java.DualElement#getElem1 <em>Elem1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elem1</em>' attribute.
	 * @see #getElem1()
	 * @generated
	 */
	void setElem1(T value);

	/**
	 * Returns the value of the '<em><b>Elem2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elem2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elem2</em>' attribute.
	 * @see #setElem2(Object)
	 * @see ecore.org.cocome.tradingsystem.util.java.JavaPackage#getDualElement_Elem2()
	 * @model
	 * @generated
	 */
	E getElem2();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.util.java.DualElement#getElem2 <em>Elem2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elem2</em>' attribute.
	 * @see #getElem2()
	 * @generated
	 */
	void setElem2(E value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	T getFirstElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	E getSecondElement();

} // DualElement
