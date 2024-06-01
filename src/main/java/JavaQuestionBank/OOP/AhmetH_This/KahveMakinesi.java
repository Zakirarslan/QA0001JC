package JavaQuestionBank.OOP.AhmetH_This;

public class KahveMakinesi {
    String marka="Philips";
    String model="P01";
    String renk="Siyah";
    String kahveTuru="Kahve-Cekirdek";

    @Override
    public String toString() {
        return "KahveMakinesi{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", kahveTuru='" + kahveTuru + '\'' +
                '}';
    }

    public void kahveYap(){
        System.out.println("Makine Calisiyor");
        System.out.println("Kahve Hazirlaniyor");
        System.out.println("Kahve Hazir");
        System.out.println("Afiyet olsun <3");
    }
    public void on(){
        System.out.println("Makine baslatiliyor...");
        System.out.println("Su isitiliyor...");
    }
    public  void off(){
        System.out.println("Makine sogutuluyor");
        System.out.println("Makine temizleniyor");
        System.out.println("Bye Bye...");
    }
    public String kahveOgutme(){
        System.out.println("Cekirdekler ogutuluyor...");
        System.out.println("toz kahve kullanima hazir");
        System.out.println("toz kahve kullanima hazir");
        return "Toz Kahve";
    }

}
