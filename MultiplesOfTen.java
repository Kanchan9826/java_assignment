import java.util.Scanner;

public class MultiplesOfTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the lower limit of the interval: ");
        int lowerLimit = scanner.nextInt();

        System.out.print("Enter the upper limit of the interval: ");
        int upperLimit = scanner.nextInt();

        
        System.out.println("Multiples of 10 between " + lowerLimit + " and " + upperLimit + ":");
        
       
        int start = (lowerLimit % 10 == 0) ? lowerLimit : lowerLimit + (10 - lowerLimit % 10);
        
        for (int i = start; i <= upperLimit; i += 10) {
            System.out.println(i);
        }

        scanner.close();
    }
}

