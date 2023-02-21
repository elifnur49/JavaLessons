package J03_ScannerClass;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
   //    System.out.print("Alinin Yasini giriniz: ");
   //   int alininYasi = scan.nextInt();
   //    System.out.print("Velinin Yasini giriniz :");
   //   int velininYasi = scan.nextInt();
   //   int temp = alininYasi;
   //   alininYasi = velininYasi;
   //   velininYasi = temp;


     //   System.out.println( "  ***    ");
     //   System.out.println("alininYasi = " + alininYasi);
     //   System.out.println("velininYasi = " + velininYasi);

        System.out.println("Alinin full adını  yazınız : ");
        String name = scan.nextLine();

        System.out.println("Alinin tüm adi  : " + name);

        byte hogluYasi;
        System.out.println("Alinin hala oglu yası : ");
        hogluYasi=scan.nextByte();
        System.out.println("hogluYasi = " + hogluYasi);

    }
}
