package Loggete;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();
        LoginLog logg  = new LoginLog(101,"SUCCESS");

        logger.log(logg);
    }
}
