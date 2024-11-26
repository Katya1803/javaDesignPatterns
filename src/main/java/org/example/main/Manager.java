package org.example.main;

import org.example.core.Executable;
import java.util.List;

/**
 * Class Manager.
 * Purpose: Coordinates the execution of patterns and principles.
 */
public class Manager {
    private final List<Executable> executables;

    /**
     * Constructor to initialize with a list of Executables.
     *
     * @param executables List of objects implementing the Executable interface.
     */
    public Manager(List<Executable> executables) {
        this.executables = executables;
    }

    /**
     * Executes all patterns and principles in the list.
     */
    public void runAll() {
        for (Executable executable : executables) {
            System.out.println("-----");
            System.out.println(executable.getDescription());
            executable.execute();
            System.out.println("-----");
        }
    }
}
