/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl;

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
import ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.StorePackage;
import ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.impl.StorePackageImpl;
import ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.credentials.CredentialsPackage;
import ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.credentials.impl.CredentialsPackageImpl;
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
import ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer;
import ecore.org.cocome.tradingsystem.inventory.data.usermanager.User;
import ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerDatatypesFactory;
import ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerFactory;
import ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage;
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
public class UsermanagerPackageImpl extends EPackageImpl implements UsermanagerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usermanagerDatatypesFactoryEClass = null;

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
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UsermanagerPackageImpl() {
		super(eNS_URI, UsermanagerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UsermanagerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UsermanagerPackage init() {
		if (isInited) return (UsermanagerPackage)EPackage.Registry.INSTANCE.getEPackage(UsermanagerPackage.eNS_URI);

		// Obtain or create and register package
		UsermanagerPackageImpl theUsermanagerPackage = (UsermanagerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UsermanagerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UsermanagerPackageImpl());

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
		ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.impl.UsermanagerPackageImpl theUsermanagerPackage_1 = (ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.impl.UsermanagerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.UsermanagerPackage.eNS_URI) instanceof ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.impl.UsermanagerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.UsermanagerPackage.eNS_URI) : ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.UsermanagerPackage.eINSTANCE);
		CredentialsPackageImpl theCredentialsPackage = (CredentialsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CredentialsPackage.eNS_URI) instanceof CredentialsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CredentialsPackage.eNS_URI) : CredentialsPackage.eINSTANCE);
		EnterprisePackageImpl theEnterprisePackage = (EnterprisePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnterprisePackage.eNS_URI) instanceof EnterprisePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnterprisePackage.eNS_URI) : EnterprisePackage.eINSTANCE);
		PersistencePackageImpl thePersistencePackage = (PersistencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PersistencePackage.eNS_URI) instanceof PersistencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PersistencePackage.eNS_URI) : PersistencePackage.eINSTANCE);
		ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl theStorePackage_1 = (ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.StorePackage.eNS_URI) instanceof ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.StorePackage.eNS_URI) : ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.StorePackage.eINSTANCE);
		ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl theUsermanagerPackage_2 = (ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage.eNS_URI) instanceof ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage.eNS_URI) : ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage.eINSTANCE);
		ExceptionPackageImpl theExceptionPackage = (ExceptionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExceptionPackage.eNS_URI) instanceof ExceptionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExceptionPackage.eNS_URI) : ExceptionPackage.eINSTANCE);
		ScopePackageImpl theScopePackage = (ScopePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScopePackage.eNS_URI) instanceof ScopePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScopePackage.eNS_URI) : ScopePackage.eINSTANCE);
		NamedSessionContextHolderPackageImpl theNamedSessionContextHolderPackage = (NamedSessionContextHolderPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NamedSessionContextHolderPackage.eNS_URI) instanceof NamedSessionContextHolderPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NamedSessionContextHolderPackage.eNS_URI) : NamedSessionContextHolderPackage.eINSTANCE);
		ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterprisePackageImpl theEnterprisePackage_1 = (ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterprisePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage.eNS_URI) instanceof ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterprisePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage.eNS_URI) : ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage.eINSTANCE);
		ecore.org.cocome.tradingsystem.inventory.data.persistence.impl.PersistencePackageImpl thePersistencePackage_1 = (ecore.org.cocome.tradingsystem.inventory.data.persistence.impl.PersistencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.persistence.PersistencePackage.eNS_URI) instanceof ecore.org.cocome.tradingsystem.inventory.data.persistence.impl.PersistencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.persistence.PersistencePackage.eNS_URI) : ecore.org.cocome.tradingsystem.inventory.data.persistence.PersistencePackage.eINSTANCE);
		ecore.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl theStorePackage_2 = (ecore.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage.eNS_URI) instanceof ecore.org.cocome.tradingsystem.inventory.data.store.impl.StorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage.eNS_URI) : ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage.eINSTANCE);
		ConnectionPackageImpl theConnectionPackage = (ConnectionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConnectionPackage.eNS_URI) instanceof ConnectionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConnectionPackage.eNS_URI) : ConnectionPackage.eINSTANCE);
		ParsingPackageImpl theParsingPackage = (ParsingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ParsingPackage.eNS_URI) instanceof ParsingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ParsingPackage.eNS_URI) : ParsingPackage.eINSTANCE);
		JavaPackageImpl theJavaPackage = (JavaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI) instanceof JavaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI) : JavaPackage.eINSTANCE);
		ecore.org.cocome.tradingsystem.util.scope.impl.ScopePackageImpl theScopePackage_1 = (ecore.org.cocome.tradingsystem.util.scope.impl.ScopePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.util.scope.ScopePackage.eNS_URI) instanceof ecore.org.cocome.tradingsystem.util.scope.impl.ScopePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.util.scope.ScopePackage.eNS_URI) : ecore.org.cocome.tradingsystem.util.scope.ScopePackage.eINSTANCE);
		ecore.org.cocome.tradingsystem.util.scope.context.impl.ContextPackageImpl theContextPackage_1 = (ecore.org.cocome.tradingsystem.util.scope.context.impl.ContextPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.util.scope.context.ContextPackage.eNS_URI) instanceof ecore.org.cocome.tradingsystem.util.scope.context.impl.ContextPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.util.scope.context.ContextPackage.eNS_URI) : ecore.org.cocome.tradingsystem.util.scope.context.ContextPackage.eINSTANCE);

		// Create package meta-data objects
		theUsermanagerPackage.createPackageContents();
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
		theUsermanagerPackage_1.createPackageContents();
		theCredentialsPackage.createPackageContents();
		theEnterprisePackage.createPackageContents();
		thePersistencePackage.createPackageContents();
		theStorePackage_1.createPackageContents();
		theUsermanagerPackage_2.createPackageContents();
		theExceptionPackage.createPackageContents();
		theScopePackage.createPackageContents();
		theNamedSessionContextHolderPackage.createPackageContents();
		theEnterprisePackage_1.createPackageContents();
		thePersistencePackage_1.createPackageContents();
		theStorePackage_2.createPackageContents();
		theConnectionPackage.createPackageContents();
		theParsingPackage.createPackageContents();
		theJavaPackage.createPackageContents();
		theScopePackage_1.createPackageContents();
		theContextPackage_1.createPackageContents();

		// Initialize created meta-data
		theUsermanagerPackage.initializePackageContents();
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
		theUsermanagerPackage_1.initializePackageContents();
		theCredentialsPackage.initializePackageContents();
		theEnterprisePackage.initializePackageContents();
		thePersistencePackage.initializePackageContents();
		theStorePackage_1.initializePackageContents();
		theUsermanagerPackage_2.initializePackageContents();
		theExceptionPackage.initializePackageContents();
		theScopePackage.initializePackageContents();
		theNamedSessionContextHolderPackage.initializePackageContents();
		theEnterprisePackage_1.initializePackageContents();
		thePersistencePackage_1.initializePackageContents();
		theStorePackage_2.initializePackageContents();
		theConnectionPackage.initializePackageContents();
		theParsingPackage.initializePackageContents();
		theJavaPackage.initializePackageContents();
		theScopePackage_1.initializePackageContents();
		theContextPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUsermanagerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UsermanagerPackage.eNS_URI, theUsermanagerPackage);
		return theUsermanagerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomer() {
		return customerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_Id() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_FirstName() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_LastName() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_MailAddress() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_CreditCardInfoSet() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomer_PreferredStore() {
		return (EReference)customerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_User() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__GetCreditCardInfo() {
		return customerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__SetCreditCardInfo__Set() {
		return customerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__AddCreditCardInfo__String() {
		return customerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__RemoveCreditCardInfo__String() {
		return customerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Username() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Credentials() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Roles() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__InitUser() {
		return userEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__InitUser__UserTO() {
		return userEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__AddCredential__ICredential() {
		return userEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__RemoveCredential__CredentialType() {
		return userEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__CheckCredential__ICredential() {
		return userEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__CheckUserCredentials__IUser() {
		return userEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__HasRole__Role() {
		return userEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__AddRole__Role() {
		return userEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__WithdrawRole__Role() {
		return userEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__ResetCredential__CredentialType() {
		return userEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__GetCredential__CredentialType() {
		return userEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsermanagerDatatypesFactory() {
		return usermanagerDatatypesFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUsermanagerDatatypesFactory__GetNewUser() {
		return usermanagerDatatypesFactoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUsermanagerDatatypesFactory__FillCustomerWithStoreTO__ICustomer() {
		return usermanagerDatatypesFactoryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUsermanagerDatatypesFactory__FillCredentialTO__ICredential() {
		return usermanagerDatatypesFactoryEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUsermanagerDatatypesFactory__FillUserTO__IUser() {
		return usermanagerDatatypesFactoryEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUsermanagerDatatypesFactory__ConvertToUser__UserTO() {
		return usermanagerDatatypesFactoryEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUsermanagerDatatypesFactory__GetNewCustomer() {
		return usermanagerDatatypesFactoryEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsermanagerFactory getUsermanagerFactory() {
		return (UsermanagerFactory)getEFactoryInstance();
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
		customerEClass = createEClass(CUSTOMER);
		createEAttribute(customerEClass, CUSTOMER__ID);
		createEAttribute(customerEClass, CUSTOMER__FIRST_NAME);
		createEAttribute(customerEClass, CUSTOMER__LAST_NAME);
		createEAttribute(customerEClass, CUSTOMER__MAIL_ADDRESS);
		createEAttribute(customerEClass, CUSTOMER__CREDIT_CARD_INFO_SET);
		createEReference(customerEClass, CUSTOMER__PREFERRED_STORE);
		createEAttribute(customerEClass, CUSTOMER__USER);
		createEOperation(customerEClass, CUSTOMER___GET_CREDIT_CARD_INFO);
		createEOperation(customerEClass, CUSTOMER___SET_CREDIT_CARD_INFO__SET);
		createEOperation(customerEClass, CUSTOMER___ADD_CREDIT_CARD_INFO__STRING);
		createEOperation(customerEClass, CUSTOMER___REMOVE_CREDIT_CARD_INFO__STRING);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__USERNAME);
		createEAttribute(userEClass, USER__CREDENTIALS);
		createEAttribute(userEClass, USER__ROLES);
		createEOperation(userEClass, USER___INIT_USER);
		createEOperation(userEClass, USER___INIT_USER__USERTO);
		createEOperation(userEClass, USER___ADD_CREDENTIAL__ICREDENTIAL);
		createEOperation(userEClass, USER___REMOVE_CREDENTIAL__CREDENTIALTYPE);
		createEOperation(userEClass, USER___CHECK_CREDENTIAL__ICREDENTIAL);
		createEOperation(userEClass, USER___CHECK_USER_CREDENTIALS__IUSER);
		createEOperation(userEClass, USER___HAS_ROLE__ROLE);
		createEOperation(userEClass, USER___ADD_ROLE__ROLE);
		createEOperation(userEClass, USER___WITHDRAW_ROLE__ROLE);
		createEOperation(userEClass, USER___RESET_CREDENTIAL__CREDENTIALTYPE);
		createEOperation(userEClass, USER___GET_CREDENTIAL__CREDENTIALTYPE);

		usermanagerDatatypesFactoryEClass = createEClass(USERMANAGER_DATATYPES_FACTORY);
		createEOperation(usermanagerDatatypesFactoryEClass, USERMANAGER_DATATYPES_FACTORY___GET_NEW_USER);
		createEOperation(usermanagerDatatypesFactoryEClass, USERMANAGER_DATATYPES_FACTORY___FILL_CUSTOMER_WITH_STORE_TO__ICUSTOMER);
		createEOperation(usermanagerDatatypesFactoryEClass, USERMANAGER_DATATYPES_FACTORY___FILL_CREDENTIAL_TO__ICREDENTIAL);
		createEOperation(usermanagerDatatypesFactoryEClass, USERMANAGER_DATATYPES_FACTORY___FILL_USER_TO__IUSER);
		createEOperation(usermanagerDatatypesFactoryEClass, USERMANAGER_DATATYPES_FACTORY___CONVERT_TO_USER__USERTO);
		createEOperation(usermanagerDatatypesFactoryEClass, USERMANAGER_DATATYPES_FACTORY___GET_NEW_CUSTOMER);
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
		ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage theUsermanagerPackage_2 = (ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage)EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage.eNS_URI);
		ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.UsermanagerPackage theUsermanagerPackage_1 = (ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.UsermanagerPackage)EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.cocome.tradingsystem.inventory.application.usermanager.UsermanagerPackage.eNS_URI);
		CredentialsPackage theCredentialsPackage = (CredentialsPackage)EPackage.Registry.INSTANCE.getEPackage(CredentialsPackage.eNS_URI);
		StorePackage theStorePackage = (StorePackage)EPackage.Registry.INSTANCE.getEPackage(StorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomer_Id(), ecorePackage.getELong(), "id", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomer_FirstName(), ecorePackage.getEString(), "firstName", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomer_LastName(), ecorePackage.getEString(), "lastName", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomer_MailAddress(), ecorePackage.getEString(), "mailAddress", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(theUtilPackage.getSet());
		EGenericType g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEAttribute(getCustomer_CreditCardInfoSet(), g1, "creditCardInfoSet", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomer_PreferredStore(), theStorePackage_2.getIStore(), null, "preferredStore", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomer_User(), theUsermanagerPackage_2.getIUser(), "user", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getCustomer__GetCreditCardInfo(), null, "getCreditCardInfo", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getSet());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getCustomer__SetCreditCardInfo__Set(), null, "setCreditCardInfo", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getSet());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "creditCardInfo", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCustomer__AddCreditCardInfo__String(), null, "addCreditCardInfo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "creditCardInfo", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCustomer__RemoveCreditCardInfo__String(), null, "removeCreditCardInfo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "creditCardInfo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_Username(), ecorePackage.getEString(), "username", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getMap());
		g2 = createEGenericType(theUsermanagerPackage_1.getCredentialType());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theCredentialsPackage.getICredential());
		g1.getETypeArguments().add(g2);
		initEAttribute(getUser_Credentials(), g1, "credentials", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getSet());
		g2 = createEGenericType(theUsermanagerPackage_1.getRole());
		g1.getETypeArguments().add(g2);
		initEAttribute(getUser_Roles(), g1, "roles", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getUser__InitUser(), null, "initUser", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUser__InitUser__UserTO(), null, "initUser", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUsermanagerPackage_1.getUserTO(), "userTO", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUser__AddCredential__ICredential(), null, "addCredential", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCredentialsPackage.getICredential(), "credential", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUser__RemoveCredential__CredentialType(), null, "removeCredential", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUsermanagerPackage_1.getCredentialType(), "credentialType", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUser__CheckCredential__ICredential(), ecorePackage.getEBoolean(), "checkCredential", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCredentialsPackage.getICredential(), "credential", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUser__CheckUserCredentials__IUser(), ecorePackage.getEBoolean(), "checkUserCredentials", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUsermanagerPackage_2.getIUser(), "userToCheck", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUser__HasRole__Role(), ecorePackage.getEBoolean(), "hasRole", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUsermanagerPackage_1.getRole(), "role", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUser__AddRole__Role(), null, "addRole", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUsermanagerPackage_1.getRole(), "role", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUser__WithdrawRole__Role(), null, "withdrawRole", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUsermanagerPackage_1.getRole(), "role", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUser__ResetCredential__CredentialType(), ecorePackage.getEString(), "resetCredential", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUsermanagerPackage_1.getCredentialType(), "credentialType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theUsermanagerPackage_1.getCredentialTypeNotFoundException());

		op = initEOperation(getUser__GetCredential__CredentialType(), theCredentialsPackage.getICredential(), "getCredential", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUsermanagerPackage_1.getCredentialType(), "credentialType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(usermanagerDatatypesFactoryEClass, UsermanagerDatatypesFactory.class, "UsermanagerDatatypesFactory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getUsermanagerDatatypesFactory__GetNewUser(), theUsermanagerPackage_2.getIUser(), "getNewUser", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUsermanagerDatatypesFactory__FillCustomerWithStoreTO__ICustomer(), theStorePackage.getCustomerWithStoreTO(), "fillCustomerWithStoreTO", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUsermanagerPackage_2.getICustomer(), "customer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUsermanagerDatatypesFactory__FillCredentialTO__ICredential(), theUsermanagerPackage_1.getCredentialTO(), "fillCredentialTO", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCredentialsPackage.getICredential(), "credential", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUsermanagerDatatypesFactory__FillUserTO__IUser(), theUsermanagerPackage_1.getUserTO(), "fillUserTO", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUsermanagerPackage_2.getIUser(), "user", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUsermanagerDatatypesFactory__ConvertToUser__UserTO(), theUsermanagerPackage_2.getIUser(), "convertToUser", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUsermanagerPackage_1.getUserTO(), "userTO", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getUsermanagerDatatypesFactory__GetNewCustomer(), theUsermanagerPackage_2.getICustomer(), "getNewCustomer", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //UsermanagerPackageImpl
