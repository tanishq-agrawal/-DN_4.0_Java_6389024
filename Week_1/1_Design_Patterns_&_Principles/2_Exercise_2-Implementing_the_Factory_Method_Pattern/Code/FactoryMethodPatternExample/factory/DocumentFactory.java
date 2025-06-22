package FactoryMethodPatternExample.factory;

import FactoryMethodPatternExample.document.Document;

public abstract class DocumentFactory {
    public abstract Document createDocument();
}
