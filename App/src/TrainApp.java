import java.util.HashMap;
import java.util.Map;

public class TrainApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // 1. Initialize the HashMap
        // Key: Bogie Name (String), Value: Seat/Load Capacity (Integer)
        Map<String, Integer> bogieCapacities = new HashMap<>();

        // 2. Map bogies to their respective capacities using put()
        System.out.println("Registering bogie capacities...");
        bogieCapacities.put("Sleeper", 72);
        bogieCapacities.put("AC Chair", 56);
        bogieCapacities.put("First Class", 24);
        bogieCapacities.put("General", 90);

        // 3. Iterate through the Map using entrySet()
        // This allows us to access both the Key and the Value in one loop
        System.out.println("\n--- Bogie Capacity Registry ---");
        for (Map.Entry<String, Integer> entry : bogieCapacities.entrySet()) {
            System.out.println("Bogie Type: " + entry.getKey() + " | Capacity: " + entry.getValue() + " seats");
        }

        // 4. Demonstrate Fast Lookup
        // We can retrieve the capacity of a specific bogie instantly
        String searchBogie = "AC Chair";
        if (bogieCapacities.containsKey(searchBogie)) {
            System.out.println("\nLookup Success: The " + searchBogie + " has a capacity of " +
                    bogieCapacities.get(searchBogie) + " seats.");
        }

        System.out.println("------------------------------------");
    }
}