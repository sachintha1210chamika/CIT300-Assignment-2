import java.util.Scanner;

public class StackOperations {
    private int[] stack;
    private int top;
    private int capacity;

    public StackOperations(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }

    // 1. Push Operation
    public void push(int element) {
        if (top >= capacity - 1) {
            System.out.println("Stack Overflow! Cannot push " + element);
            return;
        }
        stack[++top] = element;
        System.out.println("Element " + element + " pushed to stack successfully.");
    }

    // 2. Pop Operation
    public void pop() {
        if (top < 0) {
            System.out.println("Stack Underflow! Stack is empty.");
            return;
        }
        int popped = stack[top--];
        System.out.println("Element " + popped + " popped from stack successfully.");
    }

    // 3. Peek Operation
    public void peek() {
        if (top < 0) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("Top element is: " + stack[top]);
    }

    // 4. Display Stack
    public void display() {
        if (top < 0) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack elements (Top to Bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    // Submenu for Stack Operations
    public void showMenu(Scanner scanner) {
        int choice;
        do {
            System.out.println("\n--- STACK OPERATIONS MENU ---");
            System.out.println("1. Push Element");
            System.out.println("2. Pop Element");
            System.out.println("3. Peek Top Element");
            System.out.println("4. Display Stack");
            System.out.println("5. Return to Main Menu");
            System.out.print("Enter choice: ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int val = scanner.nextInt();
                    push(val);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    peek();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);
    }
}