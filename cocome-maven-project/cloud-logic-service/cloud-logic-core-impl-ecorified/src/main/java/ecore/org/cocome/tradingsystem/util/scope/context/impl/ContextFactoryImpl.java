package ecore.org.cocome.tradingsystem.util.scope.context.impl;

import org.cocome.tradingsystem.util.scope.context.NamedSessionContext;
import org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ecore.org.cocome.tradingsystem.util.scope.context.ContextFactory;
import ecore.org.cocome.tradingsystem.util.scope.context.ContextPackage;

/**
 * An implementation of the model <b>Factory</b>.
 * @generated
 */
public class ContextFactoryImpl extends EFactoryImpl implements ContextFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ContextFactory init() {
        try {
            ContextFactory theContextFactory = (ContextFactory)EPackage.Registry.INSTANCE.getEFactory(ContextPackage.eNS_URI);
            if (theContextFactory != null) {
                return theContextFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ContextFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * @generated
     */
    public ContextFactoryImpl() {
        super();
    }

    /**
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
			case ContextPackage.NAMED_SESSION_CONTEXT: return createNamedSessionContext();
			case ContextPackage.NAMED_SESSION_CONTEXT_HOLDER: return createNamedSessionContextHolder();
			default:
			    throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
			     }
			 }
	
	/**
	 * @generated
	 */
	public NamedSessionContext createNamedSessionContext() {
		return new NamedSessionContext(); // origin code instance
	}			
	
	/**
	 * @generated
	 */
	public NamedSessionContextHolder createNamedSessionContextHolder() {
		return new NamedSessionContextHolder(); // origin code instance
	}	
	
	/**
	 * @generated
	 */
	public ContextPackage getContextPackage() {
	return (ContextPackage)getEPackage();
	}

    /**
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ContextPackage getPackage() {
        return ContextPackage.eINSTANCE;
    }
    
} //ContextFactoryImpl
