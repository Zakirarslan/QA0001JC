package d17Arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        int[]ages={24,65,42,44,31,19};
        Arrays.sort(ages);

        System.out.println(Arrays.toString(ages));
        String[]name={"Zakir","Zakia","Arslan","Arslaa",};
        Arrays.sort(name);
        System.out.println(Arrays.toString(name));
        System.out.println("======");

        int max=ages[0];
        int min=ages[0];
        for (int w:ages ) {
            max=Math.max(max,w);
            min=Math.min(min,w);
            }
        System.out.println("min = " + min);
        System.out.println("max = " + max);









    }
}
