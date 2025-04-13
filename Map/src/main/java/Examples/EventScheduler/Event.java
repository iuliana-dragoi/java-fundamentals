package main.java.Examples.EventScheduler;

import java.time.LocalDate;
import java.util.Objects;

public class Event implements Comparable<Event> {

    private String name;

    private LocalDate startTime;

    public Event(String name, LocalDate startTime) {
        this.name = name;
        this.startTime = startTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getStartTime());
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Event)) return false;
        Event o = (Event) obj;
        return this.getName().equals(o.getName()) && this.getStartTime().equals(o.getStartTime());
    }

    @Override
    public int compareTo(Event o) {
        int result = this.startTime.compareTo(o.startTime);
        if (result == 0) {
            return this.name.compareTo(o.name);
        }
        return result;
    }

    @Override
    public String toString() {
        return this.getName() + " at " + this.getStartTime();
    }
}
