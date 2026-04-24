import java.util.HashSet;
import java.util.Set;

public class TrainApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // 1. Initialize a HashSet for Unique Bogie IDs
        // We use the Set interface to ensure no duplicates are allowed
        Set<String> bogieIds = new HashSet<>();

        System.out.println("Registering bogie IDs...");

        // 2. Adding Bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");

        // Intentional duplicate entry
        System.out.println("Attempting to add duplicate ID: BG101...");
        bogieIds.add("BG101");

        // 3. Adding another unique ID
        bogieIds.add("BG104");

        // 4. Display the results
        System.out.println("\n--- Unique Bogie Registration Summary ---");
        System.out.println("Registered IDs: " + bogieIds);
        System.out.println("Total Unique Bogies: " + bogieIds.size());

        // 5. Observe Deduplication Logic
        if (bogieIds.size() < 5) { // We tried to add 5 items, but only 4 are unique
            System.out.println("Note: Duplicate IDs were automatically filtered out by the HashSet.");
        }

        System.out.println("------------------------------------------");
    }
}