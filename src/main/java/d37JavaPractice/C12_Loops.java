package d37JavaPractice;

import java.util.Scanner;

public class C12_Loops {
    public static void main(String[] args) {
        //Write a code  that calculates the factorial of a given number from user

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a namber to calculate factorial");
        int f=input.nextInt();
        Integer factorialOfF=1;

        for (int i=f;i>0;i--){

            factorialOfF=factorialOfF*i;

        }
        System.out.println(factorialOfF);






    }
}
