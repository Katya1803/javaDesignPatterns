package org.example.principles.solid.ocp;

/**
 * Class PayPalPayment.
 * Purpose: Handles payment using PayPal.
 * Adheres to the Open/Closed Principle (OCP).
 */
public class PayPalPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}
