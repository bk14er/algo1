package pl.sda.structure.oop.problem4;

import java.util.ArrayList;
import java.util.List;

public class CardProcessor {


    private List<CreditCard> creditCardList = new ArrayList<>();


    public CardProcessor() {
        creditCardList.add(new CreditCard("MASTERCARD", new String[]{"34","35","36"}, new Integer[]{16,17,18}));
        creditCardList.add(new CreditCard("VISA", new String[]{"45","46"}, new Integer[]{18}));
        creditCardList.add(new CreditCard("AmericanExpress", new String[]{"60","65"}, new Integer[]{16}));
        creditCardList.add(new CreditCard("RuCard", new String[]{"60","65"}, new Integer[]{16}));

    }

    /**
     *
     * Metoda zwraca :
     *
     * MASTERCARD -         prefixy 34,35,36
     *                      długość 16,17,18
     *                      czyli np. 34 0000 1000 9890 111 (17 znaków)
     *
     * VISA                 -prefixy 45, 46
     *                      długość 18
     *                      czyli np 45 0000 1000 9890 6511 (18 znaków)
     *
     * AmericanExpress      -prefixy 60,65
     *                      długość 16
     *                      czyli np. 6011111111111111 (16 znakow)
     *                                6511111111111111 (16 znakow)
     *
     * RuCard               -prefix 98 99
     *                      dlugosć 22, 23
     *
     *
     * W przeciwnym wypadku zwraca "Unknown"
     *
     *
     */
    public String getCardType(String cardNumber){

        for(CreditCard card : creditCardList){

            if(card.matches(cardNumber)){
                return card.getName();
            }

        }

        return "Unknown";
    }

}
