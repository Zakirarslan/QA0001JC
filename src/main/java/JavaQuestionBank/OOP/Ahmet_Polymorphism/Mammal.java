package JavaQuestionBank.OOP.Ahmet_Polymorphism;

public class Mammal extends Animal {
    Mammal(){
        System.out.println("Mammal constractor");
    }
    public void feedWithMilk(){
        System.out.println("Mammals feed their babies with milk");
    }
}
