package DesignPatterns.StructureDesignPattern.Proxy;

public class RealDocumentService implements DocumentService {
    @Override
    public void getDocument(String documentId) {
        System.out.println("Fetching document: " + documentId);
    }
}
