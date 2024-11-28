package org.example.principles.solid.dip;

/**
 * Interface MessageSender.
 * Purpose: Defines the behavior for sending messages.
 * Adheres to the Dependency Inversion Principle (DIP).
 */
public interface MessageSender {
    void sendMessage(String message);
}
