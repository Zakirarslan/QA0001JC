package JavaQuestionBank.OOP.Ahmet_Elektronik;
public class Telefon extends Elektronik {

    public Telefon(){
       System.out.println("Pro MAx");
        }
    public Telefon(String tip){
        super("Iphone",2012,"16GB");
        System.out.println(tip);    }
}
