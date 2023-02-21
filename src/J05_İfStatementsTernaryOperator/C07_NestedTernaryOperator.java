package J05_İfStatementsTernaryOperator;

import java.util.Scanner;

public class C07_NestedTernaryOperator {
    public static void main(String[] args) {
       /*
      TASK :
       Girilen bir pozitif tamsayı  4 basamaklı ise  "4 Basamaklı"
      degilse çift olup olmadigini kontrol edip. Çift ise "4 basamaklı olmayan çift sayı"
      degilse "4 basamaklı olmayan tek sayı"  print eden code create ediniz.

       */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir  pozitif tamsayi giriniz");
        int say1= scan.nextInt();
        //  (sayi>999 && sayi<10000) ? (): ? (); formülü
        System.out.println((say1>999 && say1<10000)? "4 Basamaklı": say1% 2 == 0 ? " 4 Basamaklı olmayan cift sayi ": " 4 basamaklı olmayan tek sayi");

    }
}
