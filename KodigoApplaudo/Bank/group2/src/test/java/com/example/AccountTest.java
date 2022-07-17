package com.example;

import static org.junit.Assert.assertEquals;

import com.pdf.PdfGenerator;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class AccountTest {

    //AccountTest account = new AccountTest();

    @Test
    public void ShouldReturnDepositValue() throws FileNotFoundException {

        //Arrage (declaracion de variables)
        PdfGenerator pdfGenerator = new PdfGenerator();
        File directory = new File("E:\\Kodigo\\Projecto\\Group2");

        //Act (Acciones a ejecutar)
        if (directory.isDirectory()) {
            String[] files = directory.list();

            /*boolean result = false;

            for (String e : files) {
                if (e.equals("BankBalance.pdf")) {
                    result = true;

                    return;
                }
            }*/

            boolean result = Arrays.stream(files).anyMatch(e->e.equals("BankBalance.pdf"));

            //Assert (Confirmacion de los valores esperados)
            Assert.assertTrue("The directory is empty", result);
        }
         assertEquals(10, account.deposit(10.0), 0);
    }


    @Test
    public void ShouldReturnInvestimentAmount() {
        assertEquals(115, 1, 0);
    }
}
