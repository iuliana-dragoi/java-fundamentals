package main.java.SOLID.Exercise4.Booking;

import main.java.SOLID.Exercise4.Clients.Client;
import main.java.SOLID.Exercise4.Room.Room;
import java.time.LocalDate;

public class Booking {

    private Client client;
    private Room room;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private double totalPrice;

    public Booking(Client client, Room room, LocalDate checkIn, LocalDate checkOut) {
        this.client = client;
        this.room = room;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
