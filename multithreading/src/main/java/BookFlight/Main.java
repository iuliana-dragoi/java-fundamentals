package main.java.BookFlight;

import main.java.BookFlight.Model.Flight;

import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        example2();

    }

    public static void example1() {
        String from = "New York";
        String to = "San Francisco";

        var start = Instant.now();
        var flight1 = Flight.readFromAlphaAirlines(from, to);
        var flight2 = Flight.readFromGlobalAirlines(from, to);
        var flight3 = Flight.readFromPlanetAirlines(from, to);
        var end = Instant.now();

        System.out.println("Flight 1 = " + flight1);
        System.out.println("Flight 2 = " + flight2);
        System.out.println("Flight 3 = " + flight3);

        Flight bestFlight = Stream.of(flight1, flight2, flight3)
            .min(Comparator.comparing(Flight::price))
            .get();

        System.out.println("Best flight = " + bestFlight + " in " + Duration.between(start, end).toMillis() + "ms");
    }

    public static void example2() {
        String from = "New York";
        String to = "San Francisco";

        var start = Instant.now();
        var bestFlight = Flight.readFlight(from, to);
        var end = Instant.now();

        System.out.println("Best flight = " + bestFlight + " in " + Duration.between(start, end).toMillis() + "ms");
    }
}
