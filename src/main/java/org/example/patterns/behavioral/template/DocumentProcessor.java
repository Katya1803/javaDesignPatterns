package org.example.patterns.behavioral.template;

/**
 * Abstract class DocumentProcessor.
 * Purpose: Defines a template for processing documents.
 */
public abstract class DocumentProcessor {

    // Template method
    public final void processDocument() {
        openFile();
        readContent();
        closeFile();
    }

    // Common step for all documents
    protected void openFile() {
        System.out.println("Opening file...");
    }

    // Abstract method for reading content, must be implemented by subclasses
    protected abstract void readContent();

    // Common step for all documents
    protected void closeFile() {
        System.out.println("Closing file...");
    }
}