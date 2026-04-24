import java.util.Arrays;

public class TrainApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // 1. Initial array of passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Initial Capacities: " + Arrays.toString(capacities));
        System.out.println("Starting manual Bubble Sort...");

        // 2. Perform Bubble Sort Algorithm
        bubbleSort(capacities);

        // 3. Display sorted result
        System.out.println("\nFinal Sorted Capacities (Ascending): " + Arrays.toString(capacities));
        System.out.println("------------------------------------");
    }

    /**
     * Manual implementation of Bubble Sort algorithm
     * Avoids using built-in sorting libraries.
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Outer loop: Number of passes
        for (int i = 0; i < n - 1; i++) {
            // Inner loop: Compare adjacent elements
            // (n - 1 - i) ensures we don't re-check the already sorted elements at the end
            for (int j = 0; j < n - 1 - i; j++) {

                // 4. Comparison: If left value > right value, they are out of order
                if (arr[j] > arr[j + 1]) {
                    // 5. Swapping logic using a temporary variable
                    System.out.println("Swapping " + arr[j] + " and " + arr[j+1]);
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            // Optional: Print state after each pass for educational visualization
            System.out.println("Pass " + (i + 1) + ": " + Arrays.toString(arr));
        }
    }
}