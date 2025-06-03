package main.java.SOLID.Exercise1.BadVersion.DIP;

public class EmailSender {

    public void sendEmail(String from, String to, String message) {
        System.out.println("From: " + from + ", to: " + to + " Sending.. " + message);
    }
}
