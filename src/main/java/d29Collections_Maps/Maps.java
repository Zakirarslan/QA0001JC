package d29Collections_Maps;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        //Maps are like dictionaries. Thet are descriptive Jim = 13; Maps are not collesctions

        /*
        The left side keys are unique. The rigt side value cah have duplicates....
        For keys, a set is used for the values is genrally used List....


         */

        //How to create a map??

        //1) HashMap; A type of map that stores key-value pairs in a random order...
        //it is the fastest.....

        HashMap<String, Integer> myMap = new HashMap<>();

        myMap.put("Ismail" , 25);
        myMap.put("Tanya" , 28);
        myMap.put("Mikail" , 34);
        myMap.put("Derya" , 33);
        myMap.put("Goksen" , 45);
        myMap.put("Talha" , 28); //Talha=29,
        myMap.put("Talha" , 29);
        System.out.println("myMap = " + myMap); //myMap = {Tanya=28, Derya=33, Talha=28, Ismail=25, Mikail=34, Goksen=45}

        //How to get only keys from map????


        Set<String> keys = myMap.keySet();
        System.out.println("keys = " + keys);  //keys = [Tanya, Derya, Talha, Ismail, Mikail, Goksen]


        //How to get only Values from map?

        Collection<Integer> values = myMap.values();
        System.out.println("values = " + values); //values = [28, 33, 28, 25, 34, 45]

        //Can we store returning values in ArrayList? or LinkedList?
//        LinkedList<Integer> values1 = myMap.values(); you can not convert

        LinkedList<Integer> values1 = new LinkedList<>(values);
        System.out.println("values1 = " + values1); //values1 = [28, 33, 28, 25, 34, 45]


        //get() returns the value of specified key in method parenthesis......

        Integer age = myMap.get("Tanya");
        System.out.println("age = " + age); //28

        //Example
        //What is the average age of people in myMap?

        int sum = 0;


        for (Integer w:myMap.values()) { // [28, 33, 28, 25, 34, 45]

            sum = sum + w;

        }
        System.out.println("sum = " + sum);
        System.out.println("The average of the values = " + sum / values.size()); //The average of the values = 32




        //EntrySet() method returns a Set containing all values of the HashMap......
        //we put out map into set by keeping key value structure.... and make it available to iterate


        Set<Map.Entry<String , Integer>> myList = myMap.entrySet();

        System.out.println("myList = " + myList); //myEntrySet = [Tanya=28, Derya=33, Talha=29, Ismail=25, Mikail=34, Goksen=45]
        for (Map.Entry<String , Integer> w: myList) {

            System.out.println("w = " + w); // Tanya = 28

        }

        //in java you can loop over a Set using "Map.entry" and get both keys, values by using (getKey() and getValue())...

        for (Map.Entry<String , Integer> w: myList) {

            System.out.print("w.getKey() = " + w.getKey()); //gives me key only of the pair from each entries
            System.out.println();
            System.out.println("w.getValue() = " + w.getValue());//gives me value only of the pair from each entries

        }

        //Homework
        //You can calculate totalNumber of characters and age of people in the given map????????



    }
}
