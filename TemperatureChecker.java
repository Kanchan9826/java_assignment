// Custom Exception: TooHot
class TooHot extends Exception {
    public TooHot(String message) {
    super(message);
    }
    }
    // Custom Exception: TooCold
    class TooCold extends Exception {
    public TooCold(String message) {
    super(message);
    }
    }
    public class TemperatureChecker {
    // Method to check the temperature and convert it to Fahrenheit if normal
    public static void checkTemperature(int temperature) throws TooHot, TooCold {
    if (temperature > 35) {
    throw new TooHot("Temperature is too hot: " + temperature + "°C");
    } else if (temperature < 5) {
    throw new TooCold("Temperature is too cold: " + temperature + "°C");
    } else {
    // If temperature is normal, print the message and convert to Fahrenheit
    System.out.println("Normal temperature: " + temperature + "°C");
    double fahrenheit = (temperature * 9 / 5) + 32;
    System.out.println("Converted to Fahrenheit: " + fahrenheit + "°F");
    }
    }
    public static void main(String[] args) {
    if (args.length != 1) {
    System.out.println("Please enter a valid temperature value in Celsius.");
    return;
    }
    try {
    // Parse the input temperature from the command line argument
    int temperature = Integer.parseInt(args[0]);
    // Check the temperature and handle exceptions
    checkTemperature(temperature);
    } catch (TooHot e) {
    // Handle TooHot exception
    System.out.println(e.getMessage());
    } catch (TooCold e) {
    // Handle TooCold exception
    System.out.println(e.getMessage());
    } catch (NumberFormatException e) {
    // Handle invalid input (non-integer input)
    System.out.println("Invalid input! Please enter a valid integer value for the temperature.");
    }
    }
    }