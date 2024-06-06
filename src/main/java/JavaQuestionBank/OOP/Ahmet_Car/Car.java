package JavaQuestionBank.OOP.Ahmet_Car;

public class Car extends Vehicle {
     public String model="Accord";
     public int year=2024;
        public Car(){
            this("H.Back");

            //super("Honda",2020,"Lpg");
            System.out.println("Sedan");                             }

    public Car(String tip){
          this(5);
            //super("Honda",2024,"Elektrikli");

            System.out.println(tip+",");    }
    public Car(int i) {
        System.out.println("Parametreli Constractor  Car calıstı ");    }
}
