package com.sparta.siq.alpari.helpers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class RatesFileReader {


    private FileReader ratesFile;

    public RatesFileReader(String fileLocation) {
        try {
            ratesFile = new FileReader(fileLocation);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public FileReader getRatesFile()
    {
        return ratesFile;
    }


}
