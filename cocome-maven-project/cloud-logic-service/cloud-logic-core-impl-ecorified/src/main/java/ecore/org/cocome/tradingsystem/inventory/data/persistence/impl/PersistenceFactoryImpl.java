package ecore.org.cocome.tradingsystem.inventory.data.persistence.impl;

import org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext;
import org.cocome.tradingsystem.inventory.data.persistence.ServiceAdapterEntityConverter;
import org.cocome.tradingsystem.inventory.data.persistence.ServiceAdapterHeaders;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ecore.org.cocome.tradingsystem.inventory.data.persistence.PersistenceFactory;
import ecore.org.cocome.tradingsystem.inventory.data.persistence.PersistencePackage;

/**
 * An implementation of the model <b>Factory</b>.
 * @generated
 */
public class PersistenceFactoryImpl extends EFactoryImpl implements PersistenceFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static PersistenceFactory init() {
        try {
            PersistenceFactory thePersistenceFactory = (PersistenceFactory)EPackage.Registry.INSTANCE.getEFactory(PersistencePackage.eNS_URI);
            if (thePersistenceFactory != null) {
                return thePersistenceFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new PersistenceFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * @generated
     */
    public PersistenceFactoryImpl() {
        super();
    }

    /**
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
			case PersistencePackage.CLOUD_PERSISTENCE_CONTEXT: return createCloudPersistenceContext();
			case PersistencePackage.SERVICE_ADAPTER_ENTITY_CONVERTER: return createServiceAdapterEntityConverter();
			case PersistencePackage.SERVICE_ADAPTER_HEADERS: return createServiceAdapterHeaders();
			default:
			    throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
			     }
			 }
	
	/**
	 * @generated
	 */
	public CloudPersistenceContext createCloudPersistenceContext() {
		return new CloudPersistenceContext(); // origin code instance
	}			
	
	/**
	 * @generated
	 */
	public ServiceAdapterEntityConverter createServiceAdapterEntityConverter() {
		return new ServiceAdapterEntityConverter(); // origin code instance
	}			
	
	/**
	 * @generated
	 */
	public ServiceAdapterHeaders createServiceAdapterHeaders() {
		return new ServiceAdapterHeaders(); // origin code instance
	}	
	
	/**
	 * @generated
	 */
	public PersistencePackage getPersistencePackage() {
	return (PersistencePackage)getEPackage();
	}

    /**
     * @deprecated
     * @generated
     */
    @Deprecated
    public static PersistencePackage getPackage() {
        return PersistencePackage.eINSTANCE;
    }
    
} //PersistenceFactoryImpl
