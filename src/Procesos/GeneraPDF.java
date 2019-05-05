package Procesos;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.Barcode128;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.NumberFormat;

public class GeneraPDF {

    public void creaPdf(String codfac, String nom, String ape, String dni, String fechor, String tp,
            String st, String igv, String pg, DefaultTableModel modelo) {
        Document doc = new Document(PageSize.A4);
        try {
            FileOutputStream fichero = new FileOutputStream("factura" + codfac + ".pdf");
            PdfWriter pw = PdfWriter.getInstance(doc, fichero);
            pw.setInitialLeading(20);
            doc.open();
            //agregando informacion al pdf
            Font font_titulo = FontFactory.getFont(FontFactory.HELVETICA, 26, Font.BOLDITALIC);
            doc.addTitle("Factura N° " + codfac);
            Chunk titulo = new Chunk("Factura N° " + codfac, font_titulo);
            doc.add(new Paragraph("Factura N° " + codfac, font_titulo));
            doc.add(new Paragraph(Chunk.NEWLINE));
            doc.add(new Paragraph(Chunk.NEWLINE));
            doc.add(new Paragraph("Nombes: " + nom));
            doc.add(new Paragraph("Apellidos: " + ape));
            doc.add(new Paragraph("DNI: " + dni));
            doc.add(new Paragraph("Fecha y hora: " + fechor));
            doc.add(new Paragraph("Tipo de pago: " + tp));
            doc.add(new Paragraph(Chunk.NEWLINE));
            doc.add(new Paragraph(Chunk.NEWLINE));
            PdfPTable tabla = new PdfPTable(5);
            PdfPCell cabecera;
            for (int column = 0; column < 5; column++) {
                cabecera = new PdfPCell(new Phrase(modelo.getColumnName(column)));
                cabecera.setHorizontalAlignment(Element.ALIGN_CENTER);
                tabla.addCell(cabecera);
            }
            tabla.setHeaderRows(1);

            for (int i = 0; i < modelo.getRowCount(); i++) {
                for (int j = 0; j < modelo.getColumnCount(); j++) {
                    tabla.addCell((String) modelo.getValueAt(i, j));
                }
            }
            doc.add(tabla);
            doc.add(new Paragraph(Chunk.NEWLINE));
            doc.add(new Paragraph(Chunk.NEWLINE));
            Paragraph to = new Paragraph("Suma total: " + st);
            to.setAlignment(Element.ALIGN_RIGHT);
            doc.add(to);
            Paragraph i = new Paragraph("IGV: " + igv);
            i.setAlignment(Element.ALIGN_RIGHT);
            doc.add(i);
            Paragraph pt = new Paragraph("Total a Pagar: " + pg);
            pt.setAlignment(Element.ALIGN_RIGHT);
            doc.add(pt);
            
            doc.add(new Paragraph(Chunk.NEWLINE));
            doc.add(new Paragraph(Chunk.NEWLINE));
            
            doc.add(codigoBarra(doc, pw, codfac));

            doc.close();
            Desktop.getDesktop().open(new File("factura" + codfac + ".pdf"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }
    
    private Image codigoBarra(Document doc, PdfWriter pw, String codfac){
        PdfContentByte bimg = pw.getDirectContent();
        Barcode128 cod128 = new Barcode128();
        cod128.setCode(codfac);
        cod128.setCodeType(Barcode128.CODE128);
        cod128.setTextAlignment(Element.ALIGN_CENTER);        
        
        Image img = cod128.createImageWithBarcode(bimg, BaseColor.BLACK, BaseColor.BLACK);
        float escala = ((doc.getPageSize().getWidth() - doc.leftMargin()-doc.rightMargin()-0))/img.getWidth()*50;
        img.scalePercent(escala);
        img.setAlignment(Element.ALIGN_CENTER);
        
        return img;
    }
    
    private String formatoBarra(String cod){
        NumberFormat format = DecimalFormat("000000");
        return format.format((cod != null) ? Integer.parseInt(cod): 000000);
    }

    private NumberFormat DecimalFormat(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
