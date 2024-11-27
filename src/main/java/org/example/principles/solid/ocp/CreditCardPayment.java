package org.example.principles.solid.ocp;

/**
 * Class CreditCardPayment.
 * Purpose: Handles payment using a credit card.
 * Adheres to the Open/Closed Principle (OCP).
 */
public class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}
