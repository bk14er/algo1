package pl.sda.algorithm.common.advanced.recursive;

public class FibonacciNumbers {

    public static void main(String args[]){

        //Ciąg fibonacciego: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987 itd

        System.out.println(fib(4));
        System.out.println(fib(5));
    }

    /**
     * Ciąg Fibonacciego wyraża się rekurencyjnym wzorem:
     * f(n)=f(n-2)+f(n-1), gdy f(1)=1 oraz f(2)=1.
     * Łatwo obliczyć, że:
     * f(3)=f(1)+f(2)=1+1=2
     * f(4)=f(2)+f(3)=1+2=3
     * f(5)=f(3)+f(4)=2+3=5
     *
     * @param n
     * @return
     */
    public static int fib(int n) {
       //TODO
        return -1;
    }


}
