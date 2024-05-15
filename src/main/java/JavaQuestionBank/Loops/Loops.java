package JavaQuestionBank.Loops;

import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {

        String input = "Hello Welcome to TechPro Education";
        String[] result1 = input.split(" ");
        String[] result2 = input.split("X");
        System.out.println(result1.length + "-" + result2.length);
        System.out.println(Arrays.toString(result2));
        }
    }


