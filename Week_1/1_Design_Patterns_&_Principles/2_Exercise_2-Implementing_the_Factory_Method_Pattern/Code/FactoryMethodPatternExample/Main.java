package FactoryMethodPatternExample;

import FactoryMethodPatternExample.document.Document;
import FactoryMethodPatternExample.factory.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a document type to open:");
        System.out.println("1. Word Document");
        System.out.println("2. PDF Document");
        System.out.println("3. Excel Document");
        System.out.print("Enter your choice (1/2/3): ");

        int choice = scanner.nextInt();
        DocumentFactory factory;

        switch (choice) {
            case 1:
                factory = new WordDocumentFactory();
                break;
            case 2:
                factory = new PdfDocumentFactory();
                break;
            case 3:
                factory = new ExcelDocumentFactory();
                break;
            default:
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                return;
        }

        Document document = factory.createDocument();
        document.open();
    }
}
