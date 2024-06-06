package JavaQuestionBank.OOP.AhmetH_OOP;

public class Animal2 {
    public  int weight=12;
     void eat(){
        System.out.println("Animals eat...");
    }
    public void drink() {
        System.out.println("Animals Drink ");
    }
    public Animal2 create(){
         return  new Animal2();
    }
}
