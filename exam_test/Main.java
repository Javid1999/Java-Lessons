package exam_test;

public class Main {
    public static void main(String[] args) {
        Customer retailcustomer=new RetailCustomer(1,"Ceyhun",new Loan(10));

        System.out.println(test1((RetailCustomer) retailcustomer));
    }

    public static double test1(RetailCustomer customer){

        return customer.getLoan().amount*(customer.calculateTotal()- customer.calculatediscount());
    }
}
