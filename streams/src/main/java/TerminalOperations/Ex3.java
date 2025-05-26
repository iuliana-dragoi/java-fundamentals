package main.java.TerminalOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex3 {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("John", "M"));
        people.add(new Person("Jane", "F"));
        people.add(new Person("Mark", "M"));
        people.add(new Person("Alice", "F"));
        people.add(new Person("Dan", "M"));

        Map<String, List<String>> result = people.stream().collect(Collectors.groupingBy(
            Person::getGender,
            Collectors.mapping(Person::getName, Collectors.toList())
        ));
        result.forEach((k,v ) -> {
            System.out.println(k + ": " + v);
        });
    }

    static class Person {

        String name;
        String gender;

        public Person(String name, String gender) {
            this.name = name;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    '}';
        }
    }
}
