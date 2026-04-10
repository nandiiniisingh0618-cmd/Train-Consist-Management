import java.util.LinkedHashSet;
import java.util.Set;

/**
 * =======================================================
 * MAIN CLASS - UseCase5TrainConsistMgmt
 * =======================================================
 * Use Case 5: Preserve Insertion Order of Bogies
 * * Description:
 * This class maintains the exact attachment order of bogies
 * while also preventing duplicate entries using LinkedHashSet.
 * * @author Developer
 * @version 5.0
 */
public class UseCase5TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("==========================================\n");

        // LinkedHashSet preserves order and ensures uniqueness
        Set<String> formation = new LinkedHashSet<>();

        // ---- ATTACH BOGIES ----
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // ---- ATTEMPT DUPLICATE ATTACHMENT ----
        // This will be ignored automatically by the LinkedHashSet
        formation.add("Sleeper");

        // Displaying the final formation
        System.out.println("Final Train Formation:");
        System.out.println(formation);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUC5 formation setup completed...");
    }
}
