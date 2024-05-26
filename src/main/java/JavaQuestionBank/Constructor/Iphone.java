package JavaQuestionBank.Constructor;

public class Iphone {


   public String marka="Apple";
    String model= "iphone";
    int year=2023;
    boolean Cam4k=false;

    public Iphone(String marka,String model,int year,boolean Cam4k){

      this.marka=marka;
      this.model=model;
      this.year=year;
      this.Cam4k=Cam4k;
        System.out.println("marka = " + marka);
    }
    public Iphone(String marka,String model,int year){

        marka="Apple";
        model="ProMax";
        year=2024;

    }



    @Override
    public String toString() {
        return "Iphone{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", Cam4k=" + Cam4k +
                '}';
    }



}
