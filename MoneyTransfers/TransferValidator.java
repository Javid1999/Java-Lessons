package MoneyTransfers;

public class TransferValidator {
    private  static  final double DAILY_LIMIT =1000;
    public void validate(Transfer transfer)  {
       if (transfer.getSenderAccount().getAccountNumber()== transfer.getReceiverAccount().getAccountNumber()){
           throw new SameAccountException("Hesablar eyni ola bilmez");
       }
       if(transfer.getDailyTransferAmount() + transfer.getAmount()>DAILY_LIMIT){
           throw new DailyLimitException("Gundelik limiti kecmek olmaz");
       }
       if (transfer.getSenderAccount().isFrozen()){
           throw  new FrozenAccountException("Hesab dondurulub");
       }

    }
}
