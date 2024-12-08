import java.util.Scanner;

public class TemperatureConverter {

    
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

   
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("----------------------");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.print("Choose an option (1 or 2): ");
        
        int choice = scanner.nextInt();
        double temperature, convertedTemperature;

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                temperature = scanner.nextDouble();
                convertedTemperature = celsiusToFahrenheit(temperature);
                System.out.printf("%.2f Celsius is %.2f Fahrenheit.%n", temperature, convertedTemperature);
                break;

            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = scanner.nextDouble();
                convertedTemperature = fahrenheitToCelsius(temperature);
                System.out.printf("%.2f Fahrenheit is %.2f Celsius.%n", temperature, convertedTemperature);
                break;

            default:
                System.out.println("Invalid option. Please choose 1 or 2.");
        }

        scanner.close();
    }
}
