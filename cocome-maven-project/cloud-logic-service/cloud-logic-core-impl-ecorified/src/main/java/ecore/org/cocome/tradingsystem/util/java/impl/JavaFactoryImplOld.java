/**
 */
package ecore.org.cocome.tradingsystem.util.java.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

import ecore.org.cocome.tradingsystem.util.java.Assert;
import ecore.org.cocome.tradingsystem.util.java.DualElement;
import ecore.org.cocome.tradingsystem.util.java.DualIterator;
import ecore.org.cocome.tradingsystem.util.java.Iterables;
import ecore.org.cocome.tradingsystem.util.java.JavaFactoryOld;
import ecore.org.cocome.tradingsystem.util.java.JavaPackage;
import ecore.org.cocome.tradingsystem.util.java.Lists;
import ecore.org.cocome.tradingsystem.util.java.Maps;
import ecore.org.cocome.tradingsystem.util.java.Reflection;
import ecore.org.cocome.tradingsystem.util.java.Sets;
import ecore.org.cocome.tradingsystem.util.java.Swing;
import ecore.org.cocome.tradingsystem.util.java.TimeSpan;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaFactoryImplOld extends EFactoryImpl implements JavaFactoryOld {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JavaFactoryOld init() {
		return new JavaFactoryImplOld();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaFactoryImplOld() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JavaPackage.ASSERT: return createAssert();
			case JavaPackage.DUAL_ELEMENT: return createDualElement();
			case JavaPackage.DUAL_ITERATOR: return createDualIterator();
			case JavaPackage.ITERABLES: return createIterables();
			case JavaPackage.LISTS: return createLists();
			case JavaPackage.MAPS: return createMaps();
			case JavaPackage.REFLECTION: return createReflection();
			case JavaPackage.SETS: return createSets();
			case JavaPackage.SWING: return createSwing();
			case JavaPackage.TIME_SPAN: return createTimeSpan();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assert createAssert() {
		AssertImpl assert_ = new AssertImpl();
		return assert_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T, E> DualElement<T, E> createDualElement() {
		DualElementImpl<T, E> dualElement = new DualElementImpl<T, E>();
		return dualElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T, E> DualIterator<T, E> createDualIterator() {
		DualIteratorImpl<T, E> dualIterator = new DualIteratorImpl<T, E>();
		return dualIterator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iterables createIterables() {
		IterablesImpl iterables = new IterablesImpl();
		return iterables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lists createLists() {
		ListsImpl lists = new ListsImpl();
		return lists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Maps createMaps() {
		MapsImpl maps = new MapsImpl();
		return maps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reflection createReflection() {
		ReflectionImpl reflection = new ReflectionImpl();
		return reflection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sets createSets() {
		SetsImpl sets = new SetsImpl();
		return sets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Swing createSwing() {
		SwingImpl swing = new SwingImpl();
		return swing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSpan createTimeSpan() {
		TimeSpanImpl timeSpan = new TimeSpanImpl();
		return timeSpan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaPackage getJavaPackage() {
		return (JavaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JavaPackage getPackage() {
		return JavaPackage.eINSTANCE;
	}

} //JavaFactoryImpl
