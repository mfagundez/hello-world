import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello World class
 */
public class JavaHelloWorld {
    /**
     * This is a test variable to say hello everyone (to Java people)
     */
    private static final String HELLO_AGAIN_WORLD = "Hello again, Java world!";

    /**
     * Logger instance
     */
    private static Logger logger = Logger.getLogger(JavaHelloWorld.class.getName());

    public static void main(String[] args) {
        logger.log(Level.INFO, HELLO_AGAIN_WORLD);
    }
}