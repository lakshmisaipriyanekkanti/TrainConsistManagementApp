import java.util.Arrays;

/**
 * TrainApp - UC17: Sorting Bogie Names Using Arrays.sort()
 * Demonstrates the use of Java's optimized utility library for production-ready code.
 */
public class TrainApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // 1. Initialize an array of bogie type names
        String[] bogieTypes = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Initial Bogie Names: " + Arrays.toString(bogieTypes));

        // 2. Perform sorting using the optimized built-in method
        // This sorts the array alphabetically (Natural Ordering)
        System.out.println("\nSorting bogie names alphabetically using Arrays.sort()...");
        Arrays.sort(bogieTypes);

        // 3. Display the sorted result
        // Arrays.toString() provides a clean format for console output
        System.out.println("Sorted Bogie Names: " + Arrays.toString(bogieTypes));

        // 4. Testing Duplicate and Single-entry scenarios
        testAdditionalScenarios();

        System.out.println("------------------------------------");
    }

    private static void testAdditionalScenarios() {
        System.out.println("\n--- Testing Edge Cases ---");

        // Duplicate handling
        String[] duplicates = {"Sleeper", "AC Chair", "Sleeper", "General"};
        Arrays.sort(duplicates);
        System.out.println("Duplicate Test Result: " + Arrays.toString(duplicates));

        // Single element handling
        String[] single = {"Sleeper"};
        Arrays.sort(single);
        System.out.println("Single Element Test Result: " + Arrays.toString(single));
    }
}