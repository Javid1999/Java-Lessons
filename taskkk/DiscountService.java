package taskkk;

import javax.print.DocFlavor;

public class DiscountService {
    public static double discountForLoanCommission (Customer customer){
       double commission=  customer.getLoan().loancommission();
       if(customer instanceof CorpCustomer){
           return  commission*0.005;
       }
       else if (customer instanceof RetailCustomer){
           return  commission*0.02;
       }
       else {
           return 0;
       }

    }
}
