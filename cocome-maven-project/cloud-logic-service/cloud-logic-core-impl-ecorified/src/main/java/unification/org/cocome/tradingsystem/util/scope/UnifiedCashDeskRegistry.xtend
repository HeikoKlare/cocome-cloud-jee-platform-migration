package unification.org.cocome.tradingsystem.util.scope

import ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistry
import ecore.org.cocome.tradingsystem.util.scope.ScopeFactoryOld
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl
import org.eclipse.xtend.lib.annotations.Delegate
import edu.kit.ipd.sdq.activextendannotations.DelegateExcept
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.emf.ecore.InternalEObject

/**
 * Unification class for the class CashDeskRegistry
 */
class UnifiedCashDeskRegistry extends MinimalEObjectImpl.Container implements CashDeskRegistry {
	
	@Delegate
	protected var CashDeskRegistry ecoreImplementation
	
	// Methods of InternalEObject must also be delegated to the wrapped class
	@DelegateExcept(Notifier, EObject)
	protected var InternalEObject internalEcoreImplementation

	new() {
		ecoreImplementation = instance
		internalEcoreImplementation = ecoreImplementation as InternalEObject
	}
	
	def protected CashDeskRegistry getInstance() {
		return ScopeFactoryOld.eINSTANCE.createCashDeskRegistry
	}
}
