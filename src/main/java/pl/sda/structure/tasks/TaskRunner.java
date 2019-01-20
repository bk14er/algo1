package pl.sda.structure.tasks;

import pl.sda.structure.tasks.model.Task;
import pl.sda.structure.tasks.model.TaskPriority;

import java.time.LocalDate;
import java.util.*;

public class TaskRunner {

    public static void main(String args[]) {
        Queue<Task> tasks = new PriorityQueue<>(new TaskComparator());

        tasks.offer(new Task(TaskPriority.MEDIUM, "iść po bułki", LocalDate.now()));
        tasks.offer(new Task(TaskPriority.HIGH, "umyc zeby", LocalDate.now()));
        tasks.offer(new Task(TaskPriority.MEDIUM, "siłownia", LocalDate.now().minusDays(11)));
        tasks.offer(new Task(TaskPriority.MEDIUM, "umyć naczynia", LocalDate.now().plusDays(14)));
        tasks.offer(new Task(TaskPriority.MEDIUM, "iść po bułki", LocalDate.now().minusMonths(2).minusDays(2)));
        tasks.offer(new Task(TaskPriority.LOW, "iśc do pracy", LocalDate.now()));

//        do{
//            Task poll = tasks.poll();
//            System.out.println(poll);
//
//        }while (!tasks.isEmpty());

        groupByPriority2(tasks);



    }

    public Map<TaskPriority, Integer> groupByPriorirty(Queue<Task> tasks){
        Map<TaskPriority, Integer> groupByPriority = new HashMap<>();

        for(Task task : tasks){
            Integer orDefault = groupByPriority.getOrDefault(task.getPriority(), 0);
            groupByPriority.put(task.getPriority(),orDefault);
        }

        return groupByPriority;
    }

    public static Map<TaskPriority, List<Task>> groupByPriority2(Queue<Task> tasks){
        //TODO

        return null;
    }

}
