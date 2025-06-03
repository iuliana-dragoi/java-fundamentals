package main.java.SOLID.Exercise6;

public class Customer {

    private final String name;
    private final String email;

    private boolean loyal;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public boolean isLoyal() {
        return loyal;
    }

    public void setLoyal(boolean loyal) {
        this.loyal = loyal;
    }
}
