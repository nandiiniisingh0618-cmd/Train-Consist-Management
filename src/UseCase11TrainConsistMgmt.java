import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * =======================================================
 * MAIN CLASS - UseCase11TrainConsistMgmt
 * =======================================================
 * Use Case 11: Validate Train ID & Cargo Codes (Regex)
 * * Description:
 * This class ensures that Train IDs and Cargo Codes follow
 * strict business formats using Pattern and Matcher.
 * * @author Developer
 * @version 11.0
 */
public class UseCase11TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC11 - Validate Train ID & Cargo Codes ");
        System.out.println("==========================================\n");

        // 1. Define Regex Patterns
        // TRN-\\d{4} : Starts with 'TRN-', followed by exactly 4 digits
        String trainIdRegex = "TRN-\\d{4}";

        // PET-[A-Z]{2} : Starts with 'PET-', followed by exactly 2 uppercase letters
        String cargoCodeRegex = "PET-[A-Z]{2}";

        // 2. Test Data
        String[] testTrainIds = {"TRN-1234", "TRAIN12", "TRN-123", "TRN-12345"};
        String[] testCargoCodes = {"PET-AB", "PET-ab", "PET123", "PET-XYZ"};

        // 3. Validate Train IDs
        System.out.println("--- Train ID Validation ---");
        validate(testTrainIds, trainIdRegex);

        // 4. Validate Cargo Codes
        System.out.println("\n--- Cargo Code Validation ---");
        validate(testCargoCodes, cargoCodeRegex);

        System.out.println("\nUC11 validation logic completed...");
    }

    /**
     * Helper method to compile pattern and match inputs
     */
    private static void validate(String[] inputs, String regex) {
        // Compile the regex into a Pattern object for efficiency
        Pattern pattern = Pattern.compile(regex);

        for (String input : inputs) {
            // Create a matcher for the current input
            Matcher matcher = pattern.matcher(input);

            // matches() checks the entire string against the pattern
            if (matcher.matches()) {
                System.out.println("[VALID]   : " + input);
            } else {
                System.out.println("[INVALID] : " + input);
            }
        }
    }
}
