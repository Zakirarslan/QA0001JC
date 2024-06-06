package JavaQuestionBank.OOP.AhmetH_OOP;

public class Dog2 extends Animal2 {
    public int weight=13;

    @Override
    public Animal2 create() {
        return new Dog2();
    }

    public void eat(){

        System.out.println("Dogs eat meat...");
    }
    private void eat(String string){
        System.out.println("Dogs eat"+string);
    }
    private void eat(int a){
        System.out.println("Dogs eat "+a+" Meat");
    }


}
