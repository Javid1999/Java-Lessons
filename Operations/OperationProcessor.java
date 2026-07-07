package Operations;

public class OperationProcessor {
    public void process(Operation operation) {
        operation.execute();
        if (operation instanceof Auditablee){
            System.out.println("Auidit olunur");
        }
        else {
            System.out.println("Audit olunmur");
        }

    }
}
