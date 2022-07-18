package com;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.Account;
import com.sun.java.swing.action.AlignCenterAction;


import javax.swing.text.StyledDocument;
import java.io.FileNotFoundException;

public class PdfGenerator {

    public PdfGenerator () throws FileNotFoundException {
        Account bal = new Account();
        Account prevTrans = new Account();
        String path = "E:\\Kodigo\\Projecto\\Group2\\BankBalance.pdf";
        PdfWriter pdfWriter = new PdfWriter(path);

        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();

        Document document = new Document(pdfDocument);

        String bank = ("Kod Bank");
        Paragraph title = new Paragraph(bank);
        document.add(title);

        String Balance = ("Account Balance: " + bal);
        Paragraph Bal = new Paragraph(Balance);
        document.add(Bal);

        String Trans = ("Account Transaction: " + prevTrans);
        Paragraph AccountTrans = new Paragraph(Trans);
        document.add(AccountTrans);


        document.close();
        System.out.println("PDF Created");
    }

}
