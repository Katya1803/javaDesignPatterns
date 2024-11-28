package org.example.principles.dry;

import org.example.principles.PrincipleGroup;

/**
 * Class DRYExample.
 * Purpose: Demonstrates the Don't Repeat Yourself (DRY) principle using price calculations.
 */
public class DRYExample extends PrincipleGroup {

    @Override
    public void execute() {
        double basePrice = 100.0;
        double taxRate = 10.0; // 10%
        double discountValue = 15.0; // $15 discount

        // Calculate price after tax
        double priceAfterTax = PriceCalculator.calculateTax(basePrice, taxRate);
        System.out.println("Base Price: $" + basePrice);
        System.out.println("Price after Tax (" + taxRate + "%): $" + priceAfterTax);

        // Calculate price after discount
        double priceAfterDiscount = PriceCalculator.calculateDiscount(basePrice, discountValue);
        System.out.println("Price after Discount ($" + discountValue + " off): $" + priceAfterDiscount);
    }
}
