package main.java.SOLID.Exercise2.Export;

import main.java.SOLID.Exercise2.InvoiceProcess.Invoice;

public interface InvoiceExporter {

    String export(Invoice invoice);
}
