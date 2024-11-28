package org.example.principles.solid.dip;

import org.example.principles.PrincipleGroup;

/**
 * Class DIPExample.
 * Purpose: Demonstrates the Dependency Inversion Principle (DIP).
 */
public class DIPExample extends PrincipleGroup {

    @Override
    public void execute() {
        // Inject EmailSender
        MessageSender emailSender = new EmailSender();
        NotificationService emailNotification = new NotificationService(emailSender);
        emailNotification.sendNotification("This is an email notification!");

        // Inject SmsSender
        MessageSender smsSender = new SmsSender();
        NotificationService smsNotification = new NotificationService(smsSender);
        smsNotification.sendNotification("This is an SMS notification!");
    }

    @Override
    public String getDescription() {
        return "Dependency Inversion Principle (DIP): High-level modules should not depend on low-level modules. Both should depend on abstractions.";
    }
}
