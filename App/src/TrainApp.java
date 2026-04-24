// 1. Create a custom exception class
// By extending Exception, we create a 'Checked Exception'
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// 2. The PassengerBogie class with validation logic
class PassengerBogie {
    String type;
    int capacity;

    // The constructor 'throws' the exception to the caller if validation fails
    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            // Throwing the exception immediately (Fail-Fast)
            throw new InvalidCapacityException("Capacity must be greater than zero. Received: " + capacity);
        }
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

        // Test Case 1: Valid Capacity
        try {
            System.out.println("\nAttempting to create a valid bogie (Sleeper, 72 seats)...");
            PassengerBogie validBogie = new PassengerBogie("Sleeper", 72);
            System.out.println("Success: " + validBogie);
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test Case 2: Zero Capacity (Invalid)
        try {
            System.out.println("\nAttempting to create an invalid bogie (Economy, 0 seats)...");
            PassengerBogie zeroBogie = new PassengerBogie("Economy", 0);
        } catch (InvalidCapacityException e) {
            System.out.println("Caught Expected Exception: " + e.getMessage());
        }

        // Test Case 3: Negative Capacity (Invalid)
        try {
            System.out.println("\nAttempting to create an invalid bogie (VIP, -10 seats)...");
            PassengerBogie negativeBogie = new PassengerBogie("VIP", -10);
        } catch (InvalidCapacityException e) {
            System.out.println("Caught Expected Exception: " + e.getMessage());
        }

        System.out.println("\n------------------------------------");
        System.out.println("System execution continued safely.");
    }
}