public class LoggerTest {
    public static void main(String[] args) {
        // Get two instances of Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Check if both instances are the same
        if (logger1 == logger2) {
            System.out.println("Both instances are the same.");
        } else {
            System.out.println("Instances are different.");
        }

        // Test logging
        logger1.log("Hello, World!");
        logger2.log("This is another log message.");
    }
}