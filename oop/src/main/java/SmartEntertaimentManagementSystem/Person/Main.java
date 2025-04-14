package main.java.SmartEntertaimentManagementSystem.Person;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String path = "people.txt";

        List<Person> peopleToSave = Arrays.asList(
            new Person("Alice", "A", 30),
            new Person("Bob", "B", 25)
        );

        FileHandler.savePersonsToFile(peopleToSave, path);

        List<Person> loadedPeople = FileHandler.readPersonsFromFile(path);
        for (Person p : loadedPeople) {
            System.out.println(p);
        }
    }
}
