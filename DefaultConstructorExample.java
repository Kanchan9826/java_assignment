public class DefaultConstructorExample {

    
    int number;
    String message;


    public DefaultConstructorExample() {
        
        number = 10;
        message = "Hello, world!";
    }

    
    public void display() {
        System.out.println("Number: " + number);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
    
        DefaultConstructorExample obj = new DefaultConstructorExample();

        
        obj.display();
    }
}

