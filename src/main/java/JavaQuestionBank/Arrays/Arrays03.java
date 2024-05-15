package JavaQuestionBank.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03 {
    public static void main(String[] args) {
        //Take 10 integer inputs from user and store them in an array and print them on screen.
        Scanner input=new Scanner(System.in);

        int[] num=new int[10];
        for (int i = 0;i< num.length;i++){
            System.out.println("Enter "+i+" value of Array");
            num[i]=input.nextInt();
        }
        System.out.println("Array "+ Arrays.toString(num));

    }
}
