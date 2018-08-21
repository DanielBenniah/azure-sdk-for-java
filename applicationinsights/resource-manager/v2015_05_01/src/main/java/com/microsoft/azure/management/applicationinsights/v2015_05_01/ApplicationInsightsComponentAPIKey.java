/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation.ApplicationInsightsComponentAPIKeyInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation.InsightsManager;
import java.util.List;

/**
 * Type representing ApplicationInsightsComponentAPIKey.
 */
public interface ApplicationInsightsComponentAPIKey extends HasInner<ApplicationInsightsComponentAPIKeyInner>, Indexable, Refreshable<ApplicationInsightsComponentAPIKey>, HasManager<InsightsManager> {
    /**
     * @return the apiKey value.
     */
    String apiKey();

    /**
     * @return the createdDate value.
     */
    String createdDate();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the linkedReadProperties value.
     */
    List<String> linkedReadProperties();

    /**
     * @return the linkedWriteProperties value.
     */
    List<String> linkedWriteProperties();

    /**
     * @return the name value.
     */
    String name();

}