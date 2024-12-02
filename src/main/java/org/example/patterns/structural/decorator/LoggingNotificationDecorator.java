package org.example.patterns.structural.decorator;


/**
 * Class LoggingNotificationDecorator.
 * Extends NotificationDecorator to add logging functionality.
 */
public class LoggingNotificationDecorator extends NotificationDecorator {

    public LoggingNotificationDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String message) {
        log(message);
        super.send(message);
    }

    private void log(String message) {
        System.out.println("Logging: " + message);
    }
}
