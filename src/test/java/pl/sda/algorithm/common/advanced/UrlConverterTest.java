package pl.sda.algorithm.common.advanced;

import org.junit.Assert;
import org.junit.Test;

public class UrlConverterTest {

    @Test
    public void test() {
        //Wyzwanie: W zadaniu należy zastąpić wszystkie puste znaki pomiędzy wyrazami znakiem '%20' - w ASCI symbol spacji
        UrlConverter urlConverter = new UrlConverter();
        Assert.assertEquals("My%20Home%20Page", urlConverter.urlify("My Home Page    "));
        Assert.assertEquals("Moja%20Strona", urlConverter.urlify("   Moja Strona    "));
    }

}