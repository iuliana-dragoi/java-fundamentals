package main.java.SOLID.Exercise4.Services;

import main.java.SOLID.Exercise4.Booking.Booking;
import main.java.SOLID.Exercise4.Clients.Client;
import main.java.SOLID.Exercise4.Discount.DiscountStrategy;
import main.java.SOLID.Exercise4.Room.Room;
import main.java.SOLID.Exercise4.Room.RoomType;

import java.time.LocalDate;
import java.util.List;

public class BookingService {

    private final RoomAllocator roomAllocator;
    private final PriceCalculator priceCalculator;
    private final DiscountStrategy discountStrategy;

    public BookingService(RoomAllocator roomAllocator, PriceCalculator priceCalculator, DiscountStrategy discountStrategy) {
        this.roomAllocator = roomAllocator;
        this.priceCalculator = priceCalculator;
        this.discountStrategy = discountStrategy;
    }

    public Booking createBooking(Client client, List<Room> rooms, RoomType requestedRoomType, LocalDate checkIn, LocalDate checkOut) {
        Room room = roomAllocator.allocateRoom(rooms, requestedRoomType);
        double basePrice = priceCalculator.calculateTotal(room, checkIn, checkOut);
        double finalPrice = discountStrategy.applyDiscount(client, basePrice);

        Booking booking = new Booking(client, room, checkIn, checkOut);
        booking.setTotalPrice(finalPrice);
        return booking;
    }
}
