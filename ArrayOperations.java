import java.util.Scanner;

public class ArrayOperations {
    private int[] arr;
    private int size;
    private int capacity;

    public ArrayOperations(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.size = 0;
    }

    // 1. Insert Element
    public void insert(int element) {
        if (size >= capacity) {
            System.out.println("Array is Full! Cannot insert " + element);
            return;
        }
        arr[size] = element;
        size++;
        System.out.println("Element " + element + " inserted successfully.");
    }

    // 2. Delete Element
    public void delete(int element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Element " + element + " not found in Array!");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        System.out.println("Element " + element + " deleted successfully.");
    }

    // 3. Search Element
    public void search(int element) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                System.out.println("Element " + element + " found at index " + i);
                return;
            }
        }
        System.out.println("Element " + element + " not found!");
    }

    // 4. Display Array
    public void display() {
        if (size == 0) {
            System.out.println("Array is empty!");
            return;
        }
        System.out.print("Array Elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Submenu for Array Operations
    public void showMenu(Scanner scanner) {
        int choice;
        do {
            System.out.println("\n--- ARRAY OPERATIONS MENU ---");
            System.out.println("1. Insert Element");
            System.out.println("2. Delete Element");
            System.out.println("3. Search Element");
            System.out.println("4. Display Array");
            System.out.println("5. Return to Main Menu");
            System.out.print("Enter choice: ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    int insVal = scanner.nextInt();
                    insert(insVal);
                    break;
                case 2:
                    System.out.print("Enter element to delete: ");
                    int delVal = scanner.nextInt();
                    delete(delVal);
                    break;
                case 3:
                    System.out.print("Enter element to search: ");
                    int srchVal = scanner.nextInt();
                    search(srchVal);
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