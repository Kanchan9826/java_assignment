import java.util.Scanner;
import java.util.HashMap;

public class DuplicateElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        
        int[] numbers = new int[n];


        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

    
        findDuplicatesAndFrequency(numbers);

        scanner.close();
    }

    
    public static void findDuplicatesAndFrequency(int[] numbers) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        
        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        
        System.out.println("Duplicate elements and their frequencies:");
        boolean hasDuplicates = false;

        for (int key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) > 1) {
                System.out.println(key + " appears " + frequencyMap.get(key) + " times.");
                hasDuplicates = true;
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicates found.");
        }
    }
}

