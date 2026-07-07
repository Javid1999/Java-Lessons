package Operations;

public class BalanceCheck extends Operation implements  Auditablee{
    @Override
    void execute() {
        System.out.println("Balans yoxlanildi");

    }
}
