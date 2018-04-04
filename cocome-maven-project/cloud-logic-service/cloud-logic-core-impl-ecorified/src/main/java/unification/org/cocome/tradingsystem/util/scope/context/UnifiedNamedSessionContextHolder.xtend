package unification.org.cocome.tradingsystem.util.scope.context

import ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder
import ecore.org.cocome.tradingsystem.util.scope.context.ContextFactoryOld
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl
import org.eclipse.xtend.lib.annotations.Delegate
import edu.kit.ipd.sdq.activextendannotations.DelegateExcept
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.emf.ecore.InternalEObject

/**
 * Unification class for the class NamedSessionContextHolder
 */
class UnifiedNamedSessionContextHolder extends MinimalEObjectImpl.Container implements NamedSessionContextHolder {
	
	@Delegate
	protected var NamedSessionContextHolder ecoreImplementation
	
	// Methods of InternalEObject must also be delegated to the wrapped class
	@DelegateExcept(Notifier, EObject)
	protected var InternalEObject internalEcoreImplementation

	new() {
		ecoreImplementation = instance
		internalEcoreImplementation = ecoreImplementation as InternalEObject
	}
	
	def protected NamedSessionContextHolder getInstance() {
		return ContextFactoryOld.eINSTANCE.createNamedSessionContextHolder
	}
}
