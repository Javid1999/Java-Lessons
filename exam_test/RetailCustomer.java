package exam_test;

public class RetailCustomer extends Customer implements Commision,Discount {
    public RetailCustomer(int id, String name, Loan loan) {
        super(id, name, loan);
    }

    @Override
    public double calculateTotal() {
        return 0.05;
    }

    @Override
    public double calculatediscount() {
        return 0.02;
    }
}
