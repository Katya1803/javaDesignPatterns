package org.example.principles.solid.ocp;

import org.example.principles.PrincipleGroup;

/**
 * Class OCPExample.
 * Purpose: Demonstrates the Open/Closed Principle (OCP).
 */
public class OCPExample extends PrincipleGroup {

    @Override
    public void execute() {
        // Create a payment processor
        PaymentProcessor processor = new PaymentProcessor();

        // Add different payment methods
        processor.addPaymentMethod(new CreditCardPayment());
        processor.addPaymentMethod(new PayPalPayment());

        // Process payments
        double amount = 100.0;
        processor.processPayments(amount);
    }

    @Override
    public String getDescription() {
        return "Open/Closed Principle (OCP): A class should be open for extension but closed for modification.";
    }
}
