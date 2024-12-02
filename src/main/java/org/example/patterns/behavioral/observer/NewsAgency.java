package org.example.patterns.behavioral.observer;

/**
 * Class NewsAgency.
 * Purpose: Represents a subject that broadcasts news updates.
 */
public class NewsAgency extends Subject {

    // Publish a news update
    public void publishNews(String news) {
        System.out.println("NewsAgency: Publishing news - " + news);
        notifyObservers(news);
    }
}