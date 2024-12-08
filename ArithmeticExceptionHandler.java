
class CustomArithmeticException extends ArithmeticException {
    
    public CustomArithmeticException(String message) {
        super(message);
    }
}

public class ArithmeticExceptionHandler {

    
    public static int calculateEquation(int num1, int num2, String operation) throws CustomArithmeticException {
        int result = 0;

        try {
            
            switch (operation) {
                case "divide":
                    
                    if (num2 == 0) {
                        throw new CustomArithmeticException("Error: Division by zero is not allowed.");
                    }
                    result = num1 / num2;
                    break;

                case "multiply":
                    
                    if (num1 > Integer.MAX_VALUE / num2) {
                        throw new CustomArithmeticException("Error: Integer overflow during multiplication.");
                    }
                    result = num1 * num2;
                    break;

                default:
                    System.out.println("Invalid operation.");
                    break;
            }
        } catch (CustomArithmeticException e) {
            
            throw e;
        }

        return result;
    }

    public static void main(String[] args) {
        try {
            
            System.out.println("Result of division: " + calculateEquation(10, 0, "divide"));
        } catch (CustomArithmeticException e) {
        
            System.out.println(e.getMessage());
        }

        try {
            
            System.out.println("Result of multiplication: " + calculateEquation(Integer.MAX_VALUE, 2, "multiply"));
        } catch (CustomArithmeticException e) {
            
            System.out.println(e.getMessage());
        }
    }
}

