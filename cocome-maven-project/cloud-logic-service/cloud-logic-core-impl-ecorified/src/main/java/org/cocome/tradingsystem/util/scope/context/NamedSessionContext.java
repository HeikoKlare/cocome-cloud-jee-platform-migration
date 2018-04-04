package org.cocome.tradingsystem.util.scope.context;

import java.io.Serializable;
import java.lang.annotation.Annotation;

import javax.enterprise.context.ContextNotActiveException;
import javax.enterprise.context.spi.Contextual;
import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.Bean;

import org.apache.log4j.Logger;
import org.cocome.tradingsystem.util.scope.IContextRegistry;
import org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder.NamedSessionInstance;

/**
 * Implements a named session context with a {@link ThreadLocal} context holder.
 * 
 * @author Tobias Pöppke
 *
 */
public class NamedSessionContext extends unification.org.cocome.tradingsystem.util.scope.context.UnifiedNamedSessionContext implements Serializable, INamedSessionContext {

	private static long serialVersionUID = -4691689443732680725L;
	
	/*
	 * ThreadLocals are necessary here to prevent that two different contexts get activated
	 * and the one last activated receives all the calls. With ThreadLocals this won't happen
	 * and there will be no ContextNotActiveExceptions.
	 */
	
	private static Logger LOG = Logger.getLogger(NamedSessionContext.class);
	
	/**
	 * 
	 * 
	 * @param providedScope
	 */
	public NamedSessionContext(Class<? extends Annotation> providedScope) {
		setIsActive(new ThreadLocal<Boolean>());
		this.setProvidedScope(new ThreadLocal<Class<? extends Annotation>>());
		setContext(new ThreadLocal<IContextRegistry>());
		setContextHolder(new ThreadLocal<NamedSessionContextHolder>());
		
		getIsActive().set(false);
		getContext().set(null);
		getContextHolder().set(null);
		this.getProvidedScope().set(providedScope);
	}
	

	private static Logger getLOG() {
		return LOG;
	}


	private static void setLOG(Logger lOG) {
		LOG = lOG;
	}


	private static long getSerialVersionUID() {
		return serialVersionUID;
	}


	private static void setSerialVersionUID(long serialVersionUID) {
		NamedSessionContext.serialVersionUID = serialVersionUID;
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public Class<? extends Annotation> getScope() {
		return getProvidedScope().get();
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <T> T get(Contextual<T> contextual,
			CreationalContext<T> creationalContext) {
		Bean<T> bean = (Bean<T>) contextual;
		NamedSessionContextHolder contextHolder = getActiveHolder();
		getLOG().debug("get with contextual " + contextual + " and creationalContext " + creationalContext + " with context holder " + contextHolder);
		if (contextHolder == null) {
			throw new ContextNotActiveException("No context holder currently active.");
		}
		
        if (contextHolder.getBeans().containsKey(bean.getBeanClass())) {
        	// Instance class should always be of type T so casting it is ok
        	T instance = (T) contextHolder.getBean(bean.getBeanClass()).instance;
        	getLOG().debug("returning Bean instance " + instance.toString() + " from holder");
            return instance;
        } else {
        	if (creationalContext == null) {
        		return null;
        	}
        	
            T t = (T) bean.create(creationalContext);
            NamedSessionInstance<T> customInstance = new NamedSessionInstance<T>();
            customInstance.bean = bean;
            customInstance.ctx = creationalContext;
            customInstance.instance = t;
            contextHolder.putBean(customInstance);
            getLOG().debug("returning newly created bean " + t.toString());
            return t;
        }
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <T> T get(Contextual<T> contextual) {
		return this.get(contextual, null);
	}
	
	private NamedSessionContextHolder getActiveHolder() {		
		return getContextHolder().get();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isActive() {
		// TODO: cannot inject and activate context with real status...
		// return this.isActive;
		return true;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean activate(IContextRegistry context) {
		if (context != null && context.getContextName() != "") {
			this.getContext().set(context);
			getIsActive().set(true);
			NamedSessionContextHolder holder = NamedSessionContextHolder.getInstance(getName());
			this.getContextHolder().set(holder);			
		} else {
			getIsActive().set(false);
		}
		getLOG().debug("activating context: " + (getIsActive().get() ? getName(): "No context found!"));
		return getIsActive().get();
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void deactivateCurrentContext() {
		getLOG().debug("deactivating context " + getName());
		getContext().remove();
		getContextHolder().remove();
		getIsActive().remove();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getName() {
		return getContext().get().getContextName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void deleteCurrentContext() {
		String contextName = getName();
		getActiveHolder().destroyAllBeans();
		deactivateCurrentContext();
		NamedSessionContextHolder.getInstances().remove(contextName);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IContextRegistry getActiveContext() {
		if (this.getContext().get() == null) {
			throw new ContextNotActiveException("Could not return context object because no context is currently active.");
		} else {
			return this.getContext().get();
		}
	}


	public NamedSessionContext() {
	}

}
