package org.example.patterns.structural.decorator;


/**
 * Class EncryptionNotificationDecorator.
 * Extends NotificationDecorator to add encryption functionality.
 */
public class EncryptionNotificationDecorator extends NotificationDecorator {

    public EncryptionNotificationDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String message) {
        String encryptedMessage = encrypt(message);
        super.send(encryptedMessage);
    }

    private String encrypt(String message) {
        return new StringBuilder(message).reverse().toString(); // Simple reverse encryption
    }
}
