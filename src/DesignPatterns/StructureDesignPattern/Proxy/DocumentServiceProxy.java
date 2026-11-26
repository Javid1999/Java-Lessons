package DesignPatterns.StructureDesignPattern.Proxy;

import java.sql.SQLOutput;

public class DocumentServiceProxy   implements DocumentService {

    private final DocumentService realService;

    private final String userRole;


    public DocumentServiceProxy(String userRole){
        this.realService = new RealDocumentService();
        this.userRole = userRole;
    }

    @Override
    public void getDocument(String documentId) {
        System.out.println("Checking permissions...");

        if(!userRole.equals("ADMIN")){
            System.out.println("Access denied");
            return;
        }
        realService.getDocument(documentId);
    }
}
