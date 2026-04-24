import java.util.LinkedList;

public class TrainApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // 1. Initialize the consist using a LinkedList
        // LinkedList is ideal for sequential 'chaining' of bogies
        LinkedList<String> consist = new LinkedList<>();

        // 2. Add initial bogies to the consist
        // add() or addLast() appends to the end of the train
        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("AC Coach");
        consist.add("Cargo");
        consist.add("Guard");

        System.out.println("Initial Sequence: " + consist);

        // 3. Insert a Pantry Car at index 2 (between Sleeper and AC Coach)
        // LinkedList makes 'middle' insertions very efficient
        System.out.println("\nAdding Pantry Car at position 2...");
        consist.add(2, "Pantry Car");
        System.out.println("Updated Sequence: " + consist);

        // 4. Removing the first and last bogies
        // Simulating uncoupling the Engine and the Guard coach
        System.out.println("\nDetaching the Engine and Guard coach...");
        consist.removeFirst();
        consist.removeLast();

        // 5. Display the final ordered train consist
        System.out.println("\n--- Final Ordered Consist ---");
        System.out.println("Current Layout: " + consist);
        System.out.println("Total Bogies Remaining: " + consist.size());
        System.out.println("------------------------------");
    }
}
