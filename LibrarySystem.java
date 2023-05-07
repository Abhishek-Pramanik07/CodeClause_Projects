// Library Book issue and Return System

package Questions.Projects;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, LocalDate> books = new HashMap<>();

        while (true) {
            // display the menu options
            System.out.println("Select an option:");
            System.out.println("1. Issue a book");
            System.out.println("2. Return a book");
            System.out.println("3. Exit");

            // read the user's choice
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1: {
                    // issue a book
                    System.out.print("Enter the book title: ");
                    String title = scanner.nextLine();
                    LocalDate issueDate = LocalDate.now();
                    books.put(title, issueDate);
                    System.out.println(title + " issued on " + issueDate);
                    break;
                }
                case 2: {
                    // return a book
                    System.out.print("Enter the book title: ");
                    String returnedTitle = scanner.nextLine();
                    LocalDate returnDate = LocalDate.now();
                    LocalDate issueDate2 = books.remove(returnedTitle);
                    if (issueDate2 != null) {
                        long days = returnDate.toEpochDay() - issueDate2.toEpochDay();
                        System.out.println(returnedTitle + " returned on " + returnDate + ". You had it for " + days + " days.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                }
                case 3: {
                    // exit the program
                    scanner.close();
                    System.exit(0);
                    break;
                }
                default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
            }

            System.out.println();
        }
    }
}
