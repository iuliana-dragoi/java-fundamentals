package main.java.SOLID.Exercise2.InvoiceProcess;

public class DatabaseInvoiceSaver implements InvoiceSaver {

    @Override
    public void save(Invoice invoice) {
        System.out.println("Saved in Database " + invoice.calculateTotal());
    }
}
