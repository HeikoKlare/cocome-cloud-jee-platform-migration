package unification.org.cocome.tradingsystem.inventory.data.enterprise

import ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product
import ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseFactoryOld
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl
import org.eclipse.xtend.lib.annotations.Delegate
import edu.kit.ipd.sdq.activextendannotations.DelegateExcept
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.emf.ecore.InternalEObject

/**
 * Unification class for the class Product
 */
class UnifiedProduct extends MinimalEObjectImpl.Container implements Product {
	
	@Delegate
	protected var Product ecoreImplementation
	
	// Methods of InternalEObject must also be delegated to the wrapped class
	@DelegateExcept(Notifier, EObject)
	protected var InternalEObject internalEcoreImplementation

	new() {
		ecoreImplementation = instance
		internalEcoreImplementation = ecoreImplementation as InternalEObject
	}
	
	def protected Product getInstance() {
		return EnterpriseFactoryOld.eINSTANCE.createProduct
	}
}
