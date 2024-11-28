package org.example.patterns.creational.prototype;

/**
 * Class Product.
 * Implements Prototype interface.
 * Purpose: Represents a product that can be cloned.
 */
public class Product implements Prototype {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public Prototype clone() {
        return new Product(this.name, this.price);
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}
