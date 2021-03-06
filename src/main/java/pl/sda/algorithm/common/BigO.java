package pl.sda.algorithm.common;

public class BigO {

    public void foo(int[] array) {
        // O(n)
        for (int i = 0; i < array.length; i++) {
            // ...
        }

        // O(n)
        for (int i = 0; i < array.length; i++) {
            // ...
        }


        // O(n) + O(n)  = 2* O(n) = O(n)
    }

    public void bar(int[] array1, int[] array2) {
        //O(n^2) array1.length == arra2.length

        int n = array1.length;
        int m = array2.length;
        //O(n*m)

        for (int i = 0; i < array1.length; i++) {
            // ...
            for (int j = 0; j < array2.length; j++) {
                // ...
            }
        }

    }

    public void baz(int[] array) {
        //O(n^2)
        for (int i = 0; i < array.length; i++) {
            // ...
            for (int j = 0; j < array.length; j++) {
                // ...
                if (array[i] < array[j]) {
                    // Launch!
                }
            }
        }

    }

    public void beep(int[] array) {

        for (int i = 0; i < array.length; i++) {
            // ...
            for (int j = 0; j < array.length; j++) {
                // ...
                for (int k = 0; k < 999_999; k++) {
                    // Jump!
                }
            }
        }

    }

}
