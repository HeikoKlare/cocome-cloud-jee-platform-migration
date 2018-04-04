/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.store.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
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
import ecore.datatypes.org.cocome.tradingsystem.util.scope.ScopePackage;
import ecore.datatypes.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder.NamedSessionContextHolderPackage;
import ecore.datatypes.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder.impl.NamedSessionContextHolderPackageImpl;
import ecore.datatypes.org.cocome.tradingsystem.util.scope.impl.ScopePackageImpl;
import ecore.impl.EcorePackageImpl;
import ecore.org.cocome.tradingsystem.inventory.data.store.EnterpriseStoreQueryProvider;
import ecore.org.cocome.tradingsystem.inventory.data.store.IStockItem;
import ecore.org.cocome.tradingsystem.inventory.data.store.IStore;
import ecore.org.cocome.tradingsystem.inventory.data.store.OrderEntry;
import ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder;
import ecore.org.cocome.tradingsystem.inventory.data.store.StockItem;
import ecore.org.cocome.tradingsystem.inventory.data.store.Store;
import ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory;
import ecore.org.cocome.tradingsystem.inventory.data.store.StoreFactory;
import ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage;
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
public class StorePackageImpl extends EPackageImpl implements StorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enterpriseStoreQueryProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stockItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storeDatatypesFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iStockItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iStoreEClass = null;

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
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StorePackageImpl() {
		super(eNS_URI, StoreFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StorePackage init() {
		if (isInited) return (StorePackage)EPackage.Registry.INSTANCE.getEPackage(StorePackage.eNS_URI);

		// Obtain or create and register package
		StorePackageImpl theStorePackage = (StorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StorePackageImpl());

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
		ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.impl.StorePackageImpl theStorePackage_1 = (ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.impl.StorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.StorePackage.eNS_URI) instanceof ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.impl.StorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.StorePackage.eNS_URI) : ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.StorePackage.eINSTANCE);
		UsermanagerPackageImpl theUsermanagerPackage = (UsermanagerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UsermanagerPackage.eNS_URI) instanceof UsermanagerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UsermanagerPackage.eNS_URI) : UsermanagerPackage.eINSTANCE);
		CredentialsPackageImpl theCredentialsPackage = (CredentialsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CredentialsPackage.eNS_URI) instanceof CredentialsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CredentialsPackage.eNS_URI) : CredentialsPackage.eINSTANCE);
		EnterprisePackageImpl theEnterprisePackage = (EnterprisePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnterprisePackage.eNS_URI) instanceof EnterprisePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnterprisePackage.eNS_URI) : EnterprisePackage.eINSTANCE);
		PersistencePackageImpl thePersistencePackage = (PersistencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PersistencePackage.eNS_URI) instanceof PersistencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PersistencePackage.eNS_URI) : PersistencePackage.eINSTANCE);
		ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl theStorePackage_2 = (ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.StorePackage.eNS_URI) instanceof ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.StorePackage.eNS_URI) : ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.StorePackage.eINSTANCE);
		ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl theUsermanagerPackage_1 = (ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage.eNS_URI) instanceof ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage.eNS_URI) : ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage.eINSTANCE);
		ExceptionPackageImpl theExceptionPackage = (ExceptionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExceptionPackage.eNS_URI) instanceof ExceptionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExceptionPackage.eNS_URI) : ExceptionPackage.eINSTANCE);
		ScopePackageImpl theScopePackage = (ScopePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScopePackage.eNS_URI) instanceof ScopePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScopePackage.eNS_URI) : ScopePackage.eINSTANCE);
		NamedSessionContextHolderPackageImpl theNamedSessionContextHolderPackage = (NamedSessionContextHolderPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NamedSessionContextHolderPackage.eNS_URI) instanceof NamedSessionContextHolderPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NamedSessionContextHolderPackage.eNS_URI) : NamedSessionContextHolderPackage.eINSTANCE);
		ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterprisePackageImpl theEnterprisePackage_1 = (ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterprisePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage.eNS_URI) instanceof ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterprisePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage.eNS_URI) : ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage.eINSTANCE);
		ecore.org.cocome.tradingsystem.inventory.data.persistence.impl.PersistencePackageImpl thePersistencePackage_1 = (ecore.org.cocome.tradingsystem.inventory.data.persistence.impl.PersistencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.persistence.PersistencePackage.eNS_URI) instanceof ecore.org.cocome.tradingsystem.inventory.data.persistence.impl.PersistencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.persistence.PersistencePackage.eNS_URI) : ecore.org.cocome.tradingsystem.inventory.data.persistence.PersistencePackage.eINSTANCE);
		ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl theUsermanagerPackage_2 = (ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage.eNS_URI) instanceof ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage.eNS_URI) : ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage.eINSTANCE);
		ConnectionPackageImpl theConnectionPackage = (ConnectionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConnectionPackage.eNS_URI) instanceof ConnectionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConnectionPackage.eNS_URI) : ConnectionPackage.eINSTANCE);
		ParsingPackageImpl theParsingPackage = (ParsingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ParsingPackage.eNS_URI) instanceof ParsingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ParsingPackage.eNS_URI) : ParsingPackage.eINSTANCE);
		JavaPackageImpl theJavaPackage = (JavaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI) instanceof JavaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI) : JavaPackage.eINSTANCE);
		ecore.org.cocome.tradingsystem.util.scope.impl.ScopePackageImpl theScopePackage_1 = (ecore.org.cocome.tradingsystem.util.scope.impl.ScopePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.util.scope.ScopePackage.eNS_URI) instanceof ecore.org.cocome.tradingsystem.util.scope.impl.ScopePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.util.scope.ScopePackage.eNS_URI) : ecore.org.cocome.tradingsystem.util.scope.ScopePackage.eINSTANCE);
		ecore.org.cocome.tradingsystem.util.scope.context.impl.ContextPackageImpl theContextPackage_1 = (ecore.org.cocome.tradingsystem.util.scope.context.impl.ContextPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.util.scope.context.ContextPackage.eNS_URI) instanceof ecore.org.cocome.tradingsystem.util.scope.context.impl.ContextPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.util.scope.context.ContextPackage.eNS_URI) : ecore.org.cocome.tradingsystem.util.scope.context.ContextPackage.eINSTANCE);

		// Create package meta-data objects
		theStorePackage.createPackageContents();
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
		theStorePackage_1.createPackageContents();
		theUsermanagerPackage.createPackageContents();
		theCredentialsPackage.createPackageContents();
		theEnterprisePackage.createPackageContents();
		thePersistencePackage.createPackageContents();
		theStorePackage_2.createPackageContents();
		theUsermanagerPackage_1.createPackageContents();
		theExceptionPackage.createPackageContents();
		theScopePackage.createPackageContents();
		theNamedSessionContextHolderPackage.createPackageContents();
		theEnterprisePackage_1.createPackageContents();
		thePersistencePackage_1.createPackageContents();
		theUsermanagerPackage_2.createPackageContents();
		theConnectionPackage.createPackageContents();
		theParsingPackage.createPackageContents();
		theJavaPackage.createPackageContents();
		theScopePackage_1.createPackageContents();
		theContextPackage_1.createPackageContents();

		// Initialize created meta-data
		theStorePackage.initializePackageContents();
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
		theStorePackage_1.initializePackageContents();
		theUsermanagerPackage.initializePackageContents();
		theCredentialsPackage.initializePackageContents();
		theEnterprisePackage.initializePackageContents();
		thePersistencePackage.initializePackageContents();
		theStorePackage_2.initializePackageContents();
		theUsermanagerPackage_1.initializePackageContents();
		theExceptionPackage.initializePackageContents();
		theScopePackage.initializePackageContents();
		theNamedSessionContextHolderPackage.initializePackageContents();
		theEnterprisePackage_1.initializePackageContents();
		thePersistencePackage_1.initializePackageContents();
		theUsermanagerPackage_2.initializePackageContents();
		theConnectionPackage.initializePackageContents();
		theParsingPackage.initializePackageContents();
		theJavaPackage.initializePackageContents();
		theScopePackage_1.initializePackageContents();
		theContextPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StorePackage.eNS_URI, theStorePackage);
		return theStorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnterpriseStoreQueryProvider() {
		return enterpriseStoreQueryProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnterpriseStoreQueryProvider__QueryStore__String_String() {
		return enterpriseStoreQueryProviderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnterpriseStoreQueryProvider__QueryStoreById__long() {
		return enterpriseStoreQueryProviderEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnterpriseStoreQueryProvider__QueryStockItemById__long() {
		return enterpriseStoreQueryProviderEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnterpriseStoreQueryProvider__QueryProductById__long() {
		return enterpriseStoreQueryProviderEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnterpriseStoreQueryProvider__QueryProductByBarcode__long() {
		return enterpriseStoreQueryProviderEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnterpriseStoreQueryProvider__QueryOrderById__long() {
		return enterpriseStoreQueryProviderEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnterpriseStoreQueryProvider__QueryProducts__long() {
		return enterpriseStoreQueryProviderEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnterpriseStoreQueryProvider__QueryOutstandingOrders__long() {
		return enterpriseStoreQueryProviderEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnterpriseStoreQueryProvider__QueryAllStockItems__long() {
		return enterpriseStoreQueryProviderEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnterpriseStoreQueryProvider__QueryLowStockItems__long() {
		return enterpriseStoreQueryProviderEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnterpriseStoreQueryProvider__QueryStockItem__long_long() {
		return enterpriseStoreQueryProviderEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnterpriseStoreQueryProvider__QueryStockItemsByProductId__long_long() {
		return enterpriseStoreQueryProviderEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnterpriseStoreQueryProvider__QueryProductOrder__long_long_long() {
		return enterpriseStoreQueryProviderEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnterpriseStoreQueryProvider__QueryAllOrders__long() {
		return enterpriseStoreQueryProviderEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderEntry() {
		return orderEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderEntry_Id() {
		return (EAttribute)orderEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderEntry_Amount() {
		return (EAttribute)orderEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderEntry_ProductBarcode() {
		return (EAttribute)orderEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderEntry_Product() {
		return (EReference)orderEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderEntry_StoreQuery() {
		return (EAttribute)orderEntryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOrderEntry__InitOrderEntry() {
		return orderEntryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOrderEntry__ToString() {
		return orderEntryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductOrder() {
		return productOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductOrder_Id() {
		return (EAttribute)productOrderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductOrder_DeliveryDate() {
		return (EAttribute)productOrderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductOrder_OrderingDate() {
		return (EAttribute)productOrderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductOrder_OrderEntries() {
		return (EAttribute)productOrderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductOrder_StoreName() {
		return (EAttribute)productOrderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductOrder_StoreLocation() {
		return (EAttribute)productOrderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductOrder_Store() {
		return (EReference)productOrderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductOrder_StoreQuery() {
		return (EAttribute)productOrderEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStockItem() {
		return stockItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStockItem_Id() {
		return (EAttribute)stockItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStockItem_SalesPrice() {
		return (EAttribute)stockItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStockItem_Amount() {
		return (EAttribute)stockItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStockItem_MinStock() {
		return (EAttribute)stockItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStockItem_MaxStock() {
		return (EAttribute)stockItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStockItem_IncomingAmount() {
		return (EAttribute)stockItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStockItem_StoreName() {
		return (EAttribute)stockItemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStockItem_StoreLocation() {
		return (EAttribute)stockItemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStockItem_ProductBarcode() {
		return (EAttribute)stockItemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStockItem_Store() {
		return (EReference)stockItemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStockItem_Product() {
		return (EReference)stockItemEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStockItem_StoreQuery() {
		return (EAttribute)stockItemEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStore() {
		return storeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStore_Id() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStore_Name() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStore_Location() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStore_EnterpriseName() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStore_Enterprise() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStore_ProductOrders() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStore_StockItems() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStore__InitStore() {
		return storeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStore__ToString() {
		return storeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStore__CompareTo__IStore() {
		return storeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoreDatatypesFactory() {
		return storeDatatypesFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStoreDatatypesFactory__GetNewOrderEntry() {
		return storeDatatypesFactoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStoreDatatypesFactory__GetNewProductOrder() {
		return storeDatatypesFactoryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStoreDatatypesFactory__GetNewStockItem() {
		return storeDatatypesFactoryEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStoreDatatypesFactory__GetNewStore() {
		return storeDatatypesFactoryEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStoreDatatypesFactory__ConvertToOrderEntry__ComplexOrderEntryTO() {
		return storeDatatypesFactoryEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStoreDatatypesFactory__FillComplexOrderEntryTO__IOrderEntry() {
		return storeDatatypesFactoryEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStoreDatatypesFactory__ConvertToProductOrder__ComplexOrderTO() {
		return storeDatatypesFactoryEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStoreDatatypesFactory__FillComplexOrderTO__IProductOrder() {
		return storeDatatypesFactoryEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStoreDatatypesFactory__ConvertToStockItem__StockItemTO() {
		return storeDatatypesFactoryEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStoreDatatypesFactory__FillStockItemTO__IStockItem() {
		return storeDatatypesFactoryEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStoreDatatypesFactory__ConvertToStore__StoreTO() {
		return storeDatatypesFactoryEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStoreDatatypesFactory__FillStoreTO__IStore() {
		return storeDatatypesFactoryEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStoreDatatypesFactory__FillOrderEntryTO__IOrderEntry() {
		return storeDatatypesFactoryEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStoreDatatypesFactory__FillOrderTO__IProductOrder() {
		return storeDatatypesFactoryEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStoreDatatypesFactory__FillProductWithStockItemTO__IStockItem() {
		return storeDatatypesFactoryEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStoreDatatypesFactory__FillProductWithSupplierAndStockItemTO__IStockItem() {
		return storeDatatypesFactoryEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStoreDatatypesFactory__FillStoreWithEnterpriseTO__IStore() {
		return storeDatatypesFactoryEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIStockItem() {
		return iStockItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIStore() {
		return iStoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreFactory getStoreFactory() {
		return (StoreFactory)getEFactoryInstance();
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
		enterpriseStoreQueryProviderEClass = createEClass(ENTERPRISE_STORE_QUERY_PROVIDER);
		createEOperation(enterpriseStoreQueryProviderEClass, ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_STORE__STRING_STRING);
		createEOperation(enterpriseStoreQueryProviderEClass, ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_STORE_BY_ID__LONG);
		createEOperation(enterpriseStoreQueryProviderEClass, ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_STOCK_ITEM_BY_ID__LONG);
		createEOperation(enterpriseStoreQueryProviderEClass, ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_PRODUCT_BY_ID__LONG);
		createEOperation(enterpriseStoreQueryProviderEClass, ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_PRODUCT_BY_BARCODE__LONG);
		createEOperation(enterpriseStoreQueryProviderEClass, ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_ORDER_BY_ID__LONG);
		createEOperation(enterpriseStoreQueryProviderEClass, ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_PRODUCTS__LONG);
		createEOperation(enterpriseStoreQueryProviderEClass, ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_OUTSTANDING_ORDERS__LONG);
		createEOperation(enterpriseStoreQueryProviderEClass, ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_ALL_STOCK_ITEMS__LONG);
		createEOperation(enterpriseStoreQueryProviderEClass, ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_LOW_STOCK_ITEMS__LONG);
		createEOperation(enterpriseStoreQueryProviderEClass, ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_STOCK_ITEM__LONG_LONG);
		createEOperation(enterpriseStoreQueryProviderEClass, ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_STOCK_ITEMS_BY_PRODUCT_ID__LONG_LONG);
		createEOperation(enterpriseStoreQueryProviderEClass, ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_PRODUCT_ORDER__LONG_LONG_LONG);
		createEOperation(enterpriseStoreQueryProviderEClass, ENTERPRISE_STORE_QUERY_PROVIDER___QUERY_ALL_ORDERS__LONG);

		orderEntryEClass = createEClass(ORDER_ENTRY);
		createEAttribute(orderEntryEClass, ORDER_ENTRY__ID);
		createEAttribute(orderEntryEClass, ORDER_ENTRY__AMOUNT);
		createEAttribute(orderEntryEClass, ORDER_ENTRY__PRODUCT_BARCODE);
		createEReference(orderEntryEClass, ORDER_ENTRY__PRODUCT);
		createEAttribute(orderEntryEClass, ORDER_ENTRY__STORE_QUERY);
		createEOperation(orderEntryEClass, ORDER_ENTRY___INIT_ORDER_ENTRY);
		createEOperation(orderEntryEClass, ORDER_ENTRY___TO_STRING);

		productOrderEClass = createEClass(PRODUCT_ORDER);
		createEAttribute(productOrderEClass, PRODUCT_ORDER__ID);
		createEAttribute(productOrderEClass, PRODUCT_ORDER__DELIVERY_DATE);
		createEAttribute(productOrderEClass, PRODUCT_ORDER__ORDERING_DATE);
		createEAttribute(productOrderEClass, PRODUCT_ORDER__ORDER_ENTRIES);
		createEAttribute(productOrderEClass, PRODUCT_ORDER__STORE_NAME);
		createEAttribute(productOrderEClass, PRODUCT_ORDER__STORE_LOCATION);
		createEReference(productOrderEClass, PRODUCT_ORDER__STORE);
		createEAttribute(productOrderEClass, PRODUCT_ORDER__STORE_QUERY);

		stockItemEClass = createEClass(STOCK_ITEM);
		createEAttribute(stockItemEClass, STOCK_ITEM__ID);
		createEAttribute(stockItemEClass, STOCK_ITEM__SALES_PRICE);
		createEAttribute(stockItemEClass, STOCK_ITEM__AMOUNT);
		createEAttribute(stockItemEClass, STOCK_ITEM__MIN_STOCK);
		createEAttribute(stockItemEClass, STOCK_ITEM__MAX_STOCK);
		createEAttribute(stockItemEClass, STOCK_ITEM__INCOMING_AMOUNT);
		createEAttribute(stockItemEClass, STOCK_ITEM__STORE_NAME);
		createEAttribute(stockItemEClass, STOCK_ITEM__STORE_LOCATION);
		createEAttribute(stockItemEClass, STOCK_ITEM__PRODUCT_BARCODE);
		createEReference(stockItemEClass, STOCK_ITEM__STORE);
		createEReference(stockItemEClass, STOCK_ITEM__PRODUCT);
		createEAttribute(stockItemEClass, STOCK_ITEM__STORE_QUERY);

		storeEClass = createEClass(STORE);
		createEAttribute(storeEClass, STORE__ID);
		createEAttribute(storeEClass, STORE__NAME);
		createEAttribute(storeEClass, STORE__LOCATION);
		createEAttribute(storeEClass, STORE__ENTERPRISE_NAME);
		createEAttribute(storeEClass, STORE__ENTERPRISE);
		createEAttribute(storeEClass, STORE__PRODUCT_ORDERS);
		createEAttribute(storeEClass, STORE__STOCK_ITEMS);
		createEOperation(storeEClass, STORE___INIT_STORE);
		createEOperation(storeEClass, STORE___TO_STRING);
		createEOperation(storeEClass, STORE___COMPARE_TO__ISTORE);

		storeDatatypesFactoryEClass = createEClass(STORE_DATATYPES_FACTORY);
		createEOperation(storeDatatypesFactoryEClass, STORE_DATATYPES_FACTORY___GET_NEW_ORDER_ENTRY);
		createEOperation(storeDatatypesFactoryEClass, STORE_DATATYPES_FACTORY___GET_NEW_PRODUCT_ORDER);
		createEOperation(storeDatatypesFactoryEClass, STORE_DATATYPES_FACTORY___GET_NEW_STOCK_ITEM);
		createEOperation(storeDatatypesFactoryEClass, STORE_DATATYPES_FACTORY___GET_NEW_STORE);
		createEOperation(storeDatatypesFactoryEClass, STORE_DATATYPES_FACTORY___CONVERT_TO_ORDER_ENTRY__COMPLEXORDERENTRYTO);
		createEOperation(storeDatatypesFactoryEClass, STORE_DATATYPES_FACTORY___FILL_COMPLEX_ORDER_ENTRY_TO__IORDERENTRY);
		createEOperation(storeDatatypesFactoryEClass, STORE_DATATYPES_FACTORY___CONVERT_TO_PRODUCT_ORDER__COMPLEXORDERTO);
		createEOperation(storeDatatypesFactoryEClass, STORE_DATATYPES_FACTORY___FILL_COMPLEX_ORDER_TO__IPRODUCTORDER);
		createEOperation(storeDatatypesFactoryEClass, STORE_DATATYPES_FACTORY___CONVERT_TO_STOCK_ITEM__STOCKITEMTO);
		createEOperation(storeDatatypesFactoryEClass, STORE_DATATYPES_FACTORY___FILL_STOCK_ITEM_TO__ISTOCKITEM);
		createEOperation(storeDatatypesFactoryEClass, STORE_DATATYPES_FACTORY___CONVERT_TO_STORE__STORETO);
		createEOperation(storeDatatypesFactoryEClass, STORE_DATATYPES_FACTORY___FILL_STORE_TO__ISTORE);
		createEOperation(storeDatatypesFactoryEClass, STORE_DATATYPES_FACTORY___FILL_ORDER_ENTRY_TO__IORDERENTRY);
		createEOperation(storeDatatypesFactoryEClass, STORE_DATATYPES_FACTORY___FILL_ORDER_TO__IPRODUCTORDER);
		createEOperation(storeDatatypesFactoryEClass, STORE_DATATYPES_FACTORY___FILL_PRODUCT_WITH_STOCK_ITEM_TO__ISTOCKITEM);
		createEOperation(storeDatatypesFactoryEClass, STORE_DATATYPES_FACTORY___FILL_PRODUCT_WITH_SUPPLIER_AND_STOCK_ITEM_TO__ISTOCKITEM);
		createEOperation(storeDatatypesFactoryEClass, STORE_DATATYPES_FACTORY___FILL_STORE_WITH_ENTERPRISE_TO__ISTORE);

		iStockItemEClass = createEClass(ISTOCK_ITEM);

		iStoreEClass = createEClass(ISTORE);
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
		ExceptionPackage theExceptionPackage = (ExceptionPackage)EPackage.Registry.INSTANCE.getEPackage(ExceptionPackage.eNS_URI);
		ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage theEnterprisePackage_1 = (ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage)EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage.eNS_URI);
		ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.StorePackage theStorePackage_2 = (ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.StorePackage)EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.StorePackage.eNS_URI);
		UtilPackage theUtilPackage = (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);
		DatatypesPackage theDatatypesPackage = (DatatypesPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);
		EnterprisePackage theEnterprisePackage = (EnterprisePackage)EPackage.Registry.INSTANCE.getEPackage(EnterprisePackage.eNS_URI);
		ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.StorePackage theStorePackage_1 = (ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.StorePackage)EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.StorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		stockItemEClass.getESuperTypes().add(this.getIStockItem());
		storeEClass.getESuperTypes().add(this.getIStore());

		// Initialize classes, features, and operations; add parameters
		initEClass(enterpriseStoreQueryProviderEClass, EnterpriseStoreQueryProvider.class, "EnterpriseStoreQueryProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getEnterpriseStoreQueryProvider__QueryStore__String_String(), this.getIStore(), "queryStore", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "location", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnterpriseStoreQueryProvider__QueryStoreById__long(), this.getIStore(), "queryStoreById", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "storeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionPackage.getNotInDatabaseException());

		op = initEOperation(getEnterpriseStoreQueryProvider__QueryStockItemById__long(), this.getIStockItem(), "queryStockItemById", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "stockItemId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionPackage.getNotInDatabaseException());

		op = initEOperation(getEnterpriseStoreQueryProvider__QueryProductById__long(), theEnterprisePackage_1.getIProduct(), "queryProductById", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "productId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionPackage.getNotInDatabaseException());

		op = initEOperation(getEnterpriseStoreQueryProvider__QueryProductByBarcode__long(), theEnterprisePackage_1.getIProduct(), "queryProductByBarcode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "barcode", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnterpriseStoreQueryProvider__QueryOrderById__long(), theStorePackage_2.getIProductOrder(), "queryOrderById", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "orderId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionPackage.getNotInDatabaseException());

		op = initEOperation(getEnterpriseStoreQueryProvider__QueryProducts__long(), null, "queryProducts", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "storeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(theUtilPackage.getCollection());
		EGenericType g2 = createEGenericType(theEnterprisePackage_1.getIProduct());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getEnterpriseStoreQueryProvider__QueryOutstandingOrders__long(), null, "queryOutstandingOrders", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "storeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getCollection());
		g2 = createEGenericType(theStorePackage_2.getIProductOrder());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getEnterpriseStoreQueryProvider__QueryAllStockItems__long(), null, "queryAllStockItems", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "storeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getCollection());
		g2 = createEGenericType(this.getIStockItem());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getEnterpriseStoreQueryProvider__QueryLowStockItems__long(), null, "queryLowStockItems", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "storeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getCollection());
		g2 = createEGenericType(this.getIStockItem());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getEnterpriseStoreQueryProvider__QueryStockItem__long_long(), this.getIStockItem(), "queryStockItem", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "storeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "productBarcode", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnterpriseStoreQueryProvider__QueryStockItemsByProductId__long_long(), null, "queryStockItemsByProductId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "storeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getlongArray(), "productIds", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getCollection());
		g2 = createEGenericType(this.getIStockItem());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getEnterpriseStoreQueryProvider__QueryProductOrder__long_long_long(), theStorePackage_2.getIProductOrder(), "queryProductOrder", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "storeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "productBarcode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "amount", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionPackage.getNotInDatabaseException());

		op = initEOperation(getEnterpriseStoreQueryProvider__QueryAllOrders__long(), null, "queryAllOrders", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "storeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getCollection());
		g2 = createEGenericType(theStorePackage_2.getIProductOrder());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(orderEntryEClass, OrderEntry.class, "OrderEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderEntry_Id(), ecorePackage.getELong(), "id", null, 0, 1, OrderEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderEntry_Amount(), ecorePackage.getELong(), "amount", null, 0, 1, OrderEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderEntry_ProductBarcode(), ecorePackage.getELong(), "productBarcode", null, 0, 1, OrderEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderEntry_Product(), theEnterprisePackage_1.getIProduct(), null, "product", null, 0, 1, OrderEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderEntry_StoreQuery(), theStorePackage_2.getIStoreQuery(), "storeQuery", null, 0, 1, OrderEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOrderEntry__InitOrderEntry(), null, "initOrderEntry", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOrderEntry__ToString(), ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(productOrderEClass, ProductOrder.class, "ProductOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductOrder_Id(), ecorePackage.getELong(), "id", null, 0, 1, ProductOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductOrder_DeliveryDate(), theUtilPackage.getDate(), "deliveryDate", null, 0, 1, ProductOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductOrder_OrderingDate(), theUtilPackage.getDate(), "orderingDate", null, 0, 1, ProductOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getCollection());
		g2 = createEGenericType(theStorePackage_2.getIOrderEntry());
		g1.getETypeArguments().add(g2);
		initEAttribute(getProductOrder_OrderEntries(), g1, "orderEntries", null, 0, 1, ProductOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductOrder_StoreName(), ecorePackage.getEString(), "storeName", null, 0, 1, ProductOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductOrder_StoreLocation(), ecorePackage.getEString(), "storeLocation", null, 0, 1, ProductOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductOrder_Store(), this.getIStore(), null, "store", null, 0, 1, ProductOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductOrder_StoreQuery(), theStorePackage_2.getIStoreQuery(), "storeQuery", null, 0, 1, ProductOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stockItemEClass, StockItem.class, "StockItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStockItem_Id(), ecorePackage.getELong(), "id", null, 0, 1, StockItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStockItem_SalesPrice(), ecorePackage.getEDouble(), "salesPrice", null, 0, 1, StockItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStockItem_Amount(), ecorePackage.getELong(), "amount", null, 0, 1, StockItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStockItem_MinStock(), ecorePackage.getELong(), "minStock", null, 0, 1, StockItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStockItem_MaxStock(), ecorePackage.getELong(), "maxStock", null, 0, 1, StockItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStockItem_IncomingAmount(), ecorePackage.getELong(), "incomingAmount", null, 0, 1, StockItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStockItem_StoreName(), ecorePackage.getEString(), "storeName", null, 0, 1, StockItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStockItem_StoreLocation(), ecorePackage.getEString(), "storeLocation", null, 0, 1, StockItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStockItem_ProductBarcode(), ecorePackage.getELong(), "productBarcode", null, 0, 1, StockItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStockItem_Store(), this.getIStore(), null, "store", null, 0, 1, StockItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStockItem_Product(), theEnterprisePackage_1.getIProduct(), null, "product", null, 0, 1, StockItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStockItem_StoreQuery(), theStorePackage_2.getIStoreQuery(), "storeQuery", null, 0, 1, StockItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storeEClass, Store.class, "Store", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStore_Id(), ecorePackage.getELong(), "id", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_Name(), ecorePackage.getEString(), "name", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_Location(), ecorePackage.getEString(), "location", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_EnterpriseName(), ecorePackage.getEString(), "enterpriseName", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_Enterprise(), theEnterprisePackage.getITradingEnterprise(), "enterprise", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getCollection());
		g2 = createEGenericType(theStorePackage_2.getIProductOrder());
		g1.getETypeArguments().add(g2);
		initEAttribute(getStore_ProductOrders(), g1, "productOrders", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getCollection());
		g2 = createEGenericType(this.getIStockItem());
		g1.getETypeArguments().add(g2);
		initEAttribute(getStore_StockItems(), g1, "stockItems", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getStore__InitStore(), null, "initStore", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStore__ToString(), ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStore__CompareTo__IStore(), ecorePackage.getEInt(), "compareTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIStore(), "o", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(storeDatatypesFactoryEClass, StoreDatatypesFactory.class, "StoreDatatypesFactory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getStoreDatatypesFactory__GetNewOrderEntry(), theStorePackage_2.getIOrderEntry(), "getNewOrderEntry", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStoreDatatypesFactory__GetNewProductOrder(), theStorePackage_2.getIProductOrder(), "getNewProductOrder", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStoreDatatypesFactory__GetNewStockItem(), this.getIStockItem(), "getNewStockItem", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStoreDatatypesFactory__GetNewStore(), this.getIStore(), "getNewStore", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStoreDatatypesFactory__ConvertToOrderEntry__ComplexOrderEntryTO(), theStorePackage_2.getIOrderEntry(), "convertToOrderEntry", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStorePackage_1.getComplexOrderEntryTO(), "entryTO", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStoreDatatypesFactory__FillComplexOrderEntryTO__IOrderEntry(), theStorePackage_1.getComplexOrderEntryTO(), "fillComplexOrderEntryTO", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStorePackage_2.getIOrderEntry(), "entry", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionPackage.getNotInDatabaseException());

		op = initEOperation(getStoreDatatypesFactory__ConvertToProductOrder__ComplexOrderTO(), theStorePackage_2.getIProductOrder(), "convertToProductOrder", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStorePackage_1.getComplexOrderTO(), "orderTO", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStoreDatatypesFactory__FillComplexOrderTO__IProductOrder(), theStorePackage_1.getComplexOrderTO(), "fillComplexOrderTO", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStorePackage_2.getIProductOrder(), "order", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionPackage.getNotInDatabaseException());

		op = initEOperation(getStoreDatatypesFactory__ConvertToStockItem__StockItemTO(), this.getIStockItem(), "convertToStockItem", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStorePackage_1.getStockItemTO(), "stockItemTO", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStoreDatatypesFactory__FillStockItemTO__IStockItem(), theStorePackage_1.getStockItemTO(), "fillStockItemTO", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIStockItem(), "stockItem", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStoreDatatypesFactory__ConvertToStore__StoreTO(), this.getIStore(), "convertToStore", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStorePackage_1.getStoreTO(), "storeTO", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStoreDatatypesFactory__FillStoreTO__IStore(), theStorePackage_1.getStoreTO(), "fillStoreTO", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIStore(), "store", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStoreDatatypesFactory__FillOrderEntryTO__IOrderEntry(), theStorePackage_1.getOrderEntryTO(), "fillOrderEntryTO", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStorePackage_2.getIOrderEntry(), "entry", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStoreDatatypesFactory__FillOrderTO__IProductOrder(), theStorePackage_1.getOrderTO(), "fillOrderTO", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStorePackage_2.getIProductOrder(), "order", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStoreDatatypesFactory__FillProductWithStockItemTO__IStockItem(), theStorePackage_1.getProductWithStockItemTO(), "fillProductWithStockItemTO", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIStockItem(), "stockItem", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStoreDatatypesFactory__FillProductWithSupplierAndStockItemTO__IStockItem(), theStorePackage_1.getProductWithSupplierAndStockItemTO(), "fillProductWithSupplierAndStockItemTO", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIStockItem(), "stockItem", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionPackage.getNotInDatabaseException());

		op = initEOperation(getStoreDatatypesFactory__FillStoreWithEnterpriseTO__IStore(), theStorePackage_1.getStoreWithEnterpriseTO(), "fillStoreWithEnterpriseTO", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIStore(), "store", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionPackage.getNotInDatabaseException());

		initEClass(iStockItemEClass, IStockItem.class, "IStockItem", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iStoreEClass, IStore.class, "IStore", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //StorePackageImpl
