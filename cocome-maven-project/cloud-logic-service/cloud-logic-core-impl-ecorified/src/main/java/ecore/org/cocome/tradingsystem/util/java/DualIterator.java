/**
 */
package ecore.org.cocome.tradingsystem.util.java;

import java.util.Collection;
import java.util.Iterator;

import org.cocome.tradingsystem.util.java.DualElement;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dual Iterator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.java.DualIterator#getColl1 <em>Coll1</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.java.DualIterator#getColl2 <em>Coll2</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.java.DualIterator#getIterator1 <em>Iterator1</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.java.DualIterator#getIterator2 <em>Iterator2</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.java.DualIterator#getCurrElement1 <em>Curr Element1</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.java.DualIterator#getCurrElement2 <em>Curr Element2</em>}</li>
 * </ul>
 *
 * @see ecore.org.cocome.tradingsystem.util.java.JavaPackage#getDualIterator()
 * @model
 * @generated
 */
public interface DualIterator<T, E> extends EObject {
	/**
	 * Returns the value of the '<em><b>Coll1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coll1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coll1</em>' attribute.
	 * @see #setColl1(Collection)
	 * @see ecore.org.cocome.tradingsystem.util.java.JavaPackage#getDualIterator_Coll1()
	 * @model dataType="ecore.datatypes.java.util.Collection&lt;T&gt;"
	 * @generated
	 */
	Collection<T> getColl1();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.util.java.DualIterator#getColl1 <em>Coll1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coll1</em>' attribute.
	 * @see #getColl1()
	 * @generated
	 */
	void setColl1(Collection<T> value);

	/**
	 * Returns the value of the '<em><b>Coll2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coll2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coll2</em>' attribute.
	 * @see #setColl2(Collection)
	 * @see ecore.org.cocome.tradingsystem.util.java.JavaPackage#getDualIterator_Coll2()
	 * @model dataType="ecore.datatypes.java.util.Collection&lt;E&gt;"
	 * @generated
	 */
	Collection<E> getColl2();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.util.java.DualIterator#getColl2 <em>Coll2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coll2</em>' attribute.
	 * @see #getColl2()
	 * @generated
	 */
	void setColl2(Collection<E> value);

	/**
	 * Returns the value of the '<em><b>Iterator1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iterator1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterator1</em>' attribute.
	 * @see #setIterator1(Iterator)
	 * @see ecore.org.cocome.tradingsystem.util.java.JavaPackage#getDualIterator_Iterator1()
	 * @model dataType="ecore.datatypes.java.util.Iterator&lt;T&gt;"
	 * @generated
	 */
	Iterator<T> getIterator1();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.util.java.DualIterator#getIterator1 <em>Iterator1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterator1</em>' attribute.
	 * @see #getIterator1()
	 * @generated
	 */
	void setIterator1(Iterator<T> value);

	/**
	 * Returns the value of the '<em><b>Iterator2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iterator2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterator2</em>' attribute.
	 * @see #setIterator2(Iterator)
	 * @see ecore.org.cocome.tradingsystem.util.java.JavaPackage#getDualIterator_Iterator2()
	 * @model dataType="ecore.datatypes.java.util.Iterator&lt;E&gt;"
	 * @generated
	 */
	Iterator<E> getIterator2();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.util.java.DualIterator#getIterator2 <em>Iterator2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterator2</em>' attribute.
	 * @see #getIterator2()
	 * @generated
	 */
	void setIterator2(Iterator<E> value);

	/**
	 * Returns the value of the '<em><b>Curr Element1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curr Element1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curr Element1</em>' attribute.
	 * @see #setCurrElement1(Object)
	 * @see ecore.org.cocome.tradingsystem.util.java.JavaPackage#getDualIterator_CurrElement1()
	 * @model
	 * @generated
	 */
	T getCurrElement1();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.util.java.DualIterator#getCurrElement1 <em>Curr Element1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curr Element1</em>' attribute.
	 * @see #getCurrElement1()
	 * @generated
	 */
	void setCurrElement1(T value);

	/**
	 * Returns the value of the '<em><b>Curr Element2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curr Element2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curr Element2</em>' attribute.
	 * @see #setCurrElement2(Object)
	 * @see ecore.org.cocome.tradingsystem.util.java.JavaPackage#getDualIterator_CurrElement2()
	 * @model
	 * @generated
	 */
	E getCurrElement2();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.util.java.DualIterator#getCurrElement2 <em>Curr Element2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curr Element2</em>' attribute.
	 * @see #getCurrElement2()
	 * @generated
	 */
	void setCurrElement2(E value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.java.util.Iterator&lt;ecore.org.cocome.tradingsystem.util.java.DualElement&lt;T, E&gt;&gt;"
	 * @generated
	 */
	Iterator<DualElement<T, E>> iterator();

} // DualIterator
