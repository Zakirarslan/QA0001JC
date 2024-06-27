package d40JavaPractice;

import java.util.*;

public class C15_Median {
    //        get the user to enter a positive integer n and then creates an array of n elements filled with random numbers.
    //       In this array:
//
//        Find and print the median of the array.
//        Find and print the second smallest and second largest elements of the array.


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the lentgh of the array");

        int n = scan.nextInt();

        //Create an array filled with random numbers

        int arr [] = new int[n];
        Random random = new Random();
        for (int i = 0; i <n ; i++) {

            arr[i] = random.nextInt(200);

        }

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        //Find median
        double median = 0;

        if (n%2==0){

            median = (double)(arr[n/2-1]+arr[n/2])/2;


        }else{

            median = arr[n/2];


        }

        System.out.println("median = " + median);


        //Find the second smallest and second largest elements....

        int secondSmallest =  arr[1];
        int secondLargest = arr[n-2];


        System.out.println("secondLargest = " + secondLargest);
        System.out.println("secondSmallest = " + secondSmallest);

    }
}



























