package d40JavaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C20 {
    public static void main(String[] args) {
        /*
    Get integers from user
    Add several integers to an ArrayList.
Use a lambda expression to filter out and print all even numbers from the list.
Use a lambda expression to square each number in the list and print the result.
Use a lambda expression to find and print the sum of all numbers in the list.
     */
        List<Integer> nums = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println( "Enter size of List");
        int size=input.nextInt();

        for (int i=0;i<size;i++){
            System.out.println("Enter a number...");
            nums.add(input.nextInt());
         }
        int first=0;
        nums.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+", "));
        System.out.println("====");
        nums.stream().map(t -> t * t).forEach(t-> System.out.print(t+", "));
        System.out.println("====");
        System.out.println(nums.stream().reduce(0, (t, u) -> t + u));


    }
}
