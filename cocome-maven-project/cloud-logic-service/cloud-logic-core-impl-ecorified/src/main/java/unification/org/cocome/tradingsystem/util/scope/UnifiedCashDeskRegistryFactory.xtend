package unification.org.cocome.tradingsystem.util.scope

import ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistryFactory
import ecore.org.cocome.tradingsystem.util.scope.ScopeFactoryOld
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl
import org.eclipse.xtend.lib.annotations.Delegate
import edu.kit.ipd.sdq.activextendannotations.DelegateExcept
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.emf.ecore.InternalEObject

/**
 * Unification class for the class CashDeskRegistryFactory
 */
class UnifiedCashDeskRegistryFactory extends MinimalEObjectImpl.Container implements CashDeskRegistryFactory {
	
	@Delegate
	protected var CashDeskRegistryFactory ecoreImplementation
	
	// Methods of InternalEObject must also be delegated to the wrapped class
	@DelegateExcept(Notifier, EObject)
	protected var InternalEObject internalEcoreImplementation

	new() {
		ecoreImplementation = instance
		internalEcoreImplementation = ecoreImplementation as InternalEObject
	}
	
	def protected CashDeskRegistryFactory getInstance() {
		return ScopeFactoryOld.eINSTANCE.createCashDeskRegistryFactory
	}
}
