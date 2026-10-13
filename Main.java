import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayOperations arrayOps = new ArrayOperations(100); 
        SearchingOperations searchOps = new SearchingOperations(); 
        StackOperations stackOps = new StackOperations(100);
        QueueOperations queueOps = new QueueOperations(100);
        LinkedListGraphOperations member3Ops = new LinkedListGraphOperations();

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
                    arrayOps.showMenu(scanner);
                    break;
                case 2:
                    stackOps.showMenu(scanner);
                    break;
                case 3:
                    queueOps.showMenu(scanner);
                    break;
                case 4:
                    member3Ops.showLinkedListMenu(scanner);
                    break;
                case 5:
                    searchOps.showMenu(scanner);
                    break;
                case 6:
                    member3Ops.showGraphMenu(scanner);
                    break;
                case 7:
                    System.out.println("-> Performance Comparison Selected (Member 4 implementation)");
                    break;
                case 8:
                    System.out.println("-> Display All Results Selected (Member 4 implementation)");
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