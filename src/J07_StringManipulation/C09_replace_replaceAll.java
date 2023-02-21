package J07_StringManipulation;

import java.util.Scanner;

public class C09_replace_replaceAll {
    public static void main(String[] args) {
      /** replace()
      * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini
      * (update -set) saglar. Sonuc String'dir..
      *
       */
     String str="javaCAN'lara selam bolcana offer :)";
        System.out.println("str = " + str);//javaCAN'lara selam bolcana offer :)
        System.out.println(str.replace("a", "*"));//j*v*CAN'l*r* sel*m bolc*n* offer :)
        System.out.println("str.replace(\"can\",\"$\") = " + str.replace("can", "$"));//javaCAN'lara selam bol$a offer :)

        System.out.println("str.replaceFirst(\"a\",\":\") = " + str.replaceFirst("a", ":-)"));//j:-)vaCAN'lara selam bolcana offer :)
        System.out.println("str.replace('a','&') = " + str.replace('a', '&'));//j&v&CAN'l&r& sel&m bolc&n& offer :)
        // replaceAll() method u replace() methoduna benzer ama 2 fark vardır
        //1-replace() methodu char kabul eder ama replaceAll kabul etmez
        //2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)

        //(Regular Expressions)
        //   \\s bosluk (
        //   \\S bosluk disindaki tum karakterler
        //   \\w harfler ve rakamlar (a z A Z, 0 9)
        //   \\W harfler ve rakamlar disindaki tum karakterler
        //   \\d rakamlar 0 9
        //   \\D rakamlar disindaki tum karakterler

        str="javaCAN'lara selam bolcana 123456780232 § $ # £ offer :) ";


        Scanner input = new Scanner(System.in);

        System.out.print("Dadaş hele bir adını   giresen : ");
        String isim = input.nextLine();

        System.out.print("Dadaş hele bir soyadını   giresen : ");
        String soyad = input.nextLine();

        System.out.print("Dadaş hele bir kk no   giresen : ");
        String kk = input.nextLine();

       // String isim = "Elif Nur";
       // String soyadi = "İnan";
        //String kartNo = "25081345571";
        String yeniIsim = isim.charAt(0) + isim.substring(1).replaceAll("\\w", "*");
        String yeniSoyad = soyad.charAt(0) + soyad.substring(1).replaceAll("\\w", "*");

        String yeniKartNo = "**** **** **** ****" + kk.substring(12);

        System.out.println("isim-soyad:"+yeniIsim+" "+yeniSoyad+ " kart no : "+yeniKartNo);
      // System.out.println("yeni isim : "+yeniAd+" yeni sayisim : "+yeniSoyad+" yeni KK : "+yeniKK);
    }
}
