package main.java.WeatherForecast;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.StructuredTaskScope;

public record Weather(String weather, String server) {

    private static Random random = new Random();

    private enum WeatherForecast {
        Sunny, Rainy, Cloudy
    }

    public static Weather readWeather() {

        // So we have 3 weather forecasts: readFromInternationalWF, readFromGlobalWF, readFromPlanetEarthWeatherForecast
        // and we want to query all 3 servers in parallel concurrently.
        // Using StructuredTaskScope

        try (var scope = new StructuredTaskScope.ShutdownOnSuccess<Weather>()) {

            // To analyze results for our different forecasts we can create vars to put the result of the scope
            var f1 = scope.fork(() -> readFromInternationalWF()); // Provide callable to it.
            var f2 = scope.fork(() -> readFromGlobalWF());
            var f3 = scope.fork(() -> readFromPlanetEarthWeatherForecast());

            scope.join(); // Needs to be called in order to wait for all the tasks to be executed.

            System.out.println("F1: " + f1.state());
            if(f1.state() == StructuredTaskScope.Subtask.State.SUCCESS) {
                System.out.println(" " + f1.get());
            }

            System.out.println("F2: " + f2.state());
            if(f2.state() == StructuredTaskScope.Subtask.State.SUCCESS) {
                System.out.println(" " + f2.get());
            }

            System.out.println("F3: " + f3.state());
            if(f3.state() == StructuredTaskScope.Subtask.State.SUCCESS) {
                System.out.println(" " + f3.get());
            }

            return scope.result();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public static Weather readFromInternationalWF() {
        sleepFor(random.nextInt(70, 120), ChronoUnit.MILLIS);
        return new Weather(
            WeatherForecast.values()[random.nextInt(0, 3)].name(),
            "International Weather Forecast");
//        throw new RuntimeException("Something went wrong"); // Simulate a fail
    }

    public static Weather readFromGlobalWF() {
        sleepFor(random.nextInt(80, 100), ChronoUnit.MILLIS);
        return new Weather(
            WeatherForecast.values()[random.nextInt(0, 3)].name(),
            "Global Weather Forecast");
    }

    public static Weather readFromPlanetEarthWeatherForecast() {
        sleepFor(random.nextInt(80, 110), ChronoUnit.MILLIS);
        return new Weather(
            WeatherForecast.values()[random.nextInt(0, 3)].name(),
            "Planet Earth Weather Forecast");
    }

    private static void sleepFor(int amount, ChronoUnit unit) {
        try {
            Thread.sleep(Duration.of(amount, unit));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
