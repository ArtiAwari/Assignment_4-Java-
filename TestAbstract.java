abstract class Vehicle {
    abstract void start();

        void fuelType() {
        System.out.println("Most vehicles need fuel to run.");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with a key.");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with a self-start button.");
    }
}

public class TestAbstract {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.start();      
        v1.fuelType();

        Vehicle v2 = new Bike();
        v2.start();      
        v2.fuelType();
    }
}
