package d18Arrays_MultidimensionArray;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {
        int[]a=new int[3];
        a[0]=5;
        a[1]=6;
        a[2]=4;

        int[]b=new int[3];
        b[0]=6;
        b[1]=5;
        b[2]=4;
        Arrays.sort(a);
        Arrays.sort(b);


        boolean check= Arrays.equals(a,b);
        System.out.println("check = " + check);

        String z="Zakir";
        String za=z;
        String zak="Zakir";






    }
}
