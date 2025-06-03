package main.java.SOLID.Exercise2.Notification;

import main.java.SOLID.Exercise2.Clients.Client;

public class EmailSender implements MessageSender {

    @Override
    public void send(Client client, String message) {
        System.out.println("Send email to " + client.getEmail() + ": " + message);
    }
}
