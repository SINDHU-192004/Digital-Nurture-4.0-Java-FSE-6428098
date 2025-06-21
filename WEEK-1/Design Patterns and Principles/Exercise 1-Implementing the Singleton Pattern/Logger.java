// SingletonPatternExample
// Submitted by: SINDHU.T | Superset ID: 6428098

public class Logger {
    // Step 2: Private static instance
    private static Logger instance;

    // Step 2: Private constructor
    private Logger() {
        System.out.println("Logger initialized.");
    }

    // Step 2: Public method to get the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}
