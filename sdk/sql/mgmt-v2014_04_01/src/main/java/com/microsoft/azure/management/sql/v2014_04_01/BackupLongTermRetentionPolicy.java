/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v2014_04_01.implementation.BackupLongTermRetentionPolicyInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2014_04_01.implementation.SqlManager;

/**
 * Type representing BackupLongTermRetentionPolicy.
 */
public interface BackupLongTermRetentionPolicy extends HasInner<BackupLongTermRetentionPolicyInner>, Indexable, Refreshable<BackupLongTermRetentionPolicy>, Updatable<BackupLongTermRetentionPolicy.Update>, HasManager<SqlManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the recoveryServicesBackupPolicyResourceId value.
     */
    String recoveryServicesBackupPolicyResourceId();

    /**
     * @return the state value.
     */
    BackupLongTermRetentionPolicyState state();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the BackupLongTermRetentionPolicy definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithDatabasis, DefinitionStages.WithRecoveryServicesBackupPolicyResourceId, DefinitionStages.WithState, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of BackupLongTermRetentionPolicy definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a BackupLongTermRetentionPolicy definition.
         */
        interface Blank extends WithDatabasis {
        }

        /**
         * The stage of the backuplongtermretentionpolicy definition allowing to specify Databasis.
         */
        interface WithDatabasis {
           /**
            * Specifies resourceGroupName, serverName, databaseName.
            * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal
            * @param serverName The name of the server
            * @param databaseName The name of the database
            * @return the next definition stage
            */
            WithRecoveryServicesBackupPolicyResourceId withExistingDatabasis(String resourceGroupName, String serverName, String databaseName);
        }

        /**
         * The stage of the backuplongtermretentionpolicy definition allowing to specify RecoveryServicesBackupPolicyResourceId.
         */
        interface WithRecoveryServicesBackupPolicyResourceId {
           /**
            * Specifies recoveryServicesBackupPolicyResourceId.
            * @param recoveryServicesBackupPolicyResourceId The azure recovery services backup protection policy resource id
            * @return the next definition stage
            */
            WithState withRecoveryServicesBackupPolicyResourceId(String recoveryServicesBackupPolicyResourceId);
        }

        /**
         * The stage of the backuplongtermretentionpolicy definition allowing to specify State.
         */
        interface WithState {
           /**
            * Specifies state.
            * @param state The status of the backup long term retention policy. Possible values include: 'Disabled', 'Enabled'
            * @return the next definition stage
            */
            WithCreate withState(BackupLongTermRetentionPolicyState state);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<BackupLongTermRetentionPolicy> {
        }
    }
    /**
     * The template for a BackupLongTermRetentionPolicy update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<BackupLongTermRetentionPolicy> {
    }

    /**
     * Grouping of BackupLongTermRetentionPolicy update stages.
     */
    interface UpdateStages {
    }
}
