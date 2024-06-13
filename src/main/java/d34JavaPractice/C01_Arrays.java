package d34JavaPractice;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        //    Count how many words start with 'a' or 'A' in a given String
        String s = "Apex is an object oriented programming language";

        String[]g=s.split(" ");
        System.out.println(Arrays.toString(g));
        int counter=0;

        for (String w:g) {
            if (w.startsWith("a")||w.startsWith("A")){
                counter++;
            }

        }
        System.out.println(counter);


    }
}
