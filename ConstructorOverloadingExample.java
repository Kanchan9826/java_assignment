public class ConstructorOverloadingExample {

    
    int number;
    String message;

    
    public ConstructorOverloadingExample() {
        number = 0;
        message = "Default message";
        System.out.println("No-argument constructor called.");
    }

    
    public ConstructorOverloadingExample(int num) {
        number = num;
        message = "Default message";
        System.out.println("Constructor with one argument called.");
    }

    
    public ConstructorOverloadingExample(int num, String msg) {
        number = num;
        message = msg;
        System.out.println("Constructor with two arguments called.");
    }

    
    public void display() {
        System.out.println("Number: " + number);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
    

        
        ConstructorOverloadingExample obj1 = new ConstructorOverloadingExample();
        obj1.display();

    
        ConstructorOverloadingExample obj2 = new ConstructorOverloadingExample(10);
        obj2.display();

        
        ConstructorOverloadingExample obj3 = new ConstructorOverloadingExample(25, "Hello, Constructor Overloading!");
        obj3.display();
    }
}
