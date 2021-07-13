import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;

import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.output.OutputException;

import org.apache.pdfbox.exceptions.COSVisitorException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.edit.PDPageContentStream;
import org.apache.pdfbox.pdmodel.graphics.xobject.PDJpeg;

public class Gen_Barcode {

	// sets the picWidth
	private static int picWidth = 149;
	// sets the picHeigth
	private static int picHeigth = 60;

	public static void main(String[] args) throws BarcodeException, OutputException, IOException, COSVisitorException {
		generateBarcode("ADDAD11138500");
	}

	public static void generateBarcode(String barcode) throws IOException, BarcodeException, OutputException, COSVisitorException {

		Barcode barcode2 = BarcodeFactory.createCode39(barcode, false);
		// default 50
		barcode2.setBarWidth(100);
		// this sets DPI
		barcode2.setResolution(100);
		// barcode2.setFont(font);
		int gw = barcode2.getWidth();
		int gh = barcode2.getHeight();
		// change this if you want a coloured background
		// image = new BufferedImage(t, s, BufferedImage.TYPE_INT_RGB)
		BufferedImage image = new BufferedImage(gw, gh, BufferedImage.TYPE_INT_RGB);

		Graphics2D g2 = (Graphics2D) image.getGraphics();
		// default is black so draw a white box first
		// change type to INT_RGB if you want a coloured background
		g2.setColor(Color.blue);
		g2.fillRect(0, 0, gw, gh);
		barcode2.draw(g2, 200, 200);

		// CREATE ADDITIONAL INFORMATION ON BARCODE

		BufferedImage container4Barcode = new BufferedImage(picWidth, picHeigth, image.getType());
		Graphics2D g2d = container4Barcode.createGraphics();

		g2d.setBackground(Color.WHITE);
		g2d.clearRect(0, 0, picWidth, picHeigth);
		g2d.setColor(Color.black);
		g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
		g2d.drawImage(image, 80, 210, 130, 18, null);
		g2d.dispose();

		Graphics2D g2d6 = container4Barcode.createGraphics();
		g2d6.setColor(Color.black);
		g2d6.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g2d6.setFont(new Font("Verdana", Font.BOLD, 7));

		g2d6.drawString("FLORETT", 9, 20);
		g2d6.drawString("50-521-60", 57, 20);

		Graphics2D g2d4 = container4Barcode.createGraphics();
		g2d4.setColor(Color.black);
		g2d4.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g2d4.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
		g2d4.setFont(new Font("Verdana", Font.BOLD, 11));
		g2d4.drawString("SSYYS", 105, 19);
		g2d4.dispose();

		// PRINT PDF

		int ver = 782;

		PDDocument doc = new PDDocument();
		PDPage page = new PDPage();
		doc.addPage(page);
				
		PDJpeg pdJpeg = new PDJpeg(doc, container4Barcode);
				
		PDPageContentStream content = new PDPageContentStream(doc, page);
		content.drawImage(pdJpeg, 150, ver);
		content.close();

		doc.save(new FileOutputStream("C:\\barcode.pdf"));

		// opens the pdf file
		Process p = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler C:\\TestBarcodes\\barcode.pdf");
		try {
			p.waitFor();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}