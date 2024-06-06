package JavaQuestionBank.OOP.AhmetH_Instance;

public class InstanceBlock3 {
    // Bir araba fabrikasında her araba siyah renkli ve yakit tipi benzin olsun

public String renk;
public String yakitTuru;
public String ruhsat;

    @Override
    public String toString() {
        return "InstanceBlock3{" +
                "renk='" + renk + '\'' +
                ", yakitTuru='" + yakitTuru + '\'' +
                ", ruhsat='" + ruhsat + '\'' +
                '}';
    }

    {
        this.renk="siyah";
        this.yakitTuru="Benzin";

    }
    InstanceBlock3(){
        System.out.println("renk = " + renk);
        System.out.println("yakitTuru = " + yakitTuru);

    }
    InstanceBlock3(String renk, String yakitTuru){
        this.renk=renk;
        this.yakitTuru=yakitTuru;
    }
    InstanceBlock3(String renk, String yakitTuru,String ruhsat){
        this.renk=renk;
        this.yakitTuru=yakitTuru;
        this.ruhsat=ruhsat;
    }
    InstanceBlock3(String ruhsat){
        this.ruhsat=ruhsat;

    }




}
