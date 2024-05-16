package d19MultiDimensionArrays_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList01 {
    public static void main(String[] args) {
        //What is ArrayList?

        // ArrayList has dynamic structure. This means the size of array list can be automatically change,
        // you can change the size of arraylist with what ever you want....
        // it means that automatically adjust during the addition or removal of the elements....


        //ArrayList can not store primitive data types... on the other hand direct values...
        // we can use wrapper classes or String etc.

        //As a real life example; a shopping list can be represented as ArrayList....
        //The shopping list contains a list of name of products. Products are string data types..

        /*

        Arrays can store primitive data types and references but ArrayList store non-primitve data types or wrapper class
        Arrays can store less memory than ArrayList
        Arrays is faster than ArrayList
        When you create Arrays, you have to specify total number of elements
        But ArrayList is more flexibility
         */

        /*
        Why java didnt destroye Arrays?
        Bcause Arrays is faster than Arraylist...
        Arrays cover very little space in memory
        therefore arrays prefered for storing data with a known number of elements.....

         */
        ArrayList<Integer> ages=new ArrayList<Integer>();

        ages.add(21);
        ages.add(43);
        ages.add(33);
        ages.add(1,26);
        ages.add(99);

        System.out.println("ages = " + ages);
        ArrayList<Integer> newAges=new ArrayList<>();
        newAges.add(1);
        newAges.add(3);
        newAges.add(5);
        newAges.add(7);
        ages.addAll(newAges);
        System.out.println("ages = " + ages);
        System.out.println("============");
        System.out.println("ages.size() = " + ages.size());

        ArrayList<Integer> a=new ArrayList<>();
        a.add(23);
        a.add(24);
        a.add(12);
        a.add(48);
        a.add(9);


        //for (int i=0;i<a.size();i++) {
        //    if (a.get(i)%2!=0){
        //        a.set(i,10);
        //    }
//
        //}
        for (int w:a  ) {
            if (w%2!=0){
                a.set(a.indexOf(w),10);
            }

        }


        System.out.println("a = " + a);


    }
}
