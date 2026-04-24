import java.util.ArrayList;
import java.util.List;

// Reusing our Bogie class with the capacity field
class Bogie {
    String type;
    int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return type + " (" + capacity + " seats)";
    }
}

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // 1. Initialize the Bogie List
        List<Bogie> trainConsist = new ArrayList<>();
        trainConsist.add(new Bogie("Sleeper", 72));
        trainConsist.add(new Bogie("AC Chair", 56));
        trainConsist.add(new Bogie("First Class", 24));
        trainConsist.add(new Bogie("General", 90));

        System.out.println("Current Consist: " + trainConsist);

        // 2. The Stream Reduction Pipeline
        // Step A: .stream() - Start the process
        // Step B: .map() - Extract only the capacity (Bogie -> Integer)
        // Step C: .reduce() - Combine all integers using sum (Starting at 0)
        int totalSeats = trainConsist.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        // 3. Display the Quantitative Metric
        System.out.println("\n--- Operational Analytics ---");
        System.out.println("Total Bogies: " + trainConsist.size());
        System.out.println("Total Seating Capacity: " + totalSeats + " seats");

        // 4. Verification (Test Case Logic)
        if (totalSeats == (72 + 56 + 24 + 90)) {
            System.out.println("Verification Success: Total matches the sum of all bogies.");
        }

        // 5. Empty List Handling Test
        List<Bogie> emptyTrain = new ArrayList<>();
        int emptyTotal = emptyTrain.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);
        System.out.println("Empty Train Capacity: " + emptyTotal);

        System.out.println("------------------------------------");
    }
}