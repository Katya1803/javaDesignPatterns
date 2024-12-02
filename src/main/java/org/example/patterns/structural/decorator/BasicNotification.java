package org.example.patterns.structural.decorator;

/**
 * Class BasicNotification.
 * Implements Notification interface.
 * Purpose: Basic notification functionality.
 */
public class BasicNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending notification: " + message);
    }
}
