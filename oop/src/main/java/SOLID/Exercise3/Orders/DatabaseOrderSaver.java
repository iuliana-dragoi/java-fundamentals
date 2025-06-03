package main.java.SOLID.Exercise3.Orders;

public class DatabaseOrderSaver implements OrderSaver {

    @Override
    public void save(Order order) {
        System.out.println("Saved order with " + order.getItems().size() + " items");
    }
}
