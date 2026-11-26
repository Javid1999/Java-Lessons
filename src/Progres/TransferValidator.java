package Progres;

public class TransferValidator  implements Validator<Transfer>{

    @Override
    public boolean validate(Transfer transfer) {
        if (transfer.getSender() == null || transfer.getSender().isEmpty()
                || transfer.getReceiver() == null || transfer.getReceiver().isEmpty()
                || transfer.getAmount() <= 0) {

            throw new InvalidTransferException("Transfer is invalid");
        }
        return true;
    }
}
