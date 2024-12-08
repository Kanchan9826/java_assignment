import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        final double MILES_TO_KM = 1.60934;

        System.out.print("Enter distance in miles: ");
        double miles = scanner.nextDouble();

        
        double kilometers = miles * MILES_TO_KM;

        System.out.printf("%.2f miles is equal to %.2f kilometers.%n", miles, kilometers);

        scanner.close();
    }
}

