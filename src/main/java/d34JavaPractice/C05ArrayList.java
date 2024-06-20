package d34JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05ArrayList {
    public static void main(String[] args) {

        //   Decrease the value of every element that is greater than 20 by 5 in a list. If the element is 20 or less,
        //   multiply it by 2.
        //   [20, 30, 25, 20, 40]
        List<Integer> list = Arrays.asList(20, 30, 25, 20, 40);

        for (int i=0;i<list.size();i++) {
            if (list.get(i) > 20) {
                list.set(i,list.get(i)-5);
               } else {
                list.set(i,list.get(i)*2);
            }
        }
        System.out.println(list);
    }
}
