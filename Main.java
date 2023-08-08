// Inheritance: Creating a base class and derived subclasses

class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void start() {
        System.out.println("Starting the " + brand + " vehicle");
    }
}

class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println("Starting the " + getBrand() + " car");
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println("Starting the " + getBrand() + " motorcycle");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Generic");
        Car car = new Car("Toyota");
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson");

        vehicle.start();
        car.start();
        motorcycle.start();
    }
}
