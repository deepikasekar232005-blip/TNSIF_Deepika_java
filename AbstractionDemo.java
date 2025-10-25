// AbstractionDemo.java
// Program to demonstrate abstraction using abstract class

abstract class Animal {
    abstract void sound(); // abstract method
    void eat() {
        System.out.println("All animals eat food.");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Animal obj = new Dog(); // upcasting
        obj.sound();
        obj.eat();
    }
}
