
import java.awt.print.PrinterJob;
import java.io.File;

import javax.print.PrintService;
import javax.print.PrintServiceLookup;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.printing.PDFPageable;

import java.util.concurrent.TimeUnit;


public class PrintPdf {
	public static void main(String args[]) throws Exception {
		long startTime = System.nanoTime();
		
        PDDocument document = PDDocument.load(new File("C:/Users/Rey/Documents/GitHub/java/printing/PrintingExample/src/Sample.pdf"));

        PrintService myPrintService = findPrintService("Zebra ZP 500 (ZPL)");
        
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPageable(new PDFPageable(document));
        job.setPrintService(myPrintService);
        job.print();
        
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in nanoseconds  : " + timeElapsed);
        System.out.println("Execution time in seconds : " +
                ((timeElapsed / 1000000) / 1000));
    }       

    private static PrintService findPrintService(String printerName) {
        PrintService[] printServices = PrintServiceLookup.lookupPrintServices(null, null);
        for (PrintService printService : printServices) {
            if (printService.getName().trim().equals(printerName)) {
                return printService;
            }
        }
        return null;
    }
}
