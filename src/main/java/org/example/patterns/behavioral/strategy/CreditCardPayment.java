package org.example.patterns.behavioral.strategy;

/**
 * Class CreditCardPayment.
 * Implements PaymentStrategy for Credit Card payment.
 */
public class CreditCardPayment implements PaymentStrategy {
    private final String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card [" + cardNumber + "]");
    }
}