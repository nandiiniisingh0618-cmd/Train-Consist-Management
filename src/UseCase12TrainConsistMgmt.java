import java.util.ArrayList;
import java.util.List;

/**
 * =======================================================
 * MAIN CLASS - UseCase12TrainConsistMgmt
 * =======================================================
 * Use Case 12: Safety Compliance Check for Goods Bogies
 * * Description:
 * Enforces domain-specific safety rules (Cylindrical bogies
 * must only carry Petroleum) using the allMatch() stream operation.
 * * @author Developer
 * @version 12.0
 */
public class UseCase12TrainConsistMgmt {

    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return type + " [" + cargo + "]";
        }
    }

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC12 - Safety Compliance Check ");
        System.out.println("==========================================\n");

        // 1. Prepare Goods Bogies
        List<GoodsBogie> goodsConsist = new ArrayList<>();
        goodsConsist.add(new GoodsBogie("Rectangular", "Coal"));
        goodsConsist.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsConsist.add(new GoodsBogie("Rectangular", "Grain"));

        System.out.println("Initial Goods Consist: " + goodsConsist);

        // 2. Safety Rule Implementation using allMatch()
        // Rule: IF type is Cylindrical, THEN cargo MUST be Petroleum
        boolean isSafe = goodsConsist.stream().allMatch(bogie -> {
            if (bogie.type.equalsIgnoreCase("Cylindrical")) {
                return bogie.cargo.equalsIgnoreCase("Petroleum");
            }
            return true; // Non-cylindrical bogies are always safe in this rule
        });

        System.out.println("Safety Check Passed: " + isSafe);

        // 3. Simulating an Unsafe Violation
        System.out.println("\n--- Simulating Violation ---");
        goodsConsist.add(new GoodsBogie("Cylindrical", "Coal")); // DANGEROUS!
        System.out.println("Updated Goods Consist: " + goodsConsist);

        boolean isSafeAfterViolation = goodsConsist.stream().allMatch(bogie -> {
            if (bogie.type.equalsIgnoreCase("Cylindrical")) {
                return bogie.cargo.equalsIgnoreCase("Petroleum");
            }
            return true;
        });

        System.out.println("Safety Check Passed: " + isSafeAfterViolation);

        if (!isSafeAfterViolation) {
            System.out.println("ALERT: Train formation is NOT safety compliant!");
        }

        System.out.println("\nUC12 safety validation completed...");
    }
}
