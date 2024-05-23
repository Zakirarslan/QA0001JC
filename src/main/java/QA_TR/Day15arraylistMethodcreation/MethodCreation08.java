package QA_TR.Day15arraylistMethodcreation;

public class MethodCreation08 {
    public static void main(String[] args) {

        String renk = "Kirmizi";
        String marka = "Brother";
        String model = "J105";
        String str="Java candir gerisi heyecan";
        yazdirma(str);

    }

    private static String yazdirma(String neYazdirilacak) {
        System.out.println("Alinan bilgi yaziciya yonlendiriliyor...");
        System.out.println("Alinan bilgi A4 kagidina yazdiriliyor...");
        System.out.println("Alinan bilgi A4 kagidina yazdirildi...");
        System.out.println("neYazdirilacak = " + neYazdirilacak);
        return neYazdirilacak;


    }


}
