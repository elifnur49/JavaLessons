package J07_StringManipulation;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {

/*
     charAt() methodu parametre int olarak girilen index'deki char değerini return eder.
Çoooğğğ önemli ->  index değeri her zaman 0'dan başlar
      */
    String name = "Abdi Arman";
        System.out.println(name.charAt(5));// A  name Stringdeki 5.index karakteri return eder.

       char karakter= name.charAt(7);
        System.out.println("Abdinin 7. karakteri = " + karakter);// m

       // bir String ifadenin son karakteri ->length -1.indexdir.
       // bir String ifadenin ilk karakteri ->charAt(0).indexdir.

// 1.yol
        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String str= scan.nextLine();

        if (str.length()%2!=0){
            System.out.println(str.charAt((str.length() -1)/ 2));
        }else System.out.println("girilen kelimenin orta karakteri yoktur");
//2.yol
        Scanner sc=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String str1= scan.nextLine();

        if (str.length()%2==1){
            System.out.println("orta karakter = " + str.charAt(str.length() / 2));
        }else System.out.println("girilen kelimenin orta karakteri yoktur");


        //System.out.println("name.charAt(99) = " + name.charAt(99));// rte

    }
}
