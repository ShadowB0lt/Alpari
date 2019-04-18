package com.sparta.siq.alpari.helpers;

import org.junit.Test;

public class JsonParseTests {

    @Test
    public void JsonParseTest()
    {
        RatesJsonParser ratesJsonParser = new RatesJsonParser("Resources/rates.json");
        ratesJsonParser.check();
    }
}
