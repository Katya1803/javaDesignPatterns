package org.example.main;

import org.example.core.Executable;
import org.example.patterns.behavioral.observer.ObserverExample;
import org.example.patterns.behavioral.strategy.StrategyExample;
import org.example.patterns.behavioral.template.TemplateMethodExample;
import org.example.patterns.creational.factorymethod.FactoryExample;
import org.example.patterns.creational.singleton.SingletonExample;
import org.example.principles.dry.DRYExample;
import org.example.principles.solid.dip.DIPExample;
import org.example.principles.solid.isp.ISPExample;
import org.example.principles.solid.srp.SRPExample;
import org.example.principles.solid.ocp.OCPExample;
import org.example.principles.solid.lsp.LSPExample;

import java.util.List;

/**
 * Class DesignPracticeDemo.
 * Purpose: Entry point to run examples of patterns and principles.
 */
public class DesignPracticeDemo {
    public static void main(String[] args) {
        System.out.println("Design Patterns and Principles Demo");

        // Add principles to the list
        List<Executable> executables = List.of(
                new SRPExample(),
                new OCPExample(),
                new LSPExample(),
                new ISPExample(),
                new DIPExample(),
                new DRYExample(),
                new SingletonExample(),
                new FactoryExample(),
                new ObserverExample(),
                new StrategyExample(),
                new TemplateMethodExample()
        );

        // Initialize the manager and execute
        Manager manager = new Manager(executables);
        manager.runAll();
    }
}
