package unification.org.cocome.tradingsystem.inventory.data.usermanager

import ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer
import ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerFactoryOld
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl
import org.eclipse.xtend.lib.annotations.Delegate
import edu.kit.ipd.sdq.activextendannotations.DelegateExcept
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.emf.ecore.InternalEObject

/**
 * Unification class for the class Customer
 */
class UnifiedCustomer extends MinimalEObjectImpl.Container implements Customer {
	
	@Delegate
	protected var Customer ecoreImplementation
	
	// Methods of InternalEObject must also be delegated to the wrapped class
	@DelegateExcept(Notifier, EObject)
	protected var InternalEObject internalEcoreImplementation

	new() {
		ecoreImplementation = instance
		internalEcoreImplementation = ecoreImplementation as InternalEObject
	}
	
	def protected Customer getInstance() {
		return UsermanagerFactoryOld.eINSTANCE.createCustomer
	}
}
