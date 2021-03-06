/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains information for manual implementation for an Azure SQL Database,
 * Server or Elastic Pool Recommended Action.
 */
public class RecommendedActionImplementationInfo {
    /**
     * Gets the method in which this recommended action can be manually
     * implemented. e.g., TSql, AzurePowerShell. Possible values include:
     * 'TSql', 'AzurePowerShell'.
     */
    @JsonProperty(value = "method", access = JsonProperty.Access.WRITE_ONLY)
    private ImplementationMethod method;

    /**
     * Gets the manual implementation script. e.g., T-SQL script that could be
     * executed on the database.
     */
    @JsonProperty(value = "script", access = JsonProperty.Access.WRITE_ONLY)
    private String script;

    /**
     * Get gets the method in which this recommended action can be manually implemented. e.g., TSql, AzurePowerShell. Possible values include: 'TSql', 'AzurePowerShell'.
     *
     * @return the method value
     */
    public ImplementationMethod method() {
        return this.method;
    }

    /**
     * Get gets the manual implementation script. e.g., T-SQL script that could be executed on the database.
     *
     * @return the script value
     */
    public String script() {
        return this.script;
    }

}
