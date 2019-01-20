package pl.sda.structure.map;

import java.util.HashMap;
import java.util.Map;

public class MapIntroduction {

    /**
     * clear: Removes all the elements from the map.
     * containsKey: Returns true if the map contains the requested key.
     * containsValue: Returns true if the map contains the requested value.
     * equals: Compares an Object with the map for equality.
     * get: Retrieve the value of the requested key.
     * keySet: Returns a Set that contains all keys of the map.
     * put: Adds the requested key-value pair in the map.
     * remove: Removes the requested key and its value from the map, if the key exists.
     * size: Returns the number of key-value pairs currently in the map.
     *
     *  Ksiazka adresowa String ->Integer
     *  Jedna osoba - wiele numerów
     *
     * @param args
     */
    public static void main(String args[]) {

        Map<String, Integer> addresses = new HashMap<>();

        Integer anna_lewandowsa = addresses.put("Anna Lewandowsa", 123_532_324);
        Integer mariusz_lewandowski = addresses.put("Mariusz Lewandowski", 523_542_324);
        Integer adam_nawałka = addresses.put("Adam Nawałka", 222_532_324);


        Integer adam_nawałka1 = addresses.put("Adam Nawałka", 111_532_324);

        System.out.println(adam_nawałka1);


        Integer lewandowskaNumber = addresses.get("Anna Lewandowsa");
        assert 123_532_324 == lewandowskaNumber;

        Integer integer = addresses.get("Donald Tusk");


        Integer donaldTuskNumber = addresses.getOrDefault("Donald Tusk", 555_555_123);
        assert 555_555_123 == donaldTuskNumber;


    }



}
