package main.java.SOLID.Exercise3.Notifications;

import main.java.SOLID.Exercise3.Client;

public interface NotificationSender {

    void send(Client client, String message);
}
