package main.java.SOLID.Exercise1.CorrectVersion.DIP;

public class NotificationService {

    private final MessageSender messageSender;

    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void send(String from, String to, String message) {
        messageSender.send(from,to,message);
    }
}
