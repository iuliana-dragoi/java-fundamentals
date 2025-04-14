package main.java.SmartEntertaimentManagementSystem.Person;

public class Manager extends Person {

    private String department;

    public Manager(String firstName, String lastName, Integer age) {
        super(firstName, lastName, age);
    }

    public Manager(String firstName, String lastName, Integer age, String department) {
        super(firstName, lastName, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
