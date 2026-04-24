import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Standard Bogie class reused for consistency
class Bogie {
    String type;
    int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bogie{Type='" + type + "', Capacity=" + capacity + "}";
    }
}

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // 1. Create a List of Bogies (including multiple of the same type for testing)
        List<Bogie> allBogies = new ArrayList<>();
        allBogies.add(new Bogie("Sleeper", 72));
        allBogies.add(new Bogie("Sleeper", 72));
        allBogies.add(new Bogie("AC Chair", 56));
        allBogies.add(new Bogie("First Class", 24));
        allBogies.add(new Bogie("AC Chair", 56));
        allBogies.add(new Bogie("Goods", 1000));

        System.out.println("Processing total bogies: " + allBogies.size());

        // 2. Apply groupingBy Collector
        // This creates a Map<String, List<Bogie>>
        // Key: Bogie Type | Value: List of all bogies of that type
        Map<String, List<Bogie>> groupedBogies = allBogies.stream()
                .collect(Collectors.groupingBy(b -> b.type));

        // 3. Display the Structured Report
        System.out.println("\n--- Train Consist Grouped Report ---");
        groupedBogies.forEach((type, list) -> {
            System.out.println("Category: [" + type + "] - Count: " + list.size());
            list.forEach(b -> System.out.println("  -> " + b));
        });

        // 4. Verification: Check Original Integrity
        System.out.println("\nVerification: Original list is still " + allBogies.size() + " items.");
        System.out.println("------------------------------------");
    }
}