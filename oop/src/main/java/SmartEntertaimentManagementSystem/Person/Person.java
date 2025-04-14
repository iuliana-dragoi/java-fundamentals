package main.java.SmartEntertaimentManagementSystem.Person;

import main.java.SmartEntertaimentManagementSystem.Exceptions.InvalidAgeException;

/**
🔹 Person should be the base class (parent), and
🔹 Manager and Student will inherit from Person
**/

public class Person {

    private String firstName;

    private String lastName;

    private Integer age;

    public Person(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) throws InvalidAgeException {
        if(age > 0) {
            this.age = age;
        }
        else throw new InvalidAgeException("Age is not valid!");
    }

    public String toFileFormat() {
        return this.firstName + "," + this.lastName + "," + this.age;
    }

    public static Person fromFileFormat(String line) {
        String[] lines = line.split(",");
        return new Person(lines[0], lines[1], Integer.parseInt(lines[2]));
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + " " + this.getAge();
    }
}
