package unification.org.cocome.tradingsystem.util.java

import ecore.org.cocome.tradingsystem.util.java.Iterables
import ecore.org.cocome.tradingsystem.util.java.JavaFactoryOld
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl
import org.eclipse.xtend.lib.annotations.Delegate
import edu.kit.ipd.sdq.activextendannotations.DelegateExcept
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.emf.ecore.InternalEObject

/**
 * Unification class for the class Iterables
 */
class UnifiedIterables extends MinimalEObjectImpl.Container implements Iterables {
	
	@Delegate
	protected var Iterables ecoreImplementation
	
	// Methods of InternalEObject must also be delegated to the wrapped class
	@DelegateExcept(Notifier, EObject)
	protected var InternalEObject internalEcoreImplementation

	new() {
		ecoreImplementation = instance
		internalEcoreImplementation = ecoreImplementation as InternalEObject
	}
	
	def protected Iterables getInstance() {
		return JavaFactoryOld.eINSTANCE.createIterables
	}
}
