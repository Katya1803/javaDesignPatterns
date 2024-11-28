package org.example.patterns.creational.prototype;

import org.example.patterns.PatternGroup;

/**
 * Prototype pattern example.
 */
public class PrototypeExample extends PatternGroup {

    @Override
    public void execute() {
        System.out.println("Prototype Pattern Example:");

        // Create a prototype product
        Product prototype = new Product("Default Product", 100.0);
        System.out.println("Prototype: " + prototype);

        // Clone the prototype and modify its properties
        Product clonedProduct1 = (Product) prototype.clone();
        clonedProduct1.setName("Product 1");
        clonedProduct1.setPrice(120.0);
        System.out.println("Cloned Product 1: " + clonedProduct1);

        Product clonedProduct2 = (Product) prototype.clone();
        clonedProduct2.setName("Product 2");
        clonedProduct2.setPrice(150.0);
        System.out.println("Cloned Product 2: " + clonedProduct2);
    }
}
