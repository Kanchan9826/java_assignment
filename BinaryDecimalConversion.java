import java.util.Scanner;

public class BinaryDecimalConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Choose the conversion:");
        System.out.println("1. Binary to Decimal");
        System.out.println("2. Decimal to Binary");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                
                System.out.print("Enter a binary number: ");
                String binary = scanner.next();
                int decimal = binaryToDecimal(binary);
                System.out.println("Binary " + binary + " is Decimal " + decimal);
                break;

            case 2:
            
                System.out.print("Enter a decimal number: ");
                int decimalNumber = scanner.nextInt();
                String binaryNumber = decimalToBinary(decimalNumber);
                System.out.println("Decimal " + decimalNumber + " is Binary " + binaryNumber);
                break;

            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();
    }

    
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int base = 1;  

        
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += base;  
            }
            base *= 2;  
        }

        return decimal;
    }

    
    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();

        
        while (decimal > 0) {
            binary.insert(0, decimal % 2);  
            decimal /= 2;  
        }

        
        if (binary.length() == 0) {
            binary.append("0");
        }

        return binary.toString();
    }
}
