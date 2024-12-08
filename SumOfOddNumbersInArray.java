import java.util.Scanner;
public class SumOfOddNumbersInArray {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Input: Get the number of elements in the array
System.out.print("Enter the number of elements in the array: ");
int n = scanner.nextInt();
// Create an array of size 'n'
int[] numbers = new int[n];
// Input: Get the elements of the array
System.out.println("Enter the elements of the array:");
for (int i = 0; i < n; i++) {
numbers[i] = scanner.nextInt();
}
// Find the sum of all odd numbers in the array
int sum = sumOfOddNumbers(numbers);
// Output: Display the sum of odd numbers
System.out.println("The sum of all odd numbers in the array is: " + sum);
scanner.close();
}
/**
* Method to find the sum of all odd numbers in the array.
* @param numbers The array of numbers.
* @return The sum of all odd numbers.
*/
public static int sumOfOddNumbers(int[] numbers) {
int sum = 0;
// Traverse the array and sum up all odd numbers
for (int i = 0; i < numbers.length; i++) {
if (numbers[i] % 2 != 0) {
sum += numbers[i];
}
}
return sum;
}
}
