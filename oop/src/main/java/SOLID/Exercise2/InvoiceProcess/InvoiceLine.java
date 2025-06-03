package main.java.SOLID.Exercise2.InvoiceProcess;

import main.java.SOLID.Exercise2.ProductProcess.Product;

public class InvoiceLine {

    private Product product;
    private int quantity;

    public InvoiceLine(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getLineTotal() {
        return quantity * product.getPriceUnit();
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
