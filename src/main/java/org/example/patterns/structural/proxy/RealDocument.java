package org.example.patterns.structural.proxy;

/**
 * Class RealDocument.
 * Implements Document interface.
 * Purpose: Represents the actual document being accessed.
 */
public class RealDocument implements Document {
    private final String fileName;

    public RealDocument(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading document from disk: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying document: " + fileName);
    }
}
