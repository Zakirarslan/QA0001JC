package d34JavaPractice;

import java.util.LinkedList;
import java.util.List;

public class C02List {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(50);
        int sum=0;
        for (int i = 0; i <= list.size() - 1; i++)
        {

            if (list.get(i) == 20) {
                list.set(i, 2020);
            }
            sum+=list.get(i);


        }
        System.out.println(list);
        System.out.println(sum);
    }




}
