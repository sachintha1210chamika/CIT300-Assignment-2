import java.util.*;

public class LinkedListGraphOperations {

    // ==========================================
    // 1. LINKED LIST OPERATIONS (Member 3)
    // ==========================================
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;

    // Insert at end
    public void insertLinkedList(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Element " + data + " added to Linked List successfully.");
    }

    // Delete by value
    public void deleteLinkedList(int data) {
        if (head == null) {
            System.out.println("Linked List is empty!");
            return;
        }

        if (head.data == data) {
            head = head.next;
            System.out.println("Element " + data + " deleted from Linked List.");
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Element " + data + " not found in Linked List!");
        } else {
            current.next = current.next.next;
            System.out.println("Element " + data + " deleted from Linked List.");
        }
    }

    // Display Linked List
    public void displayLinkedList() {
        if (head == null) {
            System.out.println("Linked List is empty!");
            return;
        }
        System.out.print("Linked List elements: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Submenu for Linked List
    public void showLinkedListMenu(Scanner scanner) {
        int choice;
        do {
            System.out.println("\n--- LINKED LIST OPERATIONS MENU ---");
            System.out.println("1. Insert Element");
            System.out.println("2. Delete Element");
            System.out.println("3. Display Linked List");
            System.out.println("4. Return to Main Menu");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    int val = scanner.nextInt();
                    insertLinkedList(val);
                    break;
                case 2:
                    System.out.print("Enter element to delete: ");
                    int delVal = scanner.nextInt();
                    deleteLinkedList(delVal);
                    break;
                case 3:
                    displayLinkedList();
                    break;
                case 4:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);
    }

    // ==========================================
    // 2. GRAPH OPERATIONS (Member 3)
    // ==========================================
    private Map<Integer, List<Integer>> adjList = new HashMap<>();

    // Add Edge
    public void addEdge(int u, int v) {
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.putIfAbsent(v, new ArrayList<>());
        adjList.get(u).add(v);
        adjList.get(v).add(u);
        System.out.println("Edge added between vertex " + u + " and vertex " + v);
    }

    // Display Graph
    public void displayGraph() {
        if (adjList.isEmpty()) {
            System.out.println("Graph is empty!");
            return;
        }
        System.out.println("\n--- Graph Adjacency List ---");
        for (Map.Entry<Integer, List<Integer>> entry : adjList.entrySet()) {
            System.out.println("Vertex " + entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Submenu for Graph
    public void showGraphMenu(Scanner scanner) {
        int choice;
        do {
            System.out.println("\n--- GRAPH OPERATIONS MENU ---");
            System.out.println("1. Add Edge");
            System.out.println("2. Display Graph");
            System.out.println("3. Return to Main Menu");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter source vertex (u): ");
                    int u = scanner.nextInt();
                    System.out.print("Enter destination vertex (v): ");
                    int v = scanner.nextInt();
                    addEdge(u, v);
                    break;
                case 2:
                    displayGraph();
                    break;
                case 3:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 3);
    }
}