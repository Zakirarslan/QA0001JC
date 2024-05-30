package d26JavaPractice;

import java.util.Scanner;

public class C03_NestedIf {
    public static void main(String[] args) {
        /*
        Ask the user to enter a number....

        if the number is less than zero, print "Negative" on the console..

        f the number isgreater than zero,
           if the number is less than 10, print "Digit number" on the console
             if the number is greater than 10, print "Positive number" on the console....
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number ");
        int num=input.nextInt();


        if (num<0){
            System.out.println("Negative");

        } else if (num>0) {
            if (num<10){
                System.out.println("Digit number");

            }else System.out.println("Positive number");

        }else System.out.println("Please enter an other number that Zero");


    }
}
