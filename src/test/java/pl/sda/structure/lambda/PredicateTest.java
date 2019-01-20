package pl.sda.structure.lambda;

import org.junit.Test;

import java.util.function.Predicate;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PredicateTest {

    @Test
    public void testEmptyPredicate() {
        Predicate<String> pustyString = s -> s.isEmpty();
        assertTrue(pustyString.test(""));
    }

    @Test
    public void stringEndWith() {
        /**
         * TODO
         *   Utwórz predykat sprawdzajacy czy string konczy się na litere K
         *   czyli np. dla ciągu znaków
         *          "maK" zwróci true
         *          "mak" zwroci false
         *
         *          Wykorzystaj metodę endWith
         *
         *
         *          Więcej przykładów poniżej w assercjach
         */
        Predicate<String> endWithPredicate = (s) -> s.endsWith("K");

        assertTrue(endWithPredicate.test("maK"));
        assertTrue(endWithPredicate.test("K"));
        assertFalse(endWithPredicate.test("AKa"));
        assertFalse(endWithPredicate.test("aassS"));
    }


    @Test
    public void stringStartWith() {

        /*
         * TODO
         *   Utwórz predykat sprawdzajacy czy string zaczyna się ciągiem znaków "wit"
         *   Wykorzystaj metodę startWith
         *   Więcej przykładów poniżej w assercjach
         */
        Predicate<String> startWithWit = (s) -> s.startsWith("wit");

        assertTrue(startWithWit.test("wit"));
        assertTrue(startWithWit.test("witwithh"));
        assertTrue(startWithWit.test("with"));
        assertTrue(startWithWit.test("witcher"));
        assertFalse(startWithWit.test("asd"));
        assertFalse(startWithWit.test("mnbvcfd"));
    }

    @Test
    public void stringLengthEquals10() {
        /*
         * TODO
         *   Utwórz predykat sprawdzajacy czy długośc string jest równa 10
         *   Wykorzystaj metodę length()
         *   Więcej przykładów poniżej w assercjach
         */
        Predicate<String> equalsTen = (s) -> s.length() == 10;

        assertTrue(equalsTen.test("0123456789"));
        assertTrue(equalsTen.test("abcdefghij"));
        assertFalse(equalsTen.test("wit"));
        assertFalse(equalsTen.test("witwithh"));
        assertFalse(equalsTen.test("with"));
        assertFalse(equalsTen.test("witcher"));
        assertFalse(equalsTen.test("asd"));
        assertFalse(equalsTen.test("mnbvcfd"));
    }


    @Test
    public void lestThen10Charts() {
        /**
         * TODO
         *   Utwórz predykat sprawdzajacy czy długośc string jest mniejsza od 10
         *   Wykorzystaj metodę length()
         *   Więcej przykładów poniżej w assercjach
         */
        Predicate<String> lestThen10Charts = x -> x.length() < 10;

        assertFalse(lestThen10Charts.test("0123456789"));
        assertFalse(lestThen10Charts.test("abcdefghij"));
        assertTrue(lestThen10Charts.test("wit"));
        assertTrue(lestThen10Charts.test("witwithh"));
        assertTrue(lestThen10Charts.test("with"));
        assertTrue(lestThen10Charts.test("witcher"));
        assertTrue(lestThen10Charts.test("asd"));
        assertTrue(lestThen10Charts.test("mnbvcfd"));
    }

    @Test
    public void isPredicateManagerTest() {
        /**
         * Predykat sprawdz czy użytkownik jest managerem i ma 42 lata
         */
        Predicate<TestUser> isManagerWith42YearsOld = manager -> manager.isManager() && manager.getAge() == 42;

        TestUser manager = new TestUser();
        manager.setManager(true);
        manager.setAge(42);

        TestUser worker1 = new TestUser();
        worker1.setManager(false);
        worker1.setAge(42);

        TestUser worker2 = new TestUser();
        worker2.setManager(false);
        worker2.setAge(55);

        boolean expected1 = isManagerWith42YearsOld.test(manager);
        boolean expected2 = isManagerWith42YearsOld.test(worker1);
        boolean expected3 = isManagerWith42YearsOld.test(worker2);

        assertTrue(expected1);
        assertFalse(expected2);
        assertFalse(expected3);

    }


}
