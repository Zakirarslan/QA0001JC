package d37JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C10_ArrayList {
    public static void main(String[] args) {

        //    Type code that finds the smallest number in a list and adds this number to both the beginning and the end of the list.
        //    If the list is empty, print "The list is empty".
        //    10,5,30,20,50

        List<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(30);
        list.add(20);
        list.add(50);
        int smallest=Integer.MAX_VALUE;
        int toadd=0;

        for (Integer w:list) {
            if (list.isEmpty()){
                System.out.println("The list is empty");

            }else {
                if (w<smallest){
                    smallest=w;
                    toadd=w;

                }
            }

        }

       list.add(0,toadd);
       list.add(toadd);
        System.out.println("list = " + list);


    }
}
