package JavaQuestionBank.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test01 {
    public static void main(String[] args) {
        HashMap<String, Integer> myMap = new HashMap<>();
        myMap.put("Ismail" , 25);
        myMap.put("Tanya" , 28);
        myMap.put("Mikail" , 34);
        myMap.put("Derya" , 33);
        myMap.put("Goksen" , 45);
        myMap.put("Talha" , 28);
        System.out.println("myMap = " + myMap);
        //{Tanya=28, Derya=33, Talha=28, Ismail=25, Mikail=34, Goksen=45}

        //Homework
        //You can calculate totalNumber of characters and age of people in the given map????????

        Integer sumOfAges=0;
        int sumOfChars=0;
        Set<Map.Entry<String,Integer>> myList=myMap.entrySet();
        for (Map.Entry<String,Integer> w:myList ) {
            sumOfChars+=w.getKey().length();
            sumOfAges+=w.getValue();
       }
        System.out.println("sumOfAges = " + sumOfAges);
        System.out.println("sumOfChars = " + sumOfChars);







    }
}
