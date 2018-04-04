package org.cocome.tradingsystem.util.scope;

/**
 * Contains information on the context in which a cash desk operation is executing.
 * 
 * @author Tobias Pöppke
 *
 */
public class CashDeskRegistry extends unification.org.cocome.tradingsystem.util.scope.UnifiedCashDeskRegistry implements IContextRegistry {

	/**
	 * Creates a new registry. 
	 * 
	 * @param contextName
	 * 		the name of the context in which this registry is placed
	 */
	public CashDeskRegistry(String contextName) {
		this.setContextName(contextName);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public long getLong(RegistryKeys name) {
		Object v = getAttributeMap().get(name);

		try {
			return (Long) v;
		} catch (ClassCastException e) {
			return 0;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void putLong(RegistryKeys name, long value) {
		getAttributeMap().put(name, value);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getString(RegistryKeys name) {
		Object v = getAttributeMap().get(name);

		try {
			return (String) v;
		} catch (ClassCastException e) {
			return null;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void putString(RegistryKeys name, String value) {
		getAttributeMap().put(name, value);

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object getObject(RegistryKeys name) {
		Object v = getAttributeMap().get(name);

		try {
			return (Object) v;
		} catch (ClassCastException e) {
			return null;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void putObject(RegistryKeys name, Object value) {
		getAttributeMap().put(name, value);
	}

	@Override
	public boolean hasObject(RegistryKeys name) {
		return getAttributeMap().containsKey(name);
	}

	@Override
	public boolean hasLong(RegistryKeys name) {
		return getAttributeMap().containsKey(name);
	}

	public CashDeskRegistry() {
	}

}
