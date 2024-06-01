package JavaQuestionBank.OOP.AhmetH_This;

public class KahveMakinesiRunner {
    public static void main(String[] args) {
        KahveMakinesi k1=new KahveMakinesi();
        System.out.println(k1.toString());
        k1.on();
        k1.kahveOgutme();
        k1.kahveYap();
        k1.off();
    }
}
