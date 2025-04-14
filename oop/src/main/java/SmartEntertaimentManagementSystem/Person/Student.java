package main.java.SmartEntertaimentManagementSystem.Person;

import java.time.Year;

public class Student extends Person {

    private String major;

    private Year year;

    public Student(String firstName, String lastName, Integer age) {
        super(firstName, lastName, age);
    }

    public Student(String firstName, String lastName, Integer age, String major, Year year) {
        super(firstName, lastName, age);
        this.major = major;
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }
}
