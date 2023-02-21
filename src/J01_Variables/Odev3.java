package J01_Variables;

import java.util.Scanner;

public class Odev3 {
    /*
        TASK :
        Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        code create edip print ediniz.
                a) 3. bir variable kulanarak
        b) 3. bir variable kullanmadan

        input	: sayi1=20 ve sayi2=34;
        output  :  sayi1=34 ve sayi2=20

         */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int sayi1;
        int sayi2;
        int gecici;

        System.out.print("sayi1 giriniz : ");sayi1=scan.nextInt();
        System.out.print("sayi2 giriniz : ");sayi2=scan.nextInt();

        System.out.println("iki sayinin yer değişimi");
        gecici=sayi1;
        sayi1=sayi2;
        sayi2=gecici;

        System.out.println("1.sayi = "+ sayi1);
        System.out.println("2.sayi = "+ sayi2);

    }
}
