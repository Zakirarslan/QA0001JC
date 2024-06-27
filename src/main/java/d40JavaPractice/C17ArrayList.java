package d40JavaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C17ArrayList {
    public static void main(String[] args) {

        /*
 Stores the names of students in a class. This program should perform the following steps:
Take 5 student names as input from the user and add them to an ArrayList.
Print all the student names.
 */
        List<String> students=new ArrayList<>();

        Scanner input=new Scanner(System.in);

        for (int i=1;i<6;i++){
            System.out.println("Enter "+i+". Student name ");
            students.add(input.next());
        }

        for (String w:students ) {
            System.out.print(w+",");

        }
    }}