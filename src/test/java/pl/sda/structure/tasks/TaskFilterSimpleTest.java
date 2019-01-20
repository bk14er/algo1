package pl.sda.structure.tasks;

import org.junit.Test;
import pl.sda.structure.tasks.TaskFilterSimple.Condition;
import pl.sda.structure.tasks.model.Task;
import pl.sda.structure.tasks.model.TaskPriority;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * LocalDate ->  poczytaj w LocalDateTutorial
 */
public class TaskFilterSimpleTest {


    @Test
    public void testConditionAsInstance(){
        Task t1 = new Task(TaskPriority.LOW, "Kup mleko", LocalDate.now());
        Task t2 = new Task(TaskPriority.LOW, "Idz na siłke", LocalDate.now().plusDays(1));
        Task t3 = new Task(TaskPriority.HIGH, "Zrób zadanie domowe", LocalDate.now().plusYears(100));

        //Arrays.asList szybszy sposób na tworzenie listy - zamiast 3x operacja add()
        List<Task> allTasks = Arrays.asList(t1, t2, t3);
        TaskFilterSimple filter = new TaskFilterSimple(allTasks);


        List<Task> onlyWithLowLevel = filter.getWithPriority(new TaskFilterSimple.LowCondition());
        assertEquals(onlyWithLowLevel.size(), 2);
        assertEquals(onlyWithLowLevel, Arrays.asList(t1, t2));

    }

    @Test
    public void testConditionAsAnonynmus(){
        Task t1 = new Task(TaskPriority.LOW, "Kup mleko", LocalDate.now());
        Task t2 = new Task(TaskPriority.LOW, "Idz na siłke", LocalDate.now().plusDays(1));
        Task t3 = new Task(TaskPriority.HIGH, "Zrób zadanie domowe", LocalDate.now().plusYears(100));

        //Arrays.asList szybszy sposób na tworzenie listy - zamiast 3x operacja add()
        List<Task> allTasks = Arrays.asList(t1, t2, t3);
        TaskFilterSimple filter = new TaskFilterSimple(allTasks);


        List<Task> onlyWithLowLevel = filter.getWithPriority(new Condition() {
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
        TaskFilterSimple filter = new TaskFilterSimple(allTasks);

        List<Task> onlyWithMediumLevel = filter.getOnlyWithMediumLevel();

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
        TaskFilterSimple filter = new TaskFilterSimple(allTasks);

        List<Task> onlyWithMediumLevel = filter.getOnlyWithHighLevel();

        assertEquals(onlyWithMediumLevel.size(), 2);
        assertEquals(onlyWithMediumLevel, Arrays.asList(t5, t6));
    }
}