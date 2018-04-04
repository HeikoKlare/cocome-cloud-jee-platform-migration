/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.persistence.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import ecore.EcorePackage;
import ecore.datatypes.DatatypesPackage;
import ecore.datatypes.impl.DatatypesPackageImpl;
import ecore.datatypes.java.io.IoPackage;
import ecore.datatypes.java.io.impl.IoPackageImpl;
import ecore.datatypes.java.lang.LangPackage;
import ecore.datatypes.java.lang.annotation.AnnotationPackage;
import ecore.datatypes.java.lang.annotation.impl.AnnotationPackageImpl;
import ecore.datatypes.java.lang.impl.LangPackageImpl;
import ecore.datatypes.java.util.UtilPackage;
import ecore.datatypes.java.util.concurrent.ConcurrentPackage;
import ecore.datatypes.java.util.concurrent.impl.ConcurrentPackageImpl;
import ecore.datatypes.java.util.impl.UtilPackageImpl;
import ecore.datatypes.javax.ejb.EjbPackage;
import ecore.datatypes.javax.ejb.impl.EjbPackageImpl;
import ecore.datatypes.javax.enterprise.context.ContextPackage;
import ecore.datatypes.javax.enterprise.context.impl.ContextPackageImpl;
import ecore.datatypes.javax.enterprise.context.spi.SpiPackage;
import ecore.datatypes.javax.enterprise.context.spi.impl.SpiPackageImpl;
import ecore.datatypes.javax.enterprise.inject.InjectPackage;
import ecore.datatypes.javax.enterprise.inject.impl.InjectPackageImpl;
import ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.StorePackage;
import ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.impl.StorePackageImpl;
import ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.UsermanagerPackage;
import ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.credentials.CredentialsPackage;
import ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.credentials.impl.CredentialsPackageImpl;
import ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.impl.UsermanagerPackageImpl;
import ecore.datatypes.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage;
import ecore.datatypes.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterprisePackageImpl;
import ecore.datatypes.org.cocome.tradingsystem.util.exception.ExceptionPackage;
import ecore.datatypes.org.cocome.tradingsystem.util.exception.impl.ExceptionPackageImpl;
import ecore.datatypes.org.cocome.tradingsystem.util.scope.ScopePackage;
import ecore.datatypes.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder.NamedSessionContextHolderPackage;
import ecore.datatypes.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder.impl.NamedSessionContextHolderPackageImpl;
import ecore.datatypes.org.cocome.tradingsystem.util.scope.impl.ScopePackageImpl;
import ecore.impl.EcorePackageImpl;
import ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext;
import ecore.org.cocome.tradingsystem.inventory.data.persistence.PersistenceFactory;
import ecore.org.cocome.tradingsystem.inventory.data.persistence.PersistencePackage;
import ecore.org.cocome.tradingsystem.inventory.data.persistence.ServiceAdapterEntityConverter;
import ecore.org.cocome.tradingsystem.inventory.data.persistence.ServiceAdapterHeaders;
import ecore.org.cocome.tradingsystem.remote.access.connection.ConnectionPackage;
import ecore.org.cocome.tradingsystem.remote.access.connection.impl.ConnectionPackageImpl;
import ecore.org.cocome.tradingsystem.remote.access.parsing.ParsingPackage;
import ecore.org.cocome.tradingsystem.remote.access.parsing.impl.ParsingPackageImpl;
import ecore.org.cocome.tradingsystem.util.java.JavaPackage;
import ecore.org.cocome.tradingsystem.util.java.impl.JavaPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PersistencePackageImpl extends EPackageImpl implements PersistencePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudPersistenceContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceAdapterEntityConverterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceAdapterHeadersEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.PersistencePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PersistencePackageImpl() {
		super(eNS_URI, PersistenceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PersistencePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PersistencePackage init() {
		if (isInited) return (PersistencePackage)EPackage.Registry.INSTANCE.getEPackage(PersistencePackage.eNS_URI);

		// Obtain or create and register package
		PersistencePackageImpl thePersistencePackage = (PersistencePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PersistencePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PersistencePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EcorePackageImpl theEcorePackage = (EcorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) : EcorePackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);
		IoPackageImpl theIoPackage = (IoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI) instanceof IoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI) : IoPackage.eINSTANCE);
		LangPackageImpl theLangPackage = (LangPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI) instanceof LangPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI) : LangPackage.eINSTANCE);
		AnnotationPackageImpl theAnnotationPackage = (AnnotationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AnnotationPackage.eNS_URI) instanceof AnnotationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnnotationPackage.eNS_URI) : AnnotationPackage.eINSTANCE);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) instanceof UtilPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) : UtilPackage.eINSTANCE);
		ConcurrentPackageImpl theConcurrentPackage = (ConcurrentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConcurrentPackage.eNS_URI) instanceof ConcurrentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConcurrentPackage.eNS_URI) : ConcurrentPackage.eINSTANCE);
		EjbPackageImpl theEjbPackage = (EjbPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EjbPackage.eNS_URI) instanceof EjbPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EjbPackage.eNS_URI) : EjbPackage.eINSTANCE);
		ContextPackageImpl theContextPackage = (ContextPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI) instanceof ContextPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI) : ContextPackage.eINSTANCE);
		SpiPackageImpl theSpiPackage = (SpiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SpiPackage.eNS_URI) instanceof SpiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SpiPackage.eNS_URI) : SpiPackage.eINSTANCE);
		InjectPackageImpl theInjectPackage = (InjectPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InjectPackage.eNS_URI) instanceof InjectPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InjectPackage.eNS_URI) : InjectPackage.eINSTANCE);
		ecore.datatypes.javax.enterprise.inject.spi.impl.SpiPackageImpl theSpiPackage_1 = (ecore.datatypes.javax.enterprise.inject.spi.impl.SpiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.javax.enterprise.inject.spi.SpiPackage.eNS_URI) instanceof ecore.datatypes.javax.enterprise.inject.spi.impl.SpiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.javax.enterprise.inject.spi.SpiPackage.eNS_URI) : ecore.datatypes.javax.enterprise.inject.spi.SpiPackage.eINSTANCE);
		StorePackageImpl theStorePackage = (StorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StorePackage.eNS_URI) instanceof StorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StorePackage.eNS_URI) : StorePackage.eINSTANCE);
		UsermanagerPackageImpl theUsermanagerPackage = (UsermanagerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UsermanagerPackage.eNS_URI) instanceof UsermanagerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UsermanagerPackage.eNS_URI) : UsermanagerPackage.eINSTANCE);
		CredentialsPackageImpl theCredentialsPackage = (CredentialsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CredentialsPackage.eNS_URI) instanceof CredentialsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CredentialsPackage.eNS_URI) : CredentialsPackage.eINSTANCE);
		EnterprisePackageImpl theEnterprisePackage = (EnterprisePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnterprisePackage.eNS_URI) instanceof EnterprisePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnterprisePackage.eNS_URI) : EnterprisePackage.eINSTANCE);
		ecore.datatypes.org.cocome.tradingsystem.inventory.data.persistence.impl.PersistencePackageImpl thePersistencePackage_1 = (ecore.datatypes.org.cocome.tradingsystem.inventory.data.persistence.impl.PersistencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.cocome.tradingsystem.inventory.data.persistence.PersistencePackage.eNS_URI) instanceof ecore.datatypes.org.cocome.tradingsystem.inventory.data.persistence.impl.PersistencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.cocome.tradingsystem.inventory.data.persistence.PersistencePackage.eNS_URI) : ecore.datatypes.org.cocome.tradingsystem.inventory.data.persistence.PersistencePackage.eINSTANCE);
		ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl theStorePackage_1 = (ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.StorePackage.eNS_URI) instanceof ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.StorePackage.eNS_URI) : ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.StorePackage.eINSTANCE);
		ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl theUsermanagerPackage_1 = (ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage.eNS_URI) instanceof ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage.eNS_URI) : ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage.eINSTANCE);
		ExceptionPackageImpl theExceptionPackage = (ExceptionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExceptionPackage.eNS_URI) instanceof ExceptionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExceptionPackage.eNS_URI) : ExceptionPackage.eINSTANCE);
		ScopePackageImpl theScopePackage = (ScopePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScopePackage.eNS_URI) instanceof ScopePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScopePackage.eNS_URI) : ScopePackage.eINSTANCE);
		NamedSessionContextHolderPackageImpl theNamedSessionContextHolderPackage = (NamedSessionContextHolderPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NamedSessionContextHolderPackage.eNS_URI) instanceof NamedSessionContextHolderPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NamedSessionContextHolderPackage.eNS_URI) : NamedSessionContextHolderPackage.eINSTANCE);
		ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterprisePackageImpl theEnterprisePackage_1 = (ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterprisePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage.eNS_URI) instanceof ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterprisePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage.eNS_URI) : ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage.eINSTANCE);
		ecore.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl theStorePackage_2 = (ecore.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage.eNS_URI) instanceof ecore.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage.eNS_URI) : ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage.eINSTANCE);
		ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl theUsermanagerPackage_2 = (ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage.eNS_URI) instanceof ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage.eNS_URI) : ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage.eINSTANCE);
		ConnectionPackageImpl theConnectionPackage = (ConnectionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConnectionPackage.eNS_URI) instanceof ConnectionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConnectionPackage.eNS_URI) : ConnectionPackage.eINSTANCE);
		ParsingPackageImpl theParsingPackage = (ParsingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ParsingPackage.eNS_URI) instanceof ParsingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ParsingPackage.eNS_URI) : ParsingPackage.eINSTANCE);
		JavaPackageImpl theJavaPackage = (JavaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI) instanceof JavaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI) : JavaPackage.eINSTANCE);
		ecore.org.cocome.tradingsystem.util.scope.impl.ScopePackageImpl theScopePackage_1 = (ecore.org.cocome.tradingsystem.util.scope.impl.ScopePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.util.scope.ScopePackage.eNS_URI) instanceof ecore.org.cocome.tradingsystem.util.scope.impl.ScopePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.util.scope.ScopePackage.eNS_URI) : ecore.org.cocome.tradingsystem.util.scope.ScopePackage.eINSTANCE);
		ecore.org.cocome.tradingsystem.util.scope.context.impl.ContextPackageImpl theContextPackage_1 = (ecore.org.cocome.tradingsystem.util.scope.context.impl.ContextPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.util.scope.context.ContextPackage.eNS_URI) instanceof ecore.org.cocome.tradingsystem.util.scope.context.impl.ContextPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.util.scope.context.ContextPackage.eNS_URI) : ecore.org.cocome.tradingsystem.util.scope.context.ContextPackage.eINSTANCE);

		// Create package meta-data objects
		thePersistencePackage.createPackageContents();
		theEcorePackage.createPackageContents();
		theDatatypesPackage.createPackageContents();
		theIoPackage.createPackageContents();
		theLangPackage.createPackageContents();
		theAnnotationPackage.createPackageContents();
		theUtilPackage.createPackageContents();
		theConcurrentPackage.createPackageContents();
		theEjbPackage.createPackageContents();
		theContextPackage.createPackageContents();
		theSpiPackage.createPackageContents();
		theInjectPackage.createPackageContents();
		theSpiPackage_1.createPackageContents();
		theStorePackage.createPackageContents();
		theUsermanagerPackage.createPackageContents();
		theCredentialsPackage.createPackageContents();
		theEnterprisePackage.createPackageContents();
		thePersistencePackage_1.createPackageContents();
		theStorePackage_1.createPackageContents();
		theUsermanagerPackage_1.createPackageContents();
		theExceptionPackage.createPackageContents();
		theScopePackage.createPackageContents();
		theNamedSessionContextHolderPackage.createPackageContents();
		theEnterprisePackage_1.createPackageContents();
		theStorePackage_2.createPackageContents();
		theUsermanagerPackage_2.createPackageContents();
		theConnectionPackage.createPackageContents();
		theParsingPackage.createPackageContents();
		theJavaPackage.createPackageContents();
		theScopePackage_1.createPackageContents();
		theContextPackage_1.createPackageContents();

		// Initialize created meta-data
		thePersistencePackage.initializePackageContents();
		theEcorePackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();
		theIoPackage.initializePackageContents();
		theLangPackage.initializePackageContents();
		theAnnotationPackage.initializePackageContents();
		theUtilPackage.initializePackageContents();
		theConcurrentPackage.initializePackageContents();
		theEjbPackage.initializePackageContents();
		theContextPackage.initializePackageContents();
		theSpiPackage.initializePackageContents();
		theInjectPackage.initializePackageContents();
		theSpiPackage_1.initializePackageContents();
		theStorePackage.initializePackageContents();
		theUsermanagerPackage.initializePackageContents();
		theCredentialsPackage.initializePackageContents();
		theEnterprisePackage.initializePackageContents();
		thePersistencePackage_1.initializePackageContents();
		theStorePackage_1.initializePackageContents();
		theUsermanagerPackage_1.initializePackageContents();
		theExceptionPackage.initializePackageContents();
		theScopePackage.initializePackageContents();
		theNamedSessionContextHolderPackage.initializePackageContents();
		theEnterprisePackage_1.initializePackageContents();
		theStorePackage_2.initializePackageContents();
		theUsermanagerPackage_2.initializePackageContents();
		theConnectionPackage.initializePackageContents();
		theParsingPackage.initializePackageContents();
		theJavaPackage.initializePackageContents();
		theScopePackage_1.initializePackageContents();
		theContextPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePersistencePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PersistencePackage.eNS_URI, thePersistencePackage);
		return thePersistencePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudPersistenceContext() {
		return cloudPersistenceContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCloudPersistenceContext__UpdateEntity__IProductOrder() {
		return cloudPersistenceContextEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCloudPersistenceContext__CreateEntity__IStockItem() {
		return cloudPersistenceContextEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCloudPersistenceContext__UpdateEntity__IStockItem() {
		return cloudPersistenceContextEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCloudPersistenceContext__CreateEntity__ITradingEnterprise() {
		return cloudPersistenceContextEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCloudPersistenceContext__CreateEntity__IProductOrder() {
		return cloudPersistenceContextEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCloudPersistenceContext__UpdateEntity__ITradingEnterprise() {
		return cloudPersistenceContextEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCloudPersistenceContext__CreateEntity__IStore() {
		return cloudPersistenceContextEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCloudPersistenceContext__UpdateEntity__IStore() {
		return cloudPersistenceContextEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCloudPersistenceContext__CreateEntity__IProductSupplier() {
		return cloudPersistenceContextEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCloudPersistenceContext__UpdateEntity__IProductSupplier() {
		return cloudPersistenceContextEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCloudPersistenceContext__CreateEntity__IProduct() {
		return cloudPersistenceContextEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCloudPersistenceContext__UpdateEntity__IProduct() {
		return cloudPersistenceContextEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCloudPersistenceContext__CreateEntity__Object() {
		return cloudPersistenceContextEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCloudPersistenceContext__UpdateEntity__Object() {
		return cloudPersistenceContextEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCloudPersistenceContext__CreateEntity__IUser() {
		return cloudPersistenceContextEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCloudPersistenceContext__UpdateEntity__IUser() {
		return cloudPersistenceContextEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCloudPersistenceContext__CreateEntity__ICustomer() {
		return cloudPersistenceContextEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCloudPersistenceContext__UpdateEntity__ICustomer() {
		return cloudPersistenceContextEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceAdapterEntityConverter() {
		return serviceAdapterEntityConverterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceAdapterHeaders() {
		return serviceAdapterHeadersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceFactory getPersistenceFactory() {
		return (PersistenceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cloudPersistenceContextEClass = createEClass(CLOUD_PERSISTENCE_CONTEXT);
		createEOperation(cloudPersistenceContextEClass, CLOUD_PERSISTENCE_CONTEXT___UPDATE_ENTITY__IPRODUCTORDER);
		createEOperation(cloudPersistenceContextEClass, CLOUD_PERSISTENCE_CONTEXT___CREATE_ENTITY__ISTOCKITEM);
		createEOperation(cloudPersistenceContextEClass, CLOUD_PERSISTENCE_CONTEXT___UPDATE_ENTITY__ISTOCKITEM);
		createEOperation(cloudPersistenceContextEClass, CLOUD_PERSISTENCE_CONTEXT___CREATE_ENTITY__ITRADINGENTERPRISE);
		createEOperation(cloudPersistenceContextEClass, CLOUD_PERSISTENCE_CONTEXT___CREATE_ENTITY__IPRODUCTORDER);
		createEOperation(cloudPersistenceContextEClass, CLOUD_PERSISTENCE_CONTEXT___UPDATE_ENTITY__ITRADINGENTERPRISE);
		createEOperation(cloudPersistenceContextEClass, CLOUD_PERSISTENCE_CONTEXT___CREATE_ENTITY__ISTORE);
		createEOperation(cloudPersistenceContextEClass, CLOUD_PERSISTENCE_CONTEXT___UPDATE_ENTITY__ISTORE);
		createEOperation(cloudPersistenceContextEClass, CLOUD_PERSISTENCE_CONTEXT___CREATE_ENTITY__IPRODUCTSUPPLIER);
		createEOperation(cloudPersistenceContextEClass, CLOUD_PERSISTENCE_CONTEXT___UPDATE_ENTITY__IPRODUCTSUPPLIER);
		createEOperation(cloudPersistenceContextEClass, CLOUD_PERSISTENCE_CONTEXT___CREATE_ENTITY__IPRODUCT);
		createEOperation(cloudPersistenceContextEClass, CLOUD_PERSISTENCE_CONTEXT___UPDATE_ENTITY__IPRODUCT);
		createEOperation(cloudPersistenceContextEClass, CLOUD_PERSISTENCE_CONTEXT___CREATE_ENTITY__OBJECT);
		createEOperation(cloudPersistenceContextEClass, CLOUD_PERSISTENCE_CONTEXT___UPDATE_ENTITY__OBJECT);
		createEOperation(cloudPersistenceContextEClass, CLOUD_PERSISTENCE_CONTEXT___CREATE_ENTITY__IUSER);
		createEOperation(cloudPersistenceContextEClass, CLOUD_PERSISTENCE_CONTEXT___UPDATE_ENTITY__IUSER);
		createEOperation(cloudPersistenceContextEClass, CLOUD_PERSISTENCE_CONTEXT___CREATE_ENTITY__ICUSTOMER);
		createEOperation(cloudPersistenceContextEClass, CLOUD_PERSISTENCE_CONTEXT___UPDATE_ENTITY__ICUSTOMER);

		serviceAdapterEntityConverterEClass = createEClass(SERVICE_ADAPTER_ENTITY_CONVERTER);

		serviceAdapterHeadersEClass = createEClass(SERVICE_ADAPTER_HEADERS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.StorePackage theStorePackage_1 = (ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.StorePackage)EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.StorePackage.eNS_URI);
		ecore.datatypes.org.cocome.tradingsystem.inventory.data.persistence.PersistencePackage thePersistencePackage_1 = (ecore.datatypes.org.cocome.tradingsystem.inventory.data.persistence.PersistencePackage)EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.cocome.tradingsystem.inventory.data.persistence.PersistencePackage.eNS_URI);
		ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage theStorePackage_2 = (ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage)EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage.eNS_URI);
		EjbPackage theEjbPackage = (EjbPackage)EPackage.Registry.INSTANCE.getEPackage(EjbPackage.eNS_URI);
		EnterprisePackage theEnterprisePackage = (EnterprisePackage)EPackage.Registry.INSTANCE.getEPackage(EnterprisePackage.eNS_URI);
		ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage theEnterprisePackage_1 = (ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage)EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage.eNS_URI);
		ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage theUsermanagerPackage_1 = (ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage)EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(cloudPersistenceContextEClass, CloudPersistenceContext.class, "CloudPersistenceContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getCloudPersistenceContext__UpdateEntity__IProductOrder(), null, "updateEntity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStorePackage_1.getIProductOrder(), "productOrder", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePersistencePackage_1.getUpdateException());

		op = initEOperation(getCloudPersistenceContext__CreateEntity__IStockItem(), null, "createEntity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStorePackage_2.getIStockItem(), "stockItem", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEjbPackage.getCreateException());

		op = initEOperation(getCloudPersistenceContext__UpdateEntity__IStockItem(), null, "updateEntity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStorePackage_2.getIStockItem(), "stockItem", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePersistencePackage_1.getUpdateException());

		op = initEOperation(getCloudPersistenceContext__CreateEntity__ITradingEnterprise(), null, "createEntity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEnterprisePackage.getITradingEnterprise(), "enterprise", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEjbPackage.getCreateException());

		op = initEOperation(getCloudPersistenceContext__CreateEntity__IProductOrder(), null, "createEntity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStorePackage_1.getIProductOrder(), "productOrder", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEjbPackage.getCreateException());

		op = initEOperation(getCloudPersistenceContext__UpdateEntity__ITradingEnterprise(), null, "updateEntity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEnterprisePackage.getITradingEnterprise(), "enterprise", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePersistencePackage_1.getUpdateException());

		op = initEOperation(getCloudPersistenceContext__CreateEntity__IStore(), null, "createEntity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStorePackage_2.getIStore(), "store", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEjbPackage.getCreateException());

		op = initEOperation(getCloudPersistenceContext__UpdateEntity__IStore(), null, "updateEntity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStorePackage_2.getIStore(), "store", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePersistencePackage_1.getUpdateException());

		op = initEOperation(getCloudPersistenceContext__CreateEntity__IProductSupplier(), null, "createEntity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEnterprisePackage.getIProductSupplier(), "supplier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEjbPackage.getCreateException());

		op = initEOperation(getCloudPersistenceContext__UpdateEntity__IProductSupplier(), null, "updateEntity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEnterprisePackage.getIProductSupplier(), "supplier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePersistencePackage_1.getUpdateException());

		op = initEOperation(getCloudPersistenceContext__CreateEntity__IProduct(), null, "createEntity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEnterprisePackage_1.getIProduct(), "product", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEjbPackage.getCreateException());

		op = initEOperation(getCloudPersistenceContext__UpdateEntity__IProduct(), null, "updateEntity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEnterprisePackage_1.getIProduct(), "product", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePersistencePackage_1.getUpdateException());

		op = initEOperation(getCloudPersistenceContext__CreateEntity__Object(), null, "createEntity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "entity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEjbPackage.getCreateException());

		op = initEOperation(getCloudPersistenceContext__UpdateEntity__Object(), null, "updateEntity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "entity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePersistencePackage_1.getUpdateException());

		op = initEOperation(getCloudPersistenceContext__CreateEntity__IUser(), null, "createEntity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUsermanagerPackage_1.getIUser(), "user", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEjbPackage.getCreateException());

		op = initEOperation(getCloudPersistenceContext__UpdateEntity__IUser(), null, "updateEntity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUsermanagerPackage_1.getIUser(), "user", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePersistencePackage_1.getUpdateException());

		op = initEOperation(getCloudPersistenceContext__CreateEntity__ICustomer(), null, "createEntity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUsermanagerPackage_1.getICustomer(), "customer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEjbPackage.getCreateException());

		op = initEOperation(getCloudPersistenceContext__UpdateEntity__ICustomer(), null, "updateEntity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUsermanagerPackage_1.getICustomer(), "customer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePersistencePackage_1.getUpdateException());

		initEClass(serviceAdapterEntityConverterEClass, ServiceAdapterEntityConverter.class, "ServiceAdapterEntityConverter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceAdapterHeadersEClass, ServiceAdapterHeaders.class, "ServiceAdapterHeaders", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //PersistencePackageImpl
