public class ExceptionDemo {

    public static void main(String[] args) {
        try {
        
            int size = -5; 
            int[] arr = new int[size];

            
            int num1 = 10, num2 = 0;
            int result = num1 / num2; 

        } catch (NegativeArraySizeException e) {
        
            System.out.println("Exception caught: NegativeArraySizeException");
            System.out.println("Message: " + e.getMessage());
        } catch (ArithmeticException e) {
            
            System.out.println("Exception caught: ArithmeticException");
            System.out.println("Message: " + e.getMessage());
        }
    }
}

