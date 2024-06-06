package JavaQuestionBank.OOP.Ahmet_Polymorphism;

public class Cat extends Mammal {
    @Override
    public void feedWithMilk() {

        System.out.println("Cats feed their babies with milk");
    }

    Cat(){
        System.out.println("Cat Constractor");
    }
    Cat(String a){
        System.out.println(a);
    }

    public void meow(){
        System.out.println("Cats Meow...");
    }
}
