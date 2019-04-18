package com.sparta.siq.alpari.helpers;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.Test;

public class RatesJsonParser {

    private JSONObject ratesJson;

    public RatesJsonParser(String fileLocation)
    {
        try {
            RatesFileReader ratesfileReader = new RatesFileReader(fileLocation);
            JSONParser parser = new JSONParser();
            ratesJson = (JSONObject) parser.parse(ratesfileReader.getRatesFile());
        }
        catch(Exception e )
        {
            e.printStackTrace();
        }
    }

    public void check()
    {
        System.out.println(ratesJson.get("rates"));
    }

}
