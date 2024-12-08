import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms in Fibonacci series: ");
        int terms = scanner.nextInt();

        int first = 0, second = 1; 

        

        System.out.println("Fibonacci Series up to " + terms + " terms:");

        
        if (terms >= 1) {
            System.out.print(first);
        }
        if (terms >= 2) {
            System.out.print(", " + second);
        }

        
        for (int i = 3; i <= terms; i++) {
            int nextTerm = first + second;  
            System.out.print(", " + nextTerm);
            first = second;
            second = nextTerm;
        }

        System.out.println(); 

        scanner.close();
    }
}

