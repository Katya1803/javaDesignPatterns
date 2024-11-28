package org.example.principles.solid.lsp;

/**
 * Class Rectangle.
 * Purpose: Represents a rectangle shape.
 * Adheres to the Liskov Substitution Principle (LSP).
 */
public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
