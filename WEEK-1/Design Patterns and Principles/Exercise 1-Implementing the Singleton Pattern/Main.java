// Testing Singleton Logger
// Submitted by: SINDHU.T

public class Main {
    public static void main(String[] args) {
        // Getting first instance
        Logger logger1 = Logger.getInstance();
        logger1.log("Starting the application...");

        // Getting second instance
        Logger logger2 = Logger.getInstance();
        logger2.log("Performing some operations...");

        // Verifying both instances are the same
        if (logger1 == logger2) {
            System.out.println(" Only one Logger instance exists (Singleton works).");
        } else {
            System.out.println(" Singleton failed, multiple instances found.");
        }
    }
}
