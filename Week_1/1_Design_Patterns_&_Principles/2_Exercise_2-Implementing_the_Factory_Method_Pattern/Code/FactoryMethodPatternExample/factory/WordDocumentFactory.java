package FactoryMethodPatternExample.factory;

import FactoryMethodPatternExample.document.Document;
import FactoryMethodPatternExample.document.WordDocument;

public class WordDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}
