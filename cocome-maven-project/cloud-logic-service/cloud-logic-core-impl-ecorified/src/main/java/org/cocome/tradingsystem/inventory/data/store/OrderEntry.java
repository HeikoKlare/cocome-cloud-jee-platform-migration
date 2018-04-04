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

/**
 * Represents a single product order entry in the database.
 * 
 * @author Yannick Welsch
 */

@Dependent
public
class OrderEntry extends unification.org.cocome.tradingsystem.inventory.data.store.UnifiedOrderEntry implements Serializable, IOrderEntry {
	private static long serialVersionUID = -7683436740437770058L;

	

//	private ProductOrder productOrder;
	
	@Inject
	private
	Instance<IStoreQuery> storeQueryInstance;
	
	@PostConstruct
	public void initOrderEntry() {
		setStoreQuery(getStoreQueryInstance().get());
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
		OrderEntry.serialVersionUID = serialVersionUID;
	}

	

//	/**
//	 * @return The ProductOrder where the OrderEntry belongs to
//	 */
//	public ProductOrder getOrder() {
//		if (productOrder == null) {
//			productOrder = storeQuery.queryProductOrder(
//					registry.getLong(RegistryKeys.STORE_ID), 
//					productBarcode, amount);
//		}
//		return productOrder;
//	}
//
//	/**
//	 * @param productOrder
//	 *            The ProductOrder where the OrderEntry belongs to
//	 */
//	public void setOrder(final ProductOrder productOrder) {
//		this.productOrder = productOrder;
//	}

	/* (non-Javadoc)
	 * @see org.cocome.tradingsystem.inventory.data.store.IOrderEntry#toString()
	 */
	@Override
	public String toString() {
		return "OrderEntry: [ID: " + getId() + ", product barcode: " + getProductBarcode() + ", order amount: " + getAmount() + "]";
	}

}
