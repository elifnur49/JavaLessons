package J06_SwitchStatement;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        //Task->  Girilen bir tamsayının onlar basamağının harf karakteri ile  print eden code create ediniz.

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayi giriniz =");
        int sayi = oku.nextInt();
        int onlarBasamagi = (sayi / 10) % 10;

        switch (onlarBasamagi) {

            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("ıkı");
                break;
            case 3:
                System.out.println("uc");
                break;
            case 4:
                System.out.println("dort");
                break;
            case 5:
                System.out.println("bes");
                break;
            case 6:
                System.out.println("altı");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
            default:
                System.out.println("tekrar deneyiniz.");
        }

    }

}

