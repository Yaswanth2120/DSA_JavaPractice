package org.dsa.main;

import java.util.Scanner;
import org.dsa.arrays.*;
// import org.dsa.strings.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n🚀 DSA Java Practice - Choose a Problem to Run:");
            System.out.println("1. Find Max Element in an Array");
            System.out.println("2. Reverse of an Array");
            System.out.println("3. Check if array is sorted");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("❌ Invalid input! Enter a valid number.");
                scanner.next(); 
                continue; 
            }

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                System.out.println("✅ Exiting program. Goodbye!");
                break; 
            }

            // ✅ FIX 4: Handle valid choices properly
            switch (choice) {
                case 1:
                    ArrayMaxFinder.arrayMaxFinder();
                    break;
                case 2:
                    ReverseArray.reverseArray();
                    break;
                case 3:
                    CheckSortedArray.checkSorted();
                    break;
                default:
                    System.out.println("❌ Invalid choice. Please enter a number from the menu.");
            }
        }

        scanner.close(); // ✅ Close scanner AFTER loop finishes
    }
}
