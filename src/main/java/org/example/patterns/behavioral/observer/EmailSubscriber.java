package org.example.patterns.behavioral.observer;

/**
 * Class EmailSubscriber.
 * Implements Observer interface.
 * Purpose: Represents a subscriber receiving news updates via email.
 */
public class EmailSubscriber implements Observer {
    private final String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void update(String message) {
        System.out.println("Email sent to " + email + ": " + message);
    }
}