package ui.PDF;

import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import java.io.FileNotFoundException;

public class generatePDF {
    public static void main(String[] args) {
        String path = "invoice.pdf";
        PdfWriter pdfWriter = null;
        try {
            pdfWriter = new PdfWriter(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.setDefaultPageSize(PageSize.A5);
        Document document = new Document(pdfDocument);

        document.add(new Paragraph("Hello everyone"));
        document.close();

    }
}
