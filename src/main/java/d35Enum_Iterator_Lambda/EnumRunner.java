package d35Enum_Iterator_Lambda;

import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {
        //        Cities c = new Cities(); we can not create an object from enum......


        //1) Reach out to constant in enum
        Cities c = Cities.İSTANBUL;
        System.out.println(c); //İSTANBUL

        //2) reach out to the CityName of constant data....
        String city = Cities.BURSA.getCityName();
        System.out.println("city = " + city); //city = Bursa

        //3 reach out to the PlateCode of constant data
        int pcode = Cities.ADANA.getPlateCode();
        System.out.println("pcode = " + pcode); // pcode = 1

        String postalCode=Cities.ANKARA.getPostalCode();
        System.out.println("postalCode = " + postalCode);


        //Ask user to enter plate code of city, and print city name on the console....
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter plate code of City");

        Cities[ ] cityInTurkey=Cities.values();

        int plate=input.nextInt();

        if (plate<1||plate>81){
            System.out.println("Invalid plate code");
        }else {

            for (Cities w:cityInTurkey ) {
                if (plate==w.getPlateCode()){
                    System.out.println(w.getCityName());
                }

            }

        }





    }

}
