package pl.sda.algorithm.common.advanced;

import java.util.ArrayList;
import java.util.List;

public class IntersectionSolution {

    /**
     * Wersja algorytmu "brute force" -
     * <p>
     * for i in array1
     * <p>
     * for j in array2
     * <p>
     * if(array[i] == array1[j]
     * collector.add(array[i]);
     * endIF
     * endFor j
     * <p>
     * end For i
     * <p>
     * czyli 2 petle i sprawdzenie warunku array1[i] == array2[j]
     */
    public List<Integer> intersectBruteForce(int[] array1, int[] array2) {
        List<Integer> collector = new ArrayList<>();

        for(int i = 0; i < array1.length; i++){

            for(int j = 0; j < array2.length; j++){
                if(array1[i] == array2[j]){
                    collector.add(array1[i]);
                }

            }
        }
        return collector;
    }


    /**
     * 1. Iteracja :
     * i = 0
     * 1 2 4 5 6
     * j = 0
     * 2 3 5 7
     * <p>
     * OPIS ITERACJI 1: array1[i] < array2[j] czyli zwiększamy i++
     * <p>
     * 2. Iteracja:
     * i = 1
     * 1 2 4 5 6
     * j = 0
     * 2 3 5 7
     * OPIS ITERACJI 2 : array1[i] == array2[j] wówczas dodajemy element collector.add(array[j] i inkrementujemy i++ i j++
     * <p>
     * 3. Iteracja:
     * i = 2
     * 1 2 4 5 6
     * j = 0
     * 2 3 5 7
     * OPIS ITERACJI 3 : array1[i] > array2[j] więc zwiększymy j++
     * <p>
     * <p>
     * ....itd czyli do obsłużenia wewnątrz pętli while() są 3 warunki:
     * <p>
     * array1[i] < array2[j]
     * array1[i] == array2[j]
     * array1[i] > array2[j]
     */
    public List<Integer> intersectElegant(int[] array1, int[] array2) {
        List<Integer> collector = new ArrayList<>();

        //tablice mogą mieć rózne długości
        int i = 0;
        int j = 0;

        int n = array1.length;
        int m = array2.length;

          while( i < n && j < m)
          {
              if(array1[i] == array2[j]){
                  collector.add(array1[i]);
                  i++;
                  j++;
              }

              if(array1[i] > array2[j]){
                  j++;
              }

              if(array1[i] < array2[j]){
                  i++;
              }
          }

        return collector;
    }
}
