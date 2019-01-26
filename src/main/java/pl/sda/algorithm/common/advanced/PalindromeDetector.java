package pl.sda.algorithm.common.advanced;

public class PalindromeDetector {

    public boolean isPalindrome(String text) {
        text = text.replaceAll("!","");

        // Pierwsza i ostatnia litera muszą pasować , druga litera i przedostatnia itd...
        char[] content = text.toCharArray();
        int length = content.length;

        for(int i=0 ; i < length; i++){

            if(content[i] != content[length- 1 - i]){
                return false;
            }

        }


        return true;
    }

}
