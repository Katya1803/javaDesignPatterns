package org.example.principles.solid.isp;

/**
 * Class Labor.
 * Purpose: Represents a labor worker who only works.
 * Adheres to the Interface Segregation Principle (ISP).
 */
public class Labor implements Workable {

    @Override
    public void work() {
        System.out.println("Labor is working...");
    }
}
