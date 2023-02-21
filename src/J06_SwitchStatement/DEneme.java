package J06_SwitchStatement;

import java.util.Scanner;

public class DEneme {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir ay ismi giriniz ");
        String ayİsim= scan.next().toLowerCase();
        switch (ayİsim){
            case "ocak":
            case "mart":
            case "mayıs":
            case "temmuz":
            case "agustos":
            case "ekim":
            case "aralık":
                System.out.println("girilen ay 31 gündür");
                break;
            case "nisan":
            case "haziran":
            case "eylul":
            case "kasım":
                System.out.println("girilen ay 30 gündür");
                break;
            case "subat":
                System.out.println("girilen ay 28 gündür");
                System.out.println("artık yıllarda 29 gündür");

                break;
            default:
                System.out.println("Hatalı giriş yaptınız.");
    }
}
    }