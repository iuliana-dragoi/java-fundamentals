package main.java.BankSystemExample2;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person person = new Person("Alice"); // Accessing private attribute via accessor method. Output: Alice
        System.out.println(person.getName());
    }
}
