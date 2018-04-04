package unification.org.cocome.tradingsystem.remote.access.parsing

import ecore.org.cocome.tradingsystem.remote.access.parsing.CSVHelper
import ecore.org.cocome.tradingsystem.remote.access.parsing.ParsingFactoryOld
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl
import org.eclipse.xtend.lib.annotations.Delegate
import edu.kit.ipd.sdq.activextendannotations.DelegateExcept
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.emf.ecore.InternalEObject

/**
 * Unification class for the class CSVHelper
 */
class UnifiedCSVHelper extends MinimalEObjectImpl.Container implements CSVHelper {
	
	@Delegate
	protected var CSVHelper ecoreImplementation
	
	// Methods of InternalEObject must also be delegated to the wrapped class
	@DelegateExcept(Notifier, EObject)
	protected var InternalEObject internalEcoreImplementation

	new() {
		ecoreImplementation = instance
		internalEcoreImplementation = ecoreImplementation as InternalEObject
	}
	
	def protected CSVHelper getInstance() {
		return ParsingFactoryOld.eINSTANCE.createCSVHelper
	}
}
