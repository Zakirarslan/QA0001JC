package d30JavaPractice.C07_Car;

public class C07_Car implements C07_Vehicle {

    @Override
    public void start() {
        System.out.println("the car has started");

    }

    @Override
    public void stop() {
        System.out.println("the car has stopped");

    }
}
