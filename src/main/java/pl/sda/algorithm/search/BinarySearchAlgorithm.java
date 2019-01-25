package pl.sda.algorithm.search;

public class BinarySearchAlgorithm {

    /**
     * Uwaga ! Zwracamy indeks w tablicy na którym znaduję się szukany element item
     * Jeśli nie znajdziemy elementu , to zwracamy "-1"
     * <p>
     * Symulacja wyszukiwania binarnego:
     * http://www.cs.armstrong.edu/liang/animation/web/BinarySearch.html
     */
    public int binarySearch(int szukana, int[] array) {

        int left = 0;
        int right = array.length - 1;

        while(left <= right){

            int midle = (left + right) /2;

            if(array[midle] == szukana){
                return midle;
            }

            if(array[midle] < szukana){
                left = midle + 1;
            }else{
                right = midle;
            }
        }
        return -1;
    }

}
