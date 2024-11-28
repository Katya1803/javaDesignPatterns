package org.example.principles.solid.isp;

import org.example.principles.PrincipleGroup;

import java.util.List;

/**
 * Class ISPExample.
 * Purpose: Demonstrates the Interface Segregation Principle (ISP).
 */
public class ISPExample extends PrincipleGroup {

    @Override
    public void execute() {
        // Create employees
        Workable labor = new Labor();
        Workable manager = new Manager();
        Manageable managerAsManager = (Manageable) manager;

        // Employees perform their tasks
        labor.work();
        manager.work();
        managerAsManager.manage();
    }

    @Override
    public String getDescription() {
        return "Interface Segregation Principle (ISP): Clients should not be forced to depend on interfaces they do not use.";
    }
}
