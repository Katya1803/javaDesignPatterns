package org.example.principles.solid.ocp;

/**
 * Interface PaymentMethod.
 * Purpose: Defines a common behavior for all payment methods.
 * Adheres to the Open/Closed Principle (OCP).
 */
public interface PaymentMethod {
    void pay(double amount);
}
