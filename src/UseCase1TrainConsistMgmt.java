import java.util.ArrayList;
import java.util.List;

/**
 * =======================================================
 * MAIN CLASS - UseCase1TrainConsistMgmt
 * =======================================================
 * Use Case 1: Initialize Train and Display Consist Summary
 * * Description:
 * This class represents the entry point of the Train Consist
 * Management Application.
 * * @author Developer
 * @version 1.0
 */
public class UseCase1TrainConsistMgmt {

    public static void main(String[] args) {

        // 1. Display welcome banner
        System.out.println("==========================================");
        System.out.println("* === Train Consist Management App === *");
        System.out.println("==========================================\n");

        // 2. Create a dynamic List to store train bogies (Strings for now)
        // Using List (Interface) and ArrayList (Implementation)
        List<String> trainConsist = new ArrayList<>();

        // 3. Display initial consist information
        System.out.println("Train initialized successfully...");

        // Getting size of the list using size() method
        System.out.println("Initial Bogie Count : " + trainConsist.size());

        // Printing the current state (empty list)
        System.out.println("Current Train Consist : " + trainConsist);

        System.out.println("\nSystem ready for operations...");
    }
}