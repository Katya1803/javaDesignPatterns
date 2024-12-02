package org.example.patterns.structural.decorator;

/**
 * Abstract class NotificationDecorator.
 * Implements Notification interface.
 * Purpose: Base class for decorators.
 */
public abstract class NotificationDecorator implements Notification {
    protected Notification wrappedNotification;

    public NotificationDecorator(Notification notification) {
        this.wrappedNotification = notification;
    }

    @Override
    public void send(String message) {
        wrappedNotification.send(message);
    }
}
