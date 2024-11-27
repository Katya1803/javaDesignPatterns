package org.example.principles.solid.srp;

import org.example.principles.PrincipleGroup;

/**
 * Class SRPExample.
 * Purpose: Demonstrates the Single Responsibility Principle (SRP).
 */
public class SRPExample extends PrincipleGroup {

    @Override
    public void execute() {
        // Create instances of NotificationSender and NotificationLogger
        NotificationSender sender = new NotificationSender();
        NotificationLogger logger = new NotificationLogger();

        String message = "This is a test notification.";

        // Use separate classes to send and log notifications
        sender.sendNotification(message);
        logger.logNotification(message);
    }

    @Override
    public String getDescription() {
        return "Single Responsibility Principle (SRP): A class should have only one reason to change.";
    }
}
