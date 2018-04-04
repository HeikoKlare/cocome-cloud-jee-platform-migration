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

package org.cocome.tradingsystem.inventory.data.enterprise;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

/**
 * This class represents a Product in the database
 * 
 * @author Yannick Welsch
 * @author Tobias Pöppke
 */

@Dependent
public
class Product extends unification.org.cocome.tradingsystem.inventory.data.enterprise.UnifiedProduct implements Serializable, IProduct {
	private static long serialVersionUID = -2577328715744776645L;

	// Inject Instance here because otherwise CDI complains about 
	// missing the implementation bean when deploying
	@Inject
	private
	Instance<IEnterpriseQuery> enterpriseQueryInstance;
	
	@PostConstruct
	private void initProduct() {
		setEnterpriseQuery(getEnterpriseQueryInstance().get());
	}

	Instance<IEnterpriseQuery> getEnterpriseQueryInstance() {
		return enterpriseQueryInstance;
	}

	void setEnterpriseQueryInstance(Instance<IEnterpriseQuery> enterpriseQueryInstance) {
		this.enterpriseQueryInstance = enterpriseQueryInstance;
	}

	private static long getSerialVersionUID() {
		return serialVersionUID;
	}

	private static void setSerialVersionUID(long serialVersionUID) {
		Product.serialVersionUID = serialVersionUID;
	}

}
