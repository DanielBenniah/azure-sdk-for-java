/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.logic.v2018_07_01_preview.Workflows;
import com.microsoft.azure.management.logic.v2018_07_01_preview.Workflow;
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
import com.microsoft.azure.management.logic.v2018_07_01_preview.WorkflowTriggerCallbackUrl;
import com.microsoft.azure.management.logic.v2018_07_01_preview.GetCallbackUrlParameters;

class WorkflowsImpl extends GroupableResourcesCoreImpl<Workflow, WorkflowImpl, WorkflowInner, WorkflowsInner, LogicManager>  implements Workflows {
    protected WorkflowsImpl(LogicManager manager) {
        super(manager.inner().workflows(), manager);
    }

    @Override
    protected Observable<WorkflowInner> getInnerAsync(String resourceGroupName, String name) {
        WorkflowsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        WorkflowsInner client = this.inner();
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
    public PagedList<Workflow> listByResourceGroup(String resourceGroupName) {
        WorkflowsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<Workflow> listByResourceGroupAsync(String resourceGroupName) {
        WorkflowsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<WorkflowInner>, Iterable<WorkflowInner>>() {
            @Override
            public Iterable<WorkflowInner> call(Page<WorkflowInner> page) {
                return page.items();
            }
        })
        .map(new Func1<WorkflowInner, Workflow>() {
            @Override
            public Workflow call(WorkflowInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<Workflow> list() {
        WorkflowsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<Workflow> listAsync() {
        WorkflowsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<WorkflowInner>, Iterable<WorkflowInner>>() {
            @Override
            public Iterable<WorkflowInner> call(Page<WorkflowInner> page) {
                return page.items();
            }
        })
        .map(new Func1<WorkflowInner, Workflow>() {
            @Override
            public Workflow call(WorkflowInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public WorkflowImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Completable disableAsync(String resourceGroupName, String workflowName) {
        WorkflowsInner client = this.inner();
        return client.disableAsync(resourceGroupName, workflowName).toCompletable();
    }

    @Override
    public Completable enableAsync(String resourceGroupName, String workflowName) {
        WorkflowsInner client = this.inner();
        return client.enableAsync(resourceGroupName, workflowName).toCompletable();
    }

    @Override
    public Observable<Object> generateUpgradedDefinitionAsync(String resourceGroupName, String workflowName) {
        WorkflowsInner client = this.inner();
        return client.generateUpgradedDefinitionAsync(resourceGroupName, workflowName)
    ;}

    @Override
    public Observable<WorkflowTriggerCallbackUrl> listCallbackUrlAsync(String resourceGroupName, String workflowName, GetCallbackUrlParameters listCallbackUrl) {
        WorkflowsInner client = this.inner();
        return client.listCallbackUrlAsync(resourceGroupName, workflowName, listCallbackUrl)
        .map(new Func1<WorkflowTriggerCallbackUrlInner, WorkflowTriggerCallbackUrl>() {
            @Override
            public WorkflowTriggerCallbackUrl call(WorkflowTriggerCallbackUrlInner inner) {
                return new WorkflowTriggerCallbackUrlImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Object> listSwaggerAsync(String resourceGroupName, String workflowName) {
        WorkflowsInner client = this.inner();
        return client.listSwaggerAsync(resourceGroupName, workflowName)
    ;}

    @Override
    public Completable moveAsync(String resourceGroupName, String workflowName, WorkflowInner move) {
        WorkflowsInner client = this.inner();
        return client.moveAsync(resourceGroupName, workflowName, move).toCompletable();
    }

    @Override
    public Completable regenerateAccessKeyAsync(String resourceGroupName, String workflowName) {
        WorkflowsInner client = this.inner();
        return client.regenerateAccessKeyAsync(resourceGroupName, workflowName).toCompletable();
    }

    @Override
    public Completable validateByResourceGroupAsync(String resourceGroupName, String workflowName, WorkflowInner validate) {
        WorkflowsInner client = this.inner();
        return client.validateByResourceGroupAsync(resourceGroupName, workflowName, validate).toCompletable();
    }

    @Override
    public Completable validateByLocationAsync(String resourceGroupName, String location, String workflowName, WorkflowInner workflow) {
        WorkflowsInner client = this.inner();
        return client.validateByLocationAsync(resourceGroupName, location, workflowName, workflow).toCompletable();
    }

    @Override
    protected WorkflowImpl wrapModel(WorkflowInner inner) {
        return  new WorkflowImpl(inner.name(), inner, manager());
    }

    @Override
    protected WorkflowImpl wrapModel(String name) {
        return new WorkflowImpl(name, new WorkflowInner(), this.manager());
    }

}
