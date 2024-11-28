package org.example.principles.solid.dip;

/**
 * Class SmsSender.
 * Purpose: Sends messages via SMS.
 * Adheres to the Dependency Inversion Principle (DIP).
 */
public class SmsSender implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println("SMS sent: " + message);
    }
}
