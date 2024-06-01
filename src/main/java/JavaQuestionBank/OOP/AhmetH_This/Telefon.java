package JavaQuestionBank.OOP.AhmetH_This;

public class Telefon {
    String marka;
    String model;
    String renk;
    int kameraSayisi;

    @Override
    public String toString() {
        return "Telefon{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", kameraSayisi=" + kameraSayisi +
                '}';
    }

    public  Telefon(String marka, String model, String renk, int kameraSayisi){
        this.marka=marka;
        this.model=model;
        this.renk=renk;
        this.kameraSayisi=kameraSayisi;

    }
}
