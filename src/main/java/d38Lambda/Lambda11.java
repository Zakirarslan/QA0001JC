package d38Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda11 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");
        System.out.println("Original: " + myList);
        List<String> newList = ss(myList);

        printMethod(newList);



    }

    private static void printMethod(List<String> newList) {
        for (String w: newList ) {
            System.out.print(w+" ");

        }
    }

    public static List<String> ss(List<String> myList){ //[Ali, Elif, Yusuf, Elif, Zeynep, Mustafa]

        return myList.stream().sorted().map(t-> t.toLowerCase()).collect(Collectors.toList());


    }
}
