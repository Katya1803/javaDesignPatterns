package org.example.patterns.behavioral.strategy;

/**
 * Interface PaymentStrategy.
 * Purpose: Defines a common interface for different payment methods.
 */
public interface PaymentStrategy {
    void pay(double amount);
}