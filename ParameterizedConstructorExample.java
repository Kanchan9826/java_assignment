public class ParameterizedConstructorExample {

   
    int number;
    String message;

   
    public ParameterizedConstructorExample(int num, String msg) {
        number = num;
        message = msg;
    }

    
    public void display() {
        System.out.println("Number: " + number);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        
        ParameterizedConstructorExample obj = new ParameterizedConstructorExample(25, "Welcome to Java!");

        
        obj.display();
    }
}
