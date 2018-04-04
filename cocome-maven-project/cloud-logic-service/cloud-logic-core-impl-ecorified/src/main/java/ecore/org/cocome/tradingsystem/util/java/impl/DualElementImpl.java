/**
 */
package ecore.org.cocome.tradingsystem.util.java.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ecore.org.cocome.tradingsystem.util.java.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dual Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.java.impl.DualElementImpl#getElem1 <em>Elem1</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.java.impl.DualElementImpl#getElem2 <em>Elem2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DualElementImpl<T, E> extends MinimalEObjectImpl.Container implements ecore.org.cocome.tradingsystem.util.java.DualElement<T, E> {
	/**
	 * The cached value of the '{@link #getElem1() <em>Elem1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElem1()
	 * @generated
	 * @ordered
	 */
	protected T elem1;

	/**
	 * The cached value of the '{@link #getElem2() <em>Elem2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElem2()
	 * @generated
	 * @ordered
	 */
	protected E elem2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DualElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.DUAL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T getElem1() {
		return elem1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElem1(T newElem1) {
		T oldElem1 = elem1;
		elem1 = newElem1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.DUAL_ELEMENT__ELEM1, oldElem1, elem1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public E getElem2() {
		return elem2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElem2(E newElem2) {
		E oldElem2 = elem2;
		elem2 = newElem2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.DUAL_ELEMENT__ELEM2, oldElem2, elem2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T getFirstElement() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public E getSecondElement() {
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
			case JavaPackage.DUAL_ELEMENT__ELEM1:
				return getElem1();
			case JavaPackage.DUAL_ELEMENT__ELEM2:
				return getElem2();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JavaPackage.DUAL_ELEMENT__ELEM1:
				setElem1((T)newValue);
				return;
			case JavaPackage.DUAL_ELEMENT__ELEM2:
				setElem2((E)newValue);
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
			case JavaPackage.DUAL_ELEMENT__ELEM1:
				setElem1((T)null);
				return;
			case JavaPackage.DUAL_ELEMENT__ELEM2:
				setElem2((E)null);
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
			case JavaPackage.DUAL_ELEMENT__ELEM1:
				return elem1 != null;
			case JavaPackage.DUAL_ELEMENT__ELEM2:
				return elem2 != null;
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
			case JavaPackage.DUAL_ELEMENT___GET_FIRST_ELEMENT:
				return getFirstElement();
			case JavaPackage.DUAL_ELEMENT___GET_SECOND_ELEMENT:
				return getSecondElement();
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
		result.append(" (elem1: ");
		result.append(elem1);
		result.append(", elem2: ");
		result.append(elem2);
		result.append(')');
		return result.toString();
	}

} //DualElementImpl
