package ecore.org.cocome.tradingsystem.util.scope.impl;

import org.cocome.tradingsystem.util.scope.CashDeskRegistry;
import org.cocome.tradingsystem.util.scope.CashDeskRegistryFactory;
import org.cocome.tradingsystem.util.scope.CashDeskSessionScopeExtension;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ecore.org.cocome.tradingsystem.util.scope.ScopeFactory;
import ecore.org.cocome.tradingsystem.util.scope.ScopePackage;

/**
 * An implementation of the model <b>Factory</b>.
 * @generated
 */
public class ScopeFactoryImpl extends EFactoryImpl implements ScopeFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ScopeFactory init() {
        try {
            ScopeFactory theScopeFactory = (ScopeFactory)EPackage.Registry.INSTANCE.getEFactory(ScopePackage.eNS_URI);
            if (theScopeFactory != null) {
                return theScopeFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ScopeFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * @generated
     */
    public ScopeFactoryImpl() {
        super();
    }

    /**
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
			case ScopePackage.CASH_DESK_REGISTRY: return createCashDeskRegistry();
			case ScopePackage.CASH_DESK_REGISTRY_FACTORY: return createCashDeskRegistryFactory();
			case ScopePackage.CASH_DESK_SESSION_SCOPE_EXTENSION: return createCashDeskSessionScopeExtension();
			default:
			    throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
			     }
			 }
	
	/**
	 * @generated
	 */
	public CashDeskRegistry createCashDeskRegistry() {
		return new CashDeskRegistry(); // origin code instance
	}			
	
	/**
	 * @generated
	 */
	public CashDeskRegistryFactory createCashDeskRegistryFactory() {
		return new CashDeskRegistryFactory(); // origin code instance
	}			
	
	/**
	 * @generated
	 */
	public CashDeskSessionScopeExtension createCashDeskSessionScopeExtension() {
		return new CashDeskSessionScopeExtension(); // origin code instance
	}	
	
	/**
	 * @generated
	 */
	public ScopePackage getScopePackage() {
	return (ScopePackage)getEPackage();
	}

    /**
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ScopePackage getPackage() {
        return ScopePackage.eINSTANCE;
    }
    
} //ScopeFactoryImpl
