import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// 1. Defining the Bogie Class (Custom Object)
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

        // 2. Create a List of Bogie objects
        List<Bogie> passengerBogies = new ArrayList<>();

        // 3. Add bogie data
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("First Class", 24));
        passengerBogies.add(new Bogie("General", 90));

        System.out.println("Initial Bogie List (Unsorted):");
        System.out.println(passengerBogies);

        // 4. Sort the list using a Comparator (High to Low capacity)
        // We use a Lambda expression to define the comparison logic
        passengerBogies.sort((b1, b2) -> b2.capacity - b1.capacity);

        System.out.println("\n--- Sorted Bogies (Highest Capacity First) ---");
        for (Bogie b : passengerBogies) {
            System.out.println(">> " + b.name + " | Capacity: " + b.capacity);
        }

        System.out.println("----------------------------------------------");
    }
}