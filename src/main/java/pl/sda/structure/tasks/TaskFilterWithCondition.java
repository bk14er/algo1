package pl.sda.structure.tasks;

import pl.sda.structure.tasks.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskFilterWithCondition {

    private final List<Task> allTask;

    public TaskFilterWithCondition(List<Task> allTask) {
        this.allTask = allTask;
    }

    public List<Task> getOnlyWith(TaskCondition condition) {
        List<Task> result = new ArrayList<>();
        //TODO zaimplementuj
        return result;
    }


    public interface TaskCondition {

        boolean meetCriteria(Task task);

    }

}
