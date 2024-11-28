package org.example.principles.dry;

/**
 * Utility class for price calculations.
 * Purpose: Centralizes reusable logic for tax and discount calculations.
 */
public class PriceCalculator {

    /**
     * Calculate the price after tax.
     *
     * @param basePrice The original price of the product.
     * @param taxRate   The tax rate as a percentage (e.g., 10 for 10%).
     * @return Price after adding tax.
     */
    public static double calculateTax(double basePrice, double taxRate) {
        return basePrice + (basePrice * taxRate / 100);
    }

    /**
     * Calculate the price after applying a discount.
     *
     * @param basePrice     The original price of the product.
     * @param discountValue The discount amount (e.g., 10 for $10 off).
     * @return Price after applying the discount.
     */
    public static double calculateDiscount(double basePrice, double discountValue) {
        return basePrice - discountValue;
    }
}
