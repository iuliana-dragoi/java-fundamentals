package main.java.SOLID.Exercise1.CorrectVersion.DIP;

public class Main {

    /**
     NotificationService depends on the interface (MessageSender), not on concrete classes.
     We can change the implementation (email, sms, push notification, etc.) without changing the class.
     We comply with DIP and are ready for Inversion of Control / Dependency Injection, as used in Spring.
    **/

    public static void main(String[] args) {
        MessageSender emailSender = new EmailSender();
        MessageSender smsSender = new SmsSender();

        NotificationService emailService = new NotificationService(emailSender);
        NotificationService smsService = new NotificationService(smsSender);

        emailService.send("john@example.com", "alice@example.com", "Hello via Email!");
        smsService.send("0722423445", "0722123456", "Hello via SMS!");
    }
}
