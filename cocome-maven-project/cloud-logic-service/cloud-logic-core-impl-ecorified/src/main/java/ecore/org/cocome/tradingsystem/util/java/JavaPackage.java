/**
 */
package ecore.org.cocome.tradingsystem.util.java;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ecore.org.cocome.tradingsystem.util.java.JavaFactoryOld
 * @model kind="package"
 * @generated
 */
public interface JavaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "java";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "cloud-logic-core-impl/ecore.org.cocome.tradingsystem.util.java";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "java";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavaPackage eINSTANCE = ecore.org.cocome.tradingsystem.util.java.impl.JavaPackageImpl.init();

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.util.java.impl.AssertImpl <em>Assert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.util.java.impl.AssertImpl
	 * @see ecore.org.cocome.tradingsystem.util.java.impl.JavaPackageImpl#getAssert()
	 * @generated
	 */
	int ASSERT = 0;

	/**
	 * The number of structural features of the '<em>Assert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Assert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.util.java.impl.DualElementImpl <em>Dual Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.util.java.impl.DualElementImpl
	 * @see ecore.org.cocome.tradingsystem.util.java.impl.JavaPackageImpl#getDualElement()
	 * @generated
	 */
	int DUAL_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Elem1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_ELEMENT__ELEM1 = 0;

	/**
	 * The feature id for the '<em><b>Elem2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_ELEMENT__ELEM2 = 1;

	/**
	 * The number of structural features of the '<em>Dual Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get First Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_ELEMENT___GET_FIRST_ELEMENT = 0;

	/**
	 * The operation id for the '<em>Get Second Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_ELEMENT___GET_SECOND_ELEMENT = 1;

	/**
	 * The number of operations of the '<em>Dual Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_ELEMENT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.util.java.impl.DualIteratorImpl <em>Dual Iterator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.util.java.impl.DualIteratorImpl
	 * @see ecore.org.cocome.tradingsystem.util.java.impl.JavaPackageImpl#getDualIterator()
	 * @generated
	 */
	int DUAL_ITERATOR = 2;

	/**
	 * The feature id for the '<em><b>Coll1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_ITERATOR__COLL1 = 0;

	/**
	 * The feature id for the '<em><b>Coll2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_ITERATOR__COLL2 = 1;

	/**
	 * The feature id for the '<em><b>Iterator1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_ITERATOR__ITERATOR1 = 2;

	/**
	 * The feature id for the '<em><b>Iterator2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_ITERATOR__ITERATOR2 = 3;

	/**
	 * The feature id for the '<em><b>Curr Element1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_ITERATOR__CURR_ELEMENT1 = 4;

	/**
	 * The feature id for the '<em><b>Curr Element2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_ITERATOR__CURR_ELEMENT2 = 5;

	/**
	 * The number of structural features of the '<em>Dual Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_ITERATOR_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_ITERATOR___ITERATOR = 0;

	/**
	 * The number of operations of the '<em>Dual Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_ITERATOR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.util.java.impl.IterablesImpl <em>Iterables</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.util.java.impl.IterablesImpl
	 * @see ecore.org.cocome.tradingsystem.util.java.impl.JavaPackageImpl#getIterables()
	 * @generated
	 */
	int ITERABLES = 3;

	/**
	 * The number of structural features of the '<em>Iterables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERABLES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Iterables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERABLES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.util.java.impl.ListsImpl <em>Lists</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.util.java.impl.ListsImpl
	 * @see ecore.org.cocome.tradingsystem.util.java.impl.JavaPackageImpl#getLists()
	 * @generated
	 */
	int LISTS = 4;

	/**
	 * The number of structural features of the '<em>Lists</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Lists</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.util.java.impl.MapsImpl <em>Maps</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.util.java.impl.MapsImpl
	 * @see ecore.org.cocome.tradingsystem.util.java.impl.JavaPackageImpl#getMaps()
	 * @generated
	 */
	int MAPS = 5;

	/**
	 * The number of structural features of the '<em>Maps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Maps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.util.java.impl.ReflectionImpl <em>Reflection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.util.java.impl.ReflectionImpl
	 * @see ecore.org.cocome.tradingsystem.util.java.impl.JavaPackageImpl#getReflection()
	 * @generated
	 */
	int REFLECTION = 6;

	/**
	 * The number of structural features of the '<em>Reflection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Reflection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.util.java.impl.SetsImpl <em>Sets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.util.java.impl.SetsImpl
	 * @see ecore.org.cocome.tradingsystem.util.java.impl.JavaPackageImpl#getSets()
	 * @generated
	 */
	int SETS = 7;

	/**
	 * The number of structural features of the '<em>Sets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Sets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.util.java.impl.SwingImpl <em>Swing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.util.java.impl.SwingImpl
	 * @see ecore.org.cocome.tradingsystem.util.java.impl.JavaPackageImpl#getSwing()
	 * @generated
	 */
	int SWING = 8;

	/**
	 * The number of structural features of the '<em>Swing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWING_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Swing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.util.java.impl.TimeSpanImpl <em>Time Span</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.util.java.impl.TimeSpanImpl
	 * @see ecore.org.cocome.tradingsystem.util.java.impl.JavaPackageImpl#getTimeSpan()
	 * @generated
	 */
	int TIME_SPAN = 9;

	/**
	 * The feature id for the '<em><b>value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN__VALUE = 0;

	/**
	 * The feature id for the '<em><b>unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Time Span</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Duration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN___GET_DURATION__TIMEUNIT = 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN___EQUALS__OBJECT = 1;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN___HASH_CODE = 2;

	/**
	 * The operation id for the '<em>Compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN___COMPARE_TO__TIMESPAN = 3;

	/**
	 * The number of operations of the '<em>Time Span</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN_OPERATION_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.util.java.Assert <em>Assert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assert</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.java.Assert
	 * @generated
	 */
	EClass getAssert();

	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.util.java.DualElement <em>Dual Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dual Element</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.java.DualElement
	 * @generated
	 */
	EClass getDualElement();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.util.java.DualElement#getElem1 <em>Elem1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elem1</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.java.DualElement#getElem1()
	 * @see #getDualElement()
	 * @generated
	 */
	EAttribute getDualElement_Elem1();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.util.java.DualElement#getElem2 <em>Elem2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elem2</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.java.DualElement#getElem2()
	 * @see #getDualElement()
	 * @generated
	 */
	EAttribute getDualElement_Elem2();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.util.java.DualElement#getFirstElement() <em>Get First Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get First Element</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.util.java.DualElement#getFirstElement()
	 * @generated
	 */
	EOperation getDualElement__GetFirstElement();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.util.java.DualElement#getSecondElement() <em>Get Second Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Second Element</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.util.java.DualElement#getSecondElement()
	 * @generated
	 */
	EOperation getDualElement__GetSecondElement();

	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.util.java.DualIterator <em>Dual Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dual Iterator</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.java.DualIterator
	 * @generated
	 */
	EClass getDualIterator();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.util.java.DualIterator#getColl1 <em>Coll1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coll1</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.java.DualIterator#getColl1()
	 * @see #getDualIterator()
	 * @generated
	 */
	EAttribute getDualIterator_Coll1();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.util.java.DualIterator#getColl2 <em>Coll2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coll2</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.java.DualIterator#getColl2()
	 * @see #getDualIterator()
	 * @generated
	 */
	EAttribute getDualIterator_Coll2();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.util.java.DualIterator#getIterator1 <em>Iterator1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iterator1</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.java.DualIterator#getIterator1()
	 * @see #getDualIterator()
	 * @generated
	 */
	EAttribute getDualIterator_Iterator1();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.util.java.DualIterator#getIterator2 <em>Iterator2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iterator2</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.java.DualIterator#getIterator2()
	 * @see #getDualIterator()
	 * @generated
	 */
	EAttribute getDualIterator_Iterator2();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.util.java.DualIterator#getCurrElement1 <em>Curr Element1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Curr Element1</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.java.DualIterator#getCurrElement1()
	 * @see #getDualIterator()
	 * @generated
	 */
	EAttribute getDualIterator_CurrElement1();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.util.java.DualIterator#getCurrElement2 <em>Curr Element2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Curr Element2</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.java.DualIterator#getCurrElement2()
	 * @see #getDualIterator()
	 * @generated
	 */
	EAttribute getDualIterator_CurrElement2();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.util.java.DualIterator#iterator() <em>Iterator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Iterator</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.util.java.DualIterator#iterator()
	 * @generated
	 */
	EOperation getDualIterator__Iterator();

	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.util.java.Iterables <em>Iterables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterables</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.java.Iterables
	 * @generated
	 */
	EClass getIterables();

	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.util.java.Lists <em>Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lists</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.java.Lists
	 * @generated
	 */
	EClass getLists();

	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.util.java.Maps <em>Maps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maps</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.java.Maps
	 * @generated
	 */
	EClass getMaps();

	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.util.java.Reflection <em>Reflection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reflection</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.java.Reflection
	 * @generated
	 */
	EClass getReflection();

	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.util.java.Sets <em>Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sets</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.java.Sets
	 * @generated
	 */
	EClass getSets();

	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.util.java.Swing <em>Swing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swing</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.java.Swing
	 * @generated
	 */
	EClass getSwing();

	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.util.java.TimeSpan <em>Time Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Span</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.java.TimeSpan
	 * @generated
	 */
	EClass getTimeSpan();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.util.java.TimeSpan#get__value <em>value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>value</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.java.TimeSpan#get__value()
	 * @see #getTimeSpan()
	 * @generated
	 */
	EAttribute getTimeSpan___value();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.util.java.TimeSpan#get__unit <em>unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>unit</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.java.TimeSpan#get__unit()
	 * @see #getTimeSpan()
	 * @generated
	 */
	EAttribute getTimeSpan___unit();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.util.java.TimeSpan#getDuration(java.util.concurrent.TimeUnit) <em>Get Duration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Duration</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.util.java.TimeSpan#getDuration(java.util.concurrent.TimeUnit)
	 * @generated
	 */
	EOperation getTimeSpan__GetDuration__TimeUnit();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.util.java.TimeSpan#equals(java.lang.Object) <em>Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equals</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.util.java.TimeSpan#equals(java.lang.Object)
	 * @generated
	 */
	EOperation getTimeSpan__Equals__Object();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.util.java.TimeSpan#hashCode() <em>Hash Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Hash Code</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.util.java.TimeSpan#hashCode()
	 * @generated
	 */
	EOperation getTimeSpan__HashCode();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.util.java.TimeSpan#compareTo(ecore.org.cocome.tradingsystem.util.java.TimeSpan) <em>Compare To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compare To</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.util.java.TimeSpan#compareTo(ecore.org.cocome.tradingsystem.util.java.TimeSpan)
	 * @generated
	 */
	EOperation getTimeSpan__CompareTo__TimeSpan();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JavaFactory getJavaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.util.java.impl.AssertImpl <em>Assert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.util.java.impl.AssertImpl
		 * @see ecore.org.cocome.tradingsystem.util.java.impl.JavaPackageImpl#getAssert()
		 * @generated
		 */
		EClass ASSERT = eINSTANCE.getAssert();

		/**
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.util.java.impl.DualElementImpl <em>Dual Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.util.java.impl.DualElementImpl
		 * @see ecore.org.cocome.tradingsystem.util.java.impl.JavaPackageImpl#getDualElement()
		 * @generated
		 */
		EClass DUAL_ELEMENT = eINSTANCE.getDualElement();

		/**
		 * The meta object literal for the '<em><b>Elem1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DUAL_ELEMENT__ELEM1 = eINSTANCE.getDualElement_Elem1();

		/**
		 * The meta object literal for the '<em><b>Elem2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DUAL_ELEMENT__ELEM2 = eINSTANCE.getDualElement_Elem2();

		/**
		 * The meta object literal for the '<em><b>Get First Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DUAL_ELEMENT___GET_FIRST_ELEMENT = eINSTANCE.getDualElement__GetFirstElement();

		/**
		 * The meta object literal for the '<em><b>Get Second Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DUAL_ELEMENT___GET_SECOND_ELEMENT = eINSTANCE.getDualElement__GetSecondElement();

		/**
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.util.java.impl.DualIteratorImpl <em>Dual Iterator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.util.java.impl.DualIteratorImpl
		 * @see ecore.org.cocome.tradingsystem.util.java.impl.JavaPackageImpl#getDualIterator()
		 * @generated
		 */
		EClass DUAL_ITERATOR = eINSTANCE.getDualIterator();

		/**
		 * The meta object literal for the '<em><b>Coll1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DUAL_ITERATOR__COLL1 = eINSTANCE.getDualIterator_Coll1();

		/**
		 * The meta object literal for the '<em><b>Coll2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DUAL_ITERATOR__COLL2 = eINSTANCE.getDualIterator_Coll2();

		/**
		 * The meta object literal for the '<em><b>Iterator1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DUAL_ITERATOR__ITERATOR1 = eINSTANCE.getDualIterator_Iterator1();

		/**
		 * The meta object literal for the '<em><b>Iterator2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DUAL_ITERATOR__ITERATOR2 = eINSTANCE.getDualIterator_Iterator2();

		/**
		 * The meta object literal for the '<em><b>Curr Element1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DUAL_ITERATOR__CURR_ELEMENT1 = eINSTANCE.getDualIterator_CurrElement1();

		/**
		 * The meta object literal for the '<em><b>Curr Element2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DUAL_ITERATOR__CURR_ELEMENT2 = eINSTANCE.getDualIterator_CurrElement2();

		/**
		 * The meta object literal for the '<em><b>Iterator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DUAL_ITERATOR___ITERATOR = eINSTANCE.getDualIterator__Iterator();

		/**
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.util.java.impl.IterablesImpl <em>Iterables</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.util.java.impl.IterablesImpl
		 * @see ecore.org.cocome.tradingsystem.util.java.impl.JavaPackageImpl#getIterables()
		 * @generated
		 */
		EClass ITERABLES = eINSTANCE.getIterables();

		/**
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.util.java.impl.ListsImpl <em>Lists</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.util.java.impl.ListsImpl
		 * @see ecore.org.cocome.tradingsystem.util.java.impl.JavaPackageImpl#getLists()
		 * @generated
		 */
		EClass LISTS = eINSTANCE.getLists();

		/**
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.util.java.impl.MapsImpl <em>Maps</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.util.java.impl.MapsImpl
		 * @see ecore.org.cocome.tradingsystem.util.java.impl.JavaPackageImpl#getMaps()
		 * @generated
		 */
		EClass MAPS = eINSTANCE.getMaps();

		/**
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.util.java.impl.ReflectionImpl <em>Reflection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.util.java.impl.ReflectionImpl
		 * @see ecore.org.cocome.tradingsystem.util.java.impl.JavaPackageImpl#getReflection()
		 * @generated
		 */
		EClass REFLECTION = eINSTANCE.getReflection();

		/**
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.util.java.impl.SetsImpl <em>Sets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.util.java.impl.SetsImpl
		 * @see ecore.org.cocome.tradingsystem.util.java.impl.JavaPackageImpl#getSets()
		 * @generated
		 */
		EClass SETS = eINSTANCE.getSets();

		/**
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.util.java.impl.SwingImpl <em>Swing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.util.java.impl.SwingImpl
		 * @see ecore.org.cocome.tradingsystem.util.java.impl.JavaPackageImpl#getSwing()
		 * @generated
		 */
		EClass SWING = eINSTANCE.getSwing();

		/**
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.util.java.impl.TimeSpanImpl <em>Time Span</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.util.java.impl.TimeSpanImpl
		 * @see ecore.org.cocome.tradingsystem.util.java.impl.JavaPackageImpl#getTimeSpan()
		 * @generated
		 */
		EClass TIME_SPAN = eINSTANCE.getTimeSpan();

		/**
		 * The meta object literal for the '<em><b>value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SPAN__VALUE = eINSTANCE.getTimeSpan___value();

		/**
		 * The meta object literal for the '<em><b>unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SPAN__UNIT = eINSTANCE.getTimeSpan___unit();

		/**
		 * The meta object literal for the '<em><b>Get Duration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_SPAN___GET_DURATION__TIMEUNIT = eINSTANCE.getTimeSpan__GetDuration__TimeUnit();

		/**
		 * The meta object literal for the '<em><b>Equals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_SPAN___EQUALS__OBJECT = eINSTANCE.getTimeSpan__Equals__Object();

		/**
		 * The meta object literal for the '<em><b>Hash Code</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_SPAN___HASH_CODE = eINSTANCE.getTimeSpan__HashCode();

		/**
		 * The meta object literal for the '<em><b>Compare To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_SPAN___COMPARE_TO__TIMESPAN = eINSTANCE.getTimeSpan__CompareTo__TimeSpan();

	}

} //JavaPackage
