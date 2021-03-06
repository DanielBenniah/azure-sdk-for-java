/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.logic.v2018_07_01_preview.WorkflowRuns;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import rx.Completable;
import com.microsoft.azure.management.logic.v2018_07_01_preview.WorkflowWorkflowRun;

class WorkflowRunsImpl extends WrapperImpl<WorkflowRunsInner> implements WorkflowRuns {
    private final LogicManager manager;

    WorkflowRunsImpl(LogicManager manager) {
        super(manager.inner().workflowRuns());
        this.manager = manager;
    }

    public LogicManager manager() {
        return this.manager;
    }

    private WorkflowWorkflowRunImpl wrapModel(WorkflowRunInner inner) {
        return  new WorkflowWorkflowRunImpl(inner, manager());
    }

    @Override
    public Completable cancelAsync(String resourceGroupName, String workflowName, String runName) {
        WorkflowRunsInner client = this.inner();
        return client.cancelAsync(resourceGroupName, workflowName, runName).toCompletable();
    }

    @Override
    public Observable<WorkflowWorkflowRun> listAsync(final String resourceGroupName, final String workflowName) {
        WorkflowRunsInner client = this.inner();
        return client.listAsync(resourceGroupName, workflowName)
        .flatMapIterable(new Func1<Page<WorkflowRunInner>, Iterable<WorkflowRunInner>>() {
            @Override
            public Iterable<WorkflowRunInner> call(Page<WorkflowRunInner> page) {
                return page.items();
            }
        })
        .map(new Func1<WorkflowRunInner, WorkflowWorkflowRun>() {
            @Override
            public WorkflowWorkflowRun call(WorkflowRunInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<WorkflowWorkflowRun> getAsync(String resourceGroupName, String workflowName, String runName) {
        WorkflowRunsInner client = this.inner();
        return client.getAsync(resourceGroupName, workflowName, runName)
        .map(new Func1<WorkflowRunInner, WorkflowWorkflowRun>() {
            @Override
            public WorkflowWorkflowRun call(WorkflowRunInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
