package J05_İfStatementsTernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperator {
    public static void main(String[] args) {
        /*
        Ternary ije yapılan tum actionlar if-else blok ıle de yapılır.
        Ternary blok code daha clean daha okunabilir ve anlaşılabilir olması ıcın tercıh edılır.
        Ternary blok içinde komplex code yerine daha basic ve dogrudan sonuc üreten code'lar bulunur.
         */

        //Task-> girilen bir tamsayının tek-cift olmasını kontrol eden code create ediniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir tamsayı giriniz:");
        int sayi= scan.nextInt();

       if(sayi%2==0){
           System.out.println("sayı cift");
       } else
           System.out.println("sayı tek");


       System.out.println("  ***   Ternary blok   ***   ");

// condition(sart) ? (if-ise) sart true olunca yapılacak action : (else-degilse) sart false olunca yapılacak
        String sonuc = sayi % 2 == 0 ? "sayi Cift" : "sayı Tek";// bu komutun cıktıdı String Type variabledir.
        System.out.println("sonuc = " + sonuc);
        System.out.println(sayi % 2 == 0 ? "sayi Cift" : "sayı Tek");

        /*
        Trick-> ternary operator action sonucu true veya false sonucuna göre bir cıktı verir.
        eger bu cıktı data type' na göre bir variable atanmazsa CTE verir.
        cözüm olarak ya print komuta alınmalı ya da bir varaible atanmalı
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir yıl giriniz : ");
        int yil = sc.nextInt();

        String sonc=(yil % 4 == 0 && yil % 100 != 0 || yil % 400 == 0 ? "Girdiğiniz yil ARTIK YIL'dır" : "Girdiğinz yıl artık yıl değildir.");
        System.out.println(sonc);

        // Task-> girilen bir sayının pozitif negatif olmasını

        System.out.println("lütfen bir tamsayı giriniz:");
        int tamSay= scan.nextInt();
        String a=(sayi > 0 ? "sayi pozitiftir ": "sayi pozitif degildir");

        String snc=( tamSay > 0 ) ? " sayi pozitiftir ": "sayi pozitif degildir";
        System.out.println(snc);

      // TASK-> Girilen iki tamsayının buyugunu prınt eden code creatre ediniz

        System.out.println("lütfen 1. tamsayı giriniz:");
        int sayi1= scan.nextInt();
        System.out.println("lütfen 2. tamsayı giriniz:");
        int sayi2=sc.nextInt();
        String aSayi= sayi1>sayi2 ? "büyük sayı" : "Kücük sayı";
        System.out.println("aSayi = " + aSayi);
        System.out.println(sayi1>sayi2 ? " büyük sayı" : "Kücük sayı");

        //TASK04->Girilen iki tam sayının isaretleri farklı ise toplamını degilse "agam Dewamke" print eden code create ediniz
        System.out.println("lütfen 1. tamsayı giriniz:");
        int num1= scan.nextInt();
        System.out.println("lütfen 2. tamsayı giriniz:");
        int num2=sc.nextInt();
      // String number=(( num1>0 && num2<0 || num1>0 && num2>0 ? String.valueOf(num1+num2) : "agam dwwamkee"));

       Object durum= num1>0 && num2<0 || num1<0 && num2>0 ? num1+num2 : "agam dwwamkee";
        System.out.println(durum);
        // Java Class'ların hepsini kapsayan (parent) Object Class(H.z Adem) denir.

        Object bambaskaBişey = ((num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0)) ? (sayi1 + sayi2) : "agam DEWAMKEEE";
        System.out.println("TASK04 : "+bambaskaBişey);
    }
}
