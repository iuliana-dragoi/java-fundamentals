package main.java.SOLID.Exercise2;

import main.java.SOLID.Exercise2.Clients.Client;
import main.java.SOLID.Exercise2.Clients.RegularClient;
import main.java.SOLID.Exercise2.Export.InvoiceExporter;
import main.java.SOLID.Exercise2.Export.PdfInvoiceExporter;
import main.java.SOLID.Exercise2.InvoiceProcess.*;
import main.java.SOLID.Exercise2.Notification.EmailSender;
import main.java.SOLID.Exercise2.Notification.MessageSender;
import main.java.SOLID.Exercise2.ProductProcess.Product;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Create client
        Client client = new RegularClient(1, "Don", "don@example.com", "Str 123");

        //Create products
        Product laptop = new Product("laptop", 5000, "LP1");
        Product mouse = new Product("mouse", 150, "MS1");

        //Generate invoice lines
        InvoiceLine invoiceLine1 = new InvoiceLine(laptop, 1);
        InvoiceLine invoiceLine2 = new InvoiceLine(mouse, 1);

        //Generate invoice
        InvoiceGenerator generator = new InvoiceGenerator();
        Invoice invoice = generator.generateInvoice(client, List.of(invoiceLine1, invoiceLine2));

        //Inject dependencies
        InvoiceSaver saver = new DatabaseInvoiceSaver();
        MessageSender sender = new EmailSender();
        InvoiceExporter exporter = new PdfInvoiceExporter();

        //Process invoice
        InvoiceService service = new InvoiceService(saver, sender, exporter);
        service.processInvoice(invoice);
    }
}
