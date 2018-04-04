package org.cocome.tradingsystem.util.scope;

import java.io.Serializable;

import javax.enterprise.context.ContextNotActiveException;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;

import org.cocome.tradingsystem.util.qualifier.CashDeskRequired;
import org.cocome.tradingsystem.util.qualifier.EnterpriseRequired;
import org.cocome.tradingsystem.util.qualifier.StoreRequired;
import org.cocome.tradingsystem.util.scope.context.INamedSessionContext;

/**
 * Contains information about the currently active CashDeskRegistry and
 * produces the correct registry for injection via {@code @Inject} into the 
 * current request.
 * 
 * @see IContextRegistry
 * 
 * @author Tobias Pöppke
 *
 */
@RequestScoped
public class CashDeskRegistryFactory extends unification.org.cocome.tradingsystem.util.scope.UnifiedCashDeskRegistryFactory implements ICashDeskRegistryFactory, Serializable {

	private static long serialVersionUID = 3603943841760599147L;

	private static long getSerialVersionUID() {
		return serialVersionUID;
	}

	private static void setSerialVersionUID(long serialVersionUID) {
		CashDeskRegistryFactory.serialVersionUID = serialVersionUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@Produces @CashDeskSessionScoped @CashDeskRequired
	public IContextRegistry getCashDeskContextRegistry() throws ContextNotActiveException {
		INamedSessionContext sessionContext = (INamedSessionContext) getManager().getContext(CashDeskSessionScoped.class);
		IContextRegistry context = sessionContext.getActiveContext();
		
		return context;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	@Produces @StoreRequired
	public IContextRegistry getStoreContextRegistry() throws ContextNotActiveException {
		IContextRegistry context;
		try {
			context = getCashDeskContextRegistry();
		} catch (ContextNotActiveException e) {
			context = getStoreContext();
		}
		
		if (context == null) {
			throw new ContextNotActiveException("Could not access store context information to create IContextRegistry!");
		}
		return context;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@Produces @EnterpriseRequired
	public IContextRegistry getEnterpriseContextRegistry()
			throws ContextNotActiveException {
		if (getEnterpriseContext() != null) {
			return getEnterpriseContext();
		} else if (getStoreContext() != null && getStoreContext().hasLong(RegistryKeys.ENTERPRISE_ID)){
			return getStoreContext();
		}
		throw new ContextNotActiveException("Could not access enterprise information to create IContextRegistry!");
	}
	
}
