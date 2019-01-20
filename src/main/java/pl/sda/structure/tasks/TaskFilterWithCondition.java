package pl.sda.structure.tasks;

import pl.sda.structure.tasks.model.Task;
import pl.sda.structure.tasks.model.TaskPriority;

import java.util.ArrayList;
import java.util.List;

public class TaskFilterWithCondition {

    private final List<Task> allTask;

    public TaskCondition LOW_LEVEL = new TaskCondition() {
        @Override
        public boolean meetCriteria(Task task) {
            return task.getPriority().equals(TaskPriority.LOW);
        }
    };

    public static final TaskCondition MEDIUM_LEVEL = new TaskCondition() {
        @Override
        public boolean meetCriteria(Task task) {
            return task.getPriority().equals(TaskPriority.MEDIUM);
        }
    };

    public static final TaskCondition HIGH_LEVEL = new TaskCondition() {
        @Override
        public boolean meetCriteria(Task task) {
            return task.getPriority().equals(TaskPriority.HIGH);
        }
    };






    public TaskFilterWithCondition(List<Task> allTask) {
        this.allTask = allTask;
    }

    public List<Task> getOnlyWith(TaskCondition condition) {
        List<Task> result = new ArrayList<>();

        for (Task task : allTask) {

            if (condition.meetCriteria(task)) {
                result.add(task);
            }
        }

        return result;
    }


    public interface TaskCondition {

        boolean meetCriteria(Task task);

    }

}
