package org.example.patterns.behavioral.strategy;

import org.example.patterns.PatternGroup;

/**
 * Strategy pattern example.
 */
public class StrategyExample extends PatternGroup {

    @Override
    public void execute() {
        System.out.println("Strategy Pattern Example:");

        // Create context
        PaymentContext paymentContext = new PaymentContext();

        // Use Credit Card payment
        paymentContext.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        paymentContext.pay(100.50);

        // Use PayPal payment
        paymentContext.setPaymentStrategy(new PayPalPayment("user@example.com"));
        paymentContext.pay(200.75);

        // Use Google Pay payment
        paymentContext.setPaymentStrategy(new GooglePayPayment("+123456789"));
        paymentContext.pay(300.00);
    }
}