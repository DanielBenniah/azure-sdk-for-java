/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iotcentral.v2018_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input values.
 */
public class SubdomainAvailabilityInputs {
    /**
     * The subdomain of the IoT Central application instance to check.
     */
    @JsonProperty(value = "subdomain", required = true)
    private String subdomain;

    /**
     * The type of the IoT Central resource to query.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the subdomain of the IoT Central application instance to check.
     *
     * @return the subdomain value
     */
    public String subdomain() {
        return this.subdomain;
    }

    /**
     * Set the subdomain of the IoT Central application instance to check.
     *
     * @param subdomain the subdomain value to set
     * @return the SubdomainAvailabilityInputs object itself.
     */
    public SubdomainAvailabilityInputs withSubdomain(String subdomain) {
        this.subdomain = subdomain;
        return this;
    }

    /**
     * Get the type of the IoT Central resource to query.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type of the IoT Central resource to query.
     *
     * @param type the type value to set
     * @return the SubdomainAvailabilityInputs object itself.
     */
    public SubdomainAvailabilityInputs withType(String type) {
        this.type = type;
        return this;
    }

}