package JavaQuestionBank.OOP.Turkce;


import java.util.Arrays;

import static JavaQuestionBank.OOP.Turkce.ClassA.toplama;

public class Methods {
    public static void main(String[] args) {
        String renk="Beyaz";
        String marka="Brother";
        String model="J105";
        String str="Java candır gerisi heyecan";
       //String b=yazdirma(model);
      // System.out.println(str);
      //  tarama(str);
      //  System.out.println(str);

       //int toplam=toplama(5);
       //System.out.println(toplam);
       int arr[]={1,2,3,4,5,6};
      // elemandegistir(arr);
        refdegistir(arr);

       System.out.println(Arrays.toString(arr));

    }

    private static void refdegistir(int[] arr) {
        arr=new int[2];
        arr[0]=9;
        arr[1]=9;
    }

    private static void elemandegistir(int[] arr) {
        arr[4]=0;
        arr[5]=0;

    }

    public static String tarama(String a,String b) {
        System.out.println(a+" markasinin scan ozelligi "+ b+" gibidir");

        return b;
    }
    public static void tarama(String str) {

        str="Tek parametreli";



    }

    public static String yazdirma(String a) {
        System.out.println("Alinan bilgi yazdiriliyor");
        a=a+"-999";

        return a;

    }



}
