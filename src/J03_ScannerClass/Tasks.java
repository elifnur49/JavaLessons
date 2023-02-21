package J03_ScannerClass;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args){
   /// Task 1-
      int sayi =650;
      System.out.println("sayi = " + sayi);

   // Task 2-
         boolean dogruMu= true;
        System.out.println("dogruMu = " + dogruMu);

    //Task 3-
        double piSayisi= 22/7;
        System.out.println("piSayisi = " + piSayisi);

        // Task 4-
     System.out.println("F\nL\nI\nF\nN\nU\nR");

       // Task 5-
     System.out.println("- Hayat \"Java\" ile güzel -");

     // Task 6-
     System.out.println("- Hayat \n\"Java\"\n ile\n güzel -");

     // Task 7-
      byte maxByte = Byte.MAX_VALUE;
      byte minByte = Byte.MIN_VALUE;
      System.out.println("maxByte = " + maxByte);
      System.out.println(" minByte= " +minByte );

   // Task 8-
        Scanner scan= new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi1 =scan.nextInt();
        int sayininKaresi = sayi1*sayi1;
      System.out.println("sayininKaresi = " + sayininKaresi);

    // Task 9-
        String name= "Elifnur";
        String sname = "inan";
        String city = "İstanbul";
        String age = "45";
        String bilgilerim = name+" " +sname+" " +city+" "+age;
        System.out.println("Bilgilerim = " + bilgilerim);

// Task 10-
        System.out.print("Vize notunuzu giriniz: ");
        int vize = scan.nextInt();
        System.out.print("Final notunu giriniz: ");
        int fnal = scan.nextInt();

        double not = (vize * 0.4) + (fnal * 0.6);
        System.out.println("not = " + not);

// Task 11-
        char ch ='E';
        char ch2= 'İ';
        char ch3 ='F';
        char ch1 ='L';

        int asciikod = ch;
        int asciikod1=ch1;
        int asciikod2 = ch2;
        int asciikod3 = ch3;
        System.out.println(ch + " Harfinin Kodu:" + asciikod);
        System.out.println(ch1 + " Harfinin Kodu:" + asciikod1);
        System.out.println(ch2 + " Harfinin Kodu:" + asciikod2);
        System.out.println(ch3 + " Harfinin Kodu:" + asciikod3);

// Task 12 : Ekrandan integer bir değer okutunuz
// a) bunu long a çevirin  b) bu değeri byte a çevirin

        int num2=45;
        long yeni1=(long) num2;
        System.out.println(yeni1);


// Task 13 : Task 12 deki int değeri stringe çevirin

        int num= 45;
        String yen1=String.valueOf(num);
        System.out.println(yen1);



// Task 14 : Klavyeden girilen string bir ifadeyi int e çevirin
        //a) doğru değer girin ,   b)yanlış değer girin



// Task 15 : Ekrandan double bir sayı okutun ve inte çevirip yazdırın.

          double dd= 12.5;
          int ii = (int)dd;



    }
}
