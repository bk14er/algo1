package pl.sda.structure.oop.problem6.operation;

public class Expression{

    public String input;

    public Expression(String input) {
        this.input = input;
    }

    /**
     * if startWith "=" zwraca wszystko co jest za znakiem równania
     * (potrzebna bedzie metoda substring lub replace - wedle uzniania)
     * <p>
     * W przeciwnym wypadku zwraca input
     * <p>
     * <p>
     * O użyciu metody substring:
     * https://stormit.pl/string-metody/
     */
    public String evaluate() {
        if(input.startsWith("=")){
            return input.substring(1);
        }
        return input;
    }

    /**
     * Wylicz równanie:
     *
     *
     * Na początku trzeba sprawdzić jaką operacje wykonujemy tj. czy input zawiera (contains) znak:
     *      -dodawania/
     *      -odejmowania/
     *      -mnozenia/
     *      -dzielenia
     *
     * Pamiętaj o tym żeby z inputa pozbyć się znaku "="
     *
     * Potrzebna będzie metoda split np dla rówania 4+6 , metoda split("\\+") zwróci tablice 2 elementową tj. : {4,6}
     * Uwaga!!! w metodzie split znaki specialne: + - * /  należy poprzedzić parą znaków \\ tj. backslash
     *
     * @return
     */
    public int calculate() {
        //12 - 2
        String evaluate = evaluate();

        //TODO
        return Integer.valueOf(evaluate);
    }

}
