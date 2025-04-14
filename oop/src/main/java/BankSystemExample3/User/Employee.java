package main.java.BankSystemExample3.User;

public class Employee extends AbstractUser {

    private String company;

    public Employee(int id, String name, String email, String company) {
        super(id, name, email);
        this.company = company;
    }

    @Override
    public String getProfileInfo() {
        return "Employee with ID: " + this.id + ", Name: " + this.name + ", Email: " + this.email + ", from Company: " + this.company;
    }
}
