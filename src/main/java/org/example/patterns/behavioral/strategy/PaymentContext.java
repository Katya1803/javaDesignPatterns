package org.example.patterns.behavioral.strategy;

/**
 * Class PaymentContext.
 * Purpose: Manages the selected PaymentStrategy and executes payment.
 */
public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    // Set the payment strategy dynamically
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Execute payment using the current strategy
    public void pay(double amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Payment strategy is not set.");
        }
        paymentStrategy.pay(amount);
    }
}