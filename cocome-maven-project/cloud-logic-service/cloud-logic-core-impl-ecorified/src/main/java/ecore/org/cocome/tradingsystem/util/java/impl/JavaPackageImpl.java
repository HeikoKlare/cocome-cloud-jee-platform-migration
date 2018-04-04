/**
 */
package ecore.org.cocome.tradingsystem.util.java.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;
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
import ecore.org.cocome.tradingsystem.remote.access.parsing.ParsingPackage;
import ecore.org.cocome.tradingsystem.remote.access.parsing.impl.ParsingPackageImpl;
import ecore.org.cocome.tradingsystem.util.java.Assert;
import ecore.org.cocome.tradingsystem.util.java.DualElement;
import ecore.org.cocome.tradingsystem.util.java.DualIterator;
import ecore.org.cocome.tradingsystem.util.java.Iterables;
import ecore.org.cocome.tradingsystem.util.java.JavaFactory;
import ecore.org.cocome.tradingsystem.util.java.JavaPackage;
import ecore.org.cocome.tradingsystem.util.java.Lists;
import ecore.org.cocome.tradingsystem.util.java.Maps;
import ecore.org.cocome.tradingsystem.util.java.Reflection;
import ecore.org.cocome.tradingsystem.util.java.Sets;
import ecore.org.cocome.tradingsystem.util.java.Swing;
import ecore.org.cocome.tradingsystem.util.java.TimeSpan;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaPackageImpl extends EPackageImpl implements JavaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dualElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dualIteratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iterablesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reflectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeSpanEClass = null;

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
	 * @see ecore.org.cocome.tradingsystem.util.java.JavaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JavaPackageImpl() {
		super(eNS_URI, JavaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link JavaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JavaPackage init() {
		if (isInited) return (JavaPackage)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI);

		// Obtain or create and register package
		JavaPackageImpl theJavaPackage = (JavaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JavaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JavaPackageImpl());

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
		ParsingPackageImpl theParsingPackage = (ParsingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ParsingPackage.eNS_URI) instanceof ParsingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ParsingPackage.eNS_URI) : ParsingPackage.eINSTANCE);
		ecore.org.cocome.tradingsystem.util.scope.impl.ScopePackageImpl theScopePackage_1 = (ecore.org.cocome.tradingsystem.util.scope.impl.ScopePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.util.scope.ScopePackage.eNS_URI) instanceof ecore.org.cocome.tradingsystem.util.scope.impl.ScopePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.util.scope.ScopePackage.eNS_URI) : ecore.org.cocome.tradingsystem.util.scope.ScopePackage.eINSTANCE);
		ecore.org.cocome.tradingsystem.util.scope.context.impl.ContextPackageImpl theContextPackage_1 = (ecore.org.cocome.tradingsystem.util.scope.context.impl.ContextPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.util.scope.context.ContextPackage.eNS_URI) instanceof ecore.org.cocome.tradingsystem.util.scope.context.impl.ContextPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.cocome.tradingsystem.util.scope.context.ContextPackage.eNS_URI) : ecore.org.cocome.tradingsystem.util.scope.context.ContextPackage.eINSTANCE);

		// Create package meta-data objects
		theJavaPackage.createPackageContents();
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
		theParsingPackage.createPackageContents();
		theScopePackage_1.createPackageContents();
		theContextPackage_1.createPackageContents();

		// Initialize created meta-data
		theJavaPackage.initializePackageContents();
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
		theParsingPackage.initializePackageContents();
		theScopePackage_1.initializePackageContents();
		theContextPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJavaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JavaPackage.eNS_URI, theJavaPackage);
		return theJavaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssert() {
		return assertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDualElement() {
		return dualElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDualElement_Elem1() {
		return (EAttribute)dualElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDualElement_Elem2() {
		return (EAttribute)dualElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDualElement__GetFirstElement() {
		return dualElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDualElement__GetSecondElement() {
		return dualElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDualIterator() {
		return dualIteratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDualIterator_Coll1() {
		return (EAttribute)dualIteratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDualIterator_Coll2() {
		return (EAttribute)dualIteratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDualIterator_Iterator1() {
		return (EAttribute)dualIteratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDualIterator_Iterator2() {
		return (EAttribute)dualIteratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDualIterator_CurrElement1() {
		return (EAttribute)dualIteratorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDualIterator_CurrElement2() {
		return (EAttribute)dualIteratorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDualIterator__Iterator() {
		return dualIteratorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIterables() {
		return iterablesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLists() {
		return listsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaps() {
		return mapsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReflection() {
		return reflectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSets() {
		return setsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwing() {
		return swingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeSpan() {
		return timeSpanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeSpan___value() {
		return (EAttribute)timeSpanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeSpan___unit() {
		return (EAttribute)timeSpanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeSpan__GetDuration__TimeUnit() {
		return timeSpanEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeSpan__Equals__Object() {
		return timeSpanEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeSpan__HashCode() {
		return timeSpanEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeSpan__CompareTo__TimeSpan() {
		return timeSpanEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaFactory getJavaFactory() {
		return (JavaFactory)getEFactoryInstance();
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
		assertEClass = createEClass(ASSERT);

		dualElementEClass = createEClass(DUAL_ELEMENT);
		createEAttribute(dualElementEClass, DUAL_ELEMENT__ELEM1);
		createEAttribute(dualElementEClass, DUAL_ELEMENT__ELEM2);
		createEOperation(dualElementEClass, DUAL_ELEMENT___GET_FIRST_ELEMENT);
		createEOperation(dualElementEClass, DUAL_ELEMENT___GET_SECOND_ELEMENT);

		dualIteratorEClass = createEClass(DUAL_ITERATOR);
		createEAttribute(dualIteratorEClass, DUAL_ITERATOR__COLL1);
		createEAttribute(dualIteratorEClass, DUAL_ITERATOR__COLL2);
		createEAttribute(dualIteratorEClass, DUAL_ITERATOR__ITERATOR1);
		createEAttribute(dualIteratorEClass, DUAL_ITERATOR__ITERATOR2);
		createEAttribute(dualIteratorEClass, DUAL_ITERATOR__CURR_ELEMENT1);
		createEAttribute(dualIteratorEClass, DUAL_ITERATOR__CURR_ELEMENT2);
		createEOperation(dualIteratorEClass, DUAL_ITERATOR___ITERATOR);

		iterablesEClass = createEClass(ITERABLES);

		listsEClass = createEClass(LISTS);

		mapsEClass = createEClass(MAPS);

		reflectionEClass = createEClass(REFLECTION);

		setsEClass = createEClass(SETS);

		swingEClass = createEClass(SWING);

		timeSpanEClass = createEClass(TIME_SPAN);
		createEAttribute(timeSpanEClass, TIME_SPAN__VALUE);
		createEAttribute(timeSpanEClass, TIME_SPAN__UNIT);
		createEOperation(timeSpanEClass, TIME_SPAN___GET_DURATION__TIMEUNIT);
		createEOperation(timeSpanEClass, TIME_SPAN___EQUALS__OBJECT);
		createEOperation(timeSpanEClass, TIME_SPAN___HASH_CODE);
		createEOperation(timeSpanEClass, TIME_SPAN___COMPARE_TO__TIMESPAN);
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
		ConcurrentPackage theConcurrentPackage = (ConcurrentPackage)EPackage.Registry.INSTANCE.getEPackage(ConcurrentPackage.eNS_URI);

		// Create type parameters
		ETypeParameter dualElementEClass_T = addETypeParameter(dualElementEClass, "T");
		ETypeParameter dualElementEClass_E = addETypeParameter(dualElementEClass, "E");
		ETypeParameter dualIteratorEClass_T = addETypeParameter(dualIteratorEClass, "T");
		ETypeParameter dualIteratorEClass_E = addETypeParameter(dualIteratorEClass, "E");

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(assertEClass, Assert.class, "Assert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dualElementEClass, DualElement.class, "DualElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		EGenericType g1 = createEGenericType(dualElementEClass_T);
		initEAttribute(getDualElement_Elem1(), g1, "elem1", null, 0, 1, DualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(dualElementEClass_E);
		initEAttribute(getDualElement_Elem2(), g1, "elem2", null, 0, 1, DualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getDualElement__GetFirstElement(), null, "getFirstElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(dualElementEClass_T);
		initEOperation(op, g1);

		op = initEOperation(getDualElement__GetSecondElement(), null, "getSecondElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(dualElementEClass_E);
		initEOperation(op, g1);

		initEClass(dualIteratorEClass, DualIterator.class, "DualIterator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(theUtilPackage.getCollection());
		EGenericType g2 = createEGenericType(dualIteratorEClass_T);
		g1.getETypeArguments().add(g2);
		initEAttribute(getDualIterator_Coll1(), g1, "coll1", null, 0, 1, DualIterator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getCollection());
		g2 = createEGenericType(dualIteratorEClass_E);
		g1.getETypeArguments().add(g2);
		initEAttribute(getDualIterator_Coll2(), g1, "coll2", null, 0, 1, DualIterator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getIterator());
		g2 = createEGenericType(dualIteratorEClass_T);
		g1.getETypeArguments().add(g2);
		initEAttribute(getDualIterator_Iterator1(), g1, "iterator1", null, 0, 1, DualIterator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getIterator());
		g2 = createEGenericType(dualIteratorEClass_E);
		g1.getETypeArguments().add(g2);
		initEAttribute(getDualIterator_Iterator2(), g1, "iterator2", null, 0, 1, DualIterator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(dualIteratorEClass_T);
		initEAttribute(getDualIterator_CurrElement1(), g1, "currElement1", null, 0, 1, DualIterator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(dualIteratorEClass_E);
		initEAttribute(getDualIterator_CurrElement2(), g1, "currElement2", null, 0, 1, DualIterator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDualIterator__Iterator(), null, "iterator", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getIterator());
		g2 = createEGenericType(this.getDualElement());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(dualIteratorEClass_T);
		g2.getETypeArguments().add(g3);
		g3 = createEGenericType(dualIteratorEClass_E);
		g2.getETypeArguments().add(g3);
		initEOperation(op, g1);

		initEClass(iterablesEClass, Iterables.class, "Iterables", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listsEClass, Lists.class, "Lists", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mapsEClass, Maps.class, "Maps", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reflectionEClass, Reflection.class, "Reflection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setsEClass, Sets.class, "Sets", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(swingEClass, Swing.class, "Swing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeSpanEClass, TimeSpan.class, "TimeSpan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeSpan___value(), ecorePackage.getELong(), "__value", null, 0, 1, TimeSpan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeSpan___unit(), theConcurrentPackage.getTimeUnit(), "__unit", null, 0, 1, TimeSpan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTimeSpan__GetDuration__TimeUnit(), ecorePackage.getELong(), "getDuration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theConcurrentPackage.getTimeUnit(), "unit", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTimeSpan__Equals__Object(), ecorePackage.getEBoolean(), "equals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTimeSpan__HashCode(), ecorePackage.getEInt(), "hashCode", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTimeSpan__CompareTo__TimeSpan(), ecorePackage.getEInt(), "compareTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTimeSpan(), "that", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //JavaPackageImpl
