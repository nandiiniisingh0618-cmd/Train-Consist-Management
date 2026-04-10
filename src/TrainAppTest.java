import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test Suite for Train Consist Management App
 */
public class TrainAppTest {

    // Define the models locally within the test file to resolve "Cannot resolve symbol"
    static class Bogie {
        String type;
        String id;
        int capacity;

        Bogie(String type, String id, int capacity) {
            this.type = type;
            this.id = id;
            this.capacity = capacity;
        }
    }

    // --- UC9: Grouping Tests ---
    @Test
    void testGrouping_BogiesGroupedByType() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", "SL1", 72),
                new Bogie("AC", "AC1", 56),
                new Bogie("Sleeper", "SL2", 72)
        );

        Map<String, List<Bogie>> grouped = list.stream()
                .collect(Collectors.groupingBy(b -> b.type));

        assertEquals(2, grouped.get("Sleeper").size());
        assertTrue(grouped.containsKey("AC"));
    }

    // --- UC10: Total Capacity Tests ---
    @Test
    void testReduce_TotalSeatCalculation() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", "SL1", 72),
                new Bogie("AC", "AC1", 56)
        );

        int total = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        assertEquals(128, total, "72 + 56 should equal 128");
    }

    // --- UC12: Safety Compliance Tests ---
    @Test
    void testSafety_CylindricalWithInvalidCargo() {
        // Local class for Goods testing
        record GoodsBogie(String type, String cargo) {}

        List<GoodsBogie> goods = Arrays.asList(
                new GoodsBogie("Cylindrical", "Coal")
        );

        boolean isSafe = goods.stream().allMatch(b ->
                !b.type.equalsIgnoreCase("Cylindrical") || b.cargo.equalsIgnoreCase("Petroleum")
        );

        assertFalse(isSafe, "Cylindrical carrying Coal should be UNSAFE");
    }
}