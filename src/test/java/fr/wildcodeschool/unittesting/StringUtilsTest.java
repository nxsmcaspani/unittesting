package fr.wildcodeschool.unittesting;

import org.junit.Test;
import org.junit.Assert;

public class StringUtilsTest {
    @Test
    public void testHello()
    {
        Assert.assertEquals("eoaie", StringUtils.vowels("Hello Maxime"));
    }

    @Test
    public void testBravo()
    {
        Assert.assertEquals("Aaao", StringUtils.vowels("Aba bravo"));
    }

    @Test
    public void testEmpty() { Assert.assertEquals("", StringUtils.vowels(""));  }

    @Test
    public void testUnique1() { Assert.assertEquals("Aao", StringUtils.uniqueVowels("Ababravo"));}

    @Test
    public void testUnique2() { Assert.assertEquals("AEIOUYaeiouy", StringUtils.uniqueVowels("AAAEEEEIIIIOOOUUUYYYaaaeeeeiiiiiioooouuuuyyyyyyy"));}

    @Test
    public void testUniqueNoVowel() { Assert.assertEquals("", StringUtils.uniqueVowels("Mplkjthnxmldght"));}
}

