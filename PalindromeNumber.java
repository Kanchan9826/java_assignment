import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

       
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        scanner.close();
    }

   
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

       
        if (number < 0) {
            return false;
        }

       
        while (number != 0) {
            int digit = number % 10; 
            reversedNumber = reversedNumber * 10 + digit; 
            number /= 10; 
        }

        
        return originalNumber == reversedNumber;
    }
}

