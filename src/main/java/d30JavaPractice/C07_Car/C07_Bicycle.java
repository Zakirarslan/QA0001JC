package d30JavaPractice.C07_Car;

import JavaQuestionBank.OOP.Ahmet_Car.Vehicle;

public class C07_Bicycle implements C07_Vehicle {
    @Override
    public void start() {
        System.out.println("the bicycle has started");
    }

    @Override
    public void stop() {
        System.out.println("the bicycle has stopped");

    }
}
