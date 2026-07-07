package MoneyTransfers;

public class TransferService {

    private TransferValidator validator = new TransferValidator();

    public void transfer (Transfer transfer) {
        validator.validate(transfer);

        System.out.println("Transfer ugurla icra olundu");
    }
    }

