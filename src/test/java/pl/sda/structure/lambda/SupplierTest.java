package pl.sda.structure.lambda;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.function.Supplier;

import static org.junit.Assert.assertEquals;

public class SupplierTest {

    @Test
    public void testSupplier() {
        /**
         * Supplier "dostarcza" obiekty
         */
        Supplier<Long> one = () -> 1l;
        assertEquals(1l, (long) one.get());
    }

    @Test
    public void supplyTestString() {
        /**
         * TODO - supplier zwraca obiekt String o wartośći "test"
         */
        Supplier<String> test = ()->"test";
        assertEquals("test", test.get());
    }

    @Test
    public void supplyBigDecimal() {
        /**
         * TODO - supplier zwraca obiekt BigDecimal o wartośći 41
         *  BigDecimala tworzymy na 2 sposoby : new BigDecimal("41") lub BigDecimal.valueOf(41)
         */
        Supplier<BigDecimal> test = () -> BigDecimal.valueOf(41l);
        assertEquals(BigDecimal.valueOf(41l), test.get());
    }

    @Test
    public void supplyManager() {
        /**
         * Supplier użytkownika który jest managerem i nazywa się Maciek
         */
        TestUser manager = new TestUser();
        manager.setName("Maciek");
        manager.setManager(true);

        Supplier<TestUser> test = () -> manager;

        assertEquals(true, test.get().isManager());
        assertEquals("Maciek", test.get().getName());
    }

    @Test
    public void supplyManagerWhereAgeLessThan30() {

        TestUser testUser = new TestUser();

        testUser.setManager(true);
        testUser.setAge(23);

        Supplier<TestUser> test = () -> testUser;

        assertEquals(true, test.get().isManager());
        assertEquals(true, test.get().getAge() < 30);
    }


}
