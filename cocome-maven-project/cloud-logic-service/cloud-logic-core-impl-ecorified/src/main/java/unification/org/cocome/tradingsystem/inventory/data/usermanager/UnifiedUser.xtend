package unification.org.cocome.tradingsystem.inventory.data.usermanager

import ecore.org.cocome.tradingsystem.inventory.data.usermanager.User
import ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerFactoryOld
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl
import org.eclipse.xtend.lib.annotations.Delegate
import edu.kit.ipd.sdq.activextendannotations.DelegateExcept
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.emf.ecore.InternalEObject

/**
 * Unification class for the class User
 */
class UnifiedUser extends MinimalEObjectImpl.Container implements User {
	
	@Delegate
	protected var User ecoreImplementation
	
	// Methods of InternalEObject must also be delegated to the wrapped class
	@DelegateExcept(Notifier, EObject)
	protected var InternalEObject internalEcoreImplementation

	new() {
		ecoreImplementation = instance
		internalEcoreImplementation = ecoreImplementation as InternalEObject
	}
	
	def protected User getInstance() {
		return UsermanagerFactoryOld.eINSTANCE.createUser
	}
}
