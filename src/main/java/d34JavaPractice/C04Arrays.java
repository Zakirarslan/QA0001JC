package d34JavaPractice;

public class C04Arrays {
    public static void main(String[] args) {
        //Type code to find all array elements that contain the substring "abc".

        String[] arr = new String[]{"abctest", "hello", "xyzabc", "testabcxyz", "noabc"};

        for (String w:arr ) {
            if (w.contains("abc")){
                System.out.println(w);
            }
        }
    }
}
