package MoneyTransfers;

public class main {
    public static void main(String[] args) {
        Account senderAccount = new Account("1122334455","JAVID GARAYEV",true);
        Account receiverAccount = new Account("1222334455","JAVID GARAYEV",true);
        Transfer transfer = new Transfer(senderAccount,receiverAccount,500,500);

        TransferService transferService = new TransferService();
        transferService.transfer(transfer);


    }
}
