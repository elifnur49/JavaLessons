package J05_İfStatementsTernaryOperator;

import java.util.Scanner;

public class C08_TernaryOperator {
    public static void main(String[] args) {
        /*
Task-> Girilen  ürün miktarını ve ürünün birim fiyatını için Eğer urun miktarı 100 den fazla ise
      %33  indirim yapıp  ödemesi gereken toplam miktarı print eden code create ediniz.
*/
        Scanner scan=new Scanner(System.in);

        System.out.println("Ürün miktarını giriniz");
        double urunMiktari= scan.nextDouble();

        System.out.println("Ürün fiyatını giriniz");
        double birimFiyati= scan.nextDouble();

        double fatura= urunMiktari>100 ?( urunMiktari*birimFiyati*0.67):urunMiktari*birimFiyati;
        System.out.println("fatura = " + fatura);

    }
}
