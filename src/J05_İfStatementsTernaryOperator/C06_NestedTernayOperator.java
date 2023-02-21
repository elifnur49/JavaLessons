package J05_İfStatementsTernaryOperator;

import java.util.Scanner;

public class C06_NestedTernayOperator {
    public static void main(String[] args) {
         /*
       TASK :
      Girilen sayi 0 dan buyuk esit ise 10 dan kucukluğunu kontrol ediniz.
      10 dan kucuk ise  "Rakam" degilse "Pozitif Sayi" ,
      Sayi 0'dan kucuk ise "Negatif Sayi"  print eden code create ediniz
       */
        Scanner scan = new Scanner(System.in);
        System.out.println(" Bir tamsayı giriniz:");
        int sayi = scan.nextInt();
        System.out.println((sayi >= 0) ? sayi < 10 ? "Rakam" : "Pozitif Sayi" : "negatif Sayi");

      //TRICK->ne kaaa kofte o kaaa ekmek == ne kadar soru işareti (?) o kadar  iki nokta (:)
      /*
       show business Trick-> Java'da "nested" bloklar app.run edildiginde  app.yavaşlatır.
       (Time Complexity),dolayısıyla nested bloklar mecbur kalmadıkca tercih edilmez.
      */

        /*
      TASK :
       Girilen bir pozitif tamsayı  4 basamaklı ise  "4 Basamaklı"
      degilse çift olup olmadigini kontrol edip. Çift ise "4 basamaklı olmayan çift sayı"
      degilse "4 basamaklı olmayan tek sayı"  print eden code create ediniz.

       */
        System.out.println("Bir  pozitif tamsayi giriniz");
        int say1= scan.nextInt();
      //  (sayi>999 && sayi<10000) ? (): ? (); formülü
        System.out.println((say1>999 && say1<10000)? "4 Basamaklı": say1% 2 == 0 ? " 4 Basamaklı olmayan cift sayi ": " 4 basamaklı olmayan tek sayi");

    }
}
