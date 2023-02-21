package J07_StringManipulation.Tasks1;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
             /* Task->
        Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("1 adınızı giriniz : ");
        String ad = sc.nextLine();



        System.out.print("soyadınızı giriniz : ");
        String soyad = sc.nextLine();

        System.out.print(ad.substring(0, 1).toUpperCase() + ad.substring(1));

        System.out.println(" "+soyad.substring(0, 1).toUpperCase() + soyad.substring(1));





    }
}
