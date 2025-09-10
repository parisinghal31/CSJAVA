abstract class Animal {
    
    abstract void sound();

    
    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}


class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    
    void bark() {
        System.out.println("Bark with no arguments");
    }

    void bark(String sound) {
        System.out.println("Bark with sound: " + sound);
    }

    void bark(int times) {
        System.out.println("Dog barked " + times + " times");
    }
}


public class Question_11 {
    public static void main(String[] args) {
        Dog myDog = new Dog();        
        myDog.sound();
        myDog.sleep();
        myDog.bark();
        myDog.bark("Namaste!");
        myDog.bark(3);
    }
}
