package unification.org.cocome.tradingsystem.inventory.data.enterprise

import ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseDatatypesFactory
import ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseFactoryOld
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl
import org.eclipse.xtend.lib.annotations.Delegate
import edu.kit.ipd.sdq.activextendannotations.DelegateExcept
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.emf.ecore.InternalEObject

/**
 * Unification class for the class EnterpriseDatatypesFactory
 */
class UnifiedEnterpriseDatatypesFactory extends MinimalEObjectImpl.Container implements EnterpriseDatatypesFactory {
	
	@Delegate
	protected var EnterpriseDatatypesFactory ecoreImplementation
	
	// Methods of InternalEObject must also be delegated to the wrapped class
	@DelegateExcept(Notifier, EObject)
	protected var InternalEObject internalEcoreImplementation

	new() {
		ecoreImplementation = instance
		internalEcoreImplementation = ecoreImplementation as InternalEObject
	}
	
	def protected EnterpriseDatatypesFactory getInstance() {
		return EnterpriseFactoryOld.eINSTANCE.createEnterpriseDatatypesFactory
	}
}
