package pl.sda.structure.tasks;

import pl.sda.structure.tasks.model.Task;
import pl.sda.structure.tasks.model.TaskPriority;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
//          Rozwiazanie nuer1
        //        List<Task> result = new ArrayList<>();
//
//        for (Task task : allTask) {
//
//            if (condition.meetCriteria(task)) {
//                result.add(task);
//            }
//        }
//
//        return result;

        //Rozwiazanie numer 2
//        return allTask
//                .stream()
//                .filter(t->condition.meetCriteria(t))
//                .collect(Collectors.toList());
//         Rozwiazanie numer 3
        return allTask
                .stream()
                .filter(condition::meetCriteria)
                .collect(Collectors.toList());


    }


    public interface TaskCondition {

        boolean meetCriteria(Task task);

    }

}
