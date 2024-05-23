package JavaQuestionBank.Loops;

public class Loops02 {
    public static void main(String[] args) {
        //Take as input a fraction in the form a/b. Convert the same into lowest terms and print. (Lowest terms examples 3/12 = 1/4).
        int a=100;
        int b=200;

        for (int i=a; i>=1;i--){

            if (a%i==0 && (b%i)==0){
                a=a/i;
                b=b/i;
                System.out.println("a/b="+a+"/"+b);
                break;
            }
        }
    }
}
