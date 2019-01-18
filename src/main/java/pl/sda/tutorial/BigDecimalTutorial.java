package pl.sda.tutorial;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Więcej informacji na :
 * https://www.mberkan.pl/2014/08/03/operacje-na-kwotach-w-javie/
 */
public class BigDecimalTutorial {

    public static void main(String args[]) {

        //Konstrkujca bigDecimal poprzez konstruktor
        BigDecimal value1 = new BigDecimal("13.0");
        BigDecimal value2 = new BigDecimal("2.0");

        //Nowy obiekt można także stworzyć poprzez BigDecimal.valueOf()- istnieje kilka
        //Przeciązonych wersji
        BigDecimal.valueOf(123);// z typu integer
        BigDecimal.valueOf(55l); //Z typu long
        BigDecimal.valueOf(224.2); //z typu double


        //Sumowanie elementów
        BigDecimal sum = value1.add(value2); //15.0

        //Odejmowanie
        BigDecimal diff = value1.subtract(value2); // 11.0

        //Mnożenie
        BigDecimal multiplication = value1.multiply(value2); // 26.0


        //Dzielenie
        BigDecimal divide = value1.divide(value2); //6.5

        /**
         * W przypadku dzielenie pojawia się problem z dzieleniem niecałkowity(wynik są liczby po przecinku)
         *
         *  np. 0.33333333132213
         *
         *  BigDecimal ma problem - ponieważ nie wiem jak zaakrąglać i rzuca wyjątek ArithmeticException
         *
         *  2.5 / 1.5 = 1.66666666667
         *
         */
        BigDecimal a = new BigDecimal("2.5");
        BigDecimal b = new BigDecimal("1.5");

        try {
            BigDecimal problemWithDiv = a.divide(b);

        } catch (ArithmeticException ex) {
            System.out.println("Wystąpił problem: " + ex.getMessage());
        }


        /**
         * W tym celu należy podać sposób zaakrąglania -
         * jako 2 argument do funkcji divide, jest to enum RoundingMode
         *
         */
        BigDecimal correctDividing = a.divide(b, RoundingMode.CEILING); //1.7 zaakrąglanie do 'sufitu'


        /**
         *
         * Jeśli chcemy zaakrąglic do konkretnej liczby miejsc należy(domyślnie jest do 1 po przecinku):
         *
         */


        //Zwróci 1.667 - operacja setScale(3) przed dzieleniem
        BigDecimal correctDividingWithBeforeScale = a.setScale(3).divide(b, RoundingMode.CEILING); //1.667


        //Zwróci 1.700 - operacja setScale(3) dopiero po wykonaniu dzielenia
        BigDecimal correctDividingWithScaleAfter = a.divide(b, RoundingMode.CEILING).setScale(3);


        /**
         * W przykładowo enum RoudingMode i przekształcenia, wypróbuj je na w/w przykładznie:
         *
         *
         * CEILING: Ceiling function
         *
         *                  0.333  ->   0.34
         *                 -0.333  ->  -0.33
         * DOWN: Round towards zero
         *
         *                  0.333  ->   0.33
         *                 -0.333  ->  -0.33
         * FLOOR: Floor function
         *
         *                  0.333  ->   0.33
         *                 -0.333  ->  -0.34
         * HALF_UP: Round up if decimal >= .5
         *
         *                  0.5  ->  1.0
         *                  0.4  ->  0.0
         * HALF_DOWN: Round up if decimal > .5
         *
         *                  0.5  ->  0.0
         *                  0.6  ->  1.0
         *
         */


    }

}

