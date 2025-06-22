package FactoryMethodPatternExample.factory;

import FactoryMethodPatternExample.document.Document;
import FactoryMethodPatternExample.document.ExcelDocument;

public class ExcelDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}
