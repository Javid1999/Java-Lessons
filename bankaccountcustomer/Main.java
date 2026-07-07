package bankaccountcustomer;

public class Main {
    public static void main(String[] args) {
        Account saving = new SavingAccount(1,1000);
        Customer customer1 = new Customer(101,"Cavid",saving);

        double interest =
                ((SavingAccount) customer1.getAccount())
                        .calculateInterest();

        System.out.println("Interest: " + interest);


        Account current = new CurrentAccount(1, 1000);
       Customer customer2 =
               new Customer(102, "Ali", current);

        double commission =
                ((CurrentAccount) customer2.getAccount())
                        .calculateCommisson();

        System.out.println("Commission: " + commission);
    }
}
