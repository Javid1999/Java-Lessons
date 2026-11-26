package logget;

//import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();

        LoginLog loginLog = new LoginLog(101,"SUCCESS");
        TransferLog transferLog = new TransferLog(300,"TX123");
        RiskLog riskLog = new RiskLog(87,"APPROVED");

        logger.log(loginLog);
        logger.log(transferLog);
        logger.log(riskLog);

    }
}
