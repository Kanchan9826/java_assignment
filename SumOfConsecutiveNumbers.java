import java.util.Scanner;

public class SumOfConsecutiveNumbers {
    
    
    public static int sumOfConsecutiveNumbers(String number) {
        int sum = 0;
        
        
        for (int i = 0; i < number.length(); i++) {
            for (int j = i + 1; j <= number.length(); j++) {
               
                String subString = number.substring(i, j);
                
               
                sum += Integer.parseInt(subString);
            }
        }
        
        return sum;
    }

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        
        int result = sumOfConsecutiveNumbers(input);
        
       
        System.out.println("The sum of numbers formed by consecutive digits is: " + result);

       
        scanner.close();
    }
}
