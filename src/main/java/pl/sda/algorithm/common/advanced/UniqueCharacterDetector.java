package pl.sda.algorithm.common.advanced;

/*
    Zapisz na indeksie od pobranego znaku w tablicy element w iteracji wartość true
    Dodatkowo sprawdz czy już wczesniej zostało zapisane w chars[asciCharValue]

    Zobacz UniqueCharacterDetectorTest
 */
public class UniqueCharacterDetector {

    public boolean isUnique(String text) {
        boolean[] char_set = new boolean[128];

        //Pobranie numeru w tablicy znaków ASCI
        char asciChar = text.charAt(0);
        int asciCharValue = text.charAt(0);
        char[] chars = text.toCharArray();

        for (int i = 0; i < text.length(); i++) {
            //TODO
        }


        return true;
    }
}
