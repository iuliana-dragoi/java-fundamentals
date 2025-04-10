package main.java;

import java.util.Map;
import java.util.TreeMap;

public class StudentGrades {

    public static void main(String[] args) {
        TreeMap<String, Integer> studentGrades = new TreeMap<>();
        studentGrades.put("Student1", 8);
        studentGrades.put("Student2", 5);
        studentGrades.put("Student3", 6);
        studentGrades.put("Student4", 3);

        System.out.println("Students with grades between 1 and 4:");
        for(Map.Entry<String, Integer> studentGrade : studentGrades.entrySet()) {
            if(studentGrade.getValue() <= 4) {
                System.out.println(studentGrade.getKey() );
            }
        }

        System.out.println("Students with grades > 4:");
        for(Map.Entry<String, Integer> studentGrade : studentGrades.entrySet()) {
            if(studentGrade.getValue() > 4) {
                System.out.println(studentGrade.getKey() );
            }
        }

        System.out.println("Remove students that failed");
        studentGrades.entrySet().removeIf(entry -> entry.getValue() < 5);

        System.out.println("Display Students that passed in order by grades");
        studentGrades.entrySet().stream().sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue())).forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
