package main.java.Class;

import java.util.Objects;
import java.util.TreeMap;

public class Person implements Comparable<Person> {

    private String name;

    private int age;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && getName().equals(person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    @Override
    public int compareTo(Person o) {
        int ageCompare = Integer.compare(this.age, o.age);
        if(ageCompare != 0) {
            return ageCompare;
        }
        return this.name.compareTo(o.name);
    }

    public static void main(String[] args) {
        TreeMap<Person, String> people = new TreeMap<>();

        Person maria = new Person("Maria", 30);
        Person john = new Person("John", 30);

        people.put(maria, "Programmer");
        people.put(john, "Designer");

        System.out.println(maria.toString());
        System.out.println(john.toString());

        for (Person person : people.keySet()) {
            System.out.println(person.getName() + " is a " + people.get(person));
        }
    }
}


