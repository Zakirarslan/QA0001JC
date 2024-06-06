package d28Oop_Interface_Collections_Set;

public class AudiA5 implements Break, Engine, AirConditioner {
    @Override
    public void abs(int a) {
        System.out.println("Audi A5 uses an abs braking system");
    }

    @Override
    public void eco() {
        System.out.println("Audi  A5 uses eco mode");
    }

    @Override
    public void turbo() {
        System.out.println("Audi A5 uses turbo");

    }

    @Override
    public void gas() {
        System.out.println("Audi A5 uses gas");

    }

    @Override
    public void digital() {
        System.out.println("Audi A5 uses digital screen");
    }

    @Override
    public void run() {

    }
    void speed (){

        System.out.println("speed");
    }
}
