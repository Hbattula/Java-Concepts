// Base class representing a generic vehicle
class Vehicle {
    String brand;
    int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

// Subclass representing a specific type of vehicle - Car
class Car extends Vehicle {
    int numberOfDoors;

    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }

    public void start() {
        System.out.println("Car is starting...");
    }
}

// Subclass representing another specific type of vehicle - Motorcycle
class Motorcycle extends Vehicle {
    boolean hasSidecar;

    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + hasSidecar);
    }

    public void wheelie() {
        System.out.println("Motorcycle is doing a wheelie!");
    }
}

// Main class to demonstrate inheritance
public class VehicleInheritanceDemo {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2022, 4);
        myCar.displayInfo();
        myCar.start();

        System.out.println(); // Add a newline for clarity

        Motorcycle myMotorcycle = new Motorcycle("Harley-Davidson", 2022, true);
        myMotorcycle.displayInfo();
        myMotorcycle.wheelie();
    }
}
