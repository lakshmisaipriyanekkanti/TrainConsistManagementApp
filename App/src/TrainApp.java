import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // 1. Define the Regex Patterns
        // TRN- followed by exactly 4 digits
        String trainIdRegex = "TRN-\\d{4}";
        // PET- followed by exactly 2 uppercase letters
        String cargoCodeRegex = "PET-[A-Z]{2}";

        // 2. Compile the Patterns (for efficiency)
        Pattern trainPattern = Pattern.compile(trainIdRegex);
        Pattern cargoPattern = Pattern.compile(cargoCodeRegex);

        // 3. Sample Inputs for Validation (including valid and invalid cases)
        String[] testTrainIds = {"TRN-1234", "TRAIN12", "TRN-123", "TRN-12345"};
        String[] testCargoCodes = {"PET-AB", "PET-ab", "PET123", "PET-XYZ"};

        System.out.println("\n--- Validating Train IDs ---");
        for (String id : testTrainIds) {
            validateInput(id, trainPattern, "Train ID");
        }

        System.out.println("\n--- Validating Cargo Codes ---");
        for (String code : testCargoCodes) {
            validateInput(code, cargoPattern, "Cargo Code");
        }

        System.out.println("------------------------------------");
    }

    /**
     * Helper method to validate input using Matcher
     */
    private static void validateInput(String input, Pattern pattern, String label) {
        // Create a Matcher object for the input
        Matcher matcher = pattern.matcher(input);

        // matches() checks if the ENTIRE string conforms to the pattern
        if (matcher.matches()) {
            System.out.println("[VALID]   " + label + ": " + input);
        } else {
            System.out.println("[INVALID] " + label + ": " + input + " (Format Error)");
        }
    }
}