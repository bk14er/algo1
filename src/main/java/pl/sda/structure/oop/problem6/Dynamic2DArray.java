package pl.sda.structure.oop.problem6;

import pl.sda.structure.oop.problem6.operation.Expression;
import pl.sda.structure.oop.problem6.operation.Operation;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dynamic2DArray {

    /**
     * Zaprojektuj poniższą strukturę używajać List w jave
     * <p>
     * 1  2  3  4  5
     * 6  7  8  9  10
     * 11 12 13 14 15
     * 16 17 18 19 20
     * 21 22 23 24 25
     */
    public static void main(String args[]) {
        int[][] staticArray = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25},
        };




        List<List<Integer>> elements = new ArrayList<>();

        elements.add(Arrays.asList(1,2,3,4,5));


        List<List<Expression>> excelElements = new ArrayList<>();

        excelElements.add(Arrays.asList(new Expression("12"),new Expression("=12")));
        excelElements.add(Arrays.asList(new Expression("=15"),new Expression("=16")));


        for(List<Expression> expressions : excelElements){

            for(Expression expression : expressions){
                System.out.println(expression.evaluate());
            }

        }



















        /**
         * FIRST
         *  =12, =14
         */


        /**
         * SECOND
         *
         *  =2+2
         *  +
         *  =8+8
         *  -
         *  =19 - 2
         *  *
         *  2
         */

    }

}

