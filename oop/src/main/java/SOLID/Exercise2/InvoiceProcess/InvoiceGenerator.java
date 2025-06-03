package main.java.SOLID.Exercise2.InvoiceProcess;

import main.java.SOLID.Exercise2.Clients.Client;

import java.util.List;

public class InvoiceGenerator {

    public Invoice generateInvoice(Client client, List<InvoiceLine> lines) {
        Invoice invoice = new Invoice(client);
        lines.forEach(invoice::addLine);
        return invoice;
    }
}
