package JavaQuestionBank.StringBuilder;

public class Test01 {
    public static void main(String[] args) {
        StringBuilder sb3 = new StringBuilder("Learn");
        System.out.println("Before trim: " + sb3.capacity());
        sb3.trimToSize();
        System.out.println("After trim: " + sb3.capacity());
    }


}
