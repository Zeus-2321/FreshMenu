// Example of a Car class demonstrating encapsulation, inheritance, polymorphism, and abstraction

// Parent class - Vehicle
abstract class Vehicle {
    private String color;
    
    public Vehicle(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }
    
    // Abstract method
    public abstract void start();
}

// Child class - Car (inherits from Vehicle)
class Car extends Vehicle {
    private String model;
    
    public Car(String color, String model) {
        super(color);
        this.model = model;
    }
    
    public String getModel() {
        return model;
    }
    
    // Overriding the start() method from Vehicle
    @Override
    public void start() {
        System.out.println("Starting the car");
    }
    
    // Additional method specific to Car
    public void accelerate() {
        System.out.println("Accelerating the car");
    }
}

// Interface - Drivable
interface Drivable {
    void drive();
}

// Child class - ElectricCar (inherits from Car and implements Drivable)
class ElectricCar extends Car implements Drivable {
    public ElectricCar(String color, String model) {
        super(color, model);
    }
    
    // Implementing the drive() method from Drivable interface
    @Override
    public void drive() {
        System.out.println("Driving the electric car");
    }
    
    // Overriding the start() method from Vehicle
    @Override
    public void start() {
        System.out.println("Starting the electric car");
    }
}

class Main {
    public static void main(String[] args) {
        // Creating objects and demonstrating OOP concepts
        
        // Encapsulation: Accessing color property through getter method
        Car myCar = new Car("Red", "Toyota");
        System.out.println("Color of my car: " + myCar.getColor());
        
        // Inheritance and Polymorphism: Treating ElectricCar as a Drivable object
        Drivable myElectricCar = new ElectricCar("Blue", "Tesla");
        myElectricCar.drive();
        
        // Abstraction: Creating an array of Vehicle objects (including Car and ElectricCar)
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = myCar;
        vehicles[1] = new ElectricCar("White", "Nissan");
        
        // Polymorphism: Looping through the array and calling start() method
        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }
    }
}
