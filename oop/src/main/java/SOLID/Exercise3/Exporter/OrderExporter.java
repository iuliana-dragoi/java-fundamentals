package main.java.SOLID.Exercise3.Exporter;

import main.java.SOLID.Exercise3.Orders.Order;

public interface OrderExporter {

    String export(Order order);
}
