package org.example.patterns.creational.singleton;

import org.example.patterns.PatternGroup;

import java.util.HashMap;
import java.util.Map;

/**
 * Singleton pattern example: Configuration Manager.
 * Purpose: Ensures a single instance of configuration exists across the application.
 */
public class SingletonExample extends PatternGroup {

    // Static variable to hold the single instance
    private static SingletonExample instance;

    // Configuration data stored as key-value pairs
    private final Map<String, String> config;

    // Private constructor to prevent instantiation
    private SingletonExample() {
        config = new HashMap<>();
        System.out.println("Singleton Configuration Manager instance created!");
    }

    // Public static method to provide access to the instance
    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }

    // Method to set a configuration key-value pair
    public void setConfig(String key, String value) {
        config.put(key, value);
    }

    // Method to get a configuration value by key
    public String getConfig(String key) {
        return config.get(key);
    }

    @Override
    public void execute() {
        System.out.println("Accessing Singleton Configuration Manager...");

        // Access Singleton instance and set configuration
        SingletonExample configManager = SingletonExample.getInstance();
        configManager.setConfig("url", "https://example.com");
        configManager.setConfig("timeout", "5000");

        // Access Singleton instance again and get configuration
        System.out.println("URL: " + configManager.getConfig("url"));
        System.out.println("Timeout: " + configManager.getConfig("timeout"));
    }
}
