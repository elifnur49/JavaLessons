package J05_İfStatementsTernaryOperator.Tasks;

import java.util.Scanner;

public class Odev_13 {
    public static void main(String[] args) {
        /*
          TASK -> girilen iki sayiyi seçilen dört işlemden birine uygulayıp sonucu print eden code crate ediniz

         */
        Scanner sc = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz : ");
        int sayi1 = sc.nextInt();

        System.out.print("2. sayıyı giriniz : ");
        int sayi2 = sc.nextInt();

       System.out.println("Toplama için -> 1 seciniz \nÇıkarma için -> 2 seçiniz \nÇarpma için -> 3 seciniz \nBölme için -> 4 seciniz");
        int secim = sc.nextInt();

        if (secim == 1) {
            System.out.println("Toplama işlemi : " + sayi1 + " + " + sayi2 + "=" + (sayi1 + sayi2));
        } else if (secim == 2) {
            System.out.println("Çıkarma işlemi : " + sayi1 + " - " + sayi2 + "=" + (sayi1 - sayi2));
        } else if (secim == 3) {
            System.out.println("Çarpma işlemi : " + sayi1 + " * " + sayi2 + "=" + (sayi1 * sayi2));
        } else if (secim == 4) {
            System.out.println("Bölme işlemi : " + sayi1 + " / " + sayi2 + "=" + (sayi1 / sayi2));

        } else System.out.println("Yanlış seçim yaptınız.");


    }
    }



