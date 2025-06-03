package main.java.SOLID.Exercise4;

import main.java.SOLID.Exercise4.Booking.Booking;
import main.java.SOLID.Exercise4.Clients.Client;
import main.java.SOLID.Exercise4.Clients.VipClient;
import main.java.SOLID.Exercise4.Discount.DiscountStrategy;
import main.java.SOLID.Exercise4.Discount.NoDiscount;
import main.java.SOLID.Exercise4.Room.Room;
import main.java.SOLID.Exercise4.Room.RoomType;
import main.java.SOLID.Exercise4.Services.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room(1, RoomType.SINGLE, 200.0));
        rooms.add(new Room(2, RoomType.DOUBLE, 300.0));
        rooms.add(new Room(3, RoomType.SUITE, 500.0));

        Client client = new VipClient("Alice", "alice@example.com");

        RoomAllocator roomAllocator = new RoomAllocatorImpl();
        PriceCalculator priceCalculator = new PriceCalculatorImpl();
        DiscountStrategy discountStrategy = new NoDiscount();

        BookingService bookingService = new BookingService(
            roomAllocator,
            priceCalculator,
            discountStrategy
        );

        LocalDate checkIn = LocalDate.of(2025, 6, 1);
        LocalDate checkOut = LocalDate.of(2025, 6, 5);

        Booking booking = bookingService.createBooking(
                client,
                rooms,
                RoomType.SINGLE,
                checkIn,
                checkOut
        );

        System.out.println("Booking Details:");
        System.out.println("Client: " + booking.getClient().getName());
        System.out.println("Room: " + booking.getRoom().getRoomNumber());
        System.out.println("Type: " + booking.getRoom().getType());
        System.out.println("Check-in: " + booking.getCheckIn());
        System.out.println("Check-out: " + booking.getCheckOut());
        System.out.println("Total price: " + booking.getTotalPrice());
    }
}
