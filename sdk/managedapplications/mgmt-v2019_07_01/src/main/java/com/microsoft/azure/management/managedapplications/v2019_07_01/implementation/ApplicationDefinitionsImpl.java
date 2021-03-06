/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.managedapplications.v2019_07_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationDefinitions;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationDefinition;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;

class ApplicationDefinitionsImpl extends GroupableResourcesCoreImpl<ApplicationDefinition, ApplicationDefinitionImpl, ApplicationDefinitionInner, ApplicationDefinitionsInner, ManagedApplicationsManager>  implements ApplicationDefinitions {
    protected ApplicationDefinitionsImpl(ManagedApplicationsManager manager) {
        super(manager.inner().applicationDefinitions(), manager);
    }

    @Override
    protected Observable<ApplicationDefinitionInner> getInnerAsync(String resourceGroupName, String name) {
        ApplicationDefinitionsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        ApplicationDefinitionsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<ApplicationDefinition> listByResourceGroup(String resourceGroupName) {
        ApplicationDefinitionsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<ApplicationDefinition> listByResourceGroupAsync(String resourceGroupName) {
        ApplicationDefinitionsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<ApplicationDefinitionInner>, Iterable<ApplicationDefinitionInner>>() {
            @Override
            public Iterable<ApplicationDefinitionInner> call(Page<ApplicationDefinitionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ApplicationDefinitionInner, ApplicationDefinition>() {
            @Override
            public ApplicationDefinition call(ApplicationDefinitionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public ApplicationDefinitionImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Completable deleteByIdAsync(String applicationDefinitionId) {
        ApplicationDefinitionsInner client = this.inner();
        return client.deleteByIdAsync(applicationDefinitionId).toCompletable();
    }

    @Override
    public Observable<ApplicationDefinition> createOrUpdateByIdAsync(String applicationDefinitionId, ApplicationDefinitionInner parameters) {
        ApplicationDefinitionsInner client = this.inner();
        return client.createOrUpdateByIdAsync(applicationDefinitionId, parameters)
        .map(new Func1<ApplicationDefinitionInner, ApplicationDefinition>() {
            @Override
            public ApplicationDefinition call(ApplicationDefinitionInner inner) {
                return new ApplicationDefinitionImpl(inner.name(), inner, manager());
            }
        });
    }

    @Override
    protected ApplicationDefinitionImpl wrapModel(ApplicationDefinitionInner inner) {
        return  new ApplicationDefinitionImpl(inner.name(), inner, manager());
    }

    @Override
    protected ApplicationDefinitionImpl wrapModel(String name) {
        return new ApplicationDefinitionImpl(name, new ApplicationDefinitionInner(), this.manager());
    }

}
