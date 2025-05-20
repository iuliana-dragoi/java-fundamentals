package src.main.java.Exercises2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//20. Sort list of people by age using lambda and Comparator
//Sort a list of Person objects by age using a lambda.
public class Ex20 {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("P1", 12));
        people.add(new Person("P2", 23));
        people.add(new Person("P3", 55));
        people.add(new Person("P4", 54));
        people.add(new Person("P5", 25));

        people.stream()
            .sorted(Comparator.comparing(Person::getAge))
            .forEach(System.out::println);
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
