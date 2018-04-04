/**
 */
package ecore.org.cocome.tradingsystem.util.java.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import ecore.org.cocome.tradingsystem.util.java.Assert;
import ecore.org.cocome.tradingsystem.util.java.DualElement;
import ecore.org.cocome.tradingsystem.util.java.DualIterator;
import ecore.org.cocome.tradingsystem.util.java.Iterables;
import ecore.org.cocome.tradingsystem.util.java.JavaPackage;
import ecore.org.cocome.tradingsystem.util.java.Lists;
import ecore.org.cocome.tradingsystem.util.java.Maps;
import ecore.org.cocome.tradingsystem.util.java.Reflection;
import ecore.org.cocome.tradingsystem.util.java.Sets;
import ecore.org.cocome.tradingsystem.util.java.Swing;
import ecore.org.cocome.tradingsystem.util.java.TimeSpan;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ecore.org.cocome.tradingsystem.util.java.JavaPackage
 * @generated
 */
public class JavaSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JavaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaSwitch() {
		if (modelPackage == null) {
			modelPackage = JavaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case JavaPackage.ASSERT: {
				Assert assert_ = (Assert)theEObject;
				T1 result = caseAssert(assert_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.DUAL_ELEMENT: {
				DualElement<?, ?> dualElement = (DualElement<?, ?>)theEObject;
				T1 result = caseDualElement(dualElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.DUAL_ITERATOR: {
				DualIterator<?, ?> dualIterator = (DualIterator<?, ?>)theEObject;
				T1 result = caseDualIterator(dualIterator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ITERABLES: {
				Iterables iterables = (Iterables)theEObject;
				T1 result = caseIterables(iterables);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.LISTS: {
				Lists lists = (Lists)theEObject;
				T1 result = caseLists(lists);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.MAPS: {
				Maps maps = (Maps)theEObject;
				T1 result = caseMaps(maps);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.REFLECTION: {
				Reflection reflection = (Reflection)theEObject;
				T1 result = caseReflection(reflection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.SETS: {
				Sets sets = (Sets)theEObject;
				T1 result = caseSets(sets);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.SWING: {
				Swing swing = (Swing)theEObject;
				T1 result = caseSwing(swing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.TIME_SPAN: {
				TimeSpan timeSpan = (TimeSpan)theEObject;
				T1 result = caseTimeSpan(timeSpan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAssert(Assert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dual Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dual Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T, E> T1 caseDualElement(DualElement<T, E> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dual Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dual Iterator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T, E> T1 caseDualIterator(DualIterator<T, E> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iterables</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iterables</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIterables(Iterables object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lists</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lists</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLists(Lists object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maps</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maps</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMaps(Maps object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reflection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reflection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseReflection(Reflection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sets</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sets</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSets(Sets object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSwing(Swing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Span</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Span</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTimeSpan(TimeSpan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //JavaSwitch
