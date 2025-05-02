package main.java.WeatherForecast;

public class Main {

    public static void main(String[] args) {
        var weather = Weather.readWeather();
        System.out.println("weather = " + weather);
    }
}
