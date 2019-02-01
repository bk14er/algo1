package pl;

import java.util.*;

public class Example {

    public static void main(String args[]){

        test(new ArrayList<>());
        test(new HashSet<>());
        test(new LinkedList<>());

        Set<String> set = new TreeSet<>();

        set.add("z");
        set.add("a");

        for(String elem : set){
            System.out.println(elem);
        }


    }


    public static void test(Collection<String> elements){



    }


}
