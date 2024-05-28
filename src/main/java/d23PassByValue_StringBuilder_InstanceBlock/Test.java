package d23PassByValue_StringBuilder_InstanceBlock;

public class Test {
    public static void main(String[] args) {
        StringBuilder sb3 = new StringBuilder("Lonya");
        StringBuilder sb4 = new StringBuilder("Lava");

        int result = sb3.compareTo(sb4);
        System.out.println("result = " + result); //0


    }
}
