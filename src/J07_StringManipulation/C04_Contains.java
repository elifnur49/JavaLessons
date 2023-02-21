package J07_StringManipulation;

import java.util.Scanner;

public class C04_Contains {
    public static void main(String[] args) {
        /* String icerisinde istenen stringin varlıgını kontrol eder boolea return eder.

        */
        String str="Başarı gayrete aşıktır :) javaCAN'lara selam olsun";
        System.out.println(str.contains("java"));//true
        System.out.println(str.contains("Java"));// false
        System.out.println(str.contains(""));//true
        System.out.println(str.contains(""));//true

        String str1="Başarı";
        System.out.println(str1.contains(str));//false
        System.out.println(str.contains(str1));//true
        System.out.println(str.contains(str));//true


        // task-> girilen bir cumlede aranan kelimenin varlıgını kontrol eden bir code tcreate ediniz.
        //  ternary kullanınız
       Scanner scan = new Scanner(System.in);
        System.out.println("Bir metin giriniz :");
        String metin= scan.nextLine();
        System.out.println("Bir kelime giriniz :");
        String kelime=scan.nextLine();

        System.out.println (metin.contains(kelime) ? "girilen metınde ıstenen kelıme mevcut" : "girilen metınde ıstenen kelıme mevcut degıl");



    }
}
