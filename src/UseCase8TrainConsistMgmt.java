import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * =======================================================
 * MAIN CLASS - UseCase8TrainConsistMgmt
 * =======================================================
 * Use Case 8: Filter Passenger Bogies Using Streams
 * * Description:
 * This class filters passenger bogies based on seating
 * capacity using the Java Stream API.
 * * @author Developer
 * @version 8.0
 */
public class UseCase8TrainConsistMgmt {

    // Reusing Bogie model from UC7
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " (Capacity: " + capacity + ")";
        }
    }

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC8 - Filter Passenger Bogies Using Streams ");
        System.out.println("==========================================\n");

        // 1. Create a list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        System.out.println("Full Consist:");
        bogies.forEach(System.out::println);

        // 2. Apply Stream Filtering
        // Goal: Filter bogies with capacity > 60
        List<Bogie> highCapacityBogies = bogies.stream()        // Convert list to stream
                .filter(b -> b.capacity > 60)                  // Apply filter condition
                .collect(Collectors.toList());                 // Collect result back into a list

        // 3. Display qualifying bogies
        System.out.println("\nHigh Capacity Bogies (Capacity > 60):");
        if (highCapacityBogies.isEmpty()) {
            System.out.println("No bogies match the criteria.");
        } else {
            highCapacityBogies.forEach(System.out::println);
        }

        System.out.println("\nUC8 functional filtering completed...");
    }
}