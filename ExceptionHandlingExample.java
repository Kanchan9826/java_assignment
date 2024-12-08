
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class ExceptionHandlingExample {

    public static void divideNumbers(int a, int b) throws ArithmeticException, MyException {
        if (b == 0) {
            
            throw new ArithmeticException("Cannot divide by zero!");
        }
        
        if (a < 0) {
        
            throw new MyException("Negative number not allowed");
        }

        System.out.println("Division result: " + a / b);
    }

    public static void main(String[] args) {
        
        try {
            
            divideNumbers(10, 0);  
        } catch (ArithmeticException e) {
        
            System.out.println("Exception caught: " + e.getMessage());
        } catch (MyException e) {
            
            System.out.println("MyException caught: " + e.getMessage());
        } finally {
            
            System.out.println("Finally block executed.");
        }

        
        try {
            
            divideNumbers(-10, 2);  
        } catch (MyException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed after second try-catch.");
        }
    }
}
