package JavaQuestionBank.OOP.Ahmet_Car;

public class Honda extends Car{
    String model="Civic";
    public  int year=2023;

    public Honda (){
       //System.out.println("Honda Civic");
        System.out.println("Super.model = "+super.model);
        System.out.println("this.year = "+this.year);
        System.out.println("Civic");
        }
    public Honda(String model){super();
        System.out.println(model);

    }

}
