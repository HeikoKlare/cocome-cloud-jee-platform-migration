/***************************************************************************
 * Copyright 2013 DFG SPP 1593 (http://dfg-spp1593.de)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ***************************************************************************/

package org.cocome.tradingsystem.inventory.data.store;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.cocome.tradingsystem.inventory.data.enterprise.IEnterpriseQuery;
import org.cocome.tradingsystem.util.exception.NotInDatabaseException;

/**
 * Represents a store in the database.
 * 
 * @author Yannick Welsch
 */

@Dependent
public
class Store extends unification.org.cocome.tradingsystem.inventory.data.store.UnifiedStore implements Serializable, Comparable<IStore>, IStore {
	private static long serialVersionUID = 1L;
	
	private static Logger LOG = Logger.getLogger(Store.class);

	@Inject
	private
	Instance<IStoreQuery> storeQueryInstance;
	
	private IStoreQuery storeQuery;
	
	@Inject
	private
	Instance<IEnterpriseQuery> enterpriseQueryInstance;
	
	private IEnterpriseQuery enterpriseQuery;
	
	/* (non-Javadoc)
	 * @see org.cocome.tradingsystem.inventory.data.store.IStore#initStore()
	 */
	@Override
	@PostConstruct
	public void initStore() {
		setStoreQuery(getStoreQueryInstance().get());
		setEnterpriseQuery(getEnterpriseQueryInstance().get());
		
		setEnterprise(null);
		setProductOrders(null);
		setStockItems(null);
	}

	IEnterpriseQuery getEnterpriseQuery() {
		return enterpriseQuery;
	}

	void setEnterpriseQuery(IEnterpriseQuery enterpriseQuery) {
		this.enterpriseQuery = enterpriseQuery;
	}

	Instance<IEnterpriseQuery> getEnterpriseQueryInstance() {
		return enterpriseQueryInstance;
	}

	void setEnterpriseQueryInstance(Instance<IEnterpriseQuery> enterpriseQueryInstance) {
		this.enterpriseQueryInstance = enterpriseQueryInstance;
	}

	IStoreQuery getStoreQuery() {
		return storeQuery;
	}

	void setStoreQuery(IStoreQuery storeQuery) {
		this.storeQuery = storeQuery;
	}

	Instance<IStoreQuery> getStoreQueryInstance() {
		return storeQueryInstance;
	}

	void setStoreQueryInstance(Instance<IStoreQuery> storeQueryInstance) {
		this.storeQueryInstance = storeQueryInstance;
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
		Store.serialVersionUID = serialVersionUID;
	}

	/* (non-Javadoc)
	 * @see org.cocome.tradingsystem.inventory.data.store.IStore#toString()
	 */
	@Override
	public String toString() {
		return "[Id:"+getId()+",Name:"+this.getName()+",Location:"+this.getLocation()+"]";
	}

	/* (non-Javadoc)
	 * @see org.cocome.tradingsystem.inventory.data.store.IStore#compareTo(org.cocome.tradingsystem.inventory.data.store.Store)
	 */
	@Override
	public int compareTo(IStore o) {
		try {
			if(this.getEnterprise().getName().equals(o.getEnterprise().getName())
					&& this.getName().equals(o.getName())
					&& this.getLocation().equals(o.getLocation())
					){
				return 0;
			}
		} catch (NotInDatabaseException e) {
			return 0;
		}
		return 1;	
	}

}
