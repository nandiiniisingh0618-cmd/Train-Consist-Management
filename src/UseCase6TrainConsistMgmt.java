import java.util.HashMap;
import java.util.Map;

/**
 * =======================================================
 * MAIN CLASS - UseCase6TrainConsistMgmt
 * =======================================================
 * Use Case 6: Map Bogie to Capacity (HashMap)
 * * Description:
 * This class associates each bogie with its seating or
 * load capacity using a key-value mapping structure.
 * * @author Developer
 * @version 6.0
 */
public class UseCase6TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("------------------------------------------");
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap) ");
        System.out.println("------------------------------------------\n");

        // HashMap stores data in Key -> Value format
        // Key: Bogie Name (String), Value: Capacity (Integer)
        Map<String, Integer> capacityMap = new HashMap<>();

        // ---- Insert bogie capacities (CREATE/UPDATE) ----
        // put() associates the key with the value
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 56);
        capacityMap.put("First Class", 24);
        capacityMap.put("Cargo", 120);

        System.out.println("Bogie Capacity Details:");

        // ---- Iterate through map entries (READ) ----
        // entrySet() allows us to access both key and value in a loop
        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 bogie-capacity mapping completed...");
    }
}