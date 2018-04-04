package unification.org.cocome.tradingsystem.inventory.data.store

import ecore.org.cocome.tradingsystem.inventory.data.store.StockItem
import ecore.org.cocome.tradingsystem.inventory.data.store.StoreFactoryOld
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl
import org.eclipse.xtend.lib.annotations.Delegate
import edu.kit.ipd.sdq.activextendannotations.DelegateExcept
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.emf.ecore.InternalEObject

/**
 * Unification class for the class StockItem
 */
class UnifiedStockItem extends MinimalEObjectImpl.Container implements StockItem {
	
	@Delegate
	protected var StockItem ecoreImplementation
	
	// Methods of InternalEObject must also be delegated to the wrapped class
	@DelegateExcept(Notifier, EObject)
	protected var InternalEObject internalEcoreImplementation

	new() {
		ecoreImplementation = instance
		internalEcoreImplementation = ecoreImplementation as InternalEObject
	}
	
	def protected StockItem getInstance() {
		return StoreFactoryOld.eINSTANCE.createStockItem
	}
}
