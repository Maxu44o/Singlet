import java.util.Date;

public class Logger {
    protected int num = 1;
    private static Logger logger = null;

    private Logger() {
    }

    public void log(String message) {
        System.out.println("[" + new Date().toString() + "] " + num + " " + message);
        num++;
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;

    }
}
