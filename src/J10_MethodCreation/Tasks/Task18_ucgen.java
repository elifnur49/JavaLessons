package J10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task18_ucgen {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        double birinciKenarUzunlugu, ikinciKenarUzunlugu, tabanUzunlugu , yukseklik, ucgenCevresi, ucgenAlani;

        System.out.println("Üçgenin Birinci Kenar Uzunluğunu giriniz:");
        birinciKenarUzunlugu = input.nextDouble();

        System.out.println("Üçgenin İkinci Kenar Uzunluğunu giriniz:");
        ikinciKenarUzunlugu= input.nextDouble();

        System.out.println("Üçgenin Taban Uzunluğunu Giriniz:");
        tabanUzunlugu= input.nextDouble();

        System.out.println("Üçgenin Yüksekliğini Giriniz:");
        yukseklik= input.nextDouble();

        ucgenCevresi= ucgenCevresiHesapla(birinciKenarUzunlugu, ikinciKenarUzunlugu, tabanUzunlugu);
        ucgenAlani=ucgenAlaniHesapla(tabanUzunlugu, yukseklik);

        cevreYazdir(ucgenCevresi);
        alanYazdir(ucgenAlani);

    }

    public static double ucgenCevresiHesapla(double x, double y, double z){
        double cevre= x + y + z;
        return cevre;
    }
    public static double ucgenAlaniHesapla (double z, double h){
        double alan= (z*h)/2;
        return alan;
    }
    public static void cevreYazdir(double i){
        System.out.println("Üçgenin Çevresi:"+i);
    }
    public static void alanYazdir(double j){
        System.out.println("Üçgenin Alani:"+j);
    }
}
