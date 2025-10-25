public class WrapperClassDemo {
    public static void main(String[] args) {
        int a = 10;

        // Autoboxing: converting primitive to object
        Integer obj = a;
        System.out.println("Autoboxing: " + obj);

        // Unboxing: converting object to primitive
        int b = obj;
        System.out.println("Unboxing: " + b);
    }
}
