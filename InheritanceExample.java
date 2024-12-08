class Animal {
    String name;
    public Animal(String name) {
    this.name = name;
    }
    public void display() {
    System.out.println("Animal Name: " + name);
    }
    public void sound() {
    System.out.println("Animals make sounds.");
    }
    }
    class Dog extends Animal {
    public Dog(String name) {
    super(name);
    @Override
    public void sound() {
    System.out.println(name + " says: Woof Woof!");
    }
    }
    public class InheritanceExample {
    public static void main(String[] args) {
    Animal animal = new Animal("Generic Animal");
    animal.display();
    animal.sound();
    Dog dog = new Dog("Buddy");
    dog.display();
    dog.sound();
    }
    }