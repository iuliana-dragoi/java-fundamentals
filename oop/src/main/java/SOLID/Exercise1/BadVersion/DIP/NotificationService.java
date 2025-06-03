package main.java.SOLID.Exercise1.BadVersion.DIP;

/**
 High-level modules should not depend on low-level modules. Both should depend on abstractions.
 Abstractions should not depend on details. Details should depend on abstractions.

 In other words:
    -High-level classes (e.g. NotificationService) should not depend directly on concrete implementations (e.g. EmailSender).
    -Instead, they should depend on interfaces (e.g. MessageSender), and the concrete implementations should be injected.
 **/

public class NotificationService {

    /**
     NotificationService depends directly on EmailSender, so we cannot replace it with another type of sending without modifying the class.
    **/

    private EmailSender emailSender = new EmailSender();

    public void send(String from, String to, String message) {
        emailSender.sendEmail(from,to,message);
    }

}
