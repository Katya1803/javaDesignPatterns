package org.example.patterns.structural.adapter;

/**
 * Class EmailNotification.
 * Implements Notification interface.
 */
public class EmailNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}
