/**
 */
package ecore.org.cocome.tradingsystem.remote.access.parsing.impl;

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
import ecore.datatypes.org.cocome.tradingsystem.util.scope.ScopePackage;
import ecore.datatypes.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder.NamedSessionContextHolderPackage;
import ecore.datatypes.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder.impl.NamedSessionContextHolderPackageImpl;
import ecore.datatypes.org.cocome.tradingsystem.util.scope.impl.ScopePackageImpl;
import ecore.impl.EcorePackageImpl;
import ecore.org.cocome.tradingsystem.remote.access.connection.ConnectionPackage;
import ecore.org.cocome.tradingsystem.remote.access.connection.impl.ConnectionPackageImpl;
import ecore.org.cocome.tradingsystem.remote.access.parsing.CSVHelper;
import ecore.org.cocome.tradingsystem.remote.access.parsing.MessageToCSV;
import ecore.org.cocome.tradingsystem.remote.access.parsing.ParserPostMessage;
import ecore.org.cocome.tradingsystem.remote.access.parsing.ParsingFactory;
import ecore.org.cocome.tradingsystem.remote.access.parsing.ParsingPackage;
import ecore.org.cocome.tradingsystem.util.java.JavaPackage;
import ecore.org.cocome.tradingsystem.util.java.impl.JavaPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParsingPackageImpl extends EPackageImpl implements ParsingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csvHelperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageToCSVEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parserPostMessageEClass = null;

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
	 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.ParsingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ParsingPackageImpl() {
		super(eNS_URI, ParsingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ParsingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ParsingPackage init() {
		if (isInited) return (ParsingPackage)EPackage.Registry.INSTANCE.getEPackage(ParsingPackage.eNS_URI);

		// Obtain or create and register package
		ParsingPackageImpl theParsingPackage = (ParsingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ParsingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ParsingPackageImpl());

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
		ScopePackageImpl theScopePackage = (ScopePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScopePackage.eNS_URI) instanceof ScopePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScopePackage.eNS_URI) : ScopePackage.eINSTANCE);
		NamedSessionContextHolderPackageImpl theNamedSessionContextHolderPackage = (NamedSessionContextHolderPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NamedSessionContextHolderPackage.eNS_URI) instanceof NamedSessionContextHolderPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NamedSessionContextHolderPackage.eNS_URI) : NamedSessionContextHolderPackage.eINSTANCE);
		ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterprisePackageImpl theEnterprisePackage_1 = (ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterprisePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage.eNS_URI) instanceof ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterprisePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage.eNS_URI) : ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage.eINSTANCE);
		ecore.org.cocome.tradingsystem.inventory.data.persistence.impl.PersistencePackageImpl thePersistencePackage_1 = (ecore.org.cocome.tradingsystem.inventory.data.persistence.impl.PersistencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.persistence.PersistencePackage.eNS_URI) instanceof ecore.org.cocome.tradingsystem.inventory.data.persistence.impl.PersistencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.persistence.PersistencePackage.eNS_URI) : ecore.org.cocome.tradingsystem.inventory.data.persistence.PersistencePackage.eINSTANCE);
		ecore.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl theStorePackage_2 = (ecore.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage.eNS_URI) instanceof ecore.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage.eNS_URI) : ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage.eINSTANCE);
		ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl theUsermanagerPackage_2 = (ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage.eNS_URI) instanceof ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage.eNS_URI) : ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage.eINSTANCE);
		ConnectionPackageImpl theConnectionPackage = (ConnectionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConnectionPackage.eNS_URI) instanceof ConnectionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConnectionPackage.eNS_URI) : ConnectionPackage.eINSTANCE);
		JavaPackageImpl theJavaPackage = (JavaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI) instanceof JavaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI) : JavaPackage.eINSTANCE);
		ecore.org.cocome.tradingsystem.util.scope.impl.ScopePackageImpl theScopePackage_1 = (ecore.org.cocome.tradingsystem.util.scope.impl.ScopePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.util.scope.ScopePackage.eNS_URI) instanceof ecore.org.cocome.tradingsystem.util.scope.impl.ScopePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.util.scope.ScopePackage.eNS_URI) : ecore.org.cocome.tradingsystem.util.scope.ScopePackage.eINSTANCE);
		ecore.org.cocome.tradingsystem.util.scope.context.impl.ContextPackageImpl theContextPackage_1 = (ecore.org.cocome.tradingsystem.util.scope.context.impl.ContextPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.util.scope.context.ContextPackage.eNS_URI) instanceof ecore.org.cocome.tradingsystem.util.scope.context.impl.ContextPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.util.scope.context.ContextPackage.eNS_URI) : ecore.org.cocome.tradingsystem.util.scope.context.ContextPackage.eINSTANCE);

		// Create package meta-data objects
		theParsingPackage.createPackageContents();
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
		theScopePackage.createPackageContents();
		theNamedSessionContextHolderPackage.createPackageContents();
		theEnterprisePackage_1.createPackageContents();
		thePersistencePackage_1.createPackageContents();
		theStorePackage_2.createPackageContents();
		theUsermanagerPackage_2.createPackageContents();
		theConnectionPackage.createPackageContents();
		theJavaPackage.createPackageContents();
		theScopePackage_1.createPackageContents();
		theContextPackage_1.createPackageContents();

		// Initialize created meta-data
		theParsingPackage.initializePackageContents();
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
		theScopePackage.initializePackageContents();
		theNamedSessionContextHolderPackage.initializePackageContents();
		theEnterprisePackage_1.initializePackageContents();
		thePersistencePackage_1.initializePackageContents();
		theStorePackage_2.initializePackageContents();
		theUsermanagerPackage_2.initializePackageContents();
		theConnectionPackage.initializePackageContents();
		theJavaPackage.initializePackageContents();
		theScopePackage_1.initializePackageContents();
		theContextPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theParsingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ParsingPackage.eNS_URI, theParsingPackage);
		return theParsingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSVHelper() {
		return csvHelperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCSVHelper__GetStores__String() {
		return csvHelperEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCSVHelper__GetCustomers__String() {
		return csvHelperEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCSVHelper__GetUsers__String() {
		return csvHelperEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCSVHelper__GetEnterprises__String() {
		return csvHelperEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCSVHelper__GetStockItems__String() {
		return csvHelperEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCSVHelper__GetProducts__String() {
		return csvHelperEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCSVHelper__GetProductSuppliers__String() {
		return csvHelperEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCSVHelper__GetProductOrders__String() {
		return csvHelperEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageToCSV() {
		return messageToCSVEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageToCSV_Message() {
		return (EAttribute)messageToCSVEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessageToCSV__GetCSV() {
		return messageToCSVEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParserPostMessage() {
		return parserPostMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParserPostMessage_Response() {
		return (EAttribute)parserPostMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParserPostMessage_Message() {
		return (EAttribute)parserPostMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParserPostMessage_Time() {
		return (EAttribute)parserPostMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParserPostMessage_Lebel() {
		return (EAttribute)parserPostMessageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParserPostMessage_Status() {
		return (EAttribute)parserPostMessageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParserPostMessage_Description() {
		return (EAttribute)parserPostMessageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParsingFactory getParsingFactory() {
		return (ParsingFactory)getEFactoryInstance();
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
		csvHelperEClass = createEClass(CSV_HELPER);
		createEOperation(csvHelperEClass, CSV_HELPER___GET_STORES__STRING);
		createEOperation(csvHelperEClass, CSV_HELPER___GET_CUSTOMERS__STRING);
		createEOperation(csvHelperEClass, CSV_HELPER___GET_USERS__STRING);
		createEOperation(csvHelperEClass, CSV_HELPER___GET_ENTERPRISES__STRING);
		createEOperation(csvHelperEClass, CSV_HELPER___GET_STOCK_ITEMS__STRING);
		createEOperation(csvHelperEClass, CSV_HELPER___GET_PRODUCTS__STRING);
		createEOperation(csvHelperEClass, CSV_HELPER___GET_PRODUCT_SUPPLIERS__STRING);
		createEOperation(csvHelperEClass, CSV_HELPER___GET_PRODUCT_ORDERS__STRING);

		messageToCSVEClass = createEClass(MESSAGE_TO_CSV);
		createEAttribute(messageToCSVEClass, MESSAGE_TO_CSV__MESSAGE);
		createEOperation(messageToCSVEClass, MESSAGE_TO_CSV___GET_CSV);

		parserPostMessageEClass = createEClass(PARSER_POST_MESSAGE);
		createEAttribute(parserPostMessageEClass, PARSER_POST_MESSAGE__RESPONSE);
		createEAttribute(parserPostMessageEClass, PARSER_POST_MESSAGE__MESSAGE);
		createEAttribute(parserPostMessageEClass, PARSER_POST_MESSAGE__TIME);
		createEAttribute(parserPostMessageEClass, PARSER_POST_MESSAGE__LEBEL);
		createEAttribute(parserPostMessageEClass, PARSER_POST_MESSAGE__STATUS);
		createEAttribute(parserPostMessageEClass, PARSER_POST_MESSAGE__DESCRIPTION);
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
		UtilPackage theUtilPackage = (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);
		ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage theStorePackage_2 = (ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage)EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage.eNS_URI);
		ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage theUsermanagerPackage_1 = (ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage)EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage.eNS_URI);
		EnterprisePackage theEnterprisePackage = (EnterprisePackage)EPackage.Registry.INSTANCE.getEPackage(EnterprisePackage.eNS_URI);
		ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage theEnterprisePackage_1 = (ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage)EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage.eNS_URI);
		ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.StorePackage theStorePackage_1 = (ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.StorePackage)EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.StorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(csvHelperEClass, CSVHelper.class, "CSVHelper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getCSVHelper__GetStores__String(), null, "getStores", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "input", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(theUtilPackage.getCollection());
		EGenericType g2 = createEGenericType(theStorePackage_2.getIStore());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getCSVHelper__GetCustomers__String(), null, "getCustomers", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "input", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getCollection());
		g2 = createEGenericType(theUsermanagerPackage_1.getICustomer());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getCSVHelper__GetUsers__String(), null, "getUsers", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "input", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getCollection());
		g2 = createEGenericType(theUsermanagerPackage_1.getIUser());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getCSVHelper__GetEnterprises__String(), null, "getEnterprises", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "input", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getCollection());
		g2 = createEGenericType(theEnterprisePackage.getITradingEnterprise());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getCSVHelper__GetStockItems__String(), null, "getStockItems", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "input", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getCollection());
		g2 = createEGenericType(theStorePackage_2.getIStockItem());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getCSVHelper__GetProducts__String(), null, "getProducts", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "input", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getCollection());
		g2 = createEGenericType(theEnterprisePackage_1.getIProduct());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getCSVHelper__GetProductSuppliers__String(), null, "getProductSuppliers", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "input", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getCollection());
		g2 = createEGenericType(theEnterprisePackage.getIProductSupplier());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getCSVHelper__GetProductOrders__String(), null, "getProductOrders", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "input", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getCollection());
		g2 = createEGenericType(theStorePackage_1.getIProductOrder());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(messageToCSVEClass, MessageToCSV.class, "MessageToCSV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageToCSV_Message(), ecorePackage.getEString(), "message", null, 0, 1, MessageToCSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMessageToCSV__GetCSV(), ecorePackage.getEString(), "getCSV", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(parserPostMessageEClass, ParserPostMessage.class, "ParserPostMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParserPostMessage_Response(), ecorePackage.getEString(), "response", null, 0, 1, ParserPostMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParserPostMessage_Message(), ecorePackage.getEString(), "message", null, 0, 1, ParserPostMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParserPostMessage_Time(), ecorePackage.getEString(), "time", null, 0, 1, ParserPostMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParserPostMessage_Lebel(), ecorePackage.getEString(), "lebel", null, 0, 1, ParserPostMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParserPostMessage_Status(), ecorePackage.getEString(), "status", null, 0, 1, ParserPostMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParserPostMessage_Description(), ecorePackage.getEString(), "description", null, 0, 1, ParserPostMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ParsingPackageImpl
