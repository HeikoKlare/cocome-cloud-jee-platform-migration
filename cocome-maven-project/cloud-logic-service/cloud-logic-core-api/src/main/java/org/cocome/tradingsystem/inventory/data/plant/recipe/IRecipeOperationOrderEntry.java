/*
 ***************************************************************************
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
 **************************************************************************
 */

package org.cocome.tradingsystem.inventory.data.plant.recipe;

import org.cocome.tradingsystem.inventory.data.IIdentifiable;
import org.cocome.tradingsystem.inventory.data.enterprise.parameter.IParameter;
import org.cocome.tradingsystem.inventory.data.enterprise.parameter.IParameterValue;
import org.cocome.tradingsystem.util.exception.NotInDatabaseException;

import java.util.Collection;

/**
 * Represents a single {@link IProductionOrder} entry in the database.
 *
 * @param <T1> the parameter type
 * @param <T2> the parameter value type
 * @author Rudolf Biczok
 */
public interface IRecipeOperationOrderEntry<
        T1 extends IParameter,
        T2 extends IParameterValue> extends IIdentifiable {

    /**
     * @return The amount of ordered products
     */
    long getAmount();

    /**
     * @param amount The amount of ordered products
     */
    void setAmount(final long amount);

    /**
     * @return the parameter of this operation
     */
    Collection<T1> getParameters() throws NotInDatabaseException;

    /**
     * @return the parameter values
     */
    Collection<T2> getParameterValues();

    /**
     * @param parameterValues the parameter values
     */
    void setParameterValues(Collection<T2> parameterValues);
}
