import java.util.Scanner;

public class MergeSortedArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the size of array A: ");
        int n1 = scanner.nextInt();
        
       
        int[] A = new int[n1];
        System.out.println("Enter elements of array A in ascending order:");
        for (int i = 0; i < n1; i++) {
            A[i] = scanner.nextInt();
        }

        
        System.out.print("Enter the size of array B: ");
        int n2 = scanner.nextInt();
        
        
        int[] B = new int[n2];
        System.out.println("Enter elements of array B in ascending order:");
        for (int i = 0; i < n2; i++) {
            B[i] = scanner.nextInt();
        }

        
        int[] C = mergeArrays(A, B);

       
        System.out.println("Merged array C in ascending order:");
        for (int num : C) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

   
    public static int[] mergeArrays(int[] A, int[] B) {
        
        int n1 = A.length;
        int n2 = B.length;
        int[] C = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        
        while (i < n1 && j < n2) {
            if (A[i] < B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }

        
        while (i < n1) {
            C[k++] = A[i++];
        }

        
        while (j < n2) {
            C[k++] = B[j++];
        }

        return C;
    }
}

