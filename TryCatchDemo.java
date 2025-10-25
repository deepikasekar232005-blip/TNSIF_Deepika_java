public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // risky code
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
        System.out.println("Program continues...");
    }
}
