package pl.sda.structure.tasks;

import pl.sda.structure.tasks.model.Task;
import pl.sda.structure.tasks.model.TaskPriority;

import java.util.ArrayList;
import java.util.List;

public class TaskFilterSimple {

    private final List<Task> allTask;

    public TaskFilterSimple(List<Task> allTask) {
        this.allTask = allTask;
    }

    public interface Condition {

        boolean meetCriteria(Task task);

    }

    public static class LowCondition implements Condition{

        @Override
        public boolean meetCriteria(Task task) {
            return task.getPriority().equals(TaskPriority.LOW);
        }
    }


    public List<Task> getWithPriority(Condition condition) {
        List<Task> result = new ArrayList<>();

        for(Task task : allTask){

            if(condition.meetCriteria(task)){
                result.add(task);
            }

        }

        return result;

    }

    public List<Task> getWithPriority(TaskPriority taskPriority) {
        List<Task> result = new ArrayList<>();

        for(Task task : allTask){

            if(task.getPriority().equals(taskPriority)){
                result.add(task);
            }

        }

        return result;

    }


    /**
     * Pobierz taski tylko z priorytetem LOW
     */
    public List<Task> getWithLowPriority() {
        List<Task> result = new ArrayList<>();

        for(Task task : allTask){

            if(task.getPriority().equals(TaskPriority.LOW)){
                result.add(task);
            }

        }

        return result;

    }


    /**
     * Pobierz taski tylko z priorytetem MEDIUM
     */
    public List<Task> getOnlyWithMediumLevel() {
        List<Task> result = new ArrayList<>();

        for(Task task : allTask){
            if(task.getPriority().equals(TaskPriority.MEDIUM)){
                result.add(task);
            }
        }

        return result;
    }


    /**
     * Pobierz taski tylko z priorytetem HIGH
     */
    public List<Task> getOnlyWithHighLevel() {
        List<Task> result = new ArrayList<>();

        for(Task task : allTask){
            if(task.getPriority().equals(TaskPriority.HIGH)){
                result.add(task);
            }
        }

        return result;
    }


}
