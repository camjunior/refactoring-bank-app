package com.example;

import com.PdfGenerator;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class PdfTest {

    @Test
    public void PdfTestGenerator() throws FileNotFoundException {

        //Arrage (declaracion de variables)
        PdfGenerator pdfGenerator = new PdfGenerator();
        File directory = new File("E:\\Kodigo\\Projecto\\Group2");

        //Act (Acciones a ejecutar)
        if (directory.isDirectory()) {
            String[] files = directory.list();

            boolean result = Arrays.stream(files).anyMatch(e->e.equals("BankBalance.pdf"));

            //Assert (Confirmacion de los valores esperados)
            Assert.assertTrue("The directory is empty" , result);
        }


    }
}