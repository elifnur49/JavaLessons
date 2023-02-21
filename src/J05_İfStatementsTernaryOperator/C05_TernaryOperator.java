package J05_İfStatementsTernaryOperator;

import java.util.Scanner;

public class C05_TernaryOperator {
    public static void main(String[] args) {
   // Task-> Girilen bir tamsayının cift ise yarisini degilse  "agıdeşşş tek'in yarısı tam olmazz" print eden code create ediniz
        Scanner scan=new Scanner(System.in);
        System.out.println(" Bir tamsayı giriniz:");
        int sayi= scan.nextInt();
        System.out.println(sayi % 2 == 0 ? sayi/2 : "agıdeşşş tek'in yarısı tam olmazz");

        Object sonuc = sayi%2 ==0 ? sayi/2 : "tek sayını yarısı tam olmaz";
        System.out.println("sonuc" +sonuc);
    }
}
