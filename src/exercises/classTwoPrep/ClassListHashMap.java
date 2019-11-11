package exercises.classTwoPrep;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClassListHashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        Integer newStudentID;

        System.out.println("Enter your student IDs (or ENTER to finish):");

        do {

            System.out.print("Student ID: ");
            newStudentID = in.nextInt();

            if (!newStudentID.equals("")) {
                System.out.print("Name: ");
                String newStudent = in.nextLine();
                students.put(newStudentID, newStudent);

                in.nextLine();
            }

        } while(!newStudentID.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getValue() + " (" + student.getKey() + ")");
        }
    }

}