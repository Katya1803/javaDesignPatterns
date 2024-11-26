package org.example.main;



import org.example.core.Executable;

import java.util.List;

/**
 * Class DesignPracticeDemo.
 * Purpose: Entry point to run examples of patterns and principles.
 */
public class DesignPracticeDemo {
    public static void main(String[] args) {
        System.out.println("Design Patterns and Principles Demo");

        // Create a list of patterns and principles (currently empty)
        List<Executable> executables = List.of(
                // To be populated later with patterns and principles
        );

        // Initialize the manager and execute
        Manager manager = new Manager(executables);
        manager.runAll();
    }
}
