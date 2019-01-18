package pl.sda.structure.tasks;

import org.junit.Test;
import pl.sda.structure.tasks.model.Task;
import pl.sda.structure.tasks.model.TaskPriority;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TaskFilterWithConditionTest {

    @Test
    public void getOnlyWithLowLevel() {
        Task t1 = new Task(TaskPriority.LOW, "Kup mleko", LocalDate.now());
        Task t2 = new Task(TaskPriority.LOW, "Idz na siłke", LocalDate.now().plusDays(1));
        Task t3 = new Task(TaskPriority.HIGH, "Zrób zadanie domowe", LocalDate.now().plusYears(100));

        //Arrays.asList szybszy sposób na tworzenie listy - zamiast 3x operacja add()
        List<Task> allTasks = Arrays.asList(t1, t2, t3);
        TaskFilterWithCondition filter = new TaskFilterWithCondition(allTasks);

        List<Task> onlyWithLowLevel = filter.getOnlyWith(new TaskFilterWithCondition.TaskCondition() {
            @Override
            public boolean meetCriteria(Task task) {
                return task.getPriority().equals(TaskPriority.LOW);
            }
        });

        assertEquals(onlyWithLowLevel.size(), 2);
        assertEquals(onlyWithLowLevel, Arrays.asList(t1, t2));
    }

    @Test
    public void getOnlyWithMediumLevel() {
        Task t1 = new Task(TaskPriority.LOW, "Kup mleko", LocalDate.now());
        Task t2 = new Task(TaskPriority.LOW, "Idz na siłke", LocalDate.now().plusDays(1));
        Task t3 = new Task(TaskPriority.HIGH, "Zrób zadanie domowe", LocalDate.now().plusMonths(1));
        Task t4 = new Task(TaskPriority.MEDIUM, "Idz na poczte", LocalDate.now().plusYears(100));


        //Arrays.asList szybszy sposób na tworzenie listy - zamiast 3x operacja add()
        List<Task> allTasks = Arrays.asList(t1, t2, t3, t4);
        TaskFilterWithCondition filter = new TaskFilterWithCondition(allTasks);

        List<Task> onlyWithMediumLevel = filter.getOnlyWith(new TaskFilterWithCondition.TaskCondition() {
            @Override
            public boolean meetCriteria(Task task) {
                return task.getPriority().equals(TaskPriority.MEDIUM);
            }
        });

        assertEquals(onlyWithMediumLevel.size(), 1);
        assertEquals(onlyWithMediumLevel, Arrays.asList(t4));
    }

    @Test
    public void getOnlyWithHighLevel() {
        Task t1 = new Task(TaskPriority.LOW, "Kup mleko", LocalDate.now());
        Task t2 = new Task(TaskPriority.LOW, "Idz na siłke", LocalDate.now().plusDays(1));
        Task t3 = new Task(TaskPriority.LOW, "Zrób zadanie domowe", LocalDate.now().plusMonths(1));
        Task t4 = new Task(TaskPriority.MEDIUM, "Idz na poczte", LocalDate.now().plusYears(100));
        Task t5 = new Task(TaskPriority.HIGH, "Wynieść śmieci", LocalDate.now());
        Task t6 = new Task(TaskPriority.HIGH, "Umyć zęby", LocalDate.now());

        //Arrays.asList szybszy sposób na tworzenie listy - zamiast 3x operacja add()
        List<Task> allTasks = Arrays.asList(t1, t2, t3, t4, t5, t6);
        TaskFilterWithCondition filter = new TaskFilterWithCondition(allTasks);

        List<Task> onlyWithMediumLevel = filter.getOnlyWith(new TaskFilterWithCondition.TaskCondition() {
            @Override
            public boolean meetCriteria(Task task) {
                return task.getPriority().equals(TaskPriority.HIGH);
            }
        });

        assertEquals(onlyWithMediumLevel.size(), 2);
        assertEquals(onlyWithMediumLevel, Arrays.asList(t5, t6));
    }

}