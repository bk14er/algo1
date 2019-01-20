package pl.sda.structure.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import static org.junit.Assert.assertEquals;

public class FunctionTest {

    /**
     * Funkcja zamienia liczbę na ciąg znaków
     */
    @Test
    public void changeIntegerIntoString() {

        /**
         * Funkcja zgodnie z definicja z matematyki zamienia wartość przekazaną jako parametr
         * i zwraca rezultat
         */
        Function<Integer, String> changeIntegerIntoString = (number) -> String.valueOf(number);

        String expected1 = changeIntegerIntoString.apply(10);
        String expected2 = changeIntegerIntoString.apply(111);

        assertEquals("10", expected1);
        assertEquals("111", expected2);
    }


    @Test
    public void changeToUpperCase() {
        /**
         * TODO
         * Napisz funkcje zamieniająca podany ciąg znaków do dużych liter (użyj toUpperCase())
         */
        Function<String, String> changeToUpperCaseFunction = str->str.toUpperCase();

        String expected1 = changeToUpperCaseFunction.apply("aaa");
        String expected2 = changeToUpperCaseFunction.apply("abcd");
        String expected3 = changeToUpperCaseFunction.apply("dowolny tekst");

        assertEquals("AAA", expected1);
        assertEquals("ABCD", expected2);
        assertEquals("DOWOLNY TEKST", expected3);
    }

    @Test
    public void changeToLowerCase() {
        /**
         * TODO
         * Napisz funkcje zamieniająca podany ciąg znaków do małych liter (użyj toLowerCase())
         */
        Function<String, String> changeIntegerIntoString = (str)->str.toLowerCase();

        String expected1 = changeIntegerIntoString.apply("Aaa");
        String expected2 = changeIntegerIntoString.apply("aBcD");
        String expected3 = changeIntegerIntoString.apply("TEST1");
        String expected4 = changeIntegerIntoString.apply("DoM");

        assertEquals("aaa", expected1);
        assertEquals("abcd", expected2);
        assertEquals("test1", expected3);
        assertEquals("dom", expected4);
    }


}
