package JavaQuestionBank.Arrays;

import java.util.Arrays;

public class Test04 {
    public static void main(String[] args) {
        String str= "Javaisalsoeasy";
        String str3="";


        int lengthOfNewArr=0;
       for (int i=0; i<str.length(); i++) {
           char c=str.charAt(i);
         if (str.indexOf(c)!=str.lastIndexOf(c)){
             str3= str3+str.charAt(i);
         }
     }
        for (int i=0;i<str3.length();i++) {
            char k=str.charAt(i);
         //  if (str3.{
         //      int inexToDelete=str3.lastIndexOf(k);
         //      str3.replace("k","");
         //  }

        }



        String []arr=str3.split("");
        System.out.println(Arrays.toString(arr));


    }
}
