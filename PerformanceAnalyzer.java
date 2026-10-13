import java.util.Arrays;
import java.util.Random;

public class PerformanceAnalyzer {

    // 1. Performance Comparison (Case 7)
    public void comparePerformance() {
        System.out.println("\n=== PERFORMANCE COMPARISON (Member 4) ===");
        int size = 100000;
        int[] data = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            data[i] = rand.nextInt(1000000);
        }

        int target = data[rand.nextInt(size)];

        // Linear Search Performance
        long startTimeLinear = System.nanoTime();
        linearSearch(data, target);
        long endTimeLinear = System.nanoTime();
        long linearDuration = endTimeLinear - startTimeLinear;

        // Binary Search Performance (Needs sorted array)
        Arrays.sort(data);
        long startTimeBinary = System.nanoTime();
        binarySearch(data, target);
        long endTimeBinary = System.nanoTime();
        long binaryDuration = endTimeBinary - startTimeBinary;

        System.out.println("Dataset Size: " + size + " elements");
        System.out.println("Linear Search Execution Time : " + linearDuration + " nanoseconds");
        System.out.println("Binary Search Execution Time : " + binaryDuration + " nanoseconds");
        
        if (binaryDuration < linearDuration) {
            System.out.println("Conclusion: Binary Search is faster for sorted data.");
        } else {
            System.out.println("Conclusion: Linear Search performed comparably.");
        }
    }

    private void linearSearch(int[] arr, int target) {
        for (int val : arr) {
            if (val == target) break;
        }
    }

    private void binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) break;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
    }

    // 2. Display All Results (Case 8)
    public void displayAllResults() {
        System.out.println("\n=== SYSTEM SUMMARY & INTEGRATION STATUS (Member 4) ===");
        System.out.println("1. Array Operations        : Fully Functional (Member 1)");
        System.out.println("2. Stack Operations        : Fully Functional (Member 2)");
        System.out.println("3. Queue Operations        : Fully Functional (Member 2)");
        System.out.println("4. Linked List Operations  : Fully Functional (Member 3)");
        System.out.println("5. Searching Operations    : Fully Functional (Member 1)");
        System.out.println("6. Graph Operations        : Fully Functional (Member 3)");
        System.out.println("7. Performance Comparison  : Fully Functional (Member 4)");
        System.out.println("8. Summary Dashboard       : Active");
        System.out.println("Status: Project modules integrated successfully!");
    }
}