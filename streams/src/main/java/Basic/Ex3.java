package main.java.Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex3 {

    public static void main(String[] args) {

        List<Person> people = List.of(
            new Person("John", 12),
            new Person("Mary", 56),
            new Person("Alice", 32),
            new Person("Bob", 55),
            new Person("Marcus", 12),
            new Person("Natasha", 33),
            new Person("Matilda", 8)
        );

        List<Person> sortedList = people.stream().sorted(Comparator.comparing(Person::getAge).reversed()).toList();
        sortedList.forEach(System.out::println);
    }

    static class Person {

        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    };
}
