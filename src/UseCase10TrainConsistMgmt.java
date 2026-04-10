import java.util.ArrayList;
import java.util.List;

/**
 * =======================================================
 * MAIN CLASS - UseCase10TrainConsistMgmt
 * =======================================================
 * Use Case 10: Count Total Seats in Train (reduce)
 * * Description:
 * This class aggregates seating capacities into a single
 * total value using Stream reduction.
 * * @author Developer
 * @version 10.0
 */
public class UseCase10TrainConsistMgmt {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " (" + capacity + ")";
        }
    }

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC10 - Count Total Seats in Train ");
        System.out.println("==========================================\n");

        // 1. Initialize bogies with their respective capacities
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("Train Consist: " + bogies);

        // 2. Stream Aggregation
        // map() transforms Bogie objects -> Integer capacities
        // reduce() sums them up starting from an identity of 0
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        // 3. Display the operational metric
        System.out.println("\n--- Operational Metrics ---");
        System.out.println("Total Seating Capacity : " + totalSeats + " seats");

        // Handling the "Empty List" test case logic
        List<Bogie> emptyTrain = new ArrayList<>();
        int emptyTotal = emptyTrain.stream().map(b -> b.capacity).reduce(0, Integer::sum);
        System.out.println("Empty Train Capacity   : " + emptyTotal + " seats");

        System.out.println("\nUC10 aggregation metrics completed...");
    }
}