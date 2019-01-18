package pl.sda.structure.streams;

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

    }


}
