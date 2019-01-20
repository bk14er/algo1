package pl.sda.structure.streams;

import java.util.function.Predicate;

public class LambdaIntroduction {


    @FunctionalInterface
    public interface FilterString {

        boolean filterString(String str);

    }

    public static void main(String args[]) {

        Predicate<String> filter = str -> str.length() > 10;

        System.out.println(filter.test("aabc"));

//        (parameters) -> {ciało_funkcji}

        FilterString filterAsLamdas = (String test) -> test.length() > 10;


        System.out.println(filterAsLamdas.filterString("abds"));

    }


}
