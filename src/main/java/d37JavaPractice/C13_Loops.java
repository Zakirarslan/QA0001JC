package d37JavaPractice;

import java.util.Scanner;

public class C13_Loops {
    public static void main(String[] args) {

        //get a word from user.
        //The loop should continue Until the character 'c' is encountered in the word.
        // Count the number of 'a' characters in the word up to that point.


        Scanner input = new Scanner(System.in);

        int count = 0;
        String inputWord = null;
        boolean containC=false;

        do {
            System.out.println("Please enter word, press enter between entries");
            inputWord = input.next();
            for (int i = 0; i < inputWord.length(); i++) {
                char c = inputWord.charAt(i);
                 if (c == 'a' || c == 'A') {
                    count++;

                } else if (inputWord.contains("c")) {
                     containC=true;

                 }
            }
            System.out.println("Total number of A " + count);

        } while (containC==false);
    }
}
