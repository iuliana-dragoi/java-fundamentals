package main.java.SOLID.Exercise4.Services;

import main.java.SOLID.Exercise4.Room.Room;
import java.time.LocalDate;

public interface PriceCalculator {

    double calculateTotal(Room room, LocalDate checkIn, LocalDate checkOut);
}
