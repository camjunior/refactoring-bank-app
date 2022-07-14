package com.pdf;

import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PdfTemplate {

    String name;
    String lastName;
    String date;

    Document document;
    FileOutputStream file;
    Paragraph title;

    public PdfTemplate(String name, String lastName, String date){
        this.name = name;
        this.lastName = lastName;
        this.date = date;

        document = new Document();
        title = new Paragraph("Bank Balance" + name);
    }

    public void templateGenerator() throws FileNotFoundException {
        try{
            file = new FileOutputStream(name + ".pfd");
            PdfWriter.getInstance(document, file);
            document.open();
            title.setTextAlignment(1);

            document.add(title);

            document.add(new Paragraph("Nombre: " + name));


        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
