package com.adobe.nlp.snowball;

/**
 * Created by yaozhang on 6/10/2015.
 */
public interface ISnowballStemmer {
    boolean stem();

    void setCurrent(String value);

    String getCurrent();
}
