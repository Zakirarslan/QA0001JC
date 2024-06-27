package d40JavaPractice;

import java.util.Scanner;

public class C16Switch {
    public static void main(String[] args) {

        /*
        Calculate the discount rate based on customer points in a store. The discount rates based on points are as follows:

        0 - 99 points: 0% discount
        100 - 199 points: 5% discount
        200 - 299 points: 10% discount
        300 - 399 points: 15% discount
        400 and above points: 20% discount
        Take the customer's points and the purchase amount as input.
        Use a switch statement to determine the discount rate and calculate the final amount after applying the discount.
*/
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your points : ");
        int point=input.nextInt();
        System.out.println("Enter amount : ");
        double amount=input.nextDouble();
        byte discount;
        double totalPrice;

        if(point>0&&point<100){discount=1;
        } else if (point<200){discount=2;
        } else if (point<300){discount=3;
        } else if (point<400){discount=4;
        } else {   discount = 5;
        }
        switch (discount){

            case 1:
                totalPrice=amount*1;

                System.out.println("totalPrice = " + totalPrice);
                break;
           case 2:
               totalPrice=amount*0.95;
               System.out.println("You have %5 discount");
               System.out.println("Total Price = " + totalPrice);
               break;
           case 3:
                totalPrice=amount*0.90;
               System.out.println("You have %10 discount");
                System.out.println("Total Price = " + totalPrice);
                break;
           case 4:
                totalPrice=amount*0.85;
               System.out.println("You have %15 discount");
                System.out.println("Total Price = " + totalPrice);
                break;
           case 5:
                totalPrice=amount*0.80;
               System.out.println("You have %20 discount");
                System.out.println("Total Price = " + totalPrice);
                break;
        }




    }
}
