package pl.sda.algorithm.common.advanced;


//Zobacz UrlConverterTest
public class UrlConverter {

    public String urlify(String url) {
        //Pozbywamy się spacji na początku i na końcu (funkcja trim() robi to za nas :))
        url = url.trim();

        int spaceCount = 0;
        for (int i = 0; i < url.length(); i++) {

            if (url.charAt(i) == ' ') {
                spaceCount++;
            }

        }

        int newTableLength = spaceCount * 3 + url.length() - spaceCount;
        char[] result = new char[newTableLength];


        int pointer = 0;
        for (int i = 0; i < url.length(); i++) {

            //Jeśli wykryliśmy spacje
            if (url.charAt(i) == ' ') {
                //TODO
            }else{
                //TODO
            }

        }

        return String.valueOf(result);
    }

}
