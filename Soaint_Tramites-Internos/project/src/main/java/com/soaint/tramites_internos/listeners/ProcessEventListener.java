package com.soaint.tramites_internos.listeners;

    import org.kie.api.event.process.*;

public class ProcessEventListener implements org.kie.api.event.process.ProcessEventListener {


    public void beforeProcessStarted(ProcessStartedEvent processStartedEvent) {
        System.out.println("ProcessEventListener:" +processStartedEvent );
    }

    public void afterProcessStarted(ProcessStartedEvent processStartedEvent) {
        System.out.println("ProcessEventListener:" +processStartedEvent );
    }

    public void beforeProcessCompleted(ProcessCompletedEvent processCompletedEvent) {
        System.out.println("beforeProcessCompleted:" +processCompletedEvent );
    }

    public void afterProcessCompleted(ProcessCompletedEvent processCompletedEvent) {
        System.out.println("afterProcessCompleted:" +processCompletedEvent );
    }

    public void beforeNodeTriggered(ProcessNodeTriggeredEvent processNodeTriggeredEvent) {
        System.out.println("beforeNodeTriggered:" +processNodeTriggeredEvent );
    }

    public void afterNodeTriggered(ProcessNodeTriggeredEvent processNodeTriggeredEvent) {
        System.out.println("afterNodeTriggered:" +processNodeTriggeredEvent );
    }

    public void beforeNodeLeft(ProcessNodeLeftEvent processNodeLeftEvent) {
        System.out.println("beforeNodeLeft:" +processNodeLeftEvent );
    }

    public void afterNodeLeft(ProcessNodeLeftEvent processNodeLeftEvent) {
        System.out.println("afterNodeLeft:" +processNodeLeftEvent );
    }

    public void beforeVariableChanged(ProcessVariableChangedEvent processVariableChangedEvent) {
        System.out.println("beforeVariableChanged:" +processVariableChangedEvent );
    }

    public void afterVariableChanged(ProcessVariableChangedEvent processVariableChangedEvent) {
        System.out.println("afterVariableChanged:" +processVariableChangedEvent );
    }
}
