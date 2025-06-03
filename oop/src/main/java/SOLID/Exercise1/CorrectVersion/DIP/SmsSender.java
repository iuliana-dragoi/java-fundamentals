package main.java.SOLID.Exercise1.CorrectVersion.DIP;

public class SmsSender implements MessageSender {

    @Override
    public void send(String from, String to, String message) {
        System.out.println("Sending SMS to " + to + ": " + message);
    }
}
