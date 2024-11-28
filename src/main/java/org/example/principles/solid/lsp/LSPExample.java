package org.example.principles.solid.lsp;

import org.example.principles.PrincipleGroup;

import java.util.List;

/**
 * Class LSPExample.
 * Purpose: Demonstrates the Liskov Substitution Principle (LSP).
 */
public class LSPExample extends PrincipleGroup {

    @Override
    public void execute() {
        // Create shapes
        Shape rectangle = new Rectangle(5, 10); // Rectangle with width 5 and height 10
        Shape square = new Square(7); // Square with side 7

        // Add shapes to a list
        List<Shape> shapes = List.of(rectangle, square);

        // Calculate and print areas
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
        }
    }

    @Override
    public String getDescription() {
        return "Liskov Substitution Principle (LSP): Subtypes must be substitutable for their base types without altering correctness.";
    }
}
