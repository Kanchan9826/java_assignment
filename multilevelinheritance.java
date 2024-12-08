
class Animal {
    
    protected String name;

    
    public Animal(String name) {
        this.name = name;
    }

    
    public void display() {
        System.out.println("Animal name: " + name);
    }
}


class Mammal extends Animal {
   
    protected String furType;

    
    public Mammal(String name, String furType) {
        
        super(name);
        this.furType = furType;
    }

   
    public void displayMammalDetails() {
        display(); 
        System.out.println("Fur Type: " + furType);
    }
}


class Dog extends Mammal {
    
    private String breed;

    
    public Dog(String name, String furType, String breed) {
       
        super(name, furType);
        this.breed = breed;
    }

    
    public void displayDogDetails() {
        displayMammalDetails();  
        System.out.println("Breed: " + breed);
    }
}

public class multilevelinheritance {
    public static void main(String[] args) {
        
        Dog myDog = new Dog("Bulldog", "Short Hair", "English Bulldog");

        
        myDog.displayDogDetails();
    }
}

