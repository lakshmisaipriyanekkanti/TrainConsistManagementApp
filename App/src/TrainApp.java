// 1. Custom Runtime Exception for Cargo Safety
// We extend RuntimeException so we don't have to force 'throws' everywhere
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    String shape;
    String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
        this.cargo = "Empty";
    }

    // 2. Business Logic with Exception Handling
    public void assignCargo(String newCargo) {
        System.out.println("Attempting to assign [" + newCargo + "] to [" + shape + "] bogie...");

        try {
            // Safety Rule: Petroleum MUST be in a Cylindrical bogie
            if (newCargo.equalsIgnoreCase("Petroleum") && !shape.equalsIgnoreCase("Cylindrical")) {
                throw new CargoSafetyException("SAFETY ALERT: Petroleum cannot be carried in a " + shape + " bogie!");
            }

            // If check passes, assign the cargo
            this.cargo = newCargo;
            System.out.println("Success: Cargo assigned.");

        } catch (CargoSafetyException e) {
            // 3. Catch block: Handle the specific error gracefully
            System.out.println("Error Handled: " + e.getMessage());
            System.out.println("Action: Assignment blocked to prevent hazards.");

        } finally {
            // 4. Finally block: Mandatory execution (Logging/Cleanup)
            System.out.println("Log: Safety validation check completed for this bogie.");
        }
    }

    @Override
    public String toString() {
        return shape + " bogie [Current Cargo: " + cargo + "]";
    }
}

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // Test Case 1: Valid Assignment
        GoodsBogie g1 = new GoodsBogie("Cylindrical");
        g1.assignCargo("Petroleum");
        System.out.println(g1);

        System.out.println("\n------------------------------------");

        // Test Case 2: Unsafe Assignment (Rectangular + Petroleum)
        GoodsBogie g2 = new GoodsBogie("Rectangular");
        g2.assignCargo("Petroleum");
        System.out.println(g2);

        System.out.println("\n------------------------------------");

        // 5. Program continuation check
        System.out.println("Status: System operational. All safety checks processed.");
    }
}