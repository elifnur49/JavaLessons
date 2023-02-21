package J07_StringManipulation;

public class C15_UpperCaseLowerCase {
    public static void main(String[] args) {
       /*
       uppercase()-> verilen  string'in tum harflerini BUYUK harfe cevirir.
       Lowercase()-> verilen  string'in tum harflerini KUCUK harfe cevirir.
       ignorcase()-> verilen  string'in buyuk-kucuk harf duyarlılıgını kaldırır.
        */

        String str= "javaCAN'lara selam olsun :) ";
        System.out.println("str = " + str);
        System.out.println("str.toUpperCase() = " + str.toUpperCase());
        System.out.println("str.toLowerCase() = " + str.toLowerCase());
        System.out.println("str = " + str);

    }
}
