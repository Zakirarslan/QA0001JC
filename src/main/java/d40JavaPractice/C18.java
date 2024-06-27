package d40JavaPractice;

import java.util.Scanner;

public class C18 {
    public static void main(String[] args) {
        /*

Takes two numbers from the user representing a range and prints all the even numbers between those two numbers (inclusive).
The program should use a for loop to accomplish this task.


 */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNum = input.nextInt();
        System.out.println("Enter second number");
        int secondNum = input.nextInt();
        if (firstNum < secondNum) {
            for (int i = firstNum; i <= secondNum; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + ", ");

                }
            }
        }else {for (int i = secondNum; i <= firstNum; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");

            }
        }


        }
    }
}
