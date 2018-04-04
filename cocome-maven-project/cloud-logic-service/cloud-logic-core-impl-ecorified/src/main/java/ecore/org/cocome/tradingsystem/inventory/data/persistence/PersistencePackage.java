/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.persistence;

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
 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.PersistenceFactoryOld
 * @model kind="package"
 * @generated
 */
public interface PersistencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "persistence";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "cloud-logic-core-impl/ecore.org.cocome.tradingsystem.inventory.data.persistence";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "persistence";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PersistencePackage eINSTANCE = ecore.org.cocome.tradingsystem.inventory.data.persistence.impl.PersistencePackageImpl.init();

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.inventory.data.persistence.impl.CloudPersistenceContextImpl <em>Cloud Persistence Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.impl.CloudPersistenceContextImpl
	 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.impl.PersistencePackageImpl#getCloudPersistenceContext()
	 * @generated
	 */
	int CLOUD_PERSISTENCE_CONTEXT = 0;

	/**
	 * The number of structural features of the '<em>Cloud Persistence Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PERSISTENCE_CONTEXT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Update Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PERSISTENCE_CONTEXT___UPDATE_ENTITY__IPRODUCTORDER = 0;

	/**
	 * The operation id for the '<em>Create Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PERSISTENCE_CONTEXT___CREATE_ENTITY__ISTOCKITEM = 1;

	/**
	 * The operation id for the '<em>Update Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PERSISTENCE_CONTEXT___UPDATE_ENTITY__ISTOCKITEM = 2;

	/**
	 * The operation id for the '<em>Create Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PERSISTENCE_CONTEXT___CREATE_ENTITY__ITRADINGENTERPRISE = 3;

	/**
	 * The operation id for the '<em>Create Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PERSISTENCE_CONTEXT___CREATE_ENTITY__IPRODUCTORDER = 4;

	/**
	 * The operation id for the '<em>Update Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PERSISTENCE_CONTEXT___UPDATE_ENTITY__ITRADINGENTERPRISE = 5;

	/**
	 * The operation id for the '<em>Create Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PERSISTENCE_CONTEXT___CREATE_ENTITY__ISTORE = 6;

	/**
	 * The operation id for the '<em>Update Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PERSISTENCE_CONTEXT___UPDATE_ENTITY__ISTORE = 7;

	/**
	 * The operation id for the '<em>Create Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PERSISTENCE_CONTEXT___CREATE_ENTITY__IPRODUCTSUPPLIER = 8;

	/**
	 * The operation id for the '<em>Update Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PERSISTENCE_CONTEXT___UPDATE_ENTITY__IPRODUCTSUPPLIER = 9;

	/**
	 * The operation id for the '<em>Create Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PERSISTENCE_CONTEXT___CREATE_ENTITY__IPRODUCT = 10;

	/**
	 * The operation id for the '<em>Update Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PERSISTENCE_CONTEXT___UPDATE_ENTITY__IPRODUCT = 11;

	/**
	 * The operation id for the '<em>Create Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PERSISTENCE_CONTEXT___CREATE_ENTITY__OBJECT = 12;

	/**
	 * The operation id for the '<em>Update Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PERSISTENCE_CONTEXT___UPDATE_ENTITY__OBJECT = 13;

	/**
	 * The operation id for the '<em>Create Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PERSISTENCE_CONTEXT___CREATE_ENTITY__IUSER = 14;

	/**
	 * The operation id for the '<em>Update Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PERSISTENCE_CONTEXT___UPDATE_ENTITY__IUSER = 15;

	/**
	 * The operation id for the '<em>Create Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PERSISTENCE_CONTEXT___CREATE_ENTITY__ICUSTOMER = 16;

	/**
	 * The operation id for the '<em>Update Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PERSISTENCE_CONTEXT___UPDATE_ENTITY__ICUSTOMER = 17;

	/**
	 * The number of operations of the '<em>Cloud Persistence Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PERSISTENCE_CONTEXT_OPERATION_COUNT = 18;

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.inventory.data.persistence.impl.ServiceAdapterEntityConverterImpl <em>Service Adapter Entity Converter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.impl.ServiceAdapterEntityConverterImpl
	 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.impl.PersistencePackageImpl#getServiceAdapterEntityConverter()
	 * @generated
	 */
	int SERVICE_ADAPTER_ENTITY_CONVERTER = 1;

	/**
	 * The number of structural features of the '<em>Service Adapter Entity Converter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ADAPTER_ENTITY_CONVERTER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Service Adapter Entity Converter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ADAPTER_ENTITY_CONVERTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.inventory.data.persistence.impl.ServiceAdapterHeadersImpl <em>Service Adapter Headers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.impl.ServiceAdapterHeadersImpl
	 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.impl.PersistencePackageImpl#getServiceAdapterHeaders()
	 * @generated
	 */
	int SERVICE_ADAPTER_HEADERS = 2;

	/**
	 * The number of structural features of the '<em>Service Adapter Headers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ADAPTER_HEADERS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Service Adapter Headers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ADAPTER_HEADERS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext <em>Cloud Persistence Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Persistence Context</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext
	 * @generated
	 */
	EClass getCloudPersistenceContext();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#updateEntity(org.cocome.tradingsystem.inventory.data.store.IProductOrder) <em>Update Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Entity</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#updateEntity(org.cocome.tradingsystem.inventory.data.store.IProductOrder)
	 * @generated
	 */
	EOperation getCloudPersistenceContext__UpdateEntity__IProductOrder();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#createEntity(ecore.org.cocome.tradingsystem.inventory.data.store.IStockItem) <em>Create Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Entity</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#createEntity(ecore.org.cocome.tradingsystem.inventory.data.store.IStockItem)
	 * @generated
	 */
	EOperation getCloudPersistenceContext__CreateEntity__IStockItem();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#updateEntity(ecore.org.cocome.tradingsystem.inventory.data.store.IStockItem) <em>Update Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Entity</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#updateEntity(ecore.org.cocome.tradingsystem.inventory.data.store.IStockItem)
	 * @generated
	 */
	EOperation getCloudPersistenceContext__UpdateEntity__IStockItem();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#createEntity(org.cocome.tradingsystem.inventory.data.enterprise.ITradingEnterprise) <em>Create Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Entity</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#createEntity(org.cocome.tradingsystem.inventory.data.enterprise.ITradingEnterprise)
	 * @generated
	 */
	EOperation getCloudPersistenceContext__CreateEntity__ITradingEnterprise();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#createEntity(org.cocome.tradingsystem.inventory.data.store.IProductOrder) <em>Create Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Entity</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#createEntity(org.cocome.tradingsystem.inventory.data.store.IProductOrder)
	 * @generated
	 */
	EOperation getCloudPersistenceContext__CreateEntity__IProductOrder();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#updateEntity(org.cocome.tradingsystem.inventory.data.enterprise.ITradingEnterprise) <em>Update Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Entity</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#updateEntity(org.cocome.tradingsystem.inventory.data.enterprise.ITradingEnterprise)
	 * @generated
	 */
	EOperation getCloudPersistenceContext__UpdateEntity__ITradingEnterprise();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#createEntity(ecore.org.cocome.tradingsystem.inventory.data.store.IStore) <em>Create Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Entity</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#createEntity(ecore.org.cocome.tradingsystem.inventory.data.store.IStore)
	 * @generated
	 */
	EOperation getCloudPersistenceContext__CreateEntity__IStore();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#updateEntity(ecore.org.cocome.tradingsystem.inventory.data.store.IStore) <em>Update Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Entity</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#updateEntity(ecore.org.cocome.tradingsystem.inventory.data.store.IStore)
	 * @generated
	 */
	EOperation getCloudPersistenceContext__UpdateEntity__IStore();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#createEntity(org.cocome.tradingsystem.inventory.data.enterprise.IProductSupplier) <em>Create Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Entity</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#createEntity(org.cocome.tradingsystem.inventory.data.enterprise.IProductSupplier)
	 * @generated
	 */
	EOperation getCloudPersistenceContext__CreateEntity__IProductSupplier();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#updateEntity(org.cocome.tradingsystem.inventory.data.enterprise.IProductSupplier) <em>Update Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Entity</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#updateEntity(org.cocome.tradingsystem.inventory.data.enterprise.IProductSupplier)
	 * @generated
	 */
	EOperation getCloudPersistenceContext__UpdateEntity__IProductSupplier();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#createEntity(ecore.org.cocome.tradingsystem.inventory.data.enterprise.IProduct) <em>Create Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Entity</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#createEntity(ecore.org.cocome.tradingsystem.inventory.data.enterprise.IProduct)
	 * @generated
	 */
	EOperation getCloudPersistenceContext__CreateEntity__IProduct();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#updateEntity(ecore.org.cocome.tradingsystem.inventory.data.enterprise.IProduct) <em>Update Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Entity</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#updateEntity(ecore.org.cocome.tradingsystem.inventory.data.enterprise.IProduct)
	 * @generated
	 */
	EOperation getCloudPersistenceContext__UpdateEntity__IProduct();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#createEntity(java.lang.Object) <em>Create Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Entity</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#createEntity(java.lang.Object)
	 * @generated
	 */
	EOperation getCloudPersistenceContext__CreateEntity__Object();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#updateEntity(java.lang.Object) <em>Update Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Entity</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#updateEntity(java.lang.Object)
	 * @generated
	 */
	EOperation getCloudPersistenceContext__UpdateEntity__Object();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#createEntity(org.cocome.tradingsystem.inventory.data.usermanager.IUser) <em>Create Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Entity</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#createEntity(org.cocome.tradingsystem.inventory.data.usermanager.IUser)
	 * @generated
	 */
	EOperation getCloudPersistenceContext__CreateEntity__IUser();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#updateEntity(org.cocome.tradingsystem.inventory.data.usermanager.IUser) <em>Update Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Entity</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#updateEntity(org.cocome.tradingsystem.inventory.data.usermanager.IUser)
	 * @generated
	 */
	EOperation getCloudPersistenceContext__UpdateEntity__IUser();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#createEntity(org.cocome.tradingsystem.inventory.data.usermanager.ICustomer) <em>Create Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Entity</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#createEntity(org.cocome.tradingsystem.inventory.data.usermanager.ICustomer)
	 * @generated
	 */
	EOperation getCloudPersistenceContext__CreateEntity__ICustomer();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#updateEntity(org.cocome.tradingsystem.inventory.data.usermanager.ICustomer) <em>Update Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Entity</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext#updateEntity(org.cocome.tradingsystem.inventory.data.usermanager.ICustomer)
	 * @generated
	 */
	EOperation getCloudPersistenceContext__UpdateEntity__ICustomer();

	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.inventory.data.persistence.ServiceAdapterEntityConverter <em>Service Adapter Entity Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Adapter Entity Converter</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.ServiceAdapterEntityConverter
	 * @generated
	 */
	EClass getServiceAdapterEntityConverter();

	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.inventory.data.persistence.ServiceAdapterHeaders <em>Service Adapter Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Adapter Headers</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.ServiceAdapterHeaders
	 * @generated
	 */
	EClass getServiceAdapterHeaders();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PersistenceFactory getPersistenceFactory();

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
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.inventory.data.persistence.impl.CloudPersistenceContextImpl <em>Cloud Persistence Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.impl.CloudPersistenceContextImpl
		 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.impl.PersistencePackageImpl#getCloudPersistenceContext()
		 * @generated
		 */
		EClass CLOUD_PERSISTENCE_CONTEXT = eINSTANCE.getCloudPersistenceContext();

		/**
		 * The meta object literal for the '<em><b>Update Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOUD_PERSISTENCE_CONTEXT___UPDATE_ENTITY__IPRODUCTORDER = eINSTANCE.getCloudPersistenceContext__UpdateEntity__IProductOrder();

		/**
		 * The meta object literal for the '<em><b>Create Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOUD_PERSISTENCE_CONTEXT___CREATE_ENTITY__ISTOCKITEM = eINSTANCE.getCloudPersistenceContext__CreateEntity__IStockItem();

		/**
		 * The meta object literal for the '<em><b>Update Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOUD_PERSISTENCE_CONTEXT___UPDATE_ENTITY__ISTOCKITEM = eINSTANCE.getCloudPersistenceContext__UpdateEntity__IStockItem();

		/**
		 * The meta object literal for the '<em><b>Create Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOUD_PERSISTENCE_CONTEXT___CREATE_ENTITY__ITRADINGENTERPRISE = eINSTANCE.getCloudPersistenceContext__CreateEntity__ITradingEnterprise();

		/**
		 * The meta object literal for the '<em><b>Create Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOUD_PERSISTENCE_CONTEXT___CREATE_ENTITY__IPRODUCTORDER = eINSTANCE.getCloudPersistenceContext__CreateEntity__IProductOrder();

		/**
		 * The meta object literal for the '<em><b>Update Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOUD_PERSISTENCE_CONTEXT___UPDATE_ENTITY__ITRADINGENTERPRISE = eINSTANCE.getCloudPersistenceContext__UpdateEntity__ITradingEnterprise();

		/**
		 * The meta object literal for the '<em><b>Create Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOUD_PERSISTENCE_CONTEXT___CREATE_ENTITY__ISTORE = eINSTANCE.getCloudPersistenceContext__CreateEntity__IStore();

		/**
		 * The meta object literal for the '<em><b>Update Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOUD_PERSISTENCE_CONTEXT___UPDATE_ENTITY__ISTORE = eINSTANCE.getCloudPersistenceContext__UpdateEntity__IStore();

		/**
		 * The meta object literal for the '<em><b>Create Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOUD_PERSISTENCE_CONTEXT___CREATE_ENTITY__IPRODUCTSUPPLIER = eINSTANCE.getCloudPersistenceContext__CreateEntity__IProductSupplier();

		/**
		 * The meta object literal for the '<em><b>Update Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOUD_PERSISTENCE_CONTEXT___UPDATE_ENTITY__IPRODUCTSUPPLIER = eINSTANCE.getCloudPersistenceContext__UpdateEntity__IProductSupplier();

		/**
		 * The meta object literal for the '<em><b>Create Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOUD_PERSISTENCE_CONTEXT___CREATE_ENTITY__IPRODUCT = eINSTANCE.getCloudPersistenceContext__CreateEntity__IProduct();

		/**
		 * The meta object literal for the '<em><b>Update Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOUD_PERSISTENCE_CONTEXT___UPDATE_ENTITY__IPRODUCT = eINSTANCE.getCloudPersistenceContext__UpdateEntity__IProduct();

		/**
		 * The meta object literal for the '<em><b>Create Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOUD_PERSISTENCE_CONTEXT___CREATE_ENTITY__OBJECT = eINSTANCE.getCloudPersistenceContext__CreateEntity__Object();

		/**
		 * The meta object literal for the '<em><b>Update Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOUD_PERSISTENCE_CONTEXT___UPDATE_ENTITY__OBJECT = eINSTANCE.getCloudPersistenceContext__UpdateEntity__Object();

		/**
		 * The meta object literal for the '<em><b>Create Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOUD_PERSISTENCE_CONTEXT___CREATE_ENTITY__IUSER = eINSTANCE.getCloudPersistenceContext__CreateEntity__IUser();

		/**
		 * The meta object literal for the '<em><b>Update Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOUD_PERSISTENCE_CONTEXT___UPDATE_ENTITY__IUSER = eINSTANCE.getCloudPersistenceContext__UpdateEntity__IUser();

		/**
		 * The meta object literal for the '<em><b>Create Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOUD_PERSISTENCE_CONTEXT___CREATE_ENTITY__ICUSTOMER = eINSTANCE.getCloudPersistenceContext__CreateEntity__ICustomer();

		/**
		 * The meta object literal for the '<em><b>Update Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOUD_PERSISTENCE_CONTEXT___UPDATE_ENTITY__ICUSTOMER = eINSTANCE.getCloudPersistenceContext__UpdateEntity__ICustomer();

		/**
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.inventory.data.persistence.impl.ServiceAdapterEntityConverterImpl <em>Service Adapter Entity Converter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.impl.ServiceAdapterEntityConverterImpl
		 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.impl.PersistencePackageImpl#getServiceAdapterEntityConverter()
		 * @generated
		 */
		EClass SERVICE_ADAPTER_ENTITY_CONVERTER = eINSTANCE.getServiceAdapterEntityConverter();

		/**
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.inventory.data.persistence.impl.ServiceAdapterHeadersImpl <em>Service Adapter Headers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.impl.ServiceAdapterHeadersImpl
		 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.impl.PersistencePackageImpl#getServiceAdapterHeaders()
		 * @generated
		 */
		EClass SERVICE_ADAPTER_HEADERS = eINSTANCE.getServiceAdapterHeaders();

	}

} //PersistencePackage
