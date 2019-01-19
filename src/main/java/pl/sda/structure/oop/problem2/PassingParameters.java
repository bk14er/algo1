package pl.sda.structure.oop.problem2;

import java.math.BigDecimal;

public class PassingParameters {

    public static void main(String args[]){

        Parameter parameter = new Parameter()
                .sum(12)
                .name("cos");

    }


    public static class Parameter{

        private int sum;
        private String name;
        private String title;
        private BigDecimal amount;
        private BigDecimal credit;
        private String surname;
        private String address;

        public Parameter sum(int sum){
            this.sum = sum;
            return this;
        }

        public Parameter name(String name){
            this.name = name;
            return this;
        }


    }


    /**
     * Jak zastąpić wywołanie z wieloma parametrami ?
     */
    public String execute(Parameter parameter){

        // ..jakieś operacje...
        return "";
    }
}
