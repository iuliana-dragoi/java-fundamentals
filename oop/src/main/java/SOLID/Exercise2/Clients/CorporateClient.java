package main.java.SOLID.Exercise2.Clients;

public class CorporateClient extends Client {

    public CorporateClient(int id, String name, String email, String address) {
        super(id, name, email, address);
    }

    @Override
    public double getDiscount() {
        return 0.1;
    }


}
