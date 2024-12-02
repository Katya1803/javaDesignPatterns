package org.example.patterns.structural.decorator;

import org.example.patterns.PatternGroup;

/**
 * Decorator pattern example.
 */
public class DecoratorExample extends PatternGroup {

    @Override
    public void execute() {
        System.out.println("Decorator Pattern Example:");

        // Basic Notification
        Notification basicNotification = new BasicNotification();
        System.out.println("Basic Notification:");
        basicNotification.send("Hello, World!");

        // Notification with Logging
        Notification loggedNotification = new LoggingNotificationDecorator(basicNotification);
        System.out.println("\nNotification with Logging:");
        loggedNotification.send("Hello, World!");

        // Notification with Logging and Encryption
        Notification encryptedLoggedNotification = new EncryptionNotificationDecorator(loggedNotification);
        System.out.println("\nNotification with Logging and Encryption:");
        encryptedLoggedNotification.send("Hello, World!");
    }
}
