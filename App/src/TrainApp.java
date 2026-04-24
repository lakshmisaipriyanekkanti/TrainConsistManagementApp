import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Reusing the Bogie class from UC7
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // 1. Create a List of Bogies
        List<Bogie> allBogies = new ArrayList<>();
        allBogies.add(new Bogie("Sleeper", 72));
        allBogies.add(new Bogie("AC Chair", 56));
        allBogies.add(new Bogie("First Class", 24));
        allBogies.add(new Bogie("General", 90));
        allBogies.add(new Bogie("Superfast Sleeper", 80));

        System.out.println("All Available Bogies: " + allBogies);

        // 2. Define Capacity Threshold
        int threshold = 60;
        System.out.println("\nFiltering bogies with capacity > " + threshold + "...");

        // 3. Apply Stream API Pipeline
        // stream() -> filter (the logic) -> collect (the result)
        List<Bogie> highCapacityBogies = allBogies.stream()
                .filter(b -> b.capacity > threshold)
                .collect(Collectors.toList());

        // 4. Display Filtered Results
        System.out.println("--- High Capacity Bogies Found ---");
        if (highCapacityBogies.isEmpty()) {
            System.out.println("No bogies found matching the criteria.");
        } else {
            highCapacityBogies.forEach(b -> System.out.println(">> " + b));
        }

        // 5. Verify Original List Integrity (Test Case Requirement)
        System.out.println("\nVerification: Original list size remains " + allBogies.size());
        System.out.println("------------------------------------");
    }
}