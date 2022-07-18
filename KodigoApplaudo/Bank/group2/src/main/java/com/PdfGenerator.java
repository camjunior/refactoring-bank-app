package com;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.Account;

import java.io.FileNotFoundException;

public class PdfGenerator {

    public PdfGenerator () throws FileNotFoundException {
        //Account bal = new Account();
        //Account prevTrans = new Account();
        String path = "E:\\Kodigo\\Projecto\\Group2\\BankBalance.pdf";
        PdfWriter pdfWriter = new PdfWriter(path);

        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();

        Document document = new Document(pdfDocument);

        String bank = ("Kod Bank");
        Paragraph title = new Paragraph(bank);
        document.add(title);

        String UserName = ("Pepito Perez");
        Paragraph userName = new Paragraph(UserName);
        document.add(userName);

        String balance = ("Account Balance: " + 500);
        Paragraph Bal = new Paragraph(balance);
        document.add(Bal);

        String Trans = ("Account Transaction: " + 250);
        Paragraph AccountTrans = new Paragraph(Trans);
        document.add(AccountTrans);


        document.close();
        System.out.println("PDF Created");
    }

}
