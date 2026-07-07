package Operations;

public class Transfer extends Operation implements  Auditablee{
    @Override
    void execute() {
        System.out.println("kocurme icra olundu");

    }
}
