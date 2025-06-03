package main.java.SOLID.Exercise6.Discout;

import main.java.SOLID.Exercise6.Order;

public class CouponDiscount implements DiscountStrategy {

    private final String validCode;

    public CouponDiscount(String validCode) {
        this.validCode = validCode;
    }

    @Override
    public double applyDiscount(Order order) {
        if("PROMO10".equals(order.getCouponCode())) {
            return order.getTotal() * 0.1;
        }
        return 0;
    }
}
