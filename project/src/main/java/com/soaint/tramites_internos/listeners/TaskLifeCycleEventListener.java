package com.soaint.tramites_internos.listeners;

import org.kie.api.task.TaskEvent;

public class TaskLifeCycleEventListener implements org.kie.api.task.TaskLifeCycleEventListener {


    public void beforeTaskActivatedEvent(TaskEvent taskEvent) {
        System.out.println("beforeTaskActivatedEvent :"+taskEvent );
    }

    public void beforeTaskClaimedEvent(TaskEvent taskEvent) {
        System.out.println("beforeTaskClaimedEvent :"+taskEvent );
    }

    public void beforeTaskSkippedEvent(TaskEvent taskEvent) {
        System.out.println("beforeTaskSkippedEvent :"+taskEvent );
    }

    public void beforeTaskStartedEvent(TaskEvent taskEvent) {
        System.out.println("beforeTaskStartedEvent :"+taskEvent );
    }

    public void beforeTaskStoppedEvent(TaskEvent taskEvent) {
        System.out.println("beforeTaskStoppedEvent :"+taskEvent );
    }

    public void beforeTaskCompletedEvent(TaskEvent taskEvent) {
        System.out.println("beforeTaskCompletedEvent :"+taskEvent );
    }

    public void beforeTaskFailedEvent(TaskEvent taskEvent) {
        System.out.println("beforeTaskFailedEvent :"+taskEvent );
    }

    public void beforeTaskAddedEvent(TaskEvent taskEvent) {
        System.out.println("beforeTaskAddedEvent :"+taskEvent );
    }

    public void beforeTaskExitedEvent(TaskEvent taskEvent) {
        System.out.println("beforeTaskExitedEvent :"+taskEvent );
    }

    public void beforeTaskReleasedEvent(TaskEvent taskEvent) {
        System.out.println("beforeTaskReleasedEvent :"+taskEvent );
    }

    public void beforeTaskResumedEvent(TaskEvent taskEvent) {
        System.out.println("beforeTaskResumedEvent :"+taskEvent );
    }

    public void beforeTaskSuspendedEvent(TaskEvent taskEvent) {
        System.out.println("beforeTaskSuspendedEvent :"+taskEvent );
    }

    public void beforeTaskForwardedEvent(TaskEvent taskEvent) {
        System.out.println("beforeTaskForwardedEvent :"+taskEvent );
    }

    public void beforeTaskDelegatedEvent(TaskEvent taskEvent) {
        System.out.println("beforeTaskDelegatedEvent :"+taskEvent );
    }

    public void beforeTaskNominatedEvent(TaskEvent taskEvent) {
        System.out.println("beforeTaskNominatedEvent :"+taskEvent );
    }

    public void afterTaskActivatedEvent(TaskEvent taskEvent) {
        System.out.println("afterTaskActivatedEvent :"+taskEvent );
    }

    public void afterTaskClaimedEvent(TaskEvent taskEvent) {
        System.out.println("afterTaskClaimedEvent :"+taskEvent );
    }

    public void afterTaskSkippedEvent(TaskEvent taskEvent) {
        System.out.println("afterTaskSkippedEvent :"+taskEvent );
    }

    public void afterTaskStartedEvent(TaskEvent taskEvent) {
        System.out.println("afterTaskStartedEvent :"+taskEvent );
    }

    public void afterTaskStoppedEvent(TaskEvent taskEvent) {
        System.out.println("afterTaskStoppedEvent :"+taskEvent );
    }

    public void afterTaskCompletedEvent(TaskEvent taskEvent) {
        System.out.println("afterTaskCompletedEvent :"+taskEvent );
    }

    public void afterTaskFailedEvent(TaskEvent taskEvent) {
        System.out.println("afterTaskFailedEvent :"+taskEvent );
    }

    public void afterTaskAddedEvent(TaskEvent taskEvent) {
        System.out.println("afterTaskAddedEvent :"+taskEvent );
    }

    public void afterTaskExitedEvent(TaskEvent taskEvent) {
        System.out.println("afterTaskExitedEvent :"+taskEvent );
    }

    public void afterTaskReleasedEvent(TaskEvent taskEvent) {
        System.out.println("afterTaskReleasedEvent :"+taskEvent );
    }

    public void afterTaskResumedEvent(TaskEvent taskEvent) {
        System.out.println("afterTaskSuspendedEvent :"+taskEvent );
    }

    public void afterTaskSuspendedEvent(TaskEvent taskEvent) {
        System.out.println("afterTaskSuspendedEvent :"+taskEvent );
    }

    public void afterTaskForwardedEvent(TaskEvent taskEvent) {
        System.out.println("afterTaskForwardedEvent :"+taskEvent );
    }

    public void afterTaskDelegatedEvent(TaskEvent taskEvent) {
        System.out.println("afterTaskDelegatedEvent :"+taskEvent );
    }

    public void afterTaskNominatedEvent(TaskEvent taskEvent) {
        System.out.println("afterTaskNominatedEvent :"+taskEvent );
    }
}
