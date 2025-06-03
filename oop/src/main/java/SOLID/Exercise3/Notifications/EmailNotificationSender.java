package main.java.SOLID.Exercise3.Notifications;

import main.java.SOLID.Exercise3.Client;

public class EmailNotificationSender implements NotificationSender {

    @Override
    public void send(Client client, String message) {
        System.out.println("Email sent to " + client.getName() + ": " + message);
    }
}
