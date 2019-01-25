package pl.sda.algorithm.common.advanced.recursive;

public class Recursion {

    public static final int N = 5;

    public static void main(String args[]) {

        int n = 5;
        System.out.println("REKURENCJA HEAD:");
        head(10);

        System.out.println("REKURENCJA TAIL:");
        tail(10);

        System.out.println("Suma iteracyjnie: " + iterationSum(N));
        System.out.println("Suma rekurencyjnie: " + recursionSum(N));

        System.out.println("Suma rekurenyjnie ze schowkiem: " + recursionSumWithAccumulator(1, N));

    }

    public static int iterationSum(int N) {
        return -1;
    }

    public static int recursionSum(int N) {
        return -1;
    }

    public static int recursionSumWithAccumulator(int schowek, int N) {
        return -1;
    }

    /**
     * Rekurancja lewostronna (ang. head call)
     *
     * @param number
     */
    public static void head(int number) {
    }

    /**
     * Rekurencja ogonowa lub rekurencja prawostronna(ang. tail call)
     *
     * @param number
     */
    public static void tail(int number) {
    }


}
