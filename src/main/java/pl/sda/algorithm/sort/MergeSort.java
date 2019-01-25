package pl.sda.algorithm.sort;


// Zalety: Bardzo szybki algorytm sortowania - O(n log(n))
// WADY: Potrzebuje dodatkowej tablicy
public class MergeSort {

    public void sort(int arr[], int l, int r) {
        System.out.println("Dziele tablicę -> left index: " + l + ", right index " + r);

        if (l < r) {
            // Znajdz punkt środkowy
            int m = (l + r) / 2;

            // Sortuj pierwszą i drugą połowke
            sort(arr, l, m);
            sort(arr, m + 1, r);


            // Połącz dwie połowki
            merge(arr, l, m, r);
        }
    }

    // Polącz dwie tablice
    // Pierwsza podtablica to arr[l..m]
    // Druga tablica to arr[m+1..r]
    public void merge(int arr[], int l, int m, int r) {
        System.out.println("Scalam na indeksie left: "+l + ", punkt środokowy m: "+ m +",indeks right: "+ r );

        // Wyznacz długości 2 tablic do scalenia
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Utwórz 2 tymczasowe tablice */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /* Skopiuj dane do tablic tymczasowych */
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];


        /* Połacz 2 tablice */

        // Inicjalizacja indeksów podtablicy pierwszej i drugiej
        int i = 0, j = 0;

        // Początkowy index łączonych tablic
        int k = l;
        while (i < n1 && j < n2) {

            //Wstawiamy na odpowiednie miejsce w tablicy łączączej
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Skopiuj pozostałe elementy L[] jeśli jakieś zostały*/
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Skopiuj pozostałe elementy R[] jeśli jakieś zostały*/
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

        System.out.println("After merge");
        printArray(arr);
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


}
