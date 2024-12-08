// Parent class (Base class)
class Animal {
    // Method in the parent class
    void makeSound() {
    System.out.println("The animal makes a sound.");
    }
    }
    // Child class (Derived class)
    class Dog extends Animal {
    // Method overriding in the child class
    @Override
    void makeSound() {
    System.out.println("The dog barks.");
    }
    }
    class Cat extends Animal {
    // Method overriding in the child class
    @Override
    void makeSound() {
    System.out.println("The cat meows.");
    }
    }
    public class MethodOverridingExample {
    public static void main(String[] args) {
    // Create an Animal reference and point it to a Dog object
    Animal myDog = new Dog();
    myDog.makeSound(); // Calls the Dog's makeSound method
    // Create an Animal reference and point it to a Cat object
    Animal myCat = new Cat();
    myCat.makeSound(); // Calls the Cat's makeSound method
    // Create an Animal reference and point it to an Animal object
    Animal myAnimal = new Animal();
    myAnimal.makeSound(); // Calls the Animal's makeSound method
    }
}