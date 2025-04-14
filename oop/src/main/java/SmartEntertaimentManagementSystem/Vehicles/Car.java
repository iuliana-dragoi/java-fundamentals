package main.java.SmartEntertaimentManagementSystem.Vehicles;

public class Car extends Vehicle {

    private CarType carType;

    public Car(String brand, Integer year, CarType carType) {
        super(brand, year);
        this.carType = carType;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void start() {
        System.out.println("Car is starting...");
    }
}
