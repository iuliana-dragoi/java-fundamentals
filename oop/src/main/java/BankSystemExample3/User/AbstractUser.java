package main.java.BankSystemExample3.User;

public abstract class AbstractUser implements User {

    protected int id;
    protected String name;
    protected String email;

    public AbstractUser(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void login(String email, String password) {

    }

    @Override
    public void logout() {

    }

    @Override
    public String getProfileInfo() {
        return "ID: " + this.id + ", Name: " + this.name + ", Email: " + this.email;
    }

}
