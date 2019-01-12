package pl.sda.algorithm.common;

public class MDIntReverser {


    public int reverse(int x) {
        boolean isNegative = x < 0;

        if (isNegative) {
            x = x * -1;
        }

        int reverse = 0;
        int lastDigit = 0;

        //Dopóki długość liczby x>=1
        while (x >= 1) {
            lastDigit = x % 10;

            reverse = reverse * 10 + lastDigit;

            x = x / 10;
        }
        return isNegative ? reverse*-1: reverse;
    }

}
