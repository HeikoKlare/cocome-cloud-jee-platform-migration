/**
 */
package ecore.org.cocome.tradingsystem.util.java.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;

import org.cocome.tradingsystem.util.java.DualElement;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ecore.org.cocome.tradingsystem.util.java.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dual Iterator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.java.impl.DualIteratorImpl#getColl1 <em>Coll1</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.java.impl.DualIteratorImpl#getColl2 <em>Coll2</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.java.impl.DualIteratorImpl#getIterator1 <em>Iterator1</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.java.impl.DualIteratorImpl#getIterator2 <em>Iterator2</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.java.impl.DualIteratorImpl#getCurrElement1 <em>Curr Element1</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.java.impl.DualIteratorImpl#getCurrElement2 <em>Curr Element2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DualIteratorImpl<T, E> extends MinimalEObjectImpl.Container implements ecore.org.cocome.tradingsystem.util.java.DualIterator<T, E> {
	/**
	 * The cached value of the '{@link #getColl1() <em>Coll1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColl1()
	 * @generated
	 * @ordered
	 */
	protected Collection<T> coll1;

	/**
	 * The cached value of the '{@link #getColl2() <em>Coll2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColl2()
	 * @generated
	 * @ordered
	 */
	protected Collection<E> coll2;

	/**
	 * The cached value of the '{@link #getIterator1() <em>Iterator1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterator1()
	 * @generated
	 * @ordered
	 */
	protected Iterator<T> iterator1;

	/**
	 * The cached value of the '{@link #getIterator2() <em>Iterator2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterator2()
	 * @generated
	 * @ordered
	 */
	protected Iterator<E> iterator2;

	/**
	 * The cached value of the '{@link #getCurrElement1() <em>Curr Element1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrElement1()
	 * @generated
	 * @ordered
	 */
	protected T currElement1;

	/**
	 * The cached value of the '{@link #getCurrElement2() <em>Curr Element2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrElement2()
	 * @generated
	 * @ordered
	 */
	protected E currElement2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DualIteratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.DUAL_ITERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<T> getColl1() {
		return coll1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColl1(Collection<T> newColl1) {
		Collection<T> oldColl1 = coll1;
		coll1 = newColl1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.DUAL_ITERATOR__COLL1, oldColl1, coll1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<E> getColl2() {
		return coll2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColl2(Collection<E> newColl2) {
		Collection<E> oldColl2 = coll2;
		coll2 = newColl2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.DUAL_ITERATOR__COLL2, oldColl2, coll2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iterator<T> getIterator1() {
		return iterator1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIterator1(Iterator<T> newIterator1) {
		Iterator<T> oldIterator1 = iterator1;
		iterator1 = newIterator1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.DUAL_ITERATOR__ITERATOR1, oldIterator1, iterator1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iterator<E> getIterator2() {
		return iterator2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIterator2(Iterator<E> newIterator2) {
		Iterator<E> oldIterator2 = iterator2;
		iterator2 = newIterator2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.DUAL_ITERATOR__ITERATOR2, oldIterator2, iterator2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T getCurrElement1() {
		return currElement1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrElement1(T newCurrElement1) {
		T oldCurrElement1 = currElement1;
		currElement1 = newCurrElement1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.DUAL_ITERATOR__CURR_ELEMENT1, oldCurrElement1, currElement1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public E getCurrElement2() {
		return currElement2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrElement2(E newCurrElement2) {
		E oldCurrElement2 = currElement2;
		currElement2 = newCurrElement2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.DUAL_ITERATOR__CURR_ELEMENT2, oldCurrElement2, currElement2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iterator<DualElement<T, E>> iterator() {
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
			case JavaPackage.DUAL_ITERATOR__COLL1:
				return getColl1();
			case JavaPackage.DUAL_ITERATOR__COLL2:
				return getColl2();
			case JavaPackage.DUAL_ITERATOR__ITERATOR1:
				return getIterator1();
			case JavaPackage.DUAL_ITERATOR__ITERATOR2:
				return getIterator2();
			case JavaPackage.DUAL_ITERATOR__CURR_ELEMENT1:
				return getCurrElement1();
			case JavaPackage.DUAL_ITERATOR__CURR_ELEMENT2:
				return getCurrElement2();
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
			case JavaPackage.DUAL_ITERATOR__COLL1:
				setColl1((Collection<T>)newValue);
				return;
			case JavaPackage.DUAL_ITERATOR__COLL2:
				setColl2((Collection<E>)newValue);
				return;
			case JavaPackage.DUAL_ITERATOR__ITERATOR1:
				setIterator1((Iterator<T>)newValue);
				return;
			case JavaPackage.DUAL_ITERATOR__ITERATOR2:
				setIterator2((Iterator<E>)newValue);
				return;
			case JavaPackage.DUAL_ITERATOR__CURR_ELEMENT1:
				setCurrElement1((T)newValue);
				return;
			case JavaPackage.DUAL_ITERATOR__CURR_ELEMENT2:
				setCurrElement2((E)newValue);
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
			case JavaPackage.DUAL_ITERATOR__COLL1:
				setColl1((Collection<T>)null);
				return;
			case JavaPackage.DUAL_ITERATOR__COLL2:
				setColl2((Collection<E>)null);
				return;
			case JavaPackage.DUAL_ITERATOR__ITERATOR1:
				setIterator1((Iterator<T>)null);
				return;
			case JavaPackage.DUAL_ITERATOR__ITERATOR2:
				setIterator2((Iterator<E>)null);
				return;
			case JavaPackage.DUAL_ITERATOR__CURR_ELEMENT1:
				setCurrElement1((T)null);
				return;
			case JavaPackage.DUAL_ITERATOR__CURR_ELEMENT2:
				setCurrElement2((E)null);
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
			case JavaPackage.DUAL_ITERATOR__COLL1:
				return coll1 != null;
			case JavaPackage.DUAL_ITERATOR__COLL2:
				return coll2 != null;
			case JavaPackage.DUAL_ITERATOR__ITERATOR1:
				return iterator1 != null;
			case JavaPackage.DUAL_ITERATOR__ITERATOR2:
				return iterator2 != null;
			case JavaPackage.DUAL_ITERATOR__CURR_ELEMENT1:
				return currElement1 != null;
			case JavaPackage.DUAL_ITERATOR__CURR_ELEMENT2:
				return currElement2 != null;
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
			case JavaPackage.DUAL_ITERATOR___ITERATOR:
				return iterator();
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
		result.append(" (coll1: ");
		result.append(coll1);
		result.append(", coll2: ");
		result.append(coll2);
		result.append(", iterator1: ");
		result.append(iterator1);
		result.append(", iterator2: ");
		result.append(iterator2);
		result.append(", currElement1: ");
		result.append(currElement1);
		result.append(", currElement2: ");
		result.append(currElement2);
		result.append(')');
		return result.toString();
	}

} //DualIteratorImpl
