// Exam Seating Arrangement System in java

package Questions.Projects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExamSeatingArrangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        sc.nextLine(); // consume the newline character

        // prompt the user to enter the seating capacity of each room
        System.out.print("Enter the seating capacity of each room: ");
        int roomCapacity = sc.nextInt();
        sc.nextLine(); // consume the newline character

        // calculate the number of rooms needed
        int numRooms = (int) Math.ceil((double) numStudents / roomCapacity);

        // create a list of student names
        List<String> studentNames = new ArrayList<>();
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            studentNames.add(sc.nextLine());
        }

        // shuffle the list of student names
        Collections.shuffle(studentNames);

        // assign students to rooms
        int studentIndex = 0;
        for (int i = 1; i <= numRooms; i++) {
            System.out.println("Room " + i + ":");
            for (int j = 1; j <= roomCapacity; j++) {
                if (studentIndex < numStudents) {
                    System.out.println(studentNames.get(studentIndex));
                    studentIndex++;
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
