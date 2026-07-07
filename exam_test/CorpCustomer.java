package exam_test;

public class CorpCustomer extends Customer implements Commision,Discount {
    public CorpCustomer(int id, String name, Loan loan) {
        super(id, name, loan);
    }

    @Override
    public double calculateTotal() {
        return 0.012;
    }

    @Override
    public double calculatediscount() {
        return 1.2;
    }
}
