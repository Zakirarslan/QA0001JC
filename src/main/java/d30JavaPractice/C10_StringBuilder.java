package d30JavaPractice;

public class C10_StringBuilder {
    public static void main(String[] args) {

     // - Create a StringBuilder object with a capacity of 7.
        StringBuilder sb = new StringBuilder(7);

     //- Print the Capacity and Length values.
        System.out.println("sb.length() = " + sb.length());
        System.out.println("sb.capacity() = " + sb.capacity());

     //- Append the string "hava güzel" to this object and print it.
        sb.append("hava güzel");
        System.out.println("sb = " + sb);

     //- Remove the space in the middle.
        sb.delete(4,5);
        System.out.println("sb = " + sb);

     //- Reverse the data.
        sb.reverse();
        System.out.println("sb = " + sb);

     //- Delete the last 4 characters of the data.
        sb.delete(sb.length()-4,sb.length());
        System.out.println("sb = " + sb);

     //- Reverse the data again.
        sb.reverse();
        System.out.println("sb = " + sb);

     //- Append the string "Java " to the data.
        sb.insert(0,"Java ");
        System.out.println("sb = " + sb);













    }





}
