package SingletonPatternExample;

public class SingletonPatternExample {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("First message via logger1");
        logger2.log("Second message via logger2");

        if (logger1 == logger2) {
            System.out.println("Success! Both variables point to the same instance.");
            System.out.println("logger1 hashcode: " + logger1.hashCode());
            System.out.println("logger2 hashcode: " + logger2.hashCode());
        } else {
            System.out.println("Failure! Different instances exist.");
        }
    }
}
