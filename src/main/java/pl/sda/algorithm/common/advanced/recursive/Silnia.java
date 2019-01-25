package pl.sda.algorithm.common.advanced.recursive;

public class Silnia {

    public static void main(String args[]) {

        int n = 5;

        // 5 * 4 * 3 * 2 * 1
        System.out.println("Silnia : " + n + "!= " + fractional(n));


        // 3 * 2 * 1
        n = 3;
        System.out.println("Silnia : " + n + "!= " + fractional(n));
    }

    //Podpowiedz : zadanie podobne do sumy rekurencyjnej Recursion. Wystarczy zmienić znak.
    private static int fractional(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fractional(n - 1);
    }

}
