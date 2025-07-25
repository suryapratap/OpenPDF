/*
 * $Id: Images.java 3373 2008-05-12 16:21:24Z xlv $
 *
 * This code is part of the 'OpenPDF Tutorial'.
 * You can find the complete tutorial at the following address:
 * https://github.com/LibrePDF/OpenPDF/wiki/Tutorial
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 *
 */
package org.openpdf.examples.objects.images;

import org.openpdf.text.Document;
import org.openpdf.text.DocumentException;
import org.openpdf.text.Image;
import org.openpdf.text.Paragraph;
import org.openpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * General Images example.
 */
public class Images {

    /**
     * General Images example
     *
     * @param args no arguments needed
     */
    public static void main(String[] args) {

        System.out.println("Images");

        // step 1: creation of a document-object
        Document document = new Document();

        try {
            // step 2:
            // we create a writer that listens to the document
            // and directs a PDF-stream to a file
            PdfWriter.getInstance(document, new FileOutputStream("Images.pdf"));

            // step 3: we open the document
            document.open();

            // step 4:
            document.add(new Paragraph("A picture of my dog: otsoe.jpg"));
            Image jpg = Image.getInstanceFromClasspath("otsoe.jpg");
            document.add(jpg);
            document.add(new Paragraph("getacro.gif"));
            Image gif = Image.getInstanceFromClasspath("getacro.gif");
            document.add(gif);
            document.add(new Paragraph("pngnow.png"));
            Image png = Image.getInstanceFromClasspath("pngnow.png");
            document.add(png);
            document.add(new Paragraph("grayscaled.png"));
            Image grayscaledPng = Image.getInstanceFromClasspath("grayscaled.png");
            document.add(grayscaledPng);
            document.add(new Paragraph("iText.bmp"));
            Image bmp = Image.getInstanceFromClasspath("iText.bmp");
            document.add(bmp);
            document.add(new Paragraph("iText.wmf"));
            Image wmf = Image.getInstanceFromClasspath("iText.wmf");
            document.add(wmf);
            document.add(new Paragraph("iText.tif"));
            Image tif = Image.getInstanceFromClasspath("iText.tif");
            document.add(tif);
        } catch (DocumentException | IOException de) {
            System.err.println(de.getMessage());
        }

        // step 5: we close the document
        document.close();
    }
}