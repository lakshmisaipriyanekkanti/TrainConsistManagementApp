import java.util.ArrayList;
import java.util.List;

/**
 * TrainApp - UC1: Initialize Train and Display Consist Summary
 * The class name now matches the filename 'TrainApp.java'.
 */
public class TrainApp {

    public static void main(String[] args) {
        // 1. Application prints welcome message
        System.out.println("=== Train Consist Management App ===");

        // 2. Train consist is initialized
        // Using List (Interface) and ArrayList (Implementation)
        List<String> consist = new ArrayList<>();

        // 3. Initial bogie count is displayed
        System.out.println("Initializing train consist...");
        System.out.println("Initial Bogie Count: " + consist.size());

        // 4. Program continues
        System.out.println("System ready for bogie assignment.");
        System.out.println("------------------------------------");
    }
}