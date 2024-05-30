package d26JavaPractice;

import java.util.Scanner;

public class C08_WhileLoops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please give a number...");
        int num=scan.nextInt();
        int a=num;
        if (a%10==0){
            System.out.println("given num is "+num+" and it is already dividible by 10");
        }else


        while (a%10!=0){
            System.out.println(a);
            a++;
        }



    }
}
