/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.servicebus.models;

import com.microsoft.windowsazure.core.LazyArrayList;
import java.util.ArrayList;

/**
* A connection string for a service bus entity.
*/
public class ServiceBusConnectionDetail {
    private String authorizationType;
    
    /**
    * Optional. The type of authorization for the connection to the entity.
    * @return The AuthorizationType value.
    */
    public String getAuthorizationType() {
        return this.authorizationType;
    }
    
    /**
    * Optional. The type of authorization for the connection to the entity.
    * @param authorizationTypeValue The AuthorizationType value.
    */
    public void setAuthorizationType(final String authorizationTypeValue) {
        this.authorizationType = authorizationTypeValue;
    }
    
    private String connectionString;
    
    /**
    * Optional. The connection string to the entity.
    * @return The ConnectionString value.
    */
    public String getConnectionString() {
        return this.connectionString;
    }
    
    /**
    * Optional. The connection string to the entity.
    * @param connectionStringValue The ConnectionString value.
    */
    public void setConnectionString(final String connectionStringValue) {
        this.connectionString = connectionStringValue;
    }
    
    private String keyName;
    
    /**
    * Optional. The name of the key used in the connection.
    * @return The KeyName value.
    */
    public String getKeyName() {
        return this.keyName;
    }
    
    /**
    * Optional. The name of the key used in the connection.
    * @param keyNameValue The KeyName value.
    */
    public void setKeyName(final String keyNameValue) {
        this.keyName = keyNameValue;
    }
    
    private ArrayList<AccessRight> rights;
    
    /**
    * Optional. The rights connections to the entity via the connection string
    * will have.
    * @return The Rights value.
    */
    public ArrayList<AccessRight> getRights() {
        return this.rights;
    }
    
    /**
    * Optional. The rights connections to the entity via the connection string
    * will have.
    * @param rightsValue The Rights value.
    */
    public void setRights(final ArrayList<AccessRight> rightsValue) {
        this.rights = rightsValue;
    }
    
    /**
    * Initializes a new instance of the ServiceBusConnectionDetail class.
    *
    */
    public ServiceBusConnectionDetail() {
        this.setRights(new LazyArrayList<AccessRight>());
    }
}
