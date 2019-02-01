package pl.sda.algorithm.common.advanced;

public class UniqueCharacterDetectorSolution {

    public boolean isUnique(String text) {
        boolean[] char_set = new boolean[128];

        //Pobranie numeru w tablicy znaków ASCI
        char asciChar = text.charAt(0);
        int asciCharValue = text.charAt(0);
        char[] chars = text.toCharArray();

        for(int i = 0 ; i < text.length(); i++){
            int asci_value = text.charAt(i);
            if(char_set[asci_value]){
                return false;
            }
            char_set[asci_value] = true;
        }


        return true;
    }
}
