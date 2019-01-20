package pl.sda.structure.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream.of dla róznych kombinacji - z tablic statycznych
 * <p>
 * operacje pośrednie (zwracające nowy strumień)
 * peek - Służy najczęsniej do debugowania (wpisywania kolejnych elementów streamu
 * filter- Pozwala znajdować obiekt w strumieniu o danych włanościach, możemy wybrać dowolny dopasowany obiekt lub pierwszy dopasowany
 * map - Zmienia przetwarzany element na coś innego, czyli pobiera element jednego typu i zwraca element innego typu
 * limit - Ogranicza liczbę elementów w strumieniu do podanej liczby
 * findFirst - Zwraca pierwszy elment streamu
 * findAny - Zwraca losowy element streamu
 * matchAll - Match stosujemy gdy interesuje nas występowanie w strumieniu elementu o danych własnościach
 * matchAny - Jeśli w strumieniu wstępuje chciaż jeden element
 * sorted - Sortuje elementy w naturalnym dla nich porządku.
 * distinct - Usuwa powtórzenia
 * reduce - Pozwala zredukować strumień danych do pojedynczej wartości.
 * <p>
 * operacje końcowe (terminalne):
 * <p>
 * forEach - funkcja forEach - iteracja po kazdym elementcie
 * collect - Zbiera elementy strumienia w listę.
 * max - zwraca element największy (należy przekazać Comprator)
 * min - zwraca element najmniejszy (należy przekazać Comprator)
 */
public class StreamIntroduction {

    public static void main(String args[]) {


        //Tworzony statycznie poprzez of
        List<Integer> collect = Stream
                .of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        List<String> collect1 = Stream
                .of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(x -> x % 2 == 0)
                .map(numerParzysty -> numerParzysty.toString())
                .collect(Collectors.toList());

        Stream.of("a2","a3","b1","a11","d22","e12")
                .map(str -> str.toUpperCase())
                .filter(str->str.startsWith("A"))
                .forEach(System.out::println);

        Stream.of("a2","a3","b1","a11","d22","e12")
                .sorted((str1,str2) -> str1.length() - str2.length() )
                .forEach(System.out::println);

        streamDisplayInformations();


        //operacuje na kolekcjach
        List<Integer> elements = new ArrayList<>();
        elements.stream();


    }

    private static void streamDisplayInformations() {
        System.out.println("streamDisplayInformations");


        Stream.of("a2", "a3", "b1", "a11", "d22", "e12")
                .map(str -> {
                    System.out.println("Map: " + str);
                    return str.toUpperCase();
                })
                .filter(
                        str -> {
                            System.out.println("Filter: " + str);
                            return str.startsWith("A");
                        })
                .forEach(e -> {
                    System.out.println("ForEach:" + e);
                });
    }


}
