import java.util.ArrayList;
import java.util.List;

/**
 * =======================================================
 * MAIN CLASS - UseCase2TrainConsistMgmt
 * =======================================================
 * Use Case 2: Add Passenger Bogies to Train
 * * Description:
 * This class demonstrates how passenger bogies can be
 * managed dynamically using ArrayList operations.
 * * @author Developer
 * @version 2.0
 */
public class UseCase2TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("==========================================\n");

        // CREATE: Initialize the ArrayList
        List<String> passengerBogies = new ArrayList<>();

        // ---- CREATE (Add bogies) ----
        // add() attaches a new bogie to the train
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // ---- DELETE (Remove bogies) ----
        // remove() detaches a bogie from the train
        System.out.println("\nAfter Removing 'AC Chair':");
        passengerBogies.remove("AC Chair");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // ---- READ (Check existence) ----
        // contains() checks if a specific bogie is in the consist
        System.out.println("\nChecking if 'Sleeper' exists:");
        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Contains Sleeper? : " + hasSleeper);

        // ---- FINAL DISPLAY ----
        System.out.println("\nFinal Train Passenger Consist:");
        System.out.println(passengerBogies);

        System.out.println("\nUC2 operations completed successfully...");
    }
}