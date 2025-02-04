// Interface: Defines a contract for classes that implement it
interface Animal {
    void makeSound(); // Abstract method (no implementation)
}

// Abstract Class: Provides a partial implementation and can have abstract methods
abstract class Mammal implements Animal {
    // Concrete method: Provides implementation
    public void breathe() {
        System.out.println("This mammal is breathing.");
    }

    // Abstract method: Must be implemented by subclasses
    public abstract void eat();
}

// Concrete Class: Provides full implementation
class Dog extends Mammal {
    // Implementing the abstract method from the Animal interface
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    // Implementing the abstract method from the Mammal abstract class
    @Override
    public void eat() {
        System.out.println("The dog is eating bones.");
    }
}
