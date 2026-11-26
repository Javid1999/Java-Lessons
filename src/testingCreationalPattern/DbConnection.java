package testingCreationalPattern;

public class DbConnection {
    private static  DbConnection instance;

    private DbConnection() {
        System.out.println("Creating new instance of DbConnection");
    }
    public static DbConnection getInstance() {
        if (instance == null) {
            instance = new DbConnection();
        }
        return instance;
    }
}
