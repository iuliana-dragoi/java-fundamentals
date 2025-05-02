package main.java.BookFlight.Model;

public record FlightQuery(String from, String to) {

    public Flight readFromAlphaAirlines() {
        return Flight.readFromAlphaAirlines(from, to);
    }

    public Flight readFromGlobalAirlines() {
        return Flight.readFromGlobalAirlines(from, to);
    }

    public Flight readFromPlanetAirlines() {
        return Flight.readFromPlanetAirlines(from, to);
    }
}
