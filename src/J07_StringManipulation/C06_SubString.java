package J07_StringManipulation;

import java.util.Scanner;

public class C06_SubString {
    public static void main(String[] args) {

     /*
       substring()
       Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
      substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
      substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
      indexi'e kadar parçayı return eder
      baslangic indexi ==> inclusive/dahil
      bitis indexi ==> eclusive/haric
      */

        String str = "Maden geldin dünyaya otur çalış JAVA'ya : )";
        System.out.println(str.substring(10));//in dünyaya otur çalış JAVA'ya : )
        // str datasının son 10 karakterini print ediniz...
        System.out.println(str.substring(10,17));//in düny

        // str deki son 10 karakterini print ediniz.
        System.out.println(str.substring(str.length()-10));//VA'ya : )

        // str datasının ilk  10  karakterini print ediniz..
        System.out.println(str.substring(0, 10));//Maden geld

        // str datasının ilk  karakterini print ediniz..
        System.out.println(str.substring(0, 1));//m

        // str datasının son  karakterini print ediniz..
        System.out.println(str.substring(str.length()-1));// )


        //task -> girilen 4 harfli kelimeyi tersten print eden code create ediniz
        Scanner sc=new Scanner(System.in);
        System.out.print("dört harfli kelime giriniz : " );

        String kelime=sc.next();

        if (kelime.length()!=4){
            System.out.println("4 harfli kelime girecektiniz:(");
        }else{
            System.out.print(kelime.substring(kelime.length() - 1));//e
            System.out.print(kelime.substring(2,3));//l
            System.out.print(kelime.substring(1,2));//a
            System.out.print(kelime.substring(0,1));//k

                }
    }
}