import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello World class
 */
public class HelloWorld {
    /**
     *
     */
    private static final String HELLO_AGAIN_WORLD = "Hello again, Java world!";
    private static Logger logger = Logger.getLogger(HelloWorld.class.getName());

    public static void main(String[] args) {
        logger.log(Level.INFO, HELLO_AGAIN_WORLD);
    }
}