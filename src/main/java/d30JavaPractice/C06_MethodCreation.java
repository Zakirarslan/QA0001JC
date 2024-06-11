package d30JavaPractice;

import static d30JavaPractice.C06_MethodCreation.*;

public class C06_MethodCreation {

    // Write a method that takes three int parameters and calculates their sum, difference, multiply, and average.
    // Then, write a program that calls these methods and prints all the results.
    // Define three numbers in Runner class


    public static int sum(int a,int b, int c){
        int sum=a+b+c;
        return sum;
    }
    public static int diff(int a,int b, int c){
        int diff=a-b-c;
        return diff;
    }
    public static int multy(int a,int b, int c){
        int multy=a*b*c;
        return multy;
    }
}

