package unification.org.cocome.tradingsystem.remote.access.parsing

import ecore.org.cocome.tradingsystem.remote.access.parsing.ParserPostMessage
import ecore.org.cocome.tradingsystem.remote.access.parsing.ParsingFactoryOld
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl
import org.eclipse.xtend.lib.annotations.Delegate
import edu.kit.ipd.sdq.activextendannotations.DelegateExcept
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.emf.ecore.InternalEObject

/**
 * Unification class for the class ParserPostMessage
 */
class UnifiedParserPostMessage extends MinimalEObjectImpl.Container implements ParserPostMessage {
	
	@Delegate
	protected var ParserPostMessage ecoreImplementation
	
	// Methods of InternalEObject must also be delegated to the wrapped class
	@DelegateExcept(Notifier, EObject)
	protected var InternalEObject internalEcoreImplementation

	new() {
		ecoreImplementation = instance
		internalEcoreImplementation = ecoreImplementation as InternalEObject
	}
	
	def protected ParserPostMessage getInstance() {
		return ParsingFactoryOld.eINSTANCE.createParserPostMessage
	}
}
