package main.java.SOLID.Exercise2.Clients;

public class RegularClient extends Client {

    public RegularClient(int id, String name, String email, String address) {
        super(id, name, email, address);
    }

    @Override
    public double getDiscount() {
        return 0;
    }
}
