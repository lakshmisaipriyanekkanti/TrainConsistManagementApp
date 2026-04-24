import java.util.LinkedHashSet;
import java.util.Set;

public class TrainApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // 1. Initialize the LinkedHashSet
        // This ensures uniqueness (Set) AND remembers insertion order (Linked)
        Set<String> trainFormation = new LinkedHashSet<>();

        // 2. Attach Bogies in a specific sequence
        System.out.println("Attaching bogies in sequence: Engine -> Sleeper -> Cargo -> Guard");
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // 3. Attempt to add a duplicate (Business Rule: A bogie cannot be in two places)
        System.out.println("\nAttempting to attach duplicate bogie: 'Sleeper'...");
        boolean isAdded = trainFormation.add("Sleeper");

        if (!isAdded) {
            System.out.println("System Alert: Duplicate bogie detected! 'Sleeper' was not added again.");
        }

        // 4. Display the Final Formation
        // Notice the order remains exactly as it was added (unlike HashSet)
        System.out.println("\n--- Final Train Formation ---");
        System.out.println("Consist: " + trainFormation);
        System.out.println("Total Unique Bogies: " + trainFormation.size());
        System.out.println("-----------------------------");
    }
}