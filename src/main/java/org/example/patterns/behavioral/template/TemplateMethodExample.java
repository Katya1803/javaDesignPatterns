package org.example.patterns.behavioral.template;

import org.example.patterns.PatternGroup;

/**
 * Template Method pattern example.
 */
public class TemplateMethodExample extends PatternGroup {

    @Override
    public void execute() {
        System.out.println("Template Method Pattern Example:");

        // Process a Word document
        DocumentProcessor wordProcessor = new WordDocumentProcessor();
        System.out.println("Processing Word Document:");
        wordProcessor.processDocument();

        // Process a PDF document
        DocumentProcessor pdfProcessor = new PdfDocumentProcessor();
        System.out.println("Processing PDF Document:");
        pdfProcessor.processDocument();
    }
}