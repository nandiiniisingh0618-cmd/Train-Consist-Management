import java.util.LinkedList;

/**
 * =======================================================
 * MAIN CLASS - UseCase4TrainConsistMgmt
 * =======================================================
 * Use Case 4: Maintain Ordered Bogie Consist
 * * Description:
 * This class models the physical chaining of train bogies
 * using LinkedList for ordered operations.
 * * @author Developer
 * @version 4.0
 */
public class UseCase4TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("==========================================\n");

        // Create a LinkedList to represent the physical train chain
        // LinkedList maintains insertion order and allows fast inserts/deletes
        LinkedList<String> trainConsist = new LinkedList<>();

        // 1. Adding bogies in sequence
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // 2. Inserting 'Pantry Car' at position 2 (Index starts at 0)
        System.out.println("\nAfter Inserting 'Pantry Car' at position 2:");
        trainConsist.add(2, "Pantry Car");
        System.out.println(trainConsist);

        // 3. Removing First and Last bogie
        // In a real scenario, this might be detaching the engine or the guard coach
        System.out.println("\nAfter Removing First and Last Bogie:");
        trainConsist.removeFirst();
        trainConsist.removeLast();
        System.out.println(trainConsist);

        System.out.println("\nUC4 ordered consist operations completed...");
    }
}
