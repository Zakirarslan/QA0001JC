package JavaQuestionBank;

import java.util.Scanner;

public class Loops03 {
    public static void main(String[] args) {
        // Calculate the sum of digits of a number given by user. E.g.-
        // INUPT : 123        OUPUT : 6
        // INUPT : 12345      OUPUT : 15

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an Integer  ");
        int a=scan.nextInt();


        int sum=0;
        for (int i=a;i>=1;i/=10){

            sum=sum+i%10;
        }
        System.out.println("sum = " + sum);


    }
}
