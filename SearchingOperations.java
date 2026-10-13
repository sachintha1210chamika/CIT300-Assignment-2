import java.util.Arrays;
import java.util.Scanner;

public class SearchingOperations {

    // 1. Linear Search
    public void linearSearch(int[] arr, int target) {
        int steps = 0;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            steps++;
            if (arr[i] == target) {
                System.out.println("Element " + target + " found at index " + i + " using Linear Search.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element " + target + " not found in the array.");
        }
        System.out.println("Total steps taken (Linear Search): " + steps);
    }

    // 2. Binary Search (Requires sorted array)
    public void binarySearch(int[] arr, int target) {
        // Sort the array first for binary search
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        
        System.out.println("Array sorted for Binary Search: " + Arrays.toString(sortedArr));

        int left = 0;
        int right = sortedArr.length - 1;
        int steps = 0;
        boolean found = false;

        while (left <= right) {
            steps++;
            int mid = left + (right - left) / 2;

            if (sortedArr[mid] == target) {
                System.out.println("Element " + target + " found at sorted index " + mid + " using Binary Search.");
                found = true;
                break;
            } else if (sortedArr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element " + target + " not found in the array.");
        }
        System.out.println("Total steps taken (Binary Search): " + steps);
    }

    // Submenu for Searching
    public void showMenu(Scanner scanner) {
        // Sample array for demonstration
        int[] sampleArr = {12, 45, 7, 23, 56, 89, 34, 90, 3};
        
        int choice;
        do {
            System.out.println("\n--- SEARCHING OPERATIONS MENU ---");
            System.out.println("1. Linear Search");
            System.out.println("2. Binary Search");
            System.out.println("3. Return to Main Menu");
            System.out.print("Enter choice: ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Array: " + Arrays.toString(sampleArr));
                    System.out.print("Enter value to search (Linear Search): ");
                    int targetLinear = scanner.nextInt();
                    linearSearch(sampleArr, targetLinear);
                    break;
                case 2:
                    System.out.println("Current Array: " + Arrays.toString(sampleArr));
                    System.out.print("Enter value to search (Binary Search): ");
                    int targetBinary = scanner.nextInt();
                    binarySearch(sampleArr, targetBinary);
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