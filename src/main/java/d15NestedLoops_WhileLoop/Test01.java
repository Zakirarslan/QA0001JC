package d15NestedLoops_WhileLoop;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Give a number");
        int a=input.nextInt();
        int fact=1;

        for (int i=a; i>=1;i--){
           fact=fact*i;


        }
        System.out.println("fact = " + fact);
    }
}
