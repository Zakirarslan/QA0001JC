package JavaQuestionBank.OOP.AhmetH_staticOOp;

public class Student {
    public static long sayac=1000;
    public String name="Ali Can";
    public long ogrenciNo;
    public Student(){

    }
    public Student(String name){
        this.ogrenciNo=sayac;
        this.sayac++;
        this.name=name;
    }



}
