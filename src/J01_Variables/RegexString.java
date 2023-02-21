package J01_Variables;

import java.util.Scanner;

public class RegexString {

        private int maas;
        private double maasOrtalama;

        public static void main(String[] args) {
        maasOrtalamaHesaplama(8000,13000);
        }
    private static void maasOrtalamaHesaplama(int maas1, int maas2){
        System.out.println("maasOrtalama :" + (maas1+maas2) / 2 );



       /*
        TASK :
        Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        code create edip print ediniz.
                a) 3. bir variable kulanarak
        b) 3. bir variable kullanmadan

        input	: sayi1=20 ve sayi2=34;
        output  :  sayi1=34 ve sayi2=20

         */
// Task01
       int sayi =100;
        System.out.println("sayi = " + sayi);

    // Task Degeri 650 olan bir int olusturup ekrana yazdırınız.


    int sayi1= 650;
        System.out.println("sayi1 = " + sayi1);

    // Task ondalıklı bir sayıyı consolda yazdırın.

    double num= 13.45;
        System.out.println("num = " + num);
    // task02
    Scanner scan= new Scanner(System.in);
        System.out.println("Sayı yazınız: ");
    double sayi2=scan.nextDouble();
        System.out.println("sayi2 = " + sayi2);

    //task03
    //    System.out.println("Babanın yası : ");
    //    int baYasi=scan.nextInt();
    //    System.out.println("Evladın yası :");
    //    int eYasi=scan.nextInt();
    //    int yasFarklar= baYasi-eYasi;
    //   System.out.println("Yas Farkı = " + yasFarklar);

    String name="Ahmet";
    String sName= "Hacıoglu";
    String bosluk=" ";
    String fullname= name + " " +sName;
    String fullname2= sName + " "+ name;
    int sayi3=0;
    fullname= fullname + bosluk + sayi3 + bosluk;
    //  System.out.println("fullname = " + fullname);
    // System.out.println("fullname 2= " + fullname2);

    char ch ='A';
    fullname= fullname + ch;
        System.out.println("fullname = " + fullname);
        System.out.println(ch+sayi3);


    }
}