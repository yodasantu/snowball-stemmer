package com.adobe.nlp.snowball.test;

import com.adobe.nlp.snowball.ISnowballStemmer;
import org.junit.Assert;
import org.junit.Test;
import com.adobe.nlp.snowball.impl.EnglishStemmer;

public class StemmerTest {

    @Test
    public void englishSanityCheck() {

        ISnowballStemmer snowballStemmer = new EnglishStemmer();
        snowballStemmer.setCurrent("Jumps");
        snowballStemmer.stem();
        String result = snowballStemmer.getCurrent();

        Assert.assertEquals("Jump", result);
    }
}
