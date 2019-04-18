package com.sparta.siq.alpari;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RatesTest {

    private String filepath = "rates.json";

    @Before
    public void CreateTestFile()
    {
        RatesFileReader ratesFileReader = new RatesFileReader(filepath);
        //Assert.assertEquals(ratesFileReader.getRatesFile(),ratesFileReader);

    }

    @Test
    public void CheckRatesFile()
    {

    }

}
