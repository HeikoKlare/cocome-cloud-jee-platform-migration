/**
 */
package ecore.org.cocome.tradingsystem.util.java.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;

import org.cocome.tradingsystem.util.java.TimeSpan;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ecore.org.cocome.tradingsystem.util.java.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Span</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.java.impl.TimeSpanImpl#get__value <em>value</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.java.impl.TimeSpanImpl#get__unit <em>unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeSpanImpl extends MinimalEObjectImpl.Container implements ecore.org.cocome.tradingsystem.util.java.TimeSpan {
	/**
	 * The default value of the '{@link #get__value() <em>value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get__value()
	 * @generated
	 * @ordered
	 */
	protected static final long _VALUE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #get__value() <em>value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get__value()
	 * @generated
	 * @ordered
	 */
	protected long __value = _VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #get__unit() <em>unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get__unit()
	 * @generated
	 * @ordered
	 */
	protected static final TimeUnit _UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #get__unit() <em>unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get__unit()
	 * @generated
	 * @ordered
	 */
	protected TimeUnit __unit = _UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeSpanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.TIME_SPAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long get__value() {
		return __value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set__value(long new__value) {
		long old__value = __value;
		__value = new__value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.TIME_SPAN__VALUE, old__value, __value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit get__unit() {
		return __unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set__unit(TimeUnit new__unit) {
		TimeUnit old__unit = __unit;
		__unit = new__unit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.TIME_SPAN__UNIT, old__unit, __unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDuration(TimeUnit unit) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean equals(Object object) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int hashCode() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int compareTo(TimeSpan that) {
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
			case JavaPackage.TIME_SPAN__VALUE:
				return get__value();
			case JavaPackage.TIME_SPAN__UNIT:
				return get__unit();
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
			case JavaPackage.TIME_SPAN__VALUE:
				set__value((Long)newValue);
				return;
			case JavaPackage.TIME_SPAN__UNIT:
				set__unit((TimeUnit)newValue);
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
			case JavaPackage.TIME_SPAN__VALUE:
				set__value(_VALUE_EDEFAULT);
				return;
			case JavaPackage.TIME_SPAN__UNIT:
				set__unit(_UNIT_EDEFAULT);
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
			case JavaPackage.TIME_SPAN__VALUE:
				return __value != _VALUE_EDEFAULT;
			case JavaPackage.TIME_SPAN__UNIT:
				return _UNIT_EDEFAULT == null ? __unit != null : !_UNIT_EDEFAULT.equals(__unit);
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
			case JavaPackage.TIME_SPAN___GET_DURATION__TIMEUNIT:
				return getDuration((TimeUnit)arguments.get(0));
			case JavaPackage.TIME_SPAN___EQUALS__OBJECT:
				return equals(arguments.get(0));
			case JavaPackage.TIME_SPAN___HASH_CODE:
				return hashCode();
			case JavaPackage.TIME_SPAN___COMPARE_TO__TIMESPAN:
				return compareTo((TimeSpan)arguments.get(0));
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
		result.append(" (__value: ");
		result.append(__value);
		result.append(", __unit: ");
		result.append(__unit);
		result.append(')');
		return result.toString();
	}

} //TimeSpanImpl
