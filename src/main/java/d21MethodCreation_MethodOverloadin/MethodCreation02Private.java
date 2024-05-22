package d21MethodCreation_MethodOverloadin;

import java.util.Scanner;

public class MethodCreation02Private {
    public static void main(String[] args) {


        System.out.println("multiplication(3,4,5) = " + multiplication(3, 4, 5));
        System.out.println("mult() = " + mult(5,7,8));
        System.out.println("printText() = " + printText());


    }



    public static int multiplication(int a,int b) {
        int totalValue = a + b;



        return totalValue;
    }


    protected static int carpma(int a,int b){
        int toplam = a * b;
        return toplam;
    }

    private static int multiplication(int x, int y, int z){

        int mult=x*y*z;
        return mult;
    }
    private static int devision(int x, int y, int z) {

        int devision = x / y /z;
        return devision;
    }

    //Example3: Create a method with 3 parameter:
    //Multiply first two parameter and add 3rd parameter to the multiplication....
    public static int mult(int a, int b, int c){

        int totalValue=a*b+c;

        return totalValue;
    }

    //Example3 Create a method to print entered text......
    public static String printText() {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a trext : ");
        String str=input.next();


        return str;


    }
}
