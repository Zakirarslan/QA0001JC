package d37JavaPractice;

import java.util.ArrayList;
import java.util.List;

public class C11_StrinBuilder {
    public static void main(String[] args) {
        //  Write a code that takes a sentence and reverses the order of the words in the sentence by using StringBuilder.
        // your code should maintain the spaces between words. If the input sentence is empty, print "The sentence is empty".


        String sentence = "Java is a versatile programming language";

        if (sentence.isEmpty()){
            System.out.println("The sentence is empty");

        }
        StringBuilder sb = new StringBuilder();
        String s="";
        String[] arr=sentence.trim().split(" ");

       for (int i= arr.length-1; i>0;i--){
           s=arr[i]+" ";
           sb.append(s);


       }
        System.out.println("sb = " + sb);


    }
}
