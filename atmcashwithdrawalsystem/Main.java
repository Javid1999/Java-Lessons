package atmcashwithdrawalsystem;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1001,"Cavid",1700,false);

        Withdrawal withdrawal = new Withdrawal(account,1600,Currency.EUR);
        ATMservice atMservice = new ATMservice();
        atMservice.withdraw(withdrawal);
        System.out.println(account);;
    }
}
