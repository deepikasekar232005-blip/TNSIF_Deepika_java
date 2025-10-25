class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal a = new Cat(); // upcasting
        a.sound(); // calls Cat’s version (runtime polymorphism)
    }
}
