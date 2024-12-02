package org.example.patterns.behavioral.strategy;

/**
 * Class PayPalPayment.
 * Implements PaymentStrategy for PayPal payment.
 */
public class PayPalPayment implements PaymentStrategy {
    private final String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal account [" + email + "]");
    }
}