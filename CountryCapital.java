
class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

import java.util.HashMap;
import java.util.Map;

public class CountryCapital {

    
    public static String getCapital(String country) throws NoMatchFoundException {
        
        Map<String, String> countryCapitalMap = new HashMap<>();
        countryCapitalMap.put("USA", "Washington, D.C.");
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("Canada", "Ottawa");
        countryCapitalMap.put("Germany", "Berlin");
        countryCapitalMap.put("France", "Paris");
        countryCapitalMap.put("Japan", "Tokyo");
        countryCapitalMap.put("Australia", "Canberra");

        
        if (countryCapitalMap.containsKey(country)) {
            return countryCapitalMap.get(country);
        } else {
            throw new NoMatchFoundException("No match found for the country: " + country);
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter a country name as a command line argument.");
            return;
        }

        String country = args[0];

        try {
    
            String capital = getCapital(country);
            System.out.println("The capital of " + country + " is " + capital + ".");
        } catch (NoMatchFoundException e) {
            
            System.out.println(e.getMessage());
        }
    }
}
