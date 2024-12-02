package org.example.patterns.structural.proxy;

import org.example.patterns.PatternGroup;

/**
 * Proxy pattern example.
 */
public class ProxyExample extends PatternGroup {

    @Override
    public void execute() {
        System.out.println("Proxy Pattern Example:");

        // User with ADMIN role
        Document adminDocument = new DocumentProxy("AdminFile.pdf", "ADMIN");
        adminDocument.display();

        // User with USER role
        Document userDocument = new DocumentProxy("UserFile.pdf", "USER");
        userDocument.display();
    }
}
