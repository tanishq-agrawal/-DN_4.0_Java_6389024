public class LoggerTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("first log message.");
        logger2.log("second log message.");

        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same (Singleton verified).");
        } else {
            System.out.println("Different instances found (Singleton failed).");
        }
    }
}
