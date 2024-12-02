package org.example.patterns.behavioral.template;

/**
 * Class WordDocumentProcessor.
 * Implements document processing for Word documents.
 */
public class WordDocumentProcessor extends DocumentProcessor {

    @Override
    protected void readContent() {
        System.out.println("Reading content from Word document...");
    }
}