import java.util.HashSet;
import java.util.Set;

/**
 * =======================================================
 * MAIN CLASS - UseCase3TrainConsistMgmt
 * =======================================================
 * Use Case 3: Track Unique Bogie IDs
 * * Description:
 * This class ensures that duplicate bogie IDs are not
 * added into the train formation using HashSet.
 * * @author Developer
 * @version 3.0
 */
public class UseCase3TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("==========================================\n");

        // Create a Set to store unique bogie IDs
        // HashSet stores only unique values and is unordered
        Set<String> bogies = new HashSet<>();

        // ---- ADD IDs (including duplicates) ----
        // add() inserts bogie IDs into the set
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate entries will be ignored internally by HashSet
        bogies.add("BG101"); // Duplicate entry
        bogies.add("BG102"); // Duplicate entry

        // Displaying the results
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogies);

        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

        System.out.println("\nUC3 uniqueness validation completed...");
    }
}
