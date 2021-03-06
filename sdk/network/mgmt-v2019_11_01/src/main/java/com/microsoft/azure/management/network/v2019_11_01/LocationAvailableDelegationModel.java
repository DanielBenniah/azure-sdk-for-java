/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2019_11_01.implementation.AvailableDelegationInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2019_11_01.implementation.NetworkManager;
import java.util.List;

/**
 * Type representing LocationAvailableDelegationModel.
 */
public interface LocationAvailableDelegationModel extends HasInner<AvailableDelegationInner>, HasManager<NetworkManager> {
    /**
     * @return the actions value.
     */
    List<String> actions();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the serviceName value.
     */
    String serviceName();

    /**
     * @return the type value.
     */
    String type();

}
