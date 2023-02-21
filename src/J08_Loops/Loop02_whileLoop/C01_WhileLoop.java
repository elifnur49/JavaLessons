package J08_Loops.Loop02_whileLoop;

import java.util.Scanner;

public class C01_WhileLoop {
     /*
       baslangıc, bitiş  ve degişim degerleri net bilinen  tekrarlarda foor loop
       ama adım sayısı ya da tekrarın degişim degeri net bilinmeyen belli bir sarta,
       duruma(boolean) baglı olan tekrarlarda while loop kullanılır.

        */
     public static void main(String[] args) {


    //task01-> 3 den 20'ye kadar olan tamsayıları print eden code create ediniz.

         //System.out.println("   ***for cözüm***   ");

        //  for(int i=3;i<=20;i++){
       // System.out.print(i+" ");

          System.out.println("   ***while***   ");

        int basla=3;

        while(basla<=20){// basla 20 den <= oldugu surece sartı-> true ise while body action alır.
            System.out.print(basla+" ");//3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
            basla++;// while loop un döngü degişim komutu
        }
         System.out.println("   *** task02 ***   ");
     //Task 02-> 7 kere javaCAN prınt eden code yazınız
         int i=1;
           while(i<8){
              System.out.println( i+ " .javaCAN");
            i++;
     }
         System.out.println("   *** task03 ***   ");
     // Task03-> 2 basamaklı tek sayıları prınt eden code create edınız.
        int a=11;
           while (a<100){
               System.out.print(a+" ");
               a+=2;// her döngüde 2 artacak
           }
    //Task04-> girilen bir basamaklı sayma sayılarını aynı satırda prınr eden code create edınız.
         System.out.println("   *** task04 ***   ");
         int s=1;
         while (s<10){
             System.out.print(s+" ");
             s++;
         }
     // task05-> girilen ifadeyi tersten  print eden code create ediniz
          System.out.println("   *** task05 ***   ");

           Scanner sc=new Scanner(System.in);
           System.out.println("Bir cumle giriniz : ");
          String  bisey= sc.nextLine();
        int biseyUzunluk=bisey.length();

           while (biseyUzunluk>=1){//metnin uzunlugu 0 a eşit ve buyuk iken
             System.out.print(bisey.charAt(biseyUzunluk-1));//
               biseyUzunluk--;
           }

// Task06-> girilen tam sayıya kadar sayıların toplamını prınt eden code create edınız

         System.out.println("   *** task06 ***   ");

           System.out.println("Bir sayı giriniz : ");
         int biSayi=sc.nextInt();
         int toplam=0;

         while (biSayi>=0){
             toplam += biSayi;
             biSayi--;
         }
         System.out.println("toplam = " + toplam);

//Task07-> girilen tamsayının faktöriyelini prınt eden code create edınız
         System.out.println("   *** task06 ***   ");
         System.out.println("Bir sayı giriniz : ");

         int faktoriyel=1;


         while (biSayi>0){
             faktoriyel *= biSayi;
             biSayi--;
         }
         System.out.println("faktoriyel = " + faktoriyel);
     }
    }