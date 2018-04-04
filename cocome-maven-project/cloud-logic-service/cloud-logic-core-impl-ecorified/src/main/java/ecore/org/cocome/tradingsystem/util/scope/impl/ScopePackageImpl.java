/**
 */
package ecore.org.cocome.tradingsystem.util.scope.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
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
import ecore.datatypes.org.cocome.tradingsystem.inventory.data.persistence.PersistencePackage;
import ecore.datatypes.org.cocome.tradingsystem.inventory.data.persistence.impl.PersistencePackageImpl;
import ecore.datatypes.org.cocome.tradingsystem.util.exception.ExceptionPackage;
import ecore.datatypes.org.cocome.tradingsystem.util.exception.impl.ExceptionPackageImpl;
import ecore.datatypes.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder.NamedSessionContextHolderPackage;
import ecore.datatypes.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder.impl.NamedSessionContextHolderPackageImpl;
import ecore.impl.EcorePackageImpl;
import ecore.org.cocome.tradingsystem.remote.access.connection.ConnectionPackage;
import ecore.org.cocome.tradingsystem.remote.access.connection.impl.ConnectionPackageImpl;
import ecore.org.cocome.tradingsystem.remote.access.parsing.ParsingPackage;
import ecore.org.cocome.tradingsystem.remote.access.parsing.impl.ParsingPackageImpl;
import ecore.org.cocome.tradingsystem.util.java.JavaPackage;
import ecore.org.cocome.tradingsystem.util.java.impl.JavaPackageImpl;
import ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistry;
import ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistryFactory;
import ecore.org.cocome.tradingsystem.util.scope.CashDeskSessionScopeExtension;
import ecore.org.cocome.tradingsystem.util.scope.ScopeFactory;
import ecore.org.cocome.tradingsystem.util.scope.ScopePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScopePackageImpl extends EPackageImpl implements ScopePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cashDeskRegistryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cashDeskRegistryFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cashDeskSessionScopeExtensionEClass = null;

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
	 * @see ecore.org.cocome.tradingsystem.util.scope.ScopePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ScopePackageImpl() {
		super(eNS_URI, ScopeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ScopePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ScopePackage init() {
		if (isInited) return (ScopePackage)EPackage.Registry.INSTANCE.getEPackage(ScopePackage.eNS_URI);

		// Obtain or create and register package
		ScopePackageImpl theScopePackage = (ScopePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ScopePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ScopePackageImpl());

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
		PersistencePackageImpl thePersistencePackage = (PersistencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PersistencePackage.eNS_URI) instanceof PersistencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PersistencePackage.eNS_URI) : PersistencePackage.eINSTANCE);
		ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl theStorePackage_1 = (ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.StorePackage.eNS_URI) instanceof ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.StorePackage.eNS_URI) : ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.StorePackage.eINSTANCE);
		ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl theUsermanagerPackage_1 = (ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage.eNS_URI) instanceof ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage.eNS_URI) : ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage.eINSTANCE);
		ExceptionPackageImpl theExceptionPackage = (ExceptionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExceptionPackage.eNS_URI) instanceof ExceptionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExceptionPackage.eNS_URI) : ExceptionPackage.eINSTANCE);
		ecore.datatypes.org.cocome.tradingsystem.util.scope.impl.ScopePackageImpl theScopePackage_1 = (ecore.datatypes.org.cocome.tradingsystem.util.scope.impl.ScopePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.cocome.tradingsystem.util.scope.ScopePackage.eNS_URI) instanceof ecore.datatypes.org.cocome.tradingsystem.util.scope.impl.ScopePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.cocome.tradingsystem.util.scope.ScopePackage.eNS_URI) : ecore.datatypes.org.cocome.tradingsystem.util.scope.ScopePackage.eINSTANCE);
		NamedSessionContextHolderPackageImpl theNamedSessionContextHolderPackage = (NamedSessionContextHolderPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NamedSessionContextHolderPackage.eNS_URI) instanceof NamedSessionContextHolderPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NamedSessionContextHolderPackage.eNS_URI) : NamedSessionContextHolderPackage.eINSTANCE);
		ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterprisePackageImpl theEnterprisePackage_1 = (ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterprisePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage.eNS_URI) instanceof ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterprisePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage.eNS_URI) : ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage.eINSTANCE);
		ecore.org.cocome.tradingsystem.inventory.data.persistence.impl.PersistencePackageImpl thePersistencePackage_1 = (ecore.org.cocome.tradingsystem.inventory.data.persistence.impl.PersistencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.persistence.PersistencePackage.eNS_URI) instanceof ecore.org.cocome.tradingsystem.inventory.data.persistence.impl.PersistencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.persistence.PersistencePackage.eNS_URI) : ecore.org.cocome.tradingsystem.inventory.data.persistence.PersistencePackage.eINSTANCE);
		ecore.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl theStorePackage_2 = (ecore.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage.eNS_URI) instanceof ecore.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage.eNS_URI) : ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage.eINSTANCE);
		ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl theUsermanagerPackage_2 = (ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage.eNS_URI) instanceof ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage.eNS_URI) : ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage.eINSTANCE);
		ConnectionPackageImpl theConnectionPackage = (ConnectionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConnectionPackage.eNS_URI) instanceof ConnectionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConnectionPackage.eNS_URI) : ConnectionPackage.eINSTANCE);
		ParsingPackageImpl theParsingPackage = (ParsingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ParsingPackage.eNS_URI) instanceof ParsingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ParsingPackage.eNS_URI) : ParsingPackage.eINSTANCE);
		JavaPackageImpl theJavaPackage = (JavaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI) instanceof JavaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI) : JavaPackage.eINSTANCE);
		ecore.org.cocome.tradingsystem.util.scope.context.impl.ContextPackageImpl theContextPackage_1 = (ecore.org.cocome.tradingsystem.util.scope.context.impl.ContextPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.util.scope.context.ContextPackage.eNS_URI) instanceof ecore.org.cocome.tradingsystem.util.scope.context.impl.ContextPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.util.scope.context.ContextPackage.eNS_URI) : ecore.org.cocome.tradingsystem.util.scope.context.ContextPackage.eINSTANCE);

		// Create package meta-data objects
		theScopePackage.createPackageContents();
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
		thePersistencePackage.createPackageContents();
		theStorePackage_1.createPackageContents();
		theUsermanagerPackage_1.createPackageContents();
		theExceptionPackage.createPackageContents();
		theScopePackage_1.createPackageContents();
		theNamedSessionContextHolderPackage.createPackageContents();
		theEnterprisePackage_1.createPackageContents();
		thePersistencePackage_1.createPackageContents();
		theStorePackage_2.createPackageContents();
		theUsermanagerPackage_2.createPackageContents();
		theConnectionPackage.createPackageContents();
		theParsingPackage.createPackageContents();
		theJavaPackage.createPackageContents();
		theContextPackage_1.createPackageContents();

		// Initialize created meta-data
		theScopePackage.initializePackageContents();
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
		thePersistencePackage.initializePackageContents();
		theStorePackage_1.initializePackageContents();
		theUsermanagerPackage_1.initializePackageContents();
		theExceptionPackage.initializePackageContents();
		theScopePackage_1.initializePackageContents();
		theNamedSessionContextHolderPackage.initializePackageContents();
		theEnterprisePackage_1.initializePackageContents();
		thePersistencePackage_1.initializePackageContents();
		theStorePackage_2.initializePackageContents();
		theUsermanagerPackage_2.initializePackageContents();
		theConnectionPackage.initializePackageContents();
		theParsingPackage.initializePackageContents();
		theJavaPackage.initializePackageContents();
		theContextPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theScopePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ScopePackage.eNS_URI, theScopePackage);
		return theScopePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCashDeskRegistry() {
		return cashDeskRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCashDeskRegistry_AttributeMap() {
		return (EAttribute)cashDeskRegistryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCashDeskRegistry_ContextName() {
		return (EAttribute)cashDeskRegistryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCashDeskRegistry__GetLong__RegistryKeys() {
		return cashDeskRegistryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCashDeskRegistry__PutLong__RegistryKeys_long() {
		return cashDeskRegistryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCashDeskRegistry__GetString__RegistryKeys() {
		return cashDeskRegistryEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCashDeskRegistry__PutString__RegistryKeys_String() {
		return cashDeskRegistryEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCashDeskRegistry__GetObject__RegistryKeys() {
		return cashDeskRegistryEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCashDeskRegistry__PutObject__RegistryKeys_Object() {
		return cashDeskRegistryEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCashDeskRegistry__HasObject__RegistryKeys() {
		return cashDeskRegistryEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCashDeskRegistry__HasLong__RegistryKeys() {
		return cashDeskRegistryEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCashDeskRegistryFactory() {
		return cashDeskRegistryFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCashDeskRegistryFactory_Manager() {
		return (EAttribute)cashDeskRegistryFactoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCashDeskRegistryFactory_StoreContext() {
		return (EAttribute)cashDeskRegistryFactoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCashDeskRegistryFactory_EnterpriseContext() {
		return (EAttribute)cashDeskRegistryFactoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCashDeskRegistryFactory__GetCashDeskContextRegistry() {
		return cashDeskRegistryFactoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCashDeskRegistryFactory__GetStoreContextRegistry() {
		return cashDeskRegistryFactoryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCashDeskRegistryFactory__GetEnterpriseContextRegistry() {
		return cashDeskRegistryFactoryEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCashDeskSessionScopeExtension() {
		return cashDeskSessionScopeExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCashDeskSessionScopeExtension__AddScope__BeforeBeanDiscovery() {
		return cashDeskSessionScopeExtensionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCashDeskSessionScopeExtension__RegisterContext__AfterBeanDiscovery_BeanManager() {
		return cashDeskSessionScopeExtensionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeFactory getScopeFactory() {
		return (ScopeFactory)getEFactoryInstance();
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
		cashDeskRegistryEClass = createEClass(CASH_DESK_REGISTRY);
		createEAttribute(cashDeskRegistryEClass, CASH_DESK_REGISTRY__ATTRIBUTE_MAP);
		createEAttribute(cashDeskRegistryEClass, CASH_DESK_REGISTRY__CONTEXT_NAME);
		createEOperation(cashDeskRegistryEClass, CASH_DESK_REGISTRY___GET_LONG__REGISTRYKEYS);
		createEOperation(cashDeskRegistryEClass, CASH_DESK_REGISTRY___PUT_LONG__REGISTRYKEYS_LONG);
		createEOperation(cashDeskRegistryEClass, CASH_DESK_REGISTRY___GET_STRING__REGISTRYKEYS);
		createEOperation(cashDeskRegistryEClass, CASH_DESK_REGISTRY___PUT_STRING__REGISTRYKEYS_STRING);
		createEOperation(cashDeskRegistryEClass, CASH_DESK_REGISTRY___GET_OBJECT__REGISTRYKEYS);
		createEOperation(cashDeskRegistryEClass, CASH_DESK_REGISTRY___PUT_OBJECT__REGISTRYKEYS_OBJECT);
		createEOperation(cashDeskRegistryEClass, CASH_DESK_REGISTRY___HAS_OBJECT__REGISTRYKEYS);
		createEOperation(cashDeskRegistryEClass, CASH_DESK_REGISTRY___HAS_LONG__REGISTRYKEYS);

		cashDeskRegistryFactoryEClass = createEClass(CASH_DESK_REGISTRY_FACTORY);
		createEAttribute(cashDeskRegistryFactoryEClass, CASH_DESK_REGISTRY_FACTORY__MANAGER);
		createEAttribute(cashDeskRegistryFactoryEClass, CASH_DESK_REGISTRY_FACTORY__STORE_CONTEXT);
		createEAttribute(cashDeskRegistryFactoryEClass, CASH_DESK_REGISTRY_FACTORY__ENTERPRISE_CONTEXT);
		createEOperation(cashDeskRegistryFactoryEClass, CASH_DESK_REGISTRY_FACTORY___GET_CASH_DESK_CONTEXT_REGISTRY);
		createEOperation(cashDeskRegistryFactoryEClass, CASH_DESK_REGISTRY_FACTORY___GET_STORE_CONTEXT_REGISTRY);
		createEOperation(cashDeskRegistryFactoryEClass, CASH_DESK_REGISTRY_FACTORY___GET_ENTERPRISE_CONTEXT_REGISTRY);

		cashDeskSessionScopeExtensionEClass = createEClass(CASH_DESK_SESSION_SCOPE_EXTENSION);
		createEOperation(cashDeskSessionScopeExtensionEClass, CASH_DESK_SESSION_SCOPE_EXTENSION___ADD_SCOPE__BEFOREBEANDISCOVERY);
		createEOperation(cashDeskSessionScopeExtensionEClass, CASH_DESK_SESSION_SCOPE_EXTENSION___REGISTER_CONTEXT__AFTERBEANDISCOVERY_BEANMANAGER);
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
		ecore.org.cocome.tradingsystem.util.scope.context.ContextPackage theContextPackage_1 = (ecore.org.cocome.tradingsystem.util.scope.context.ContextPackage)EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.util.scope.context.ContextPackage.eNS_URI);
		UtilPackage theUtilPackage = (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);
		ecore.datatypes.org.cocome.tradingsystem.util.scope.ScopePackage theScopePackage_1 = (ecore.datatypes.org.cocome.tradingsystem.util.scope.ScopePackage)EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.cocome.tradingsystem.util.scope.ScopePackage.eNS_URI);
		ecore.datatypes.javax.enterprise.inject.spi.SpiPackage theSpiPackage_1 = (ecore.datatypes.javax.enterprise.inject.spi.SpiPackage)EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.javax.enterprise.inject.spi.SpiPackage.eNS_URI);
		ContextPackage theContextPackage = (ContextPackage)EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theContextPackage_1);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(cashDeskRegistryEClass, CashDeskRegistry.class, "CashDeskRegistry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		EGenericType g1 = createEGenericType(theUtilPackage.getHashMap());
		EGenericType g2 = createEGenericType(theScopePackage_1.getRegistryKeys());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		initEAttribute(getCashDeskRegistry_AttributeMap(), g1, "attributeMap", null, 0, 1, CashDeskRegistry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCashDeskRegistry_ContextName(), ecorePackage.getEString(), "contextName", null, 0, 1, CashDeskRegistry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getCashDeskRegistry__GetLong__RegistryKeys(), ecorePackage.getELong(), "getLong", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theScopePackage_1.getRegistryKeys(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCashDeskRegistry__PutLong__RegistryKeys_long(), null, "putLong", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theScopePackage_1.getRegistryKeys(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCashDeskRegistry__GetString__RegistryKeys(), ecorePackage.getEString(), "getString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theScopePackage_1.getRegistryKeys(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCashDeskRegistry__PutString__RegistryKeys_String(), null, "putString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theScopePackage_1.getRegistryKeys(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCashDeskRegistry__GetObject__RegistryKeys(), ecorePackage.getEJavaObject(), "getObject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theScopePackage_1.getRegistryKeys(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCashDeskRegistry__PutObject__RegistryKeys_Object(), null, "putObject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theScopePackage_1.getRegistryKeys(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCashDeskRegistry__HasObject__RegistryKeys(), ecorePackage.getEBoolean(), "hasObject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theScopePackage_1.getRegistryKeys(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCashDeskRegistry__HasLong__RegistryKeys(), ecorePackage.getEBoolean(), "hasLong", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theScopePackage_1.getRegistryKeys(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cashDeskRegistryFactoryEClass, CashDeskRegistryFactory.class, "CashDeskRegistryFactory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCashDeskRegistryFactory_Manager(), theSpiPackage_1.getBeanManager(), "manager", null, 0, 1, CashDeskRegistryFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCashDeskRegistryFactory_StoreContext(), theScopePackage_1.getIContextRegistry(), "storeContext", null, 0, 1, CashDeskRegistryFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCashDeskRegistryFactory_EnterpriseContext(), theScopePackage_1.getIContextRegistry(), "enterpriseContext", null, 0, 1, CashDeskRegistryFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCashDeskRegistryFactory__GetCashDeskContextRegistry(), theScopePackage_1.getIContextRegistry(), "getCashDeskContextRegistry", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theContextPackage.getContextNotActiveException());

		op = initEOperation(getCashDeskRegistryFactory__GetStoreContextRegistry(), theScopePackage_1.getIContextRegistry(), "getStoreContextRegistry", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theContextPackage.getContextNotActiveException());

		op = initEOperation(getCashDeskRegistryFactory__GetEnterpriseContextRegistry(), theScopePackage_1.getIContextRegistry(), "getEnterpriseContextRegistry", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theContextPackage.getContextNotActiveException());

		initEClass(cashDeskSessionScopeExtensionEClass, CashDeskSessionScopeExtension.class, "CashDeskSessionScopeExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getCashDeskSessionScopeExtension__AddScope__BeforeBeanDiscovery(), null, "addScope", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSpiPackage_1.getBeforeBeanDiscovery(), "event", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCashDeskSessionScopeExtension__RegisterContext__AfterBeanDiscovery_BeanManager(), null, "registerContext", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSpiPackage_1.getAfterBeanDiscovery(), "event", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSpiPackage_1.getBeanManager(), "manager", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //ScopePackageImpl
