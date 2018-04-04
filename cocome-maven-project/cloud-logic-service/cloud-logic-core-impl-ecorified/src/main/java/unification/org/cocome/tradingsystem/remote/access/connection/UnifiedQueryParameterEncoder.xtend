package unification.org.cocome.tradingsystem.remote.access.connection

import ecore.org.cocome.tradingsystem.remote.access.connection.QueryParameterEncoder
import ecore.org.cocome.tradingsystem.remote.access.connection.ConnectionFactoryOld
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl
import org.eclipse.xtend.lib.annotations.Delegate
import edu.kit.ipd.sdq.activextendannotations.DelegateExcept
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.emf.ecore.InternalEObject

/**
 * Unification class for the class QueryParameterEncoder
 */
class UnifiedQueryParameterEncoder extends MinimalEObjectImpl.Container implements QueryParameterEncoder {
	
	@Delegate
	protected var QueryParameterEncoder ecoreImplementation
	
	// Methods of InternalEObject must also be delegated to the wrapped class
	@DelegateExcept(Notifier, EObject)
	protected var InternalEObject internalEcoreImplementation

	new() {
		ecoreImplementation = instance
		internalEcoreImplementation = ecoreImplementation as InternalEObject
	}
	
	def protected QueryParameterEncoder getInstance() {
		return ConnectionFactoryOld.eINSTANCE.createQueryParameterEncoder
	}
}
