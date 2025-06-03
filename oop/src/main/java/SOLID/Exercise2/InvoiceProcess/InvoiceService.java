package main.java.SOLID.Exercise2.InvoiceProcess;

import main.java.SOLID.Exercise2.Export.InvoiceExporter;
import main.java.SOLID.Exercise2.Notification.MessageSender;

public class InvoiceService {

    private InvoiceSaver saver;
    private MessageSender sender;
    private InvoiceExporter exporter;

    public InvoiceService(InvoiceSaver saver, MessageSender sender, InvoiceExporter exporter) {
        this.saver = saver;
        this.sender = sender;
        this.exporter = exporter;
    }

    public void processInvoice(Invoice invoice){
        saver.save(invoice);
        String exported = exporter.export(invoice);
        sender.send(invoice.getClient(), exported);
    }
}
