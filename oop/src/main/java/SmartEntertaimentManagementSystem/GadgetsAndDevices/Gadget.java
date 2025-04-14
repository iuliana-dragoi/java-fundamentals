package main.java.SmartEntertaimentManagementSystem.GadgetsAndDevices;

import main.java.SmartEntertaimentManagementSystem.Exceptions.InvalidPriceException;

public class Gadget {

    private Integer price;

    public Gadget(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) throws InvalidPriceException {
        if(price > 0) this.price = price;
        else throw new InvalidPriceException("Invalid price");
    }
}
