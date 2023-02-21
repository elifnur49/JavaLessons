package J07_StringManipulation.Tasks1;

import java.util.Scanner;

public class _12_String_methods {
    public static void main(String[] args) {

        /*  apple kelimesinden  oluşan bir String yaz.
            String'in içinde App olup olmadığını doğrula.  */

        //Kodu buraya yazınız.
        Scanner sc = new Scanner(System.in);
        System.out.print(" bir cümle  giriniz : ");

        String kelime = sc.nextLine().toLowerCase();

        if (kelime.indexOf("apple") == -1) {
            System.out.println("Girilen cumle apple icermiyor");
        }else
            System.out.println("Girilen cumle app iceriyor");


    }
}
