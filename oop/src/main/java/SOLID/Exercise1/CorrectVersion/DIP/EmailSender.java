package main.java.SOLID.Exercise1.CorrectVersion.DIP;

public class EmailSender implements MessageSender {

    @Override
    public void send(String from, String to, String message) {
        System.out.println("Sending EMAIL to " + to + ": " + message);
    }
}
