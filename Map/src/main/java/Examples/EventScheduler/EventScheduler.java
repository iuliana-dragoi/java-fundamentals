package main.java.Examples.EventScheduler;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class EventScheduler {

    private TreeMap<Event, LocalDate> map;

    public EventScheduler() {
        this.map = new TreeMap<>();
    }

    public void scheduleEvent(Event event) {
        map.put(event, event.getStartTime());
    }

    public void cancelEvent(Event event) {
        if(map.containsKey(event)) {
            map.remove(event);
        }
        else {
            System.out.println("Event doesn't exist");
        }
    }

    public Event getNextEvent() {
        if(map.isEmpty()) {
            System.out.println("No events");
            return null;
        }
        else {
            Map.Entry<Event, LocalDate> entry = this.map.firstEntry();
            return entry.getKey();
        }
    }

    public List<Event> getAllUpcomingEvents() {
        return new ArrayList<>(map.keySet());
    }
}
