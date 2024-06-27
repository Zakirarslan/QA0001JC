package d38Lambda;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda12 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");
        myList.add("Solomon");
        System.out.println("Original: " + myList);
        //Exapmle: Create a method that prints the elements of a list to console without duplicates in lowercase.......
        //And sorted by their lenght, from shortest to longest...

        sortElementsWithLenght(myList);
    }


    public static void sortElementsWithLenght(List<String> myList){

        myList.stream().distinct().map(t-> t.toLowerCase()).
                sorted().sorted(Comparator.comparing(t-> t.length())).
                forEach(t -> System.out.print(t + " "));  //ali elif yusuf jesus solomon mustafa

    }
}
