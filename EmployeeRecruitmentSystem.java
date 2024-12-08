
class TooOlder extends Exception {
    public TooOlder(String message) {
        super(message);
    }
}


class TooYounger extends Exception {
    public TooYounger(String message) {
        super(message);
    }
}

public class EmployeeRecruitmentSystem {


    public static void checkEligibility(String name, int age) throws TooOlder, TooYounger {
        if (age > 45) {
            throw new TooOlder("Candidate is too old to be eligible for recruitment.");
        } else if (age < 20) {
            throw new TooYounger("Candidate is too young to be eligible for recruitment.");
        } else {
            
            System.out.println("Eligible Candidate: " + name);
        }
    }

    public static void main(String[] args) {
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        
        System.out.print("Enter candidate's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter candidate's age: ");
        int age = scanner.nextInt();

        try {
            
            checkEligibility(name, age);
        } catch (TooOlder e) {
            
            System.out.println(e.getMessage());
        } catch (TooYounger e) {
            
            System.out.println(e.getMessage());
        } finally {
    
            scanner.close();
        }
    }
}
