
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class PersonDetails {

   
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0) {
           
            throw new InvalidAgeException("Age cannot be negative.");
        }
    }

    public static void main(String[] args) {
       
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        try {
          
            validateAge(age);

           
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        } catch (InvalidAgeException e) {
           
            System.out.println(e.getMessage());
        } finally {
           
            scanner.close();
        }
    }
}

