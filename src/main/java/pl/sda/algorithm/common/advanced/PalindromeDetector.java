package pl.sda.algorithm.common.advanced;

//zobacz PalindromeDetectorTest
public class PalindromeDetector {

    public boolean isPalindrome(String text) {
        text = text.replaceAll("!","");

        // Pierwsza i ostatnia litera muszą pasować , druga litera i przedostatnia itd...
        char[] content = text.toCharArray();
        int length = content.length;

        for(int i=0 ; i < length; i++){

           //TODO zaimplementuj

        }


        return true;
    }

}
