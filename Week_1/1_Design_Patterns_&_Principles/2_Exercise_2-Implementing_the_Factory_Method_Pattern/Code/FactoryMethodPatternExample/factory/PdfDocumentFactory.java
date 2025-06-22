package FactoryMethodPatternExample.factory;

import FactoryMethodPatternExample.document.Document;
import FactoryMethodPatternExample.document.PdfDocument;

public class PdfDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}
