package unification.org.cocome.tradingsystem.inventory.data.store

import ecore.org.cocome.tradingsystem.inventory.data.store.OrderEntry
import ecore.org.cocome.tradingsystem.inventory.data.store.StoreFactoryOld
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl
import org.eclipse.xtend.lib.annotations.Delegate
import edu.kit.ipd.sdq.activextendannotations.DelegateExcept
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.emf.ecore.InternalEObject

/**
 * Unification class for the class OrderEntry
 */
class UnifiedOrderEntry extends MinimalEObjectImpl.Container implements OrderEntry {
	
	@Delegate
	protected var OrderEntry ecoreImplementation
	
	// Methods of InternalEObject must also be delegated to the wrapped class
	@DelegateExcept(Notifier, EObject)
	protected var InternalEObject internalEcoreImplementation

	new() {
		ecoreImplementation = instance
		internalEcoreImplementation = ecoreImplementation as InternalEObject
	}
	
	def protected OrderEntry getInstance() {
		return StoreFactoryOld.eINSTANCE.createOrderEntry
	}
}
