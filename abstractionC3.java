// Abstract class representing a Shape
abstract class Shape {
    String name;

    public Shape(String name) {
        this.name = name;
    }

    // Abstract method for calculating area
    public abstract double calculateArea();

    // Concrete method
    public void displayInfo() {
        System.out.println("Name: " + name);
    }
}

// Concrete class representing a Circle
class Circle extends Shape {
    double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

// Concrete class representing a Rectangle
class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Main class to demonstrate abstraction
public class AbstractionDemo {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 5.0);
        Rectangle rectangle = new Rectangle("Rectangle", 4.0, 6.0);

        // Using abstraction
        displayShapeInfo(circle);
        displayShapeInfo(rectangle);
    }

    // Abstraction in action - method works with any Shape
    private static void displayShapeInfo(Shape shape) {
        shape.displayInfo();
        System.out.println("Area: " + shape.calculateArea() + "\n");
    }
}
