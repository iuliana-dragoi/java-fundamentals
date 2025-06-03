package main.java.SOLID.Exercise2.Export;

import main.java.SOLID.Exercise2.InvoiceProcess.Invoice;

public class PdfInvoiceExporter implements InvoiceExporter {

    @Override
    public String export(Invoice invoice) {
        return "PDF: Invoice for " + invoice.getClient().getName() + " total: " + invoice.calculateTotal();
    }
}
