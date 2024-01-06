// Abstract class representing an Animal
abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    // Abstract method for making a sound
    public abstract void makeSound();

    // Concrete method
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Interface for flying behavior
interface Flying {
    void fly();
}

// Interface for swimming behavior
interface Swimming {
    void swim();
}

// Concrete class representing a Lion
class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Roar!");
    }
}

// Concrete class representing a Parrot that can fly
class Parrot extends Animal implements Flying {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Squawk!");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying.");
    }
}

// Concrete class representing a Fish that can swim
class Fish extends Animal implements Swimming {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Blub, blub!");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming.");
    }
}

// Main class to demonstrate polymorphism
public class ZooPolymorphismDemo {
    public static void main(String[] args) {
        Animal lion = new Lion("Simba");
        Animal parrot = new Parrot("Polly");
        Animal fish = new Fish("Nemo");

        // Polymorphic behavior
        performActions(lion);
        performActions(parrot);
        performActions(fish);
    }

    // Polymorphic method that works with any Animal
    private static void performActions(Animal animal) {
        System.out.println("Name: " + animal.name);
        animal.makeSound();
        animal.sleep();

        // Check if the animal implements additional interfaces
        if (animal instanceof Flying) {
            ((Flying) animal).fly();
        }

        if (animal instanceof Swimming) {
            ((Swimming) animal).swim();
        }

        System.out.println(); // Add a newline for clarity
    }
}
