package pl.sda.algorithm.common.advanced.recursive;

public class Recursion {

    public static final int N = 5;

    public static void main(String args[]) {

        int n = 5;

        System.out.println("Suma iteracyjnie: " + iterationSum(N));

        System.out.println("Suma rekurencyjnie: " + recursionSum(N));

        System.out.println("Silnia 5: " + fractional(N));

        System.out.println("REKURENCJA HEAD:");
        head(10);

        System.out.println("REKURENCJA TAIL:");
        tail(10);

        System.out.println("Suma rekurenyjnie ze schowkiem: " + recursionSumWithAccumulator(1, N));

    }

    public static int iterationSum(int N) {
        int result = 0;

        for (int i = 1; i < N; i++) {
            result = i + result;
        }

        return result;
    }

    /**
     * N
     * 5 + recursionSum(4)
     * 4 + recursionSum(3)
     * 3 + recursionSum(2)
     * 2 + recursionSum(1)
     * 1  => 1
     */
    public static int recursionSum(int N) {
        if (N == 1) {
            return 1;
        }
        return N + recursionSum(N - 1);
    }

    /**
     * 5! = 1 * 2 * 3 * 4 * 5
     * <p>
     * 5 * silna(4) ..
     * 4 * silnia(3)
     */
    public static int fractional(int N) {

        if (N < 2) {
            return 1;
        }

        return N * fractional(N - 1);
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

        if(number == 0){
            return;
        }

        head(number -1);
        System.out.println(number);
    }

    /**
     * Rekurencja ogonowa lub rekurencja prawostronna(ang. tail call)
     *
     * @param number
     */
    public static void tail(int number) {
        if(number == 0){
            return;
        }

        System.out.println(number);
        tail(number -1);

    }


}
