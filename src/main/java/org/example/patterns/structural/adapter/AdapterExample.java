package org.example.patterns.structural.adapter;

import org.example.patterns.PatternGroup;

/**
 * Adapter pattern example.
 */
public class AdapterExample extends PatternGroup {

    @Override
    public void execute() {
        System.out.println("Adapter Pattern Example:");

        // Using EmailNotification directly
        Notification emailNotification = new EmailNotification();
        emailNotification.send("This is an email notification.");

        // Using SmsService through the SmsAdapter
        Notification smsNotification = new SmsAdapter("+123456789");
        smsNotification.send("This is an SMS notification.");
    }
}
