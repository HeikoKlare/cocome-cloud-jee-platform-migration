/**
 */
package ecore.org.cocome.tradingsystem.util.java.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ecore.org.cocome.tradingsystem.util.java.JavaPackage
 * @generated
 */
public class JavaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JavaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JavaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaSwitch<Adapter> modelSwitch =
		new JavaSwitch<Adapter>() {
			@Override
			public Adapter caseAssert(Assert object) {
				return createAssertAdapter();
			}
			@Override
			public <T, E> Adapter caseDualElement(DualElement<T, E> object) {
				return createDualElementAdapter();
			}
			@Override
			public <T, E> Adapter caseDualIterator(DualIterator<T, E> object) {
				return createDualIteratorAdapter();
			}
			@Override
			public Adapter caseIterables(Iterables object) {
				return createIterablesAdapter();
			}
			@Override
			public Adapter caseLists(Lists object) {
				return createListsAdapter();
			}
			@Override
			public Adapter caseMaps(Maps object) {
				return createMapsAdapter();
			}
			@Override
			public Adapter caseReflection(Reflection object) {
				return createReflectionAdapter();
			}
			@Override
			public Adapter caseSets(Sets object) {
				return createSetsAdapter();
			}
			@Override
			public Adapter caseSwing(Swing object) {
				return createSwingAdapter();
			}
			@Override
			public Adapter caseTimeSpan(TimeSpan object) {
				return createTimeSpanAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ecore.org.cocome.tradingsystem.util.java.Assert <em>Assert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore.org.cocome.tradingsystem.util.java.Assert
	 * @generated
	 */
	public Adapter createAssertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecore.org.cocome.tradingsystem.util.java.DualElement <em>Dual Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore.org.cocome.tradingsystem.util.java.DualElement
	 * @generated
	 */
	public Adapter createDualElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecore.org.cocome.tradingsystem.util.java.DualIterator <em>Dual Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore.org.cocome.tradingsystem.util.java.DualIterator
	 * @generated
	 */
	public Adapter createDualIteratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecore.org.cocome.tradingsystem.util.java.Iterables <em>Iterables</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore.org.cocome.tradingsystem.util.java.Iterables
	 * @generated
	 */
	public Adapter createIterablesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecore.org.cocome.tradingsystem.util.java.Lists <em>Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore.org.cocome.tradingsystem.util.java.Lists
	 * @generated
	 */
	public Adapter createListsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecore.org.cocome.tradingsystem.util.java.Maps <em>Maps</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore.org.cocome.tradingsystem.util.java.Maps
	 * @generated
	 */
	public Adapter createMapsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecore.org.cocome.tradingsystem.util.java.Reflection <em>Reflection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore.org.cocome.tradingsystem.util.java.Reflection
	 * @generated
	 */
	public Adapter createReflectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecore.org.cocome.tradingsystem.util.java.Sets <em>Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore.org.cocome.tradingsystem.util.java.Sets
	 * @generated
	 */
	public Adapter createSetsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecore.org.cocome.tradingsystem.util.java.Swing <em>Swing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore.org.cocome.tradingsystem.util.java.Swing
	 * @generated
	 */
	public Adapter createSwingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecore.org.cocome.tradingsystem.util.java.TimeSpan <em>Time Span</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore.org.cocome.tradingsystem.util.java.TimeSpan
	 * @generated
	 */
	public Adapter createTimeSpanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //JavaAdapterFactory
