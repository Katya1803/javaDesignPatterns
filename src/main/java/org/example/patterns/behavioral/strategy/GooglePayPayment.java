package org.example.patterns.behavioral.strategy;

/**
 * Class GooglePayPayment.
 * Implements PaymentStrategy for Google Pay payment.
 */
public class GooglePayPayment implements PaymentStrategy {
    private final String phoneNumber;

    public GooglePayPayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Google Pay linked to phone [" + phoneNumber + "]");
    }
}