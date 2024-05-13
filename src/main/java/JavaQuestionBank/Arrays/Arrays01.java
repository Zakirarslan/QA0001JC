package JavaQuestionBank.Arrays;

import java.util.Arrays;
import java.util.Random;

public class Arrays01 {
    public static void main(String[] args) {
        //içşnde 200 tane 1000'den küçük poziti tamsayi olan bir array oluşturun

        int [] array=new int[200];
        Random rndm=new Random();
        for (int i=0;i<200;i++){
            int sayi= rndm.nextInt(1001);
            array[i]=sayi;


        }
        System.out.print(Arrays.toString(array)+", ");


    }

}
