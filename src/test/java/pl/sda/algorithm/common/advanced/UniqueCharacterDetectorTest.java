package pl.sda.algorithm.common.advanced;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueCharacterDetectorTest {

    @Test
    public void uniqueCharacters() {
        // Challenge: Given a string, see if you can detect whether it contains only
        // unique chars
        UniqueCharacterDetector detector = new UniqueCharacterDetector();

        Assert.assertTrue(detector.isUnique("ab"));
        Assert.assertFalse(detector.isUnique("aa"));
        Assert.assertTrue(detector.isUnique("abcdefghijklmnopqrstuvwxyz"));
    }

}