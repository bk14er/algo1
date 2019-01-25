package pl.sda.algorithm.common.advanced;

import org.junit.Assert;
import org.junit.Test;
import pl.sda.algorithm.common.advanced.PalindromeDetector;

public class PalindromeDetectorTest {

    PalindromeDetector palindromeDetector = new PalindromeDetector();

    @Test
    public void palindromes() {
        // Wyzwanie: Sprawdz czy podany ciąg znaków jest palindromem
        // Palindrom (gr. palindromeo – biec z powrotem) – wyrażenie brzmiące tak samo czytane
        // od lewej do prawej i od prawej do lewej.
        Assert.assertTrue(palindromeDetector.isPalindrome("abba"));
        Assert.assertTrue(palindromeDetector.isPalindrome("mom"));
        Assert.assertTrue(palindromeDetector.isPalindrome("dad"));
        Assert.assertFalse(palindromeDetector.isPalindrome("ktoś"));
        Assert.assertFalse(palindromeDetector.isPalindrome("tak"));
    }

}