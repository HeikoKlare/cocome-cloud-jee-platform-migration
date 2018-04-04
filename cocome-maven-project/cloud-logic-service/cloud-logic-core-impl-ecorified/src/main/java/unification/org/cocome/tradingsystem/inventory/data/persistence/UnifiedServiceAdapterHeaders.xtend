package unification.org.cocome.tradingsystem.inventory.data.persistence

import ecore.org.cocome.tradingsystem.inventory.data.persistence.ServiceAdapterHeaders
import ecore.org.cocome.tradingsystem.inventory.data.persistence.PersistenceFactoryOld
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl
import org.eclipse.xtend.lib.annotations.Delegate
import edu.kit.ipd.sdq.activextendannotations.DelegateExcept
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.emf.ecore.InternalEObject

/**
 * Unification class for the class ServiceAdapterHeaders
 */
class UnifiedServiceAdapterHeaders extends MinimalEObjectImpl.Container implements ServiceAdapterHeaders {
	
	@Delegate
	protected var ServiceAdapterHeaders ecoreImplementation
	
	// Methods of InternalEObject must also be delegated to the wrapped class
	@DelegateExcept(Notifier, EObject)
	protected var InternalEObject internalEcoreImplementation

	new() {
		ecoreImplementation = instance
		internalEcoreImplementation = ecoreImplementation as InternalEObject
	}
	
	def protected ServiceAdapterHeaders getInstance() {
		return PersistenceFactoryOld.eINSTANCE.createServiceAdapterHeaders
	}
}
