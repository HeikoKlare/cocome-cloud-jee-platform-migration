/**
 */
package ecore.org.cocome.tradingsystem.util.scope;

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
 * @see ecore.org.cocome.tradingsystem.util.scope.ScopeFactoryOld
 * @model kind="package"
 * @generated
 */
public interface ScopePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scope";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "cloud-logic-core-impl/ecore.org.cocome.tradingsystem.util.scope";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "scope";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScopePackage eINSTANCE = ecore.org.cocome.tradingsystem.util.scope.impl.ScopePackageImpl.init();

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.util.scope.impl.CashDeskRegistryImpl <em>Cash Desk Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.util.scope.impl.CashDeskRegistryImpl
	 * @see ecore.org.cocome.tradingsystem.util.scope.impl.ScopePackageImpl#getCashDeskRegistry()
	 * @generated
	 */
	int CASH_DESK_REGISTRY = 0;

	/**
	 * The feature id for the '<em><b>Attribute Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_DESK_REGISTRY__ATTRIBUTE_MAP = 0;

	/**
	 * The feature id for the '<em><b>Context Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_DESK_REGISTRY__CONTEXT_NAME = 1;

	/**
	 * The number of structural features of the '<em>Cash Desk Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_DESK_REGISTRY_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Long</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_DESK_REGISTRY___GET_LONG__REGISTRYKEYS = 0;

	/**
	 * The operation id for the '<em>Put Long</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_DESK_REGISTRY___PUT_LONG__REGISTRYKEYS_LONG = 1;

	/**
	 * The operation id for the '<em>Get String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_DESK_REGISTRY___GET_STRING__REGISTRYKEYS = 2;

	/**
	 * The operation id for the '<em>Put String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_DESK_REGISTRY___PUT_STRING__REGISTRYKEYS_STRING = 3;

	/**
	 * The operation id for the '<em>Get Object</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_DESK_REGISTRY___GET_OBJECT__REGISTRYKEYS = 4;

	/**
	 * The operation id for the '<em>Put Object</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_DESK_REGISTRY___PUT_OBJECT__REGISTRYKEYS_OBJECT = 5;

	/**
	 * The operation id for the '<em>Has Object</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_DESK_REGISTRY___HAS_OBJECT__REGISTRYKEYS = 6;

	/**
	 * The operation id for the '<em>Has Long</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_DESK_REGISTRY___HAS_LONG__REGISTRYKEYS = 7;

	/**
	 * The number of operations of the '<em>Cash Desk Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_DESK_REGISTRY_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.util.scope.impl.CashDeskRegistryFactoryImpl <em>Cash Desk Registry Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.util.scope.impl.CashDeskRegistryFactoryImpl
	 * @see ecore.org.cocome.tradingsystem.util.scope.impl.ScopePackageImpl#getCashDeskRegistryFactory()
	 * @generated
	 */
	int CASH_DESK_REGISTRY_FACTORY = 1;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_DESK_REGISTRY_FACTORY__MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Store Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_DESK_REGISTRY_FACTORY__STORE_CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Enterprise Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_DESK_REGISTRY_FACTORY__ENTERPRISE_CONTEXT = 2;

	/**
	 * The number of structural features of the '<em>Cash Desk Registry Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_DESK_REGISTRY_FACTORY_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Cash Desk Context Registry</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_DESK_REGISTRY_FACTORY___GET_CASH_DESK_CONTEXT_REGISTRY = 0;

	/**
	 * The operation id for the '<em>Get Store Context Registry</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_DESK_REGISTRY_FACTORY___GET_STORE_CONTEXT_REGISTRY = 1;

	/**
	 * The operation id for the '<em>Get Enterprise Context Registry</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_DESK_REGISTRY_FACTORY___GET_ENTERPRISE_CONTEXT_REGISTRY = 2;

	/**
	 * The number of operations of the '<em>Cash Desk Registry Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_DESK_REGISTRY_FACTORY_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.util.scope.impl.CashDeskSessionScopeExtensionImpl <em>Cash Desk Session Scope Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.util.scope.impl.CashDeskSessionScopeExtensionImpl
	 * @see ecore.org.cocome.tradingsystem.util.scope.impl.ScopePackageImpl#getCashDeskSessionScopeExtension()
	 * @generated
	 */
	int CASH_DESK_SESSION_SCOPE_EXTENSION = 2;

	/**
	 * The number of structural features of the '<em>Cash Desk Session Scope Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_DESK_SESSION_SCOPE_EXTENSION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Add Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_DESK_SESSION_SCOPE_EXTENSION___ADD_SCOPE__BEFOREBEANDISCOVERY = 0;

	/**
	 * The operation id for the '<em>Register Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_DESK_SESSION_SCOPE_EXTENSION___REGISTER_CONTEXT__AFTERBEANDISCOVERY_BEANMANAGER = 1;

	/**
	 * The number of operations of the '<em>Cash Desk Session Scope Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_DESK_SESSION_SCOPE_EXTENSION_OPERATION_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistry <em>Cash Desk Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cash Desk Registry</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistry
	 * @generated
	 */
	EClass getCashDeskRegistry();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistry#getAttributeMap <em>Attribute Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Map</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistry#getAttributeMap()
	 * @see #getCashDeskRegistry()
	 * @generated
	 */
	EAttribute getCashDeskRegistry_AttributeMap();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistry#getContextName <em>Context Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Name</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistry#getContextName()
	 * @see #getCashDeskRegistry()
	 * @generated
	 */
	EAttribute getCashDeskRegistry_ContextName();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistry#getLong(org.cocome.tradingsystem.util.scope.RegistryKeys) <em>Get Long</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Long</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistry#getLong(org.cocome.tradingsystem.util.scope.RegistryKeys)
	 * @generated
	 */
	EOperation getCashDeskRegistry__GetLong__RegistryKeys();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistry#putLong(org.cocome.tradingsystem.util.scope.RegistryKeys, long) <em>Put Long</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Put Long</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistry#putLong(org.cocome.tradingsystem.util.scope.RegistryKeys, long)
	 * @generated
	 */
	EOperation getCashDeskRegistry__PutLong__RegistryKeys_long();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistry#getString(org.cocome.tradingsystem.util.scope.RegistryKeys) <em>Get String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get String</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistry#getString(org.cocome.tradingsystem.util.scope.RegistryKeys)
	 * @generated
	 */
	EOperation getCashDeskRegistry__GetString__RegistryKeys();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistry#putString(org.cocome.tradingsystem.util.scope.RegistryKeys, java.lang.String) <em>Put String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Put String</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistry#putString(org.cocome.tradingsystem.util.scope.RegistryKeys, java.lang.String)
	 * @generated
	 */
	EOperation getCashDeskRegistry__PutString__RegistryKeys_String();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistry#getObject(org.cocome.tradingsystem.util.scope.RegistryKeys) <em>Get Object</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Object</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistry#getObject(org.cocome.tradingsystem.util.scope.RegistryKeys)
	 * @generated
	 */
	EOperation getCashDeskRegistry__GetObject__RegistryKeys();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistry#putObject(org.cocome.tradingsystem.util.scope.RegistryKeys, java.lang.Object) <em>Put Object</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Put Object</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistry#putObject(org.cocome.tradingsystem.util.scope.RegistryKeys, java.lang.Object)
	 * @generated
	 */
	EOperation getCashDeskRegistry__PutObject__RegistryKeys_Object();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistry#hasObject(org.cocome.tradingsystem.util.scope.RegistryKeys) <em>Has Object</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Object</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistry#hasObject(org.cocome.tradingsystem.util.scope.RegistryKeys)
	 * @generated
	 */
	EOperation getCashDeskRegistry__HasObject__RegistryKeys();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistry#hasLong(org.cocome.tradingsystem.util.scope.RegistryKeys) <em>Has Long</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Long</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistry#hasLong(org.cocome.tradingsystem.util.scope.RegistryKeys)
	 * @generated
	 */
	EOperation getCashDeskRegistry__HasLong__RegistryKeys();

	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistryFactory <em>Cash Desk Registry Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cash Desk Registry Factory</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistryFactory
	 * @generated
	 */
	EClass getCashDeskRegistryFactory();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistryFactory#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manager</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistryFactory#getManager()
	 * @see #getCashDeskRegistryFactory()
	 * @generated
	 */
	EAttribute getCashDeskRegistryFactory_Manager();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistryFactory#getStoreContext <em>Store Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Store Context</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistryFactory#getStoreContext()
	 * @see #getCashDeskRegistryFactory()
	 * @generated
	 */
	EAttribute getCashDeskRegistryFactory_StoreContext();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistryFactory#getEnterpriseContext <em>Enterprise Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enterprise Context</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistryFactory#getEnterpriseContext()
	 * @see #getCashDeskRegistryFactory()
	 * @generated
	 */
	EAttribute getCashDeskRegistryFactory_EnterpriseContext();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistryFactory#getCashDeskContextRegistry() <em>Get Cash Desk Context Registry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cash Desk Context Registry</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistryFactory#getCashDeskContextRegistry()
	 * @generated
	 */
	EOperation getCashDeskRegistryFactory__GetCashDeskContextRegistry();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistryFactory#getStoreContextRegistry() <em>Get Store Context Registry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Store Context Registry</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistryFactory#getStoreContextRegistry()
	 * @generated
	 */
	EOperation getCashDeskRegistryFactory__GetStoreContextRegistry();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistryFactory#getEnterpriseContextRegistry() <em>Get Enterprise Context Registry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Enterprise Context Registry</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistryFactory#getEnterpriseContextRegistry()
	 * @generated
	 */
	EOperation getCashDeskRegistryFactory__GetEnterpriseContextRegistry();

	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.util.scope.CashDeskSessionScopeExtension <em>Cash Desk Session Scope Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cash Desk Session Scope Extension</em>'.
	 * @see ecore.org.cocome.tradingsystem.util.scope.CashDeskSessionScopeExtension
	 * @generated
	 */
	EClass getCashDeskSessionScopeExtension();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.util.scope.CashDeskSessionScopeExtension#addScope(javax.enterprise.inject.spi.BeforeBeanDiscovery) <em>Add Scope</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Scope</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.util.scope.CashDeskSessionScopeExtension#addScope(javax.enterprise.inject.spi.BeforeBeanDiscovery)
	 * @generated
	 */
	EOperation getCashDeskSessionScopeExtension__AddScope__BeforeBeanDiscovery();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.util.scope.CashDeskSessionScopeExtension#registerContext(javax.enterprise.inject.spi.AfterBeanDiscovery, javax.enterprise.inject.spi.BeanManager) <em>Register Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Context</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.util.scope.CashDeskSessionScopeExtension#registerContext(javax.enterprise.inject.spi.AfterBeanDiscovery, javax.enterprise.inject.spi.BeanManager)
	 * @generated
	 */
	EOperation getCashDeskSessionScopeExtension__RegisterContext__AfterBeanDiscovery_BeanManager();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScopeFactory getScopeFactory();

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
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.util.scope.impl.CashDeskRegistryImpl <em>Cash Desk Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.util.scope.impl.CashDeskRegistryImpl
		 * @see ecore.org.cocome.tradingsystem.util.scope.impl.ScopePackageImpl#getCashDeskRegistry()
		 * @generated
		 */
		EClass CASH_DESK_REGISTRY = eINSTANCE.getCashDeskRegistry();

		/**
		 * The meta object literal for the '<em><b>Attribute Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASH_DESK_REGISTRY__ATTRIBUTE_MAP = eINSTANCE.getCashDeskRegistry_AttributeMap();

		/**
		 * The meta object literal for the '<em><b>Context Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASH_DESK_REGISTRY__CONTEXT_NAME = eINSTANCE.getCashDeskRegistry_ContextName();

		/**
		 * The meta object literal for the '<em><b>Get Long</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CASH_DESK_REGISTRY___GET_LONG__REGISTRYKEYS = eINSTANCE.getCashDeskRegistry__GetLong__RegistryKeys();

		/**
		 * The meta object literal for the '<em><b>Put Long</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CASH_DESK_REGISTRY___PUT_LONG__REGISTRYKEYS_LONG = eINSTANCE.getCashDeskRegistry__PutLong__RegistryKeys_long();

		/**
		 * The meta object literal for the '<em><b>Get String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CASH_DESK_REGISTRY___GET_STRING__REGISTRYKEYS = eINSTANCE.getCashDeskRegistry__GetString__RegistryKeys();

		/**
		 * The meta object literal for the '<em><b>Put String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CASH_DESK_REGISTRY___PUT_STRING__REGISTRYKEYS_STRING = eINSTANCE.getCashDeskRegistry__PutString__RegistryKeys_String();

		/**
		 * The meta object literal for the '<em><b>Get Object</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CASH_DESK_REGISTRY___GET_OBJECT__REGISTRYKEYS = eINSTANCE.getCashDeskRegistry__GetObject__RegistryKeys();

		/**
		 * The meta object literal for the '<em><b>Put Object</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CASH_DESK_REGISTRY___PUT_OBJECT__REGISTRYKEYS_OBJECT = eINSTANCE.getCashDeskRegistry__PutObject__RegistryKeys_Object();

		/**
		 * The meta object literal for the '<em><b>Has Object</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CASH_DESK_REGISTRY___HAS_OBJECT__REGISTRYKEYS = eINSTANCE.getCashDeskRegistry__HasObject__RegistryKeys();

		/**
		 * The meta object literal for the '<em><b>Has Long</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CASH_DESK_REGISTRY___HAS_LONG__REGISTRYKEYS = eINSTANCE.getCashDeskRegistry__HasLong__RegistryKeys();

		/**
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.util.scope.impl.CashDeskRegistryFactoryImpl <em>Cash Desk Registry Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.util.scope.impl.CashDeskRegistryFactoryImpl
		 * @see ecore.org.cocome.tradingsystem.util.scope.impl.ScopePackageImpl#getCashDeskRegistryFactory()
		 * @generated
		 */
		EClass CASH_DESK_REGISTRY_FACTORY = eINSTANCE.getCashDeskRegistryFactory();

		/**
		 * The meta object literal for the '<em><b>Manager</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASH_DESK_REGISTRY_FACTORY__MANAGER = eINSTANCE.getCashDeskRegistryFactory_Manager();

		/**
		 * The meta object literal for the '<em><b>Store Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASH_DESK_REGISTRY_FACTORY__STORE_CONTEXT = eINSTANCE.getCashDeskRegistryFactory_StoreContext();

		/**
		 * The meta object literal for the '<em><b>Enterprise Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASH_DESK_REGISTRY_FACTORY__ENTERPRISE_CONTEXT = eINSTANCE.getCashDeskRegistryFactory_EnterpriseContext();

		/**
		 * The meta object literal for the '<em><b>Get Cash Desk Context Registry</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CASH_DESK_REGISTRY_FACTORY___GET_CASH_DESK_CONTEXT_REGISTRY = eINSTANCE.getCashDeskRegistryFactory__GetCashDeskContextRegistry();

		/**
		 * The meta object literal for the '<em><b>Get Store Context Registry</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CASH_DESK_REGISTRY_FACTORY___GET_STORE_CONTEXT_REGISTRY = eINSTANCE.getCashDeskRegistryFactory__GetStoreContextRegistry();

		/**
		 * The meta object literal for the '<em><b>Get Enterprise Context Registry</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CASH_DESK_REGISTRY_FACTORY___GET_ENTERPRISE_CONTEXT_REGISTRY = eINSTANCE.getCashDeskRegistryFactory__GetEnterpriseContextRegistry();

		/**
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.util.scope.impl.CashDeskSessionScopeExtensionImpl <em>Cash Desk Session Scope Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.util.scope.impl.CashDeskSessionScopeExtensionImpl
		 * @see ecore.org.cocome.tradingsystem.util.scope.impl.ScopePackageImpl#getCashDeskSessionScopeExtension()
		 * @generated
		 */
		EClass CASH_DESK_SESSION_SCOPE_EXTENSION = eINSTANCE.getCashDeskSessionScopeExtension();

		/**
		 * The meta object literal for the '<em><b>Add Scope</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CASH_DESK_SESSION_SCOPE_EXTENSION___ADD_SCOPE__BEFOREBEANDISCOVERY = eINSTANCE.getCashDeskSessionScopeExtension__AddScope__BeforeBeanDiscovery();

		/**
		 * The meta object literal for the '<em><b>Register Context</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CASH_DESK_SESSION_SCOPE_EXTENSION___REGISTER_CONTEXT__AFTERBEANDISCOVERY_BEANMANAGER = eINSTANCE.getCashDeskSessionScopeExtension__RegisterContext__AfterBeanDiscovery_BeanManager();

	}

} //ScopePackage
