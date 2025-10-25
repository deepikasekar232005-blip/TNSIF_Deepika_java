@FunctionalInterface
interface Message {
    void greet(String name);
}

public class LambdaDemo {
    public static void main(String[] args) {
        // Lambda expression to implement the interface
        Message m = (name) -> {
            System.out.println("Hello, " + name + "!");
        };

        // Calling the method
        m.greet("Deepika");
    }
}
