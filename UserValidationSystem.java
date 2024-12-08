
class UsernameTooShortException extends Exception {
    public UsernameTooShortException(String message) {
        super(message);
    }
}


class PasswordMismatchException extends Exception {
    public PasswordMismatchException(String message) {
        super(message);
    }
}

public class UserValidationSystem {

    
    public static void validateUser(String username, String password) throws UsernameTooShortException, PasswordMismatchException {
        String correctPassword = "Secure123"; 

        
        if (username.length() < 6) {
            throw new UsernameTooShortException("Username must be at least 6 characters long.");
        }

       
        if (!password.equals(correctPassword)) {
            throw new PasswordMismatchException("Password does not match.");
        }

        
        System.out.println("Username and password are valid.");
    }

    public static void main(String[] args) {
       
        java.util.Scanner scanner = new java.util.Scanner(System.in);

       
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        try {
            
            validateUser(username, password);
        } catch (UsernameTooShortException e) {
            
            System.out.println(e.getMessage());
        } catch (PasswordMismatchException e) {
           
            System.out.println(e.getMessage());
        } finally {
           
            scanner.close();
        }
    }
}

