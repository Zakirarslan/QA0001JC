package d20ArrayList_MethodCreation;

import d21MethodCreation_MethodOverloadin.MethodCreation02;

public class MethodCreation01 {
    public static void main(String[] args) { //Create a method in java; we can not create a method inside another method....
        //However, if inside a method (ex: main method) an inner class(nested class) can be defined....
        //And inside this  inner class, we can create methods....

        //But this local inner class, is accesible inside main method only. Can not be used outside main method....


        System.out.println("addition(5,12,13) = " + addition());
        //how to create method in java

        //Access Modifier + static(optinal) +returnType+ methodName + () + {method body}


        int min = Math.min(15,16);
        System.out.println("min = " + min);

        //int a= MethodCreation02.multiplication(3,6);
       // System.out.println("a = " + a);

    } // end of main method


    //Example Create a method
    public static int addition (){

        int a = 5 ;
        int b = 10;


        return a+b;

    }

}
