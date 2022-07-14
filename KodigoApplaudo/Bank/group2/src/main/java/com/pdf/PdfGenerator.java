package com.pdf;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import java.io.FileNotFoundException;

public class PdfGenerator {

    public PdfGenerator () throws FileNotFoundException {
        String path = "E:\\Kodigo\\Projecto\\Group2\\BankBalance.pdf";
        PdfWriter pdfWriter = new PdfWriter(path);

        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();

        Document document = new Document(pdfDocument);

        String bank = "Kod Bank";
        Paragraph title = new Paragraph(bank);
        document.add(title);

        document.close();
        System.out.println("PDF Created");
    }

}
