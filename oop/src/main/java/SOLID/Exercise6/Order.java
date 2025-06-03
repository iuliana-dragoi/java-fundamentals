package main.java.SOLID.Exercise6;


import java.util.ArrayList;
import java.util.List;

public class Order {

    private final Customer customer;
    private final List<OrderLine> items;

    private String couponCode;

    public Order(Customer customer, List<OrderLine> items, String couponCode) {
        this.customer = customer;
        this.items = items;
        this.couponCode = couponCode;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<OrderLine> getItems() {
        return items;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public double getTotal() {
        return this.items.stream().mapToDouble(OrderLine::getTotal).sum();
    }

    public static class Builder {

        private Customer customer;
        private final List<OrderLine> items = new ArrayList<>();

        private String couponCode;

        public Builder withCustomer(Customer customer) {
            this.customer = customer;
            return this;
        }

        public Builder addItem(Product product, int quantity) {
            this.items.add(new OrderLine(product, quantity));
            return this;
        }

        public Builder addCoupon(String couponCode) {
            this.couponCode = couponCode;
            return this;
        }

        public Order build() {
            if(customer == null || items.isEmpty()) {
                throw new IllegalStateException("Order must have a customer and at least one item.");
            }
            return new Order(customer, items, couponCode);
        }
    }
}
