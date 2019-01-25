package pl.sda.algorithm.common.advanced;

import org.junit.Assert;
import org.junit.Test;

public class CompressorTest {

    private Compressor compressor = new Compressor();

    @Test
    public void test(){
        // Wyzwanie : Dla podanego ciągu znaków np aaabb napisz algorytm ktory
        // skompresuje do ciągu znaków poprzedzonych ilością wystąpień np. dla "aaabb" zwróci  "a3b2".
        // UWAGA !!! Jeśli skompresowany ciąg znaków nie jest mniejszy od oryginału - zwróc oryginał
        Assert.assertEquals("a3b2", compressor.compress("aaabb"));
        Assert.assertEquals("aabb", compressor.compress("aabb"));
        Assert.assertEquals("a3b1c3", compressor.compress("aaabccc"));
        Assert.assertEquals("ab", compressor.compress("ab"));
        Assert.assertEquals("abc", compressor.compress("abc"));
        Assert.assertEquals("z3", compressor.compress("zzz"));
        Assert.assertEquals("aabbaabb", compressor.compress("aabbaabb")); // skrocony zapis nie jest mniejszy od oryginału
        Assert.assertEquals("a3b1a4c2a4b1a1", compressor.compress("aaabaaaaccaaaaba"));


    }

}