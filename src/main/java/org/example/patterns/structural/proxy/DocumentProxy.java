package org.example.patterns.structural.proxy;

/**
 * Class DocumentProxy.
 * Implements Document interface.
 * Purpose: Controls access to the real document.
 */
public class DocumentProxy implements Document {
    private final String fileName;
    private RealDocument realDocument;
    private final String userRole;

    public DocumentProxy(String fileName, String userRole) {
        this.fileName = fileName;
        this.userRole = userRole;
    }

    @Override
    public void display() {
        if ("ADMIN".equalsIgnoreCase(userRole)) {
            if (realDocument == null) {
                realDocument = new RealDocument(fileName);
            }
            realDocument.display();
        } else {
            System.out.println("Access Denied: You do not have permission to view this document.");
        }
    }
}
