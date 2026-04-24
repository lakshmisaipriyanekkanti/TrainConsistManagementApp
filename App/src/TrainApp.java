import java.util.ArrayList;
import java.util.List;

// 1. Define the GoodsBogie class with type and cargo properties
class GoodsBogie {
    String type;
    String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " [" + cargo + "]";
    }
}

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // 2. Prepare a list of Goods Bogies
        List<GoodsBogie> goodsConsist = new ArrayList<>();
        goodsConsist.add(new GoodsBogie("Box", "Coal"));
        goodsConsist.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsConsist.add(new GoodsBogie("Open", "Grain"));

        // Scenario A: Safe Train
        checkSafety(goodsConsist, "Standard Consist");

        // Scenario B: Unsafe Train (Cylindrical carrying Coal)
        List<GoodsBogie> unsafeConsist = new ArrayList<>(goodsConsist);
        unsafeConsist.add(new GoodsBogie("Cylindrical", "Coal")); // Rule Violation!
        checkSafety(unsafeConsist, "Unsafe Addition Consist");

        System.out.println("------------------------------------");
    }

    /**
     * Enforces the Safety Rule:
     * If a bogie is 'Cylindrical', its cargo MUST be 'Petroleum'.
     */
    private static void checkSafety(List<GoodsBogie> list, String label) {
        System.out.println("\nAnalyzing " + label + "...");

        // 3. allMatch() evaluates the entire stream against the lambda predicate
        boolean isSafe = list.stream().allMatch(b -> {
            if (b.type.equalsIgnoreCase("Cylindrical")) {
                return b.cargo.equalsIgnoreCase("Petroleum");
            }
            return true; // Non-cylindrical bogies pass this specific check
        });

        // 4. Display result
        if (isSafe) {
            System.out.println("Result: [SAFE] All bogies comply with safety protocols.");
        } else {
            System.out.println("Result: [UNSAFE] Safety violation detected! Cargo mismatch.");
        }
    }
}