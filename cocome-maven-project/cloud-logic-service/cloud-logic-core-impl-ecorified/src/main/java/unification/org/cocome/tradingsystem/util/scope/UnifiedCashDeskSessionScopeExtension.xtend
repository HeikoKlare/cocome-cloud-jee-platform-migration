package unification.org.cocome.tradingsystem.util.scope

import ecore.org.cocome.tradingsystem.util.scope.CashDeskSessionScopeExtension
import ecore.org.cocome.tradingsystem.util.scope.ScopeFactoryOld
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl
import org.eclipse.xtend.lib.annotations.Delegate
import edu.kit.ipd.sdq.activextendannotations.DelegateExcept
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.emf.ecore.InternalEObject

/**
 * Unification class for the class CashDeskSessionScopeExtension
 */
class UnifiedCashDeskSessionScopeExtension extends MinimalEObjectImpl.Container implements CashDeskSessionScopeExtension {
	
	@Delegate
	protected var CashDeskSessionScopeExtension ecoreImplementation
	
	// Methods of InternalEObject must also be delegated to the wrapped class
	@DelegateExcept(Notifier, EObject)
	protected var InternalEObject internalEcoreImplementation

	new() {
		ecoreImplementation = instance
		internalEcoreImplementation = ecoreImplementation as InternalEObject
	}
	
	def protected CashDeskSessionScopeExtension getInstance() {
		return ScopeFactoryOld.eINSTANCE.createCashDeskSessionScopeExtension
	}
}
