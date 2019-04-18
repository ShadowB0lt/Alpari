package com.sparta.siq.alpari;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class RatesFileReader {

    private FileReader ratesFile;

    public RatesFileReader(String fileLocation) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileLocation));
            String line;
            bufferedReader.readLine();
            while((line = bufferedReader.readLine()) !=null)
            {

            }


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
