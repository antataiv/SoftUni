import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class P09GeneratePDF {
	public static void main(String[] args) throws DocumentException, IOException {
		Document pdfDocument = new Document();
		
		FileOutputStream fileOutput = new FileOutputStream("Deck-of-Cards.pdf");
		PdfWriter.getInstance(pdfDocument, fileOutput);
		
		pdfDocument.open();
		
		PdfPTable table = new PdfPTable(7);
		table.setWidthPercentage(100);
		
		BaseFont baseFont = BaseFont.createFont("times.ttf", BaseFont.IDENTITY_H, true);
		Font black = new Font(baseFont, 20f, 0, BaseColor.BLACK);
		Font red = new Font(baseFont, 20f, 0, BaseColor.RED);
		
		String card = "";
		String suit = "";
		for (int i = 2; i < 15; i++) {
			switch (i) {
			case 11: card = "J";
				break;
			case 12: card = "Q";
				break;
			case 13: card = "K";
				break;
			case 14: card = "A";
				break;
			default: card = String.valueOf(i);
				break;
			}
			for (int j = 1; j < 5; j++) {
				switch (j) {
				case 1: suit = "\u2660";		//♠
					break;
				case 2: suit = "\u2665";		//♥
					break;
				case 3: suit = "\u2663";		//♣
					break;
				case 4: suit = "\u2666";		//♦
					break;
				}
				PdfPCell cell = new PdfPCell();
				cell.setPadding(3);
				cell.setBorder(0);
				
				PdfPTable currentCell = new PdfPTable(1);
				PdfPCell singleCell = new PdfPCell();
				if(j==1 || j==3){
					singleCell = new PdfPCell(new Paragraph(card+suit, black));
				}
				else if (j==2 || j==4){
					singleCell = new PdfPCell(new Paragraph(card+suit, red));
				}
				singleCell.setFixedHeight(50);
				singleCell.setHorizontalAlignment(Element.ALIGN_CENTER);
				singleCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				currentCell.addCell(singleCell);
				cell.addElement(currentCell);
				
				table.addCell(cell);
			}
		}
		
		for (int i = 0; i < 4; i++) {
            PdfPCell emptyCell = new PdfPCell();
            emptyCell.setBorder(0);
            table.addCell(emptyCell);
        }
		pdfDocument.add(table);
		pdfDocument.close();
		fileOutput.close();
	}
}