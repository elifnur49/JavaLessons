package Odevler;

public class Quız {
    public static void main(String[] args) {
        int a = 13;
        int b = 17;
        int c = 47;
        System.out.println(b + a + c);//77
        System.out.println(c - a/(b-c) + a * b);//268
        // int ' i int' e boldugumuz zaman sonuc int cikar.
        // Java yuvarlama islemi yapmaz. Sonucun tam kismini bolme isleminin
        // sonucu olarak ekrana yazdiririr.
        System.out.println(c/a);
        // Farkli data type'lari ile matematiksel islemler yaparsaniz sonuc buyuk data type 'inda verilir
        int d = 12;
        double e = 4;
        float f = 4f;

        System.out.println(d/e);//3.0
        System.out.println(d+e);//16.0
        System.out.println(e/d);//0.3333
        System.out.println(f/d);//0.333333334

        //modulus islemi : Iki ondalık olmayan sayi birbirine bolundugunde kalani verir
        // Java'da modulus isleminin sembolu %

        System.out.println(13%5);//3
        System.out.println(245%3);//2

        // Cift sayi : 2'ye bolundugunde 0 kalanini veren sayilardir

        System.out.println(12346%2);//0 sayimiz cifttir.

        // Tek sayi :  2'ye bolundugunde 1 kalanini veren sayilardir

        System.out.println(98765%2);//1 sayimiz tektir.



    }
}







