package MoneyTransfers;

public class Transfer {
    private Account senderAccount;
    private Account receiverAccount;
    private double amount;
    private double dailyTransferAmount;


    public Transfer(Account senderAccount, Account receiverAccount, double amount, double dailyTransferAmount) {
        this.senderAccount = senderAccount;
        this.receiverAccount = receiverAccount;
        this.amount = amount;
        this.dailyTransferAmount = dailyTransferAmount;
    }

    public Account getSenderAccount() {
        return senderAccount;
    }

    public void setSenderAccount(Account senderAccount) {
        this.senderAccount = senderAccount;
    }

    public Account getReceiverAccount() {
        return receiverAccount;
    }

    public void setReceiverAccount(Account receiverAccount) {
        this.receiverAccount = receiverAccount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getDailyTransferAmount() {
        return dailyTransferAmount;
    }

    public void setDailyTransferAmount(double dailyTransferAmount) {
        this.dailyTransferAmount = dailyTransferAmount;
    }
}
