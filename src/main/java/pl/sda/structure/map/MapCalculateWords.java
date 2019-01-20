package pl.sda.structure.map;

import java.util.HashMap;
import java.util.Map;

public class MapCalculateWords {

    public static void main(String args[]) {
        String example1 = "aaaAAAbbbcccDDD";
        Map<String, Integer> groupByWordCount = groupByWordsCount(example1);

        /**
         * Powinno wyświetlić dla w/w przykładu mape z posortowanymi kluczami:
         *
         * klucz wartość
         *  a      6
         *  b      3
         *  c      3
         *  d      3
         */
        System.out.println(groupByWordCount);
    }

    /**
     * Pogrupuj znaki i ilość ich wystąpienia w przykadowym tekscie
     * <p>
     * Algorytm:
     * <p>
     * Najpierw pobierasz groupByWords.get(charAtI) i zapisujesz wartośc klucza do zmiennej ilosc
     * Robisz update w mapie dla klucza charAtI ( groupByWords.put(chartAtI, ilosc++)
     *
     * @return
     */
    private static Map<String, Integer> groupByWordsCount(String word) {
        Map<String, Integer> groupByWords = new HashMap<>();

        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            String charAtI = word.substring(i, i + 1);
            //TODO wykonaj kroki według powyższego algorytmu
            throw new RuntimeException("TODO");

        }


        return groupByWords;

    }

}
