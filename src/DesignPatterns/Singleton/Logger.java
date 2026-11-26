package DesignPatterns.Singleton;

public class Logger {
    private static Logger instance;

    private Logger() {
        System.out.println("Starting Logger");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
            System.out.println("Logger instance created");
        }

        return instance;
    }
    public void log(String message) {
        System.out.println(message);
    }
}
