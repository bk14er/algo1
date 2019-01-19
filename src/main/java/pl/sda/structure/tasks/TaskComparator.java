package pl.sda.structure.tasks;

import pl.sda.structure.tasks.model.Task;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Comparator;

public class TaskComparator implements Comparator<Task> {

    /**
     * Priorytety według poniższego algorytmu:
     * <p>
     * Najpierw porównujemy TaskPriority
     * jeśli są równe to porównujemy ich pola dueDate (wykorzystaj metodę isBefore() )
     * <p>
     * patrz TaskComparatorTest
     * <p>
     * 1 gdy t1> t2
     * -1 gdy t2 < t1
     * <p>
     * Sytuacja kiedy taski są równe nie wystąpi!
     * <p>
     * <p>
     * Przykładowa tablica :
     * Task{priority=LOW, taskName='iśc do pracy', dueDate=2019-01-17}
     * Task{priority=MEDIUM, taskName='umyć naczynia', dueDate=2019-01-31}
     * Task{priority=MEDIUM, taskName='iść po bułki', dueDate=2019-01-17}
     * Task{priority=MEDIUM, taskName='siłownia', dueDate=2019-01-06}
     * Task{priority=MEDIUM, taskName='iść po bułki', dueDate=2018-11-15}
     * Task{priority=HIGH, taskName='umyc zeby', dueDate=2019-01-17}
     */
    @Override
    public int compare(Task t1, Task t2) {

        if(t1.getPriority().equals(t2.getPriority())){

            if(t1.getDueDate().compareTo(t2.getDueDate()) >0){
                return -1;
            }
            return 1;
        }

        if(t1.getPriority().getLevel() > t2.getPriority().getLevel()){
            return -1;
        }
        return 1;

    }
}
