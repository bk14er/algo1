package pl.sda.structure.map;

import java.util.*;

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
        mapSimple();

        mapWithMultiplyValues();

        mapPassingArguments();
    }

    private static void mapWithMultiplyValues() {
        Map<String, List<Integer>> numbers = new TreeMap<>();


        numbers.put("A_L", Arrays.asList(123_321,123_321,183_213));
        numbers.put("G_L", Arrays.asList(554_321,123_321,183_213));
        numbers.put("D_L", Arrays.asList(154_321,123_321,183_213));

        Set<Map.Entry<String, List<Integer>>> entries = numbers.entrySet();
        
        
        for(Map.Entry<String, List<Integer>> entry : entries){
            System.out.println("Klucz: " + entry.getKey()+",wartość: "+ entry.getValue());
        }


        Set<String> keys = numbers.keySet();
        
        for(String key : keys){
            System.out.println("Wartość: "+  numbers.get(key));
        }
        


        /**
         * Zwróci liste - bo parametryzacja wartości List<Integer>
         */
        numbers.get("A_L");
    }

    private static void mapPassingArguments() {
        List<String> names = Arrays.asList("A_L", "G_L","M_D","K_W");
        List<Integer> numbersList = Arrays.asList(333_231_321, 432_432_423,432_123, 234_123);

        Map<String, Integer> addresses = new HashMap<>();

        for(int i =0 ; i < names.size(); i++){
            addresses.put(names.get(i), numbersList.get(i));
        }
    }

    private static void mapSimple() {
        HashMap<String, Integer> addresses = new HashMap<>();

        Integer anna_lewandowsa = addresses.put("Anna Lewandowsa", 123_532_324);
        Integer mariusz_lewandowski = addresses.put("Mariusz Lewandowski", 523_542_324);
        Integer adam_nawałka = addresses.put("Adam Nawałka", 222_532_324);


        Integer adam_nawałka1 = addresses.put("Adam Nawałka", 111_532_324);

        System.out.println(adam_nawałka1);


        Integer lewandowskaNumber = addresses.get("Anna Lewandowsa");
        assert 123_532_324 == lewandowskaNumber;

        Integer donald_tusk_null = addresses.get("Donald Tusk");
        assert donald_tusk_null == null;

        Integer donaldTuskNumber = addresses.getOrDefault("Donald Tusk", 555_555_123);
        assert 555_555_123 == donaldTuskNumber;


        Set<String> keys = addresses.keySet();

        for(String key : keys){
            System.out.println(addresses.get(key));
        }

        Set<Map.Entry<String, Integer>> entries = addresses.entrySet();

        for(Map.Entry<String, Integer> keyAndValues : entries){
            System.out.println("Klucz: " + keyAndValues.getKey()+ ", Wartość: "+ keyAndValues.getValue());
        }

        Collection<Integer> values = addresses.values();

        for(Integer value : values){
            System.out.println("Wartość: "+ value);
        }
    }


}
