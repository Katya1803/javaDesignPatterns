package org.example.patterns.creational.factorymethod;

public class ShapeFactory {

    /**
     * Factory method to get a Shape object.
     *
     * @param shapeType The type of shape (e.g., "circle", "rectangle", "square").
     * @return Shape object.
     */
    public static Shape getShape(String shapeType) {
        if ("circle".equalsIgnoreCase(shapeType)) {
            return new Circle();
        } else if ("rectangle".equalsIgnoreCase(shapeType)) {
            return new Rectangle();
        } else if ("square".equalsIgnoreCase(shapeType)) {
            return new Square();
        }
        throw new IllegalArgumentException("Unknown shape type: " + shapeType);
    }
}