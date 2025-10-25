public class FinallyBlockDemo {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } 
        catch (ArithmeticException e){
            System.out.println("Exception caught:"+ e.getMessage());
        }
        finally {
            System.out.println("Finally block always executes.");
        }
    }
}