package org.example.patterns.behavioral.observer;

/**
 * Class SMSSubscriber.
 * Implements Observer interface.
 * Purpose: Represents a subscriber receiving news updates via SMS.
 */
public class SMSSubscriber implements Observer {
    private final String phoneNumber;

    public SMSSubscriber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String message) {
        System.out.println("SMS sent to " + phoneNumber + ": " + message);
    }
}