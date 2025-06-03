package main.java.SOLID.Exercise3.Exporter;

import main.java.SOLID.Exercise3.Orders.Order;

public class PdfOrderExporter implements OrderExporter {

    @Override
    public String export(Order order) {
        return "Order for " + order.getClient().getName() + ": " + order.getItems().size() + " items.";
    }
}
