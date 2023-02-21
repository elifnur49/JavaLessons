package J06_SwitchStatement;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // Task-> Girilen hafta gün sayısına karşılık gelen gün adını print eden code create ediniz.
        // 1.gün Pazartesi olsun
        Scanner oku = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int Sayi=oku.nextInt();

        switch(Sayi){
            case 1:
            System.out.println("Pazartesi");
            break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;

            default:
                System.out.println("Hatalı giriş yaptınız.Tekrar deneyiniz");
        }
    }
}



