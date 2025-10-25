// ThreadMethodsDemo.java
// Program to demonstrate common thread methods

class MyThreadMethod extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running...");
    }
}

public class ThreadMethodsDemo {
    public static void main(String[] args) {
        MyThreadMethod t1 = new MyThreadMethod();
        MyThreadMethod t2 = new MyThreadMethod();

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        try {
            t1.join(); // waits for t1 to finish before starting t2
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        t2.start();

        System.out.println("Priority of t1: " + t1.getPriority());
        System.out.println("Priority of t2: " + t2.getPriority());
    }
}
