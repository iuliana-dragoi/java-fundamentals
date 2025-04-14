package main.java.BankSystemExample3.User;

public interface User {

    void login(String email, String password);

    void logout();

    String getProfileInfo();

}
