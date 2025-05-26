package main.java.TerminalOperations;

import java.util.ArrayList;
import java.util.List;

public class Ex5 {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Dan", 55));
        people.add(new Person("John", 33));
        people.add(new Person("Jane", 42));
        people.add(new Person("Jack", 18));
        people.add(new Person("Jill", 23));

        List<Person> peopleOver30 = people.stream()
                .filter(p -> p.getAge() > 30)
                .toList();
        System.out.println(peopleOver30);
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
    }
}
