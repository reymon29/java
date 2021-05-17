import java.awt.print.PrinterJob;
import java.io.File;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.printing.PDFPageable;


public class PrintPdf {
	
	public static void main(String args[]) throws Exception {
		String myLabelType = args[0];
		String PATH  = "C:/LabelPrinting";
		fileWithDirectoryAssurance(PATH);
		long startTime = System.nanoTime();
		long endTime = System.nanoTime();
        PDDocument document = PDDocument.load(new File("C:/LabelPrinting/Sample.pdf"));
        if (myLabelType.equals("QRLabel")) {
        	 PrintService myPrintService = findPrintService("Brother");
        	 PrinterJob job = PrinterJob.getPrinterJob();
             job.setPageable(new PDFPageable(document));
             job.setPrintService(myPrintService);
             job.print();
        } else if (myLabelType.equals("ShippingLabel")) {
        	System.out.println("Printing...Label");
        	 PrintService myPrintService = findPrintService("Zebra");
        	 PrinterJob job = PrinterJob.getPrinterJob();
             job.setPageable(new PDFPageable(document));
             job.setPrintService(myPrintService);
             job.print();
        }
       
        
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in nanoseconds  : " + timeElapsed);
        System.out.println("Execution time in seconds : " +
                ((timeElapsed / 1000000) / 1000));
    }       

    private static PrintService findPrintService(String printerName) {
        PrintService[] printServices = PrintServiceLookup.lookupPrintServices(null, null);
        for (PrintService printService : printServices) {
            if (printService.getName().trim().contains(printerName)) {
                return printService;
            }
        }
        return null;
    }
    
    /** Creates parent directories if necessary. Then returns file */
    private static File fileWithDirectoryAssurance(String directory) {
        File dir = new File(directory);
        if (!dir.exists()) dir.mkdirs();
        return new File(directory);
    }
}
