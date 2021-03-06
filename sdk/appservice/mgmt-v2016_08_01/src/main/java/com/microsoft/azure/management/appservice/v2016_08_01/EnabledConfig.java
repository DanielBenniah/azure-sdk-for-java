/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Enabled configuration.
 */
public class EnabledConfig {
    /**
     * True if configuration is enabled, false if it is disabled and null if
     * configuration is not set.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * Get true if configuration is enabled, false if it is disabled and null if configuration is not set.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set true if configuration is enabled, false if it is disabled and null if configuration is not set.
     *
     * @param enabled the enabled value to set
     * @return the EnabledConfig object itself.
     */
    public EnabledConfig withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

}
