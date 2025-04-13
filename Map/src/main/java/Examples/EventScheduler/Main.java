package main.java.Examples.EventScheduler;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        EventScheduler scheduler = new EventScheduler();

        scheduler.scheduleEvent(new Event("Interview", LocalDate.of(2025, 4, 14)));
        scheduler.scheduleEvent(new Event("Team Meeting", LocalDate.of(2025, 4, 12)));
        scheduler.scheduleEvent(new Event("Code Review", LocalDate.of(2025, 4, 15)));

        System.out.println("Next Event: " + scheduler.getNextEvent());

        scheduler.cancelEvent(new Event("Team Meeting", LocalDate.of(2025, 4, 12)));
        System.out.println("Next Event after cancellation: " + scheduler.getNextEvent());

        System.out.println("All upcoming events:");
        for (Event event : scheduler.getAllUpcomingEvents()) {
            System.out.println(event);
        }
    }
}
