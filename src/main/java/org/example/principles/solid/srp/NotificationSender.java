package org.example.principles.solid.srp;

/**
 * Class NotificationSender.
 * Purpose: Responsible for sending notifications.
 * Adheres to the Single Responsibility Principle (SRP).
 */
public class NotificationSender {
    public void sendNotification(String message) {
        // Simulate sending a notification
        System.out.println("Notification sent: " + message);
    }
}