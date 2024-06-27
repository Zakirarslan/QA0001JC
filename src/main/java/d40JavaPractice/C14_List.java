package d40JavaPractice;

import java.util.ArrayList;
import java.util.List;

public class C14_List {
    public static void main(String[] args) {
          /*
      Create a list.
Add numbers from 1 to 15.
Then, double the elements that are greater than 10.
Example:
Input: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15
Output: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 22, 24, 26, 28, 30
       */

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 16; i++) {
            if (i > 10) {
                list.add(i * 2);
            } else {
                list.add(i);
            }
        }

        System.out.println(list);

    }

}
