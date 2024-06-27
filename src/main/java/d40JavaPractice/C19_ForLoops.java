package d40JavaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C19_ForLoops {
    public static void main(String[] args) {
 /*
 write codes that manages a list of students' names. The codes should:
get the number of students
Add several student names to an ArrayList.
Use a for-each loop to print each student's name in the list.
Count how many students have names starting with the letter 'A' and print the count.
         */
        List<String> students = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String studentName;
        int op = 0;

        do {
            System.out.println("Enter Name of new Student. Enter 1 to exist ");
            studentName = input.next();
            if (studentName.equals("1")) {
                op = 1;
            } else {
                students.add(studentName);
            }
        } while (op != 1);
        System.out.println(students);
        int count=0;
        for (String w:students   ) {
            if (w.startsWith("A")){
                count++;
            }
        }
        System.out.println("Number of Students "+students.size());
        System.out.println("Starting with A "+count);
    }
}
