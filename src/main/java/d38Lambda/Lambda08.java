package d38Lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda08 {
    public static void main(String[] args) {
        List<String> myList=new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zaynep");
        myList.add("Mustafa");
        System.out.println("myList = " + myList);
        exceptE(myList);



        }

    public static void exceptE(List<String> myList) {

        myList.stream().filter(t -> !t.startsWith("E")).forEach(t-> System.out.println(t+", "));


    }
}
