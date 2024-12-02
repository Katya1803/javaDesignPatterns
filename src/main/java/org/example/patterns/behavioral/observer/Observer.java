package org.example.patterns.behavioral.observer;

/**
 * Interface Observer.
 * Purpose: Represents a subscriber that listens for updates from the Subject.
 */
public interface Observer {
    void update(String message);
}
