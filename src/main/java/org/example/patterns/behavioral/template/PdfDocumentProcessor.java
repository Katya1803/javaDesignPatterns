package org.example.patterns.behavioral.template;

/**
 * Class PdfDocumentProcessor.
 * Implements document processing for PDF documents.
 */
public class PdfDocumentProcessor extends DocumentProcessor {

    @Override
    protected void readContent() {
        System.out.println("Reading content from PDF document...");
    }
}