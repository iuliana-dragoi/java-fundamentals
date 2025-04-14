package main.java.SmartEntertaimentManagementSystem.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {

    public static void savePersonsToFile(List<Person> people, String filePath) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for(Person person : people) {
                writer.write(person.toFileFormat());
                writer.newLine();
            }
            System.out.println("Saved successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Person> readPersonsFromFile(String filePath) {
        List<Person> people = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null) {
                people.add(Person.fromFileFormat(line));
            }
            System.out.println("Loaded successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return people;
    }
}
