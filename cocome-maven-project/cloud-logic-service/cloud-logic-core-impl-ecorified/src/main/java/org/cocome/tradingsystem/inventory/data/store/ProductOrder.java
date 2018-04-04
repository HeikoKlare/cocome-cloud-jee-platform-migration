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
import java.util.LinkedList;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

/**
 * The ProductOrder class represents an ProductOrder of a Store in the database.
 * 
 * @author Yannick Welsch
 * @author Tobias Pöppke
 */

@Dependent
public
class ProductOrder extends unification.org.cocome.tradingsystem.inventory.data.store.UnifiedProductOrder implements Serializable, IProductOrder {
	private static long serialVersionUID = -8340585715760459030L;

	@Inject
	private
	Instance<IStoreQuery> storeQueryInstance;
	
	@PostConstruct
	private void initProductOrder() {
		setStoreQuery(getStoreQueryInstance().get());
		setOrderEntries(new LinkedList<IOrderEntry>());
	}
	
	Instance<IStoreQuery> getStoreQueryInstance() {
		return storeQueryInstance;
	}

	void setStoreQueryInstance(Instance<IStoreQuery> storeQueryInstance) {
		this.storeQueryInstance = storeQueryInstance;
	}

	private static long getSerialVersionUID() {
		return serialVersionUID;
	}

	private static void setSerialVersionUID(long serialVersionUID) {
		ProductOrder.serialVersionUID = serialVersionUID;
	}

}
