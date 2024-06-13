package d34JavaPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03Maps {
    public static void main(String[] args) {
        //Create a map
    /*
    add elements as key and as values
    Laptop = 1200
    Tv = 800
    Refrigerator = 1500
    Music System = 600

   in the map Contains product names as keys and their prices as values,
    write code to check if there is any product with a price greater than 1000 and print all such products.
     */


        Map<String, Integer> mps = new HashMap<>();
        mps.put("Laptop",1200);
        mps.put("Tv",800);
        mps.put("Refrigator",1500);
        mps.put("Music System",600);
        Set<Map.Entry<String , Integer>> elist = mps.entrySet();

        for (Map.Entry<String , Integer> w: elist ) {
            if (w.getValue()>1000){
                System.out.println( w.getKey());
            }
        }

    }
}
