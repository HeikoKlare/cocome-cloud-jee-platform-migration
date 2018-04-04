/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.persistence.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

import ecore.org.cocome.tradingsystem.inventory.data.persistence.CloudPersistenceContext;
import ecore.org.cocome.tradingsystem.inventory.data.persistence.PersistenceFactoryOld;
import ecore.org.cocome.tradingsystem.inventory.data.persistence.PersistencePackage;
import ecore.org.cocome.tradingsystem.inventory.data.persistence.ServiceAdapterEntityConverter;
import ecore.org.cocome.tradingsystem.inventory.data.persistence.ServiceAdapterHeaders;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PersistenceFactoryImplOld extends EFactoryImpl implements PersistenceFactoryOld {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PersistenceFactoryOld init() {
		return new PersistenceFactoryImplOld();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceFactoryImplOld() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudPersistenceContext createCloudPersistenceContext() {
		CloudPersistenceContextImpl cloudPersistenceContext = new CloudPersistenceContextImpl();
		return cloudPersistenceContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceAdapterEntityConverter createServiceAdapterEntityConverter() {
		ServiceAdapterEntityConverterImpl serviceAdapterEntityConverter = new ServiceAdapterEntityConverterImpl();
		return serviceAdapterEntityConverter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceAdapterHeaders createServiceAdapterHeaders() {
		ServiceAdapterHeadersImpl serviceAdapterHeaders = new ServiceAdapterHeadersImpl();
		return serviceAdapterHeaders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistencePackage getPersistencePackage() {
		return (PersistencePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PersistencePackage getPackage() {
		return PersistencePackage.eINSTANCE;
	}

} //PersistenceFactoryImpl
