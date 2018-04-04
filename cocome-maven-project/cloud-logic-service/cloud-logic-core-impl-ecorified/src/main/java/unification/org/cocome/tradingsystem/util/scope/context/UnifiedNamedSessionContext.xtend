package unification.org.cocome.tradingsystem.util.scope.context

import ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext
import ecore.org.cocome.tradingsystem.util.scope.context.ContextFactoryOld
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl
import org.eclipse.xtend.lib.annotations.Delegate
import edu.kit.ipd.sdq.activextendannotations.DelegateExcept
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.emf.ecore.InternalEObject

/**
 * Unification class for the class NamedSessionContext
 */
class UnifiedNamedSessionContext extends MinimalEObjectImpl.Container implements NamedSessionContext {
	
	@Delegate
	protected var NamedSessionContext ecoreImplementation
	
	// Methods of InternalEObject must also be delegated to the wrapped class
	@DelegateExcept(Notifier, EObject)
	protected var InternalEObject internalEcoreImplementation

	new() {
		ecoreImplementation = instance
		internalEcoreImplementation = ecoreImplementation as InternalEObject
	}
	
	def protected NamedSessionContext getInstance() {
		return ContextFactoryOld.eINSTANCE.createNamedSessionContext
	}
}
