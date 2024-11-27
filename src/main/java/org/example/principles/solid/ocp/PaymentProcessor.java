package org.example.principles.solid.ocp;

import java.util.ArrayList;
import java.util.List;

/**
 * Class PaymentProcessor.
 * Purpose: Processes payments using different methods.
 * Adheres to the Open/Closed Principle (OCP).
 */
public class PaymentProcessor {
    private final List<PaymentMethod> paymentMethods = new ArrayList<>();

    /**
     * Add a new payment method to the processor.
     *
     * @param paymentMethod Payment method to be added.
     */
    public void addPaymentMethod(PaymentMethod paymentMethod) {
        paymentMethods.add(paymentMethod);
    }

    /**
     * Process payments for all available methods.
     *
     * @param amount Amount to be paid.
     */
    public void processPayments(double amount) {
        for (PaymentMethod paymentMethod : paymentMethods) {
            paymentMethod.pay(amount);
        }
    }
}
