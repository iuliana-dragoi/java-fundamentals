package main.java.SmartEntertaimentManagementSystem.Vehicles;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Toyota", 2022, CarType.SUV);
        car.displayInfo();
        car.start();
        System.out.println("Type: " + car.getCarType());
    }
}
