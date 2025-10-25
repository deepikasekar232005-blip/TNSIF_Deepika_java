final class Vehicle {
    final int speedLimit = 80;
    final void displaySpeed() {
        System.out.println("Speed Limit: "+ speedLimit +"km/hr");
    }
}
public class NonAccessModifierDemo {
    static int wheels = 4;
    static void showWheels(){
        System.out.println("All vehicles have "+ wheels +"Wheels.");
    }
    public static void main(String[] args){
        Vehicle v = new Vehicle();
        v.displaySpeed();
        showWheels();
    }
}