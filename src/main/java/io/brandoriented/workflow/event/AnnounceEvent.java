package io.brandoriented.workflow.event;

import io.brandoriented.workflow.Marking;
import io.brandoriented.workflow.Transition;
import io.brandoriented.workflow.WorkflowInterface;

import java.util.Map;

public class AnnounceEvent extends Event {
    public AnnounceEvent(Object subject, Marking marking, Transition transition, WorkflowInterface workflow, Map<String, Boolean> context) {
        super(subject, marking, transition, workflow, context);
    }

    public AnnounceEvent(Object subject, Marking marking, Transition transition, WorkflowInterface workflow) {
        super(subject, marking, transition, workflow);
    }
}
