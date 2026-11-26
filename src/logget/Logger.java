package logget;

public class Logger {
    public <T extends Log> void log(T log) {
        System.out.println(log.format());
    }
}
