package taskkk;



public class Main {
    public static void main(String[] args) {
        Loan loan = new  RetailLoan(1,200);
        Customer retailCustomer = new RetailCustomer(2, "Ali", loan);
        double comm = retailCustomer.getLoan().loancommission();

       double discount = DiscountService.discountForLoanCommission(retailCustomer);
        double finalcom= comm-discount;
        System.out.println(retailCustomer.getLoan().loancommission());
        System.out.println(DiscountService.discountForLoanCommission(retailCustomer));
        System.out.println(finalcom);
        System.out.println(loan.getAmount());

    }
    }

