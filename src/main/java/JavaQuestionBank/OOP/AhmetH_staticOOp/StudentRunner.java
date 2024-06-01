package JavaQuestionBank.OOP.AhmetH_staticOOp;

public class StudentRunner {
    public static void main(String[] args) {
        Student s=new Student("Ali Can");
       // s.name="Veli Can";
        //Student.sayac=157;
        System.out.println("s.name = " + s.name);
       // System.out.println("s.sayac = " + Student.sayac);
        System.out.println("s.ogrenciNo = " + s.ogrenciNo);


        Student s1=new Student("Veli Can");
        System.out.println("s1.name = " + s1.name);
      //  System.out.println("s1.sayac = " + Student.sayac);
        System.out.println("s1.ogrenciNo = " + s1.ogrenciNo);
    }
}
