/*
 *************************************************************************
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
 *************************************************************************
 */

package org.cocome.tradingsystem.inventory.application.enterprise.parameter;

import javax.xml.bind.annotation.*;
import java.util.Set;

/**
 * Gives the user a finite number of options to customize a product
 *
 * @author Rudolf Biczok
 */
@XmlType(
        name = "NorminalCustomProductParameterTO",
        namespace = "http://parameter.enterprise.application.inventory.tradingsystem.cocome.org")
@XmlRootElement(name = "NorminalCustomProductParameterTO")
@XmlAccessorType(XmlAccessType.FIELD)
public class NorminalCustomProductParameterTO extends CustomProductParameterTO
        implements INorminalParameterTO {
    private static final long serialVersionUID = -2577328715744776645L;

    @XmlElement(name = "options", required = true)
    private Set<String> options;

    /**
     * @return The possible values this options a user can set for this option
     */
    @Override
    public Set<String> getOptions() {
        return options;
    }

    /**
     * @param options The possible values this options a user can set for this option
     */
    @Override
    public void setOptions(final Set<String> options) {
        this.options = options;
    }
}
