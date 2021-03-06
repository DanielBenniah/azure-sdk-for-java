/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import rx.Observable;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.RestorePoint;

/**
 * Type representing SqlPoolRestorePoints.
 */
public interface SqlPoolRestorePoints {
    /**
     * Get SQL pool backup.
     * Get SQL pool backup information.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RestorePoint> listAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName);

    /**
     * Creates a restore point for a data warehouse.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param restorePointLabel The restore point label to apply
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RestorePoint> createAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String restorePointLabel);

}
