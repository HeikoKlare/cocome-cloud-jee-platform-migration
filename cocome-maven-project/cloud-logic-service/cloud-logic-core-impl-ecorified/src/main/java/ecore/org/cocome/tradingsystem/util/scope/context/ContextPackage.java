/**
 */
package ecore.org.cocome.tradingsystem.util.scope.context;

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
 * @see ecore.org.cocome.tradingsystem.util.scope.context.ContextFactoryOld
 * @model kind="package"
 * @generated
 */
public interface ContextPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "context";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "cloud-logic-core-impl/ecore.org.cocome.tradingsystem.util.scope.context";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "context";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContextPackage eINSTANCE = ecore.org.cocome.tradingsystem.util.scope.context.impl.ContextPackageImpl.init();

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.util.scope.context.impl.NamedSessionContextImpl <em>Named Session Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.util.scope.context.impl.NamedSessionContextImpl
	 * @see ecore.org.cocome.tradingsystem.util.scope.context.impl.ContextPackageImpl#getNamedSessionContext()
	 * @generated
	 */
	int NAMED_SESSION_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SESSION_CONTEXT__IS_ACTIVE = 0;

	/**
	 * The feature id for the '<em><b>Provided Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SESSION_CONTEXT__PROVIDED_SCOPE = 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SESSION_CONTEXT__CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Context Holder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SESSION_CONTEXT__CONTEXT_HOLDER = 3;

	/**
	 * The number of structural features of the '<em>Named Session Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SESSION_CONTEXT_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SESSION_CONTEXT___GET_SCOPE = 0;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SESSION_CONTEXT___GET__CONTEXTUAL_CREATIONALCONTEXT = 1;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SESSION_CONTEXT___GET__CONTEXTUAL = 2;

	/**
	 * The operation id for the '<em>Is Active</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SESSION_CONTEXT___IS_ACTIVE = 3;

	/**
	 * The operation id for the '<em>Activate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SESSION_CONTEXT___ACTIVATE__ICONTEXTREGISTRY = 4;

	/**
	 * The operation id for the '<em>Deactivate Current Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SESSION_CONTEXT___DEACTIVATE_CURRENT_CONTEXT = 5;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SESSION_CONTEXT___GET_NAME = 6;

	/**
	 * The operation id for the '<em>Delete Current Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SESSION_CONTEXT___DELETE_CURRENT_CONTEXT = 7;

	/**
	 * The operation id for the '<em>Get Active Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SESSION_CONTEXT___GET_ACTIVE_CONTEXT = 8;

	/**
	 * The number of operations of the '<em>Named Session Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SESSION_CONTEXT_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.util.scope.context.impl.NamedSessionContextHolderImpl <em>Named Session Context Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.util.scope.context.impl.NamedSessionContextHolderImpl
	 * @see ecore.org.cocome.tradingsystem.util.scope.context.impl.ContextPackageImpl#getNamedSessionContextHolder()
	 * @generated
	 */
	int NAMED_SESSION_CONTEXT_HOLDER = 1;

	/**
	 * The feature id for the '<em><b>Beans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SESSION_CONTEXT_HOLDER__BEANS = 0;

	/**
	 * The feature id for the '<em><b>Context Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SESSION_CONTEXT_HOLDER__CONTEXT_NAME = 1;

	/**
	 * The number of structural features of the '<em>Named Session Context Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SESSION_CONTEXT_HOLDER_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Bean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SESSION_CONTEXT_HOLDER___GET_BEAN__CLASS = 0;

	/**
	 * The operation id for the '<em>Put Bean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SESSION_CONTEXT_HOLDER___PUT_BEAN__NAMEDSESSIONINSTANCE = 1;

	/**
	 * The operation id for the '<em>Destroy Bean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SESSION_CONTEXT_HOLDER___DESTROY_BEAN__NAMEDSESSIONINSTANCE = 2;

	/**
	 * The operation id for the '<em>Destroy All Beans</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SESSION_CONTEXT_HOLDER___DESTROY_ALL_BEANS = 3;

	/**
	 * The number of operations of the '<em>Named Session Context Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SESSION_CONTEXT_HOLDER_OPERATION_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext <em>Named Session Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Session Context</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext
	 * @generated
	 */
	EClass getNamedSessionContext();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext#getIsActive <em>Is Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Active</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext#getIsActive()
	 * @see #getNamedSessionContext()
	 * @generated
	 */
	EAttribute getNamedSessionContext_IsActive();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext#getProvidedScope <em>Provided Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provided Scope</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext#getProvidedScope()
	 * @see #getNamedSessionContext()
	 * @generated
	 */
	EAttribute getNamedSessionContext_ProvidedScope();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext#getContext()
	 * @see #getNamedSessionContext()
	 * @generated
	 */
	EAttribute getNamedSessionContext_Context();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext#getContextHolder <em>Context Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Holder</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext#getContextHolder()
	 * @see #getNamedSessionContext()
	 * @generated
	 */
	EAttribute getNamedSessionContext_ContextHolder();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext#getScope() <em>Get Scope</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Scope</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext#getScope()
	 * @generated
	 */
	EOperation getNamedSessionContext__GetScope();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext#get(javax.enterprise.context.spi.Contextual, javax.enterprise.context.spi.CreationalContext) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext#get(javax.enterprise.context.spi.Contextual, javax.enterprise.context.spi.CreationalContext)
	 * @generated
	 */
	EOperation getNamedSessionContext__Get__Contextual_CreationalContext();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext#get(javax.enterprise.context.spi.Contextual) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext#get(javax.enterprise.context.spi.Contextual)
	 * @generated
	 */
	EOperation getNamedSessionContext__Get__Contextual();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext#isActive() <em>Is Active</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Active</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext#isActive()
	 * @generated
	 */
	EOperation getNamedSessionContext__IsActive();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext#activate(org.cocome.tradingsystem.util.scope.IContextRegistry) <em>Activate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Activate</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext#activate(org.cocome.tradingsystem.util.scope.IContextRegistry)
	 * @generated
	 */
	EOperation getNamedSessionContext__Activate__IContextRegistry();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext#deactivateCurrentContext() <em>Deactivate Current Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Deactivate Current Context</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext#deactivateCurrentContext()
	 * @generated
	 */
	EOperation getNamedSessionContext__DeactivateCurrentContext();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext#getName()
	 * @generated
	 */
	EOperation getNamedSessionContext__GetName();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext#deleteCurrentContext() <em>Delete Current Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Current Context</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext#deleteCurrentContext()
	 * @generated
	 */
	EOperation getNamedSessionContext__DeleteCurrentContext();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext#getActiveContext() <em>Get Active Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Active Context</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext#getActiveContext()
	 * @generated
	 */
	EOperation getNamedSessionContext__GetActiveContext();

	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder <em>Named Session Context Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Session Context Holder</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder
	 * @generated
	 */
	EClass getNamedSessionContextHolder();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder#getBeans <em>Beans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beans</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder#getBeans()
	 * @see #getNamedSessionContextHolder()
	 * @generated
	 */
	EAttribute getNamedSessionContextHolder_Beans();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder#getContextName <em>Context Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Name</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder#getContextName()
	 * @see #getNamedSessionContextHolder()
	 * @generated
	 */
	EAttribute getNamedSessionContextHolder_ContextName();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder#getBean(java.lang.Class) <em>Get Bean</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bean</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder#getBean(java.lang.Class)
	 * @generated
	 */
	EOperation getNamedSessionContextHolder__GetBean__Class();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder#putBean(org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder.NamedSessionInstance) <em>Put Bean</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Put Bean</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder#putBean(org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder.NamedSessionInstance)
	 * @generated
	 */
	EOperation getNamedSessionContextHolder__PutBean__NamedSessionInstance();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder#destroyBean(org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder.NamedSessionInstance) <em>Destroy Bean</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Destroy Bean</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder#destroyBean(org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder.NamedSessionInstance)
	 * @generated
	 */
	EOperation getNamedSessionContextHolder__DestroyBean__NamedSessionInstance();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder#destroyAllBeans() <em>Destroy All Beans</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Destroy All Beans</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder#destroyAllBeans()
	 * @generated
	 */
	EOperation getNamedSessionContextHolder__DestroyAllBeans();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContextFactory getContextFactory();

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
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.util.scope.context.impl.NamedSessionContextImpl <em>Named Session Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.util.scope.context.impl.NamedSessionContextImpl
		 * @see ecore.org.cocome.tradingsystem.util.scope.context.impl.ContextPackageImpl#getNamedSessionContext()
		 * @generated
		 */
		EClass NAMED_SESSION_CONTEXT = eINSTANCE.getNamedSessionContext();

		/**
		 * The meta object literal for the '<em><b>Is Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_SESSION_CONTEXT__IS_ACTIVE = eINSTANCE.getNamedSessionContext_IsActive();

		/**
		 * The meta object literal for the '<em><b>Provided Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_SESSION_CONTEXT__PROVIDED_SCOPE = eINSTANCE.getNamedSessionContext_ProvidedScope();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_SESSION_CONTEXT__CONTEXT = eINSTANCE.getNamedSessionContext_Context();

		/**
		 * The meta object literal for the '<em><b>Context Holder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_SESSION_CONTEXT__CONTEXT_HOLDER = eINSTANCE.getNamedSessionContext_ContextHolder();

		/**
		 * The meta object literal for the '<em><b>Get Scope</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMED_SESSION_CONTEXT___GET_SCOPE = eINSTANCE.getNamedSessionContext__GetScope();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMED_SESSION_CONTEXT___GET__CONTEXTUAL_CREATIONALCONTEXT = eINSTANCE.getNamedSessionContext__Get__Contextual_CreationalContext();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMED_SESSION_CONTEXT___GET__CONTEXTUAL = eINSTANCE.getNamedSessionContext__Get__Contextual();

		/**
		 * The meta object literal for the '<em><b>Is Active</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMED_SESSION_CONTEXT___IS_ACTIVE = eINSTANCE.getNamedSessionContext__IsActive();

		/**
		 * The meta object literal for the '<em><b>Activate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMED_SESSION_CONTEXT___ACTIVATE__ICONTEXTREGISTRY = eINSTANCE.getNamedSessionContext__Activate__IContextRegistry();

		/**
		 * The meta object literal for the '<em><b>Deactivate Current Context</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMED_SESSION_CONTEXT___DEACTIVATE_CURRENT_CONTEXT = eINSTANCE.getNamedSessionContext__DeactivateCurrentContext();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMED_SESSION_CONTEXT___GET_NAME = eINSTANCE.getNamedSessionContext__GetName();

		/**
		 * The meta object literal for the '<em><b>Delete Current Context</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMED_SESSION_CONTEXT___DELETE_CURRENT_CONTEXT = eINSTANCE.getNamedSessionContext__DeleteCurrentContext();

		/**
		 * The meta object literal for the '<em><b>Get Active Context</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMED_SESSION_CONTEXT___GET_ACTIVE_CONTEXT = eINSTANCE.getNamedSessionContext__GetActiveContext();

		/**
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.util.scope.context.impl.NamedSessionContextHolderImpl <em>Named Session Context Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.util.scope.context.impl.NamedSessionContextHolderImpl
		 * @see ecore.org.cocome.tradingsystem.util.scope.context.impl.ContextPackageImpl#getNamedSessionContextHolder()
		 * @generated
		 */
		EClass NAMED_SESSION_CONTEXT_HOLDER = eINSTANCE.getNamedSessionContextHolder();

		/**
		 * The meta object literal for the '<em><b>Beans</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_SESSION_CONTEXT_HOLDER__BEANS = eINSTANCE.getNamedSessionContextHolder_Beans();

		/**
		 * The meta object literal for the '<em><b>Context Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_SESSION_CONTEXT_HOLDER__CONTEXT_NAME = eINSTANCE.getNamedSessionContextHolder_ContextName();

		/**
		 * The meta object literal for the '<em><b>Get Bean</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMED_SESSION_CONTEXT_HOLDER___GET_BEAN__CLASS = eINSTANCE.getNamedSessionContextHolder__GetBean__Class();

		/**
		 * The meta object literal for the '<em><b>Put Bean</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMED_SESSION_CONTEXT_HOLDER___PUT_BEAN__NAMEDSESSIONINSTANCE = eINSTANCE.getNamedSessionContextHolder__PutBean__NamedSessionInstance();

		/**
		 * The meta object literal for the '<em><b>Destroy Bean</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMED_SESSION_CONTEXT_HOLDER___DESTROY_BEAN__NAMEDSESSIONINSTANCE = eINSTANCE.getNamedSessionContextHolder__DestroyBean__NamedSessionInstance();

		/**
		 * The meta object literal for the '<em><b>Destroy All Beans</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMED_SESSION_CONTEXT_HOLDER___DESTROY_ALL_BEANS = eINSTANCE.getNamedSessionContextHolder__DestroyAllBeans();

	}

} //ContextPackage
