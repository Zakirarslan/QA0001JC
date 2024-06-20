package d34JavaPractice;

import java.util.*;

public class C06ArrayList {
    public static void main(String[] args) {

        //Type the code that shows the count of unique elements in a list of strings.
        //Example: {"apple", "banana", "apple", "orange", "banana", "apple"} ==> 3

        List<String> list= Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        // 1.way
        Collections.sort(list);
        System.out.println("Sorted list = " + list); //[apple, apple, apple, banana, banana, orange]
        List<String> uniqList=new ArrayList<>();
        String first=null;
        for (String w:list ) {
            if(!w.equals(first)){
                uniqList.add(w);
            }
            first=w;
       }
        System.out.println("uniqList = " + uniqList);
        System.out.println(uniqList.size());


        //   2.way  Lambda
        long countOfUniqs= list.stream().distinct().count();
        System.out.println("countOfUniqs = " + countOfUniqs);

        //3nd way
        HashSet<String> mySet1 = new HashSet<>(list);
        System.out.println("mySet1 = " + mySet1);
        System.out.println("mySet1.size() = " + mySet1.size());


    }
}