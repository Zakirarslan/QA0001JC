package d30JavaPractice.C07_Car;

public class C07_Runner {
    public static void main(String[] args) {
        C07_Car car=new C07_Car();

        car.start();
        car.stop();

        C07_Bicycle bicycle=new C07_Bicycle();

        bicycle.start();
        bicycle.stop();
    }
}
