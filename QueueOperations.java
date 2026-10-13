import java.util.Scanner;

public class QueueOperations {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    public QueueOperations(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.count = 0;
    }

    // 1. Enqueue Operation
    public void enqueue(int element) {
        if (count == capacity) {
            System.out.println("Queue Overflow! Cannot enqueue " + element);
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = element;
        count++;
        System.out.println("Element " + element + " enqueued to queue successfully.");
    }

    // 2. Dequeue Operation
    public void dequeue() {
        if (count == 0) {
            System.out.println("Queue Underflow! Queue is empty.");
            return;
        }
        int dequeued = queue[front];
        front = (front + 1) % capacity;
        count--;
        System.out.println("Element " + dequeued + " dequeued from queue successfully.");
    }

    // 3. Display Queue
    public void display() {
        if (count == 0) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue elements (Front to Rear): ");
        for (int i = 0; i < count; i++) {
            int index = (front + i) % capacity;
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }

    // Submenu for Queue Operations
    public void showMenu(Scanner scanner) {
        int choice;
        do {
            System.out.println("\n--- QUEUE OPERATIONS MENU ---");
            System.out.println("1. Enqueue Element");
            System.out.println("2. Dequeue Element");
            System.out.println("3. Display Queue");
            System.out.println("4. Return to Main Menu");
            System.out.print("Enter choice: ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to enqueue: ");
                    int val = scanner.nextInt();
                    enqueue(val);
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);
    }
}