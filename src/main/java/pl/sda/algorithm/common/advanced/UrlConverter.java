package pl.sda.algorithm.common.advanced;

public class UrlConverter {

    public String urlify(String url) {
        //Pozbywamy się spacji na początku i na końcu (funkcja trim() robi to za nas :))
        url = url.trim();

        //TODO KROK 1  Iterujesz po każdym znaku url i zliczasz spacje czyli url.charAt(i) == ' '
        int spaceCount = 0;


        //TODO KROK 2  najpierw wylicz newTableLenght
        // newTableLenght = spaceCount * 3 + url.length() - spaceCount
        int newTableLength = 0;
        char[] result = new char[newTableLength];


        int pointer = 0;
        for(int i=0 ; i < url.length(); i++){
            //TODO KROK 3
            // Sprawdz czy aktualny znak to spacja jeśli tak:
            //    na kolejnych 3 pozycjach ustaw w tablicy result odpowiednio znaki: % 2 0 (zwiększ odpowiednio pointer)
            // w przeciwnym wypadku przepisz result[pointer] =  url.charAt(i) (inkrementuj pointer)
        }

        return String.valueOf(result);
    }

}
