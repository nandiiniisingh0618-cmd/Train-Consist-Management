import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * =======================================================
 * MAIN CLASS - UseCase9TrainConsistMgmt
 * =======================================================
 * Use Case 9: Group Bogies by Type (Collectors.groupingBy)
 * * Description:
 * This class demonstrates how to categorize bogies into
 * logical groups using Stream collectors for reporting.
 * * @author Developer
 * @version 9.0
 */
public class UseCase9TrainConsistMgmt {

    static class Bogie {
        String type;
        String id;

        Bogie(String type, String id) {
            this.type = type;
            this.id = id;
        }

        @Override
        public String toString() {
            return "[" + id + "]";
        }
    }

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC9 - Group Bogies by Type (groupingBy) ");
        System.out.println("==========================================\n");

        // 1. Initialize a list with multiple bogies of different types
        List<Bogie> trainConsist = new ArrayList<>();
        trainConsist.add(new Bogie("Sleeper", "SL01"));
        trainConsist.add(new Bogie("Sleeper", "SL02"));
        trainConsist.add(new Bogie("AC Chair", "AC01"));
        trainConsist.add(new Bogie("First Class", "FC01"));
        trainConsist.add(new Bogie("AC Chair", "AC02"));

        System.out.println("Original Flat List: " + trainConsist + "\n");

        // 2. Perform Grouping
        // Key: Bogie Type (String), Value: List of Bogies (List<Bogie>)
        Map<String, List<Bogie>> groupedBogies = trainConsist.stream()
                .collect(Collectors.groupingBy(b -> b.type));

        // 3. Display categorized results
        System.out.println("Structured Bogie Report:");
        groupedBogies.forEach((type, list) -> {
            System.out.println(type + " -> " + list + " (Count: " + list.size() + ")");
        });

        System.out.println("\nUC9 data categorization completed...");
    }
}