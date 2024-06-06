package d28Oop_Interface_Collections_Set;

public class AudiRunner {
    public static void main(String[] args) {


 //Brake b = new Brake(); interface can not be inistiated..

        AudiA5 a = new AudiA5();
        a.abs(5);
        a.eco();
        a.turbo();
        a.gas();
        System.out.println("Break.price = " + Break.price);

        System.out.println("Engine.price = " + Engine.price); //interfaceName + variableName

        System.out.println("Break.price = " + Break.price);
        a.run();
        ((Engine)a).run();
    }
}