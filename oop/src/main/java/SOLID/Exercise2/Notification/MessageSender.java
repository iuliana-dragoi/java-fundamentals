package main.java.SOLID.Exercise2.Notification;

import main.java.SOLID.Exercise2.Clients.Client;

public interface MessageSender {

    void send(Client client, String message);
}
