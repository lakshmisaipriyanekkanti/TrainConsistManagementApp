import java.util.ArrayList;
import java.util.List;

public class TrainApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // 1. Initialize the consist
        List<String> passengerBogies = new ArrayList<>();

        // 2. Add Passenger Bogies (Creating the Consist)
        // add() appends elements to the end of the list
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Adding bogies: Sleeper, AC Chair, First Class...");
        System.out.println("Current Consist: " + passengerBogies);

        // 3. Remove a Bogie (Simulating uncoupling)
        // remove() searches for the object and deletes it, shifting others left
        System.out.println("\nRemoving bogie: AC Chair...");
        passengerBogies.remove("AC Chair");
        System.out.println("Updated Consist: " + passengerBogies);

        // 4. Existence Check (Using contains)
        // contains() returns a boolean (true/false)
        System.out.println("\nChecking for Sleeper bogie...");
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Status: Sleeper bogie is present in the consist.");
        } else {
            System.out.println("Status: Sleeper bogie not found.");
        }

        // 5. Final State Summary
        System.out.println("\nFinal Bogie Count: " + passengerBogies.size());
        System.out.println("Final Consist: " + passengerBogies);
        System.out.println("------------------------------------");
    }
}