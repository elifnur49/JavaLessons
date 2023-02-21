package J04_JavaOperators;

import java.util.Scanner;

public class Alistirmalar {
    public static void main(String[] args) {
        //11.01.2023 Tasks
 //Task 1
        System.out.println("Derse hoşgeldiniz");
 //Task 2
         int sayi = 30;
        System.out.println("sayi = " + sayi);
  //Task 3
        double sayi1=15.4;
        double sayi2= 25.2;
        double toplam =sayi1+sayi2;
        System.out.println("toplam = " + toplam);
   //Task 4
       Scanner scan = new Scanner(System.in);
       String name="Elifnur";
        System.out.println("name = " + name);
        String sName= "inan";
        System.out.println("sName = " + sName);
        String bosluk=" ";
        String fullname= name + " " +sName;
        System.out.println("fullname = " + fullname);
   //Task 5 :
       boolean dogruMu= true;
        System.out.println("dogruMu = " + dogruMu);
   //Task 6 :
        System.out.println("Java\nCanlar\niyi\nmiyiz?");

   //Task 7 :
        System.out.println("\"Java\tCanlar\"\t\nhazir\tmıyız?");

  //Task 8 :
        int ii =115;
        byte bb = (byte) ii;
        System.out.println("bb = " + bb);
  //Task 9 :
       int aa =124;
       double dd = aa;
        System.out.println("dd = " + dd);
   //Task10 :
        int iii=95;
        long ll = iii;
        System.out.println("ll = " + ll);
   //Task11 :
        double d1= 201.8;
        ii = (int) d1;
        System.out.println("ii = " + ii);
 //Task12 :
       double d2= bb;
       d2 = 25.4;
       bb = (byte) d2;
        System.out.println("bb = " + bb);
   //Task13 :
        int  yas = 45;
        String yeniYas = String.valueOf(yas);
        System.out.println("yeniYas = " + yeniYas);
   //Task14 :
        double aDouble = 0.11;
        String aString = Double.toString(aDouble);
        System.out.println("aString = " + aString);

   //Task15 :
         String aYas = "12";
        int yasYeni = Integer.parseInt(aYas);
        System.out.println("yasYeni = " + yasYeni);
   //Task16 :

        String eskiYas = "12.5";
        double dYas = Double.parseDouble(eskiYas);
        System.out.println("dYas = " + dYas);

 // Task17 :
         int say;  say=10;  say=sayi+1;
         System.out.println("Sayı =" + say);// 11 oluyor
 // Task18 :
         int say2=15; say2 = say2/2;
        System.out.println("say2 = " + say2); // 7 oluyor

 //Task19 :
        int say3=15; say3 = say2/2*2;
        System.out.println("sayi3 = " + say3); // sayi=3 6

 //Task20 :
        double vizeNot=41,finalNotu=60;
        int sonucNot= (int) ((vizeNot+finalNotu)/2);
        System.out.println("Geçme Notu " + sonucNot); // gecme notu: 50

 //Task21 :
        char ch = 'A'; System.out.println("ch+0 = " + (ch+0));// 65

 //Task22 :
        char ch1 = 'A'; System.out.println("ch+0 = " + (ch+0)); //A0
 // Task23 :
         int say1 = 10;  say1 +=5; say1++; System.out.println("sayi = " + say1); // 16
 //Task24 :
         int saay2 = 10; saay2 *= 5; saay2 = saay2 + 12;  saay2--; saay2 -=3;// 58
           System.out.println("sayi = " + saay2);
 //Task25 :
        Scanner sc = new Scanner(System.in);

        System.out.print("Çemberin yarı çapını giriniz: ");
        int yarıcap = scan.nextInt();

        System.out.println("Çemberin çevresi = " + (2 * Math.PI * yarıcap));

 int a=10,b=20,c=20; int x= 5, y=10,z=15;
 //Task26 :
         boolean sonuc1=(a==b); System.out.println("sonuc = " + sonuc1);// false
 //Task27 :
         boolean sonuc2=(a<b);  System.out.println("sonuc = " + sonuc2);// true
// Task28 :
          boolean sonuc3=(a>=b); System.out.println("sonuc = " + sonuc3);//false
 //Task29 :
          boolean sonuc4=(b==b); System.out.println("sonuc = " + sonuc4);//true
 //Task30 :
          boolean sonuc5=(a<=b); System.out.println("sonuc = " + sonuc5);// true
// Task31 :
         boolean sonuc6=(a!=b); System.out.println("sonuc = " + sonuc5);//true
//Task32 :
        System.out.println((a==c));// false
// Task33 :
        System.out.println((c!=c));//false
// Task34 :
        System.out.println((x==5) && (z==15));//true
  //Task35 :
        System.out.println((x==5) || (z==15));//true
 //Task36 :
        System.out.println((x==5) && !(y==15));//true
 //Task37 :
        System.out.println(!(x==5) || (y==15));//false
 //Task38 :
        System.out.println(!true);//false
 //Task39 :
         boolean sonuc7=(a==b && a!=c); System.out.println("sonuc = " + sonuc7);// false
 //Task40 :
         boolean sonuc8=(a==b || a!=c); System.out.println("sonuc = " + sonuc8);// true
 //Task41 :
         boolean sonuc9=(b<=c && a!=c); System.out.println("sonuc = " + sonuc9);// true

}
}