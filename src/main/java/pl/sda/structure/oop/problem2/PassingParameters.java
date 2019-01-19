package pl.sda.structure.oop.problem2;

import java.math.BigDecimal;

public class PassingParameters {

    public static void main(String args[]) {


        StringBuilder stringBuilder = new StringBuilder()
                .append("cos")
                .append("test")
                .append("fdsfd");

        String builded = stringBuilder.toString();

        BigDecimal.valueOf(12.3)
                .add(new BigDecimal("123.2"))
                .add(new BigDecimal("22.2"));


        Parameter parameter = new Parameter()
                .sum(12)
                .amount(new BigDecimal("123,.12"))
                .title("title")
                .name("name");

    }


    public static class Parameter {

        private int sum;
        private String name;
        private String title;
        private BigDecimal amount;
        private BigDecimal credit;
        private String surname;
        private String address;

        public Parameter sum(int sum) {
            this.sum = sum;
            return this;
        }

        public Parameter name(String name) {
            this.name = name;
            return this;
        }


        public Parameter title(String title) {
            this.title = title;
            return this;
        }

        public Parameter amount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }
    }


    /**
     * Jak zastąpić wywołanie z wieloma parametrami ?
     */
    public String execute(Parameter parameter) {

        // ..jakieś operacje...
        return "";
    }
}
