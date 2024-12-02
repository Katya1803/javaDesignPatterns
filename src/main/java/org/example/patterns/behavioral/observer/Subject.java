package org.example.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Interface Subject.
 * Purpose: Represents a subject that manages and notifies observers.
 */
public abstract class Subject {
    private final List<Observer> observers = new ArrayList<>();

    // Add an observer
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Remove an observer
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Notify all observers
    protected void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}