package org.example.principles.solid.lsp;

/**
 * Class Square.
 * Purpose: Represents a square shape.
 * Adheres to the Liskov Substitution Principle (LSP).
 */
public class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
