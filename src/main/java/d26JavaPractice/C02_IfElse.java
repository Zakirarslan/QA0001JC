package d26JavaPractice;

import java.util.Scanner;

public class C02_IfElse {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number ");
        int numA=input.nextInt();
        System.out.println("Please enter second number ");
        int numB=input.nextInt();


        if (numA>0&&numB>0){
            System.out.println("Sum of given numbers is "+(numA+numB));
        } if (numA<0&&numB<0){
            System.out.println("Multiplication of given numbers is "+(numA*numB));
        } if ((numA<0&&numB>0) ||(numA>0&&numB<0)){
            System.out.println("Operations with numbers cannot be performed");
        } if (numA==0||numB==0) {
            System.out.println("absording number");
        }





    }
}
