package d37JavaPractice;

import java.util.Scanner;

public class C14_Loops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a word");
        String word = scan.nextLine();
        String[] split = word.split("");
        int countA = 0;
        for (int i = 0; i < split.length; i++) {
            if (split[i].equalsIgnoreCase("a")) {
                countA++;
            }
            if (split[i].equalsIgnoreCase("c")) {
                break;
            }

        }
        System.out.println("countA: " + countA);

    }
}


