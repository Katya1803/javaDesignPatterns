package org.example.patterns.creational.factorymethod;

import org.example.patterns.PatternGroup;

/**
 * Factory pattern example.
 */
public class FactoryExample extends PatternGroup {

    @Override
    public void execute() {
        System.out.println("Factory Pattern Example:");

        // Create shapes using the factory
        Shape circle = ShapeFactory.getShape("circle");
        Shape rectangle = ShapeFactory.getShape("rectangle");
        Shape square = ShapeFactory.getShape("square");

        // Draw the shapes
        circle.draw();
        rectangle.draw();
        square.draw();
    }
}