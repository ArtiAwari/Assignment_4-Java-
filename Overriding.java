class Animal {
    // Parent class method
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    // Overriding the parent class method
  
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Animal a = new Animal(); // Animal reference and object
        a.sound(); // Calls Animal's sound()

        Dog d = new Dog(); // Dog reference and object
        d.sound(); // Calls Dog's overridden sound()

        Animal ad = new Dog(); // Animal reference but Dog object
        ad.sound(); // Calls Dog's overridden sound()
    }
}
