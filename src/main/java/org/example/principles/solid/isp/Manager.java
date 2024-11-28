package org.example.principles.solid.isp;

/**
 * Class Manager.
 * Purpose: Represents a manager who works and manages.
 * Adheres to the Interface Segregation Principle (ISP).
 */
public class Manager implements Workable, Manageable {

    @Override
    public void work() {
        System.out.println("Manager is working...");
    }

    @Override
    public void manage() {
        System.out.println("Manager is managing the team...");
    }
}
