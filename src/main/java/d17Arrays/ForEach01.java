package d17Arrays;

import java.util.Arrays;

public class ForEach01 {
    public static void main(String[] args) {
        String []cityes={"Berlin","Izmir","Askhabad","Lebap","Moscow"};

        System.out.println(Arrays.toString(cityes));
        System.out.println("===============");

        for (int i=0;i<cityes.length;i++)

            System.out.println(cityes[i]);
        System.out.println("===============");

        for (String c:cityes) {
            System.out.println(c);

        }
        int []in={2,3,5,6,1,0};
        for (int l:in ) {
            System.out.println(l);

        }
    }
}
