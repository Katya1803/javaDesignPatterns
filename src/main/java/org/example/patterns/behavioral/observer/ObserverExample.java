package org.example.patterns.behavioral.observer;

import org.example.patterns.PatternGroup;

/**
 * Observer pattern example.
 */
public class ObserverExample extends PatternGroup {

    @Override
    public void execute() {
        System.out.println("Observer Pattern Example:");

        // Create a subject
        NewsAgency newsAgency = new NewsAgency();

        // Create observers
        EmailSubscriber emailSubscriber = new EmailSubscriber("subscriber@example.com");
        SMSSubscriber smsSubscriber = new SMSSubscriber("+123456789");

        // Register observers
        newsAgency.addObserver(emailSubscriber);
        newsAgency.addObserver(smsSubscriber);

        // Publish news
        newsAgency.publishNews("Breaking News: Observer Pattern implemented!");
        newsAgency.publishNews("Latest Update: Observer pattern is amazing!");
    }
}