package JavaQuestionBank.OOP.AhmetH_Animals;

public class Mammal extends Animal{
    public void tweet(){
        System.out.println( "Birds tweet...");
    }

    Mammal(){
        System.out.println("Mammal constractor");
    }
    public void feedWithMilk(){
        System.out.println("Mammals feed their babies with milk");
    }
}
