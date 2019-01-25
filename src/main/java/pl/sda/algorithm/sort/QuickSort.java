package pl.sda.algorithm.sort;

public class QuickSort {

    public int[] sort(int[] array) {

        // Iteruj po tablicy i sprawdzaj czy wszystkie elementy na lewo od "pivot" są mniejsze
        // i elementy na prawo od "pivot" są większe
        // Powtarzamy ten proces dla nowy tablic, na lewej i prawej od indeksu "pivot"
        quickSort(array, 0, array.length - 1);

        return array;
    }

    private void quickSort(int[] array, int left, int right) {

        if(left > right){
            return;
        }

        // Krok 1: Podziel tablice dla punktu pivot - i zwróc indeks w obrębie które
        // dokonujemy podziału na 2 podtablice
        int index = partition(array, left, right);

        if (left < index - 1)
            quickSort(array, left, index - 1);
        if (index < right)
            quickSort(array, index, right);

    }


    public static int partition(int[] array, int left, int right) {

        // pivot z ang. "oś"
        // Dobierz punkt pivot - w naszym przpadku to środkowy element (dla uproszczenia)
        int pivot = array[(left + right) / 2];

        // Przesuwaj lewy i prawy indeks do siebie
        while (left <= right) {

            // Przesuwaj lewy indeks do momentu aż znajdziesz element większy od "pivot"
            while (array[left] < pivot) {
                left++;
            }
            // Przesuwaj prawy indeks aż znajdziesz element mniejszy od pivotu
            while (array[right] > pivot) {
                right--;
            }

            // Dodakowe sprawdzenie , czy nie przesuneliśmy za daleko lewego lub prawego punktu
            if (left <= right) {
                //zamien elementy
                swap(array, left, right);
                left++;
                right--;
            }
        }
        // W tym momencie wszystkie elementy na lewo są mniejsze , a na prawo większe od "pivot"
        // Teraz musimy zwrócić następny punkt podziału
        return left;
    }

    private static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

}
