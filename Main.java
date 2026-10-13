import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.5); // (Note: scanner setup)
        int choice;

        do {
            System.out.println("\n=== DATA STRUCTURE & GRAPH ANALYZER ===");
            System.out.println("1. Array Operations");
            System.out.println("2. Stack Operations");
            System.out.println("3. Queue Operations");
            System.out.println("4. Linked List Operations");
            System.out.println("5. Searching Operations");
            System.out.println("6. Graph Operations");
            System.out.println("7. Performance Comparison");
            System.out.println("8. Display All Results");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("-> Array Operations Selected");
                    
                    break;
                case 2:
                    System.out.println("-> Stack Operations Selected");
                    break;
                case 3:
                    System.out.println("-> Queue Operations Selected");
                    break;
                case 4:
                    System.out.println("-> Linked List Operations Selected");
                    break;
                case 5:
                    System.out.println("-> Searching Operations Selected");
                    break;
                case 6:
                    System.out.println("-> Graph Operations Selected");
                    break;
                case 7:
                    System.out.println("-> Performance Comparison Selected");
                    break;
                case 8:
                    System.out.println("-> Display All Results Selected");
                    break;
                case 9:
                    System.out.println("Exiting program. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 9);

        scanner.close();
    }
}