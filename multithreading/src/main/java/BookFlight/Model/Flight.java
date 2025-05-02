package main.java.BookFlight.Model;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.Random;
import java.util.concurrent.StructuredTaskScope;
import java.util.stream.Stream;

public record Flight(String from, String to, int price, String airline) {

    private static Random random = new Random();

    // https://app.pluralsight.com/ilx/video-courses/a589c8c4-fd08-4bbc-a516-15de80c23ec5/5f5e07af-d814-4908-af7e-c205dbfb84be/1c24db94-739f-4603-86e0-b51ba4db9d24
    
    public static Flight readFlight(String from, String to) {

        FlightQuery query = new FlightQuery(from, to);

        try(var scope = new StructuredTaskScope<Flight>()) {
            // to be able to use method references FlightQuery was created.
            var t1 = scope.fork(query::readFromAlphaAirlines);
            var t2 = scope.fork(query::readFromGlobalAirlines);
            var t3 = scope.fork(query::readFromPlanetAirlines);

            scope.join();

            var bestFlight = Stream.of(t1, t2, t3)
                .filter(t -> t.state() == StructuredTaskScope.Subtask.State.SUCCESS)
                .map( StructuredTaskScope.Subtask::get)
                .min(Comparator.comparing(Flight::price))
                .get();

            return bestFlight;

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static Flight readFromAlphaAirlines(String from, String to) {
        sleepFor(random.nextInt(80, 110), ChronoUnit.MILLIS);
        return new Flight(from, to, random.nextInt(70, 120), "Alpha Airlines");
    }

    public static Flight readFromGlobalAirlines(String from, String to) {
        sleepFor(random.nextInt(90, 115), ChronoUnit.MILLIS);
        return new Flight(from, to, random.nextInt(60, 90), "Global Airlines");
    }

    public static Flight readFromPlanetAirlines(String from, String to) {
        sleepFor(random.nextInt(100, 130), ChronoUnit.MILLIS);
        return new Flight(from, to, random.nextInt(50, 70), "Planet Airlines");
    }

    private static void sleepFor(int amount, ChronoUnit unit) {
        try {
            Thread.sleep(Duration.of(amount, unit));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
