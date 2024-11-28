package org.example.principles.solid.dip;

/**
 * Class NotificationService.
 * Purpose: Sends notifications using various message senders.
 * Adheres to the Dependency Inversion Principle (DIP).
 */
public class NotificationService {
    private final MessageSender messageSender;

    /**
     * Constructor to inject the dependency.
     *
     * @param messageSender The message sender to use.
     */
    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void sendNotification(String message) {
        messageSender.sendMessage(message);
    }
}
