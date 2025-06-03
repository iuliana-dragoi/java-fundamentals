package main.java.SOLID.Exercise2.InvoiceProcess;

import main.java.SOLID.Exercise2.Clients.Client;

import java.util.ArrayList;
import java.util.List;

public class Invoice {

    private Client client;
    private List<InvoiceLine> invoiceLines = new ArrayList<>();

    public Invoice(Client client) {
        this.client = client;
    }

    public void addLine(InvoiceLine line) {
        this.invoiceLines.add(line);
    }

    public double calculateTotal() {
        double total = this.invoiceLines.stream().mapToDouble(InvoiceLine::getLineTotal).sum();
        return total; // apply discount
    }

    public Client getClient() {
        return client;
    }

    public List<InvoiceLine> getInvoiceLines() {
        return invoiceLines;
    }
}
