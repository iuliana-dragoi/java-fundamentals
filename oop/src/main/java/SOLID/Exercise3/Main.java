package main.java.SOLID.Exercise3;

import main.java.SOLID.Exercise3.Clients.GuestClient;
import main.java.SOLID.Exercise3.Discounts.DiscountStrategy;
import main.java.SOLID.Exercise3.Discounts.NewCustomerDiscount;
import main.java.SOLID.Exercise3.Exporter.OrderExporter;
import main.java.SOLID.Exercise3.Exporter.PdfOrderExporter;
import main.java.SOLID.Exercise3.Notifications.EmailNotificationSender;
import main.java.SOLID.Exercise3.Notifications.NotificationSender;
import main.java.SOLID.Exercise3.Orders.*;
import main.java.SOLID.Exercise3.Products.Product;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Create client
        Client client = new GuestClient("Alice", "Alice@example.com");

        //Create products
        Product laptop = new Product("laptop", 5000);
        Product mouse = new Product("mouse", 150);

        OrderItem orderItem1 = new OrderItem(laptop, 1);
        OrderItem orderItem2 = new OrderItem(mouse, 1);

        OrderService service = new OrderService();
        Order order = service.createOrder(client, List.of(orderItem1, orderItem2));

        //Inject dependencies
        OrderSaver saver = new DatabaseOrderSaver();
        NotificationSender sender = new EmailNotificationSender();
        DiscountStrategy discount = new NewCustomerDiscount();
        OrderExporter exporter = new PdfOrderExporter();

        //Process order
        OrderProcessor processor = new OrderProcessor(saver,sender,exporter,discount);
        processor.process(order);
    }
}
