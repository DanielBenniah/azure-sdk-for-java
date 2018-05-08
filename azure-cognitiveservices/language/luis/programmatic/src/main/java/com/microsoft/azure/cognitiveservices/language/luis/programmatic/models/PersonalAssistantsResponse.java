/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.programmatic.models;

import java.util.List;
import java.util.UUID;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response containing user's endpoint keys and the endpoint URLs of the
 * prebuilt Cortana applications.
 */
public class PersonalAssistantsResponse {
    /**
     * The endpointKeys property.
     */
    @JsonProperty(value = "endpointKeys")
    private List<UUID> endpointKeys;

    /**
     * The endpointUrls property.
     */
    @JsonProperty(value = "endpointUrls")
    private Map<String, String> endpointUrls;

    /**
     * Get the endpointKeys value.
     *
     * @return the endpointKeys value
     */
    public List<UUID> endpointKeys() {
        return this.endpointKeys;
    }

    /**
     * Set the endpointKeys value.
     *
     * @param endpointKeys the endpointKeys value to set
     * @return the PersonalAssistantsResponse object itself.
     */
    public PersonalAssistantsResponse withEndpointKeys(List<UUID> endpointKeys) {
        this.endpointKeys = endpointKeys;
        return this;
    }

    /**
     * Get the endpointUrls value.
     *
     * @return the endpointUrls value
     */
    public Map<String, String> endpointUrls() {
        return this.endpointUrls;
    }

    /**
     * Set the endpointUrls value.
     *
     * @param endpointUrls the endpointUrls value to set
     * @return the PersonalAssistantsResponse object itself.
     */
    public PersonalAssistantsResponse withEndpointUrls(Map<String, String> endpointUrls) {
        this.endpointUrls = endpointUrls;
        return this;
    }

}