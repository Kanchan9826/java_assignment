import java.util.Scanner;

public class AdmissionEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();  

        
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter marks for Student " + i + ":");

            System.out.print("Mathematics: ");
            int mathMarks = scanner.nextInt();

            System.out.print("Physics: ");
            int physicsMarks = scanner.nextInt();

            System.out.print("Chemistry: ");
            int chemistryMarks = scanner.nextInt();

            
            int totalMarks = mathMarks + physicsMarks + chemistryMarks;
            
            int totalMathPhysics = mathMarks + physicsMarks;

            
            if ((mathMarks >= 60 && physicsMarks >= 50 && chemistryMarks >= 40 && totalMarks >= 200) ||
                totalMathPhysics >= 150) {
                System.out.println("Student " + i + " is eligible for admission.");
            } else {
                System.out.println("Student " + i + " is not eligible for admission.");
            }
            System.out.println(); 
        }

        scanner.close();
    }
}

