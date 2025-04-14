package main.java.SmartEntertaimentManagementSystem.Film;

import main.java.SmartEntertaimentManagementSystem.Exceptions.InvalidAgeException;
import main.java.SmartEntertaimentManagementSystem.Exceptions.InvalidDurationException;

public class Film {

    private String title;

    private Integer duration;

    public Film(String title) {
        this(title, 90);
    }

    public Film(String title, Integer duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) throws InvalidDurationException {
        if (duration > 0) this.duration = duration;
        else throw new InvalidDurationException("Invalid duration");
    }

    public void displayInfo() {
        System.out.println(this.title + " duration " + this.duration + " minutes" );
    }
}
