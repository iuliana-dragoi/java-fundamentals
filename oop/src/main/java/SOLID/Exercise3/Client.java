package main.java.SOLID.Exercise3;

public abstract class Client {

    private String name;

    private String email;

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }
}
