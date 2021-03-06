package pl.sda.structure.oop.problem4;


import java.util.Arrays;
import java.util.List;

public class CreditCard {

    private String name;
    private List<String> prefixes;
    private List<Integer> lengths;


    public CreditCard(String name, String[] prefixes, Integer[] lengths) {

        this.name = name;
        this.prefixes = Arrays.asList(prefixes);
        this.lengths = Arrays.asList(lengths);

    }

    public String getName() {
        return name;
    }

    /**
     *  Potrzbować będziesz metod:
     *          startsWith - do sprawdzenia prefixów
     *          contains - do sprawdzenia długości
     *
     * @param cardNumber
     * @return
     */
    public boolean matches(String cardNumber){

        //Krok1 sprawdz długość cardNumber.length czy zawiera się w długościach dla karty (contains)
        int cardLength = cardNumber.length();

        if(!lengths.contains(cardLength)){
            return false;
        }

        //Krok2 sprawdz prefix - startWith metda dla klasy String

        for(String prefix : prefixes){

//            if(cardNumber.startsWith(prefix)){
//                return true;
//            }

            String cardPrefix = cardNumber.substring(0,2);
            if(cardPrefix.equals(prefix)){
                return true;
            }


        }

        //Zwróc false jeśli w/w warunki nie przeszły
        return false;
    }



}
