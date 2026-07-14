// Parent class
class animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends animal {

    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();   // Output: Dog barks
    }
}