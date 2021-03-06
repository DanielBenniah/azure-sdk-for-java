/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Disable protection input properties.
 */
public class DisableProtectionInputProperties {
    /**
     * Disable protection reason. It can have values
     * NotSpecified/MigrationComplete. Possible values include: 'NotSpecified',
     * 'MigrationComplete'.
     */
    @JsonProperty(value = "disableProtectionReason")
    private DisableProtectionReason disableProtectionReason;

    /**
     * Replication provider specific input.
     */
    @JsonProperty(value = "replicationProviderInput")
    private DisableProtectionProviderSpecificInput replicationProviderInput;

    /**
     * Get disable protection reason. It can have values NotSpecified/MigrationComplete. Possible values include: 'NotSpecified', 'MigrationComplete'.
     *
     * @return the disableProtectionReason value
     */
    public DisableProtectionReason disableProtectionReason() {
        return this.disableProtectionReason;
    }

    /**
     * Set disable protection reason. It can have values NotSpecified/MigrationComplete. Possible values include: 'NotSpecified', 'MigrationComplete'.
     *
     * @param disableProtectionReason the disableProtectionReason value to set
     * @return the DisableProtectionInputProperties object itself.
     */
    public DisableProtectionInputProperties withDisableProtectionReason(DisableProtectionReason disableProtectionReason) {
        this.disableProtectionReason = disableProtectionReason;
        return this;
    }

    /**
     * Get replication provider specific input.
     *
     * @return the replicationProviderInput value
     */
    public DisableProtectionProviderSpecificInput replicationProviderInput() {
        return this.replicationProviderInput;
    }

    /**
     * Set replication provider specific input.
     *
     * @param replicationProviderInput the replicationProviderInput value to set
     * @return the DisableProtectionInputProperties object itself.
     */
    public DisableProtectionInputProperties withReplicationProviderInput(DisableProtectionProviderSpecificInput replicationProviderInput) {
        this.replicationProviderInput = replicationProviderInput;
        return this;
    }

}
