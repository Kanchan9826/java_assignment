import java.util.Scanner;

public class SumAndAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        
        int[] numbers = new int[n];

        
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

       
        int sum = calculateSum(numbers);
        double average = calculateAverage(sum, n);

        
        System.out.println("The sum of the array elements is: " + sum);
        System.out.println("The average of the array elements is: " + average);

        scanner.close();
    }

    
    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

   
    public static double calculateAverage(int sum, int count) {
        return (double) sum / count;
    }
}
