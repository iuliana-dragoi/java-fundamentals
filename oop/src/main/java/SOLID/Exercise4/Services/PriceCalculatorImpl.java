package main.java.SOLID.Exercise4.Services;

import main.java.SOLID.Exercise4.Room.Room;
import java.time.LocalDate;
import java.time.Period;

public class PriceCalculatorImpl implements PriceCalculator {

    @Override
    public double calculateTotal(Room room, LocalDate checkIn, LocalDate checkOut) {
        Period period = Period.between(checkIn, checkOut);
        int nights = period.getDays();
        return nights * room.getPricePerNight();
    }
}
