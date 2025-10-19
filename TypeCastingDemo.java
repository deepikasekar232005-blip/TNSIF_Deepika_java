public class TypeCastingDemo {
    public static void main(String[] args){
        int num = 10;
        double d = num;
        System.out.println("Implicit casting: int to double = "+ d);
        double x = 12.56;
        int y = (int) x;
        System.out.println("Explicit casting double to int = "+y);
    }
}