import java.util.Scanner;

public class StackUsingArray {

    // Class to represent the stack
    static class Stack {
        int maxSize; // Maximum size of stack
        int top; // Top of stack
        int[] stackArray; // Array to store stack elements

        // Constructor to initialize stack
        Stack(int size) {
            maxSize = size;
            stackArray = new int[size];
            top = -1; // Stack is empty initially
        }

        // Method to check if stack is full
        boolean isFull() {
            return top == maxSize - 1;
        }

        // Method to check if stack is empty
        boolean isEmpty() {
            return top == -1;
        }

        // Method to push an element to the stack
        void push(int value) {
            if (isFull()) {
                System.out.println("Stack Overflow! Cannot push " + value);
            } else {
                stackArray[++top] = value; // Increment top and insert element
                System.out.println(value + " pushed to stack");
            }
        }

        // Method to pop an element from the stack
        int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow! Cannot pop.");
                return -1; // Return -1 if stack is empty
            } else {
                return stackArray[top--]; // Return element and decrement top
            }
        }

        // Method to peek the top element of the stack
        int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return -1; // Return -1 if stack is empty
            } else {
                return stackArray[top]; // Return the top element
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the size of the stack
        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();

        // Create a stack with the given size
        Stack stack = new Stack(size);

        // Menu for user to perform stack operations
        while (true) {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Push operation
                    System.out.print("Enter the element to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;

                case 2: // Pop operation
                    int poppedValue = stack.pop();
                    if (poppedValue != -1) {
                        System.out.println("Popped element: " + poppedValue);
                    }
                    break;

                case 3: // Peek operation
                    int topValue = stack.peek();
                    if (topValue != -1) {
                        System.out.println("Top element: " + topValue);
                    }
                    break;

                case 4: // Exit the program
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
