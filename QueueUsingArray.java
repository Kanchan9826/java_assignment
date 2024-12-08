import java.util.Scanner;

public class QueueUsingArray {

    // Class to represent the Queue
    static class Queue {
        int maxSize;  // Maximum size of the Queue
        int front;    // Front of the Queue
        int rear;     // Rear of the Queue
        int[] queueArray; // Array to store the Queue elements

        // Constructor to initialize the Queue
        Queue(int size) {
            maxSize = size;
            queueArray = new int[size];
            front = -1;  // Initially, the front is -1 indicating the Queue is empty
            rear = -1;   // Initially, the rear is -1 indicating the Queue is empty
        }

        // Method to check if the Queue is empty
        boolean isEmpty() {
            return front == -1;
        }

        // Method to check if the Queue is full
        boolean isFull() {
            return (rear + 1) % maxSize == front;
        }

        // Method to add an element to the Queue (Enqueue)
        void enqueue(int value) {
            if (isFull()) {
                System.out.println("Queue Overflow! Cannot enqueue " + value);
            } else {
                // If Queue is empty, set both front and rear to 0
                if (front == -1) {
                    front = 0;
                }
                // Increment rear in a circular manner and insert the element
                rear = (rear + 1) % maxSize;
                queueArray[rear] = value;
                System.out.println(value + " enqueued to the Queue");
            }
        }

        // Method to remove an element from the Queue (Dequeue)
        int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue Underflow! Cannot dequeue.");
                return -1;  // Return -1 if Queue is empty
            } else {
                int dequeuedValue = queueArray[front];
                // If there is only one element, reset the Queue
                if (front == rear) {
                    front = rear = -1;
                } else {
                    front = (front + 1) % maxSize;  // Move front to the next position in a circular manner
                }
                return dequeuedValue;
            }
        }

        // Method to peek the front element of the Queue
        int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;  // Return -1 if Queue is empty
            } else {
                return queueArray[front];  // Return the front element
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the size of the Queue
        System.out.print("Enter the size of the Queue: ");
        int size = scanner.nextInt();

        // Create a Queue with the given size
        Queue queue = new Queue(size);

        // Menu for user to perform Queue operations
        while (true) {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Enqueue operation
                    System.out.print("Enter the element to enqueue: ");
                    int value = scanner.nextInt();
                    queue.enqueue(value);
                    break;

                case 2: // Dequeue operation
                    int dequeuedValue = queue.dequeue();
                    if (dequeuedValue != -1) {
                        System.out.println("Dequeued element: " + dequeuedValue);
                    }
                    break;

                case 3: // Peek operation
                    int frontValue = queue.peek();
                    if (frontValue != -1) {
                        System.out.println("Front element: " + frontValue);
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
