package org.example.principles.solid.srp;

/**
 * Class NotificationLogger.
 * Purpose: Responsible for logging notifications.
 * Adheres to the Single Responsibility Principle (SRP).
 */
public class NotificationLogger {
    public void logNotification(String message) {
        // Simulate logging the notification
        System.out.println("Notification logged: " + message);
    }
}