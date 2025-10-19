public class OperatorDemo{
    public static void main(String[] args){
        int a = 10, b = 5;
        System.out.println("Addition: "+(a+b));
        System.out.println("Subtraction: "+(a-b));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Division: "+(a/b));
        System.out.println("a > b: "+(a>b));
        System.out.println("a == b: "+(a==b));
        System.out.println("(a > b) && (b > 0):"+((a > b) && (b > 0)));
        a += 2;
        System.out.println("a after += 2: "+a);
    }
}