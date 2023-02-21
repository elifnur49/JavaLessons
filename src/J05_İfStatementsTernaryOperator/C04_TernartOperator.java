package J05_İfStatementsTernaryOperator;

import java.util.Scanner;

public class C04_TernartOperator {
    public static void main(String[] args) {
     // girilen br tamsayının 2 veya daha fazla basamaklı olmasını kontrol eden code cretare ediniz


        Scanner scan=new Scanner(System.in);
        System.out.println(" bir tamsayı giriniz:");
        int sayi= scan.nextInt();
        System.out.println(sayi > 9||sayi<-9 ? "sayi iki veya daha fazla basamaklı ": "sayi tek basamaklı");

        String sonuc=( sayi > 9 ||sayi<-9) ? " sayi iki veya daha fazla basamaklı ": "sayi tek basamaklı";
        System.out.println(sonuc);

       // System.out.println((sayi < 10 && sayi > -10) ? "agıdeşş senin sayı TEK BASAMAKLI " : "agıdeşşş senin sayı ENAZ 2 BASAMAKLI ");

    }
}
