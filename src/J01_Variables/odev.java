package J01_Variables;

import java.util.Scanner;

public class odev {
   public static void main(String[] args) {
    /*
       int x = 30;
       int y = 10;
       int alininYasi = x;
       int velininYasi = y;

       x = x + y;
       y = x - y;
       x = x - y;

       System.out.println("Alinin yasi = " + x);
       System.out.println("Velinin yasi = " + y);

       */
         System.out.println("Hello world!");
         int Rose =300;
         int Buket=10;
        int Price=10;
        System.out.println("totaly : " +(300/10)*10);


    Scanner scan=new Scanner(System.in);

    int sayi1;
    int sayi2;
    int gecici;

        System.out.println("sayi1 giriniz");sayi1=scan.nextInt();
        System.out.println("sayi2 giriniz");sayi2=scan.nextInt();

        System.out.println("Degerler degisrtiriliyor");
    gecici=sayi1;
    sayi1=sayi2;
    sayi2=gecici;

        System.out.println("1.sayi="+sayi1);
        System.out.println("2.sayi="+sayi2);






   }

}