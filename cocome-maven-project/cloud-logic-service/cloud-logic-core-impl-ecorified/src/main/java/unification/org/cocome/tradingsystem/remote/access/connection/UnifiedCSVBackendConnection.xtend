package unification.org.cocome.tradingsystem.remote.access.connection

import ecore.org.cocome.tradingsystem.remote.access.connection.CSVBackendConnection
import ecore.org.cocome.tradingsystem.remote.access.connection.ConnectionFactoryOld
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl
import org.eclipse.xtend.lib.annotations.Delegate
import edu.kit.ipd.sdq.activextendannotations.DelegateExcept
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.emf.ecore.InternalEObject

/**
 * Unification class for the class CSVBackendConnection
 */
class UnifiedCSVBackendConnection extends MinimalEObjectImpl.Container implements CSVBackendConnection {
	
	@Delegate
	protected var CSVBackendConnection ecoreImplementation
	
	// Methods of InternalEObject must also be delegated to the wrapped class
	@DelegateExcept(Notifier, EObject)
	protected var InternalEObject internalEcoreImplementation

	new() {
		ecoreImplementation = instance
		internalEcoreImplementation = ecoreImplementation as InternalEObject
	}
	
	def protected CSVBackendConnection getInstance() {
		return ConnectionFactoryOld.eINSTANCE.createCSVBackendConnection
	}
}
